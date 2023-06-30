package com.reliance.yeticarpet.activity.login.mvp
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse
import com.reliance.yeticarpet.activity.login.dto.LoginResponse
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.AppConstant.checkedDeviceUserStatus
import com.reliance.yeticarpet.apputlis.AppUtils.convertToUpperCase
import com.reliance.yeticarpet.apputlis.ResponseErrorHandler.handleErrorResponse
import com.reliance.yeticarpet.apputlis.RetailerInfo
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.accessToken
import com.reliance.yeticarpet.apputlis.UserInfo.checkDeviceStatus
import com.reliance.yeticarpet.apputlis.UserInfo.distributorId
import com.reliance.yeticarpet.apputlis.UserInfo.loginStatus
import com.reliance.yeticarpet.apputlis.UserInfo.refreshToken
import com.reliance.yeticarpet.apputlis.UserInfo.tokenStatus
import com.reliance.yeticarpet.apputlis.UserInfo.verifyOtp
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.json.JSONException
import org.json.JSONObject


class LoginPresenter(
    private val loginModel: LoginModel,
    private val loginView: LoginView,
    private val appCompatActivity: AppCompatActivity
) {
    private val compositeDisposable= CompositeDisposable()
    var isSavePassword: Boolean = false

    fun onCreateView() {
        loginView.getForgotPasswordObservable().doOnNext { loginModel.getForgetPasswordView()}.subscribe()
        loginView.getLoginObservable().doOnNext { getLoginRequest() }.subscribe()
    }

    //login with api
    private fun getLoginRequest() {
        when {
            loginView.checkNetwork() -> {
                userLoginRequestApi()
            }
            else -> loginView.getErrorMessage(ApiConstants.NONETWORK) }
    }

    private fun userLoginRequestApi() {
        loginView.showProgressDialog()
        compositeDisposable.add(
            loginModel.postLogin(loginView.getLoginRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::userLoginSuccessApi, this::userloginError
                ))
    }


    private fun getCheckDeviceApi() {
        loginView.showProgressDialog()
        compositeDisposable.add(
            loginModel.getCheckDevice()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::getCheckDevicesApiResult, this::checkUserDeviceError
                ))
    }

    private fun getCheckDevicesApiResult(result: CheckDeviceResponse) {
        if (loginView.isUserInputEmpty != true) {
            loginView.hidProgressDialog()
            UserInfo.username = result.toString()
            checkDeviceStatus = result.status!!

            System.out.println("CheckDeviceStatus" + checkDeviceStatus)


            if (checkDeviceStatus.equals(true)){
                verifyOtp = true
                loginModel.getRetailerDashboardView()
            }
            else if (checkDeviceStatus.equals(false)){
                checkedDeviceUserStatus =  true

                loginModel.getOtpView()
            }
        }
    }

    private fun checkUserDeviceError(e: Throwable) {
        loginView.getErrorMessage(e.message.toString())
    }




    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            loginModel.postRefresh(loginView.postRefreshRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::tokenSuccess, this::tokenError
                ))
    }

    private fun tokenSuccess(result: RefreshTokenResponse) {
        accessToken = result.access.toString()
        tokenStatus = true
        getCheckDeviceApi()
    }

    @SuppressLint("SuspiciousIndentation")
    private fun tokenError(e: Throwable) {
        val response = JSONObject()
        getLoginRequest()
    }

    private fun userLoginSuccessApi(result: LoginResponse) {
        if (loginView.isUserInputEmpty != true) {
            loginView.hidProgressDialog()
            UserInfo.username = result.toString()
            refreshToken = result.refresh.toString()

            UserInfo.retailerId = result.retailerId?.toIntOrNull() ?: 0
             distributorId = result.distributorId ?: 0 // Set a default value if null



            RetailerInfo.retailerName = result.retailerName.toString()
            var text = convertToUpperCase(result.retailerName.toString())

            UserInfo.userId = result.userId.toString()!!
            loginStatus = true
            if (loginStatus && isSavePassword) {
                isSavePassword = true
            } else {
                isSavePassword = false
                val error = result.username
            }
            userRefreshRequestTokenApi()
        }
    }

    private fun userloginError(e: Throwable) {
        loginView.hidProgressDialog()
        loginStatus = false

        val errorResponse = handleErrorResponse(e)
        if (errorResponse.isNullOrEmpty()) {
            loginView.getErrorMessage(loginView.errorMessage)
            return
        }

        try {
            val json = JSONObject(errorResponse)

            if (json.has("detail")) {
                val detail = json.getString("detail")
                loginView.getErrorMessage(loginView.errorMessage)
            } else {
                loginView.getErrorMessage(loginView.errorMessage)
            }
        } catch (ex: JSONException) {

            loginView.getErrorMessage(loginView.errorMessage)
        }
    }
}