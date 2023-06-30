package com.reliance.yeticarpet.activity.changepassword.mvp
import com.reliance.yeticarpet.activity.changepassword.dto.ChangePasswordResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.AppUtils.convertToUpperCase
import com.reliance.yeticarpet.apputlis.ResponseErrorHandler.handleErrorResponse
import com.reliance.yeticarpet.apputlis.RetailerInfo
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.loginStatus
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.json.JSONException
import org.json.JSONObject


class ChangePasswordPresenter(
    private val changePasswordModel: ChangePasswordModel,
    private val changePasswordView: ChangePasswordView
) {
    private val compositeDisposable= CompositeDisposable()
    var isSavePassword: Boolean = false

    fun onCreateView() {
        changePasswordView.getLoginObservable().doOnNext { getLoginRequest() }.subscribe()
        changePasswordView.getDiscardObservable().doOnNext { changePasswordModel.getUserSetting() }.subscribe()
    }

    //login with api
    private fun getLoginRequest() {
        when {
            changePasswordView.checkNetwork() -> {
                userLoginRequestApi()
            }
            else -> changePasswordView.getErrorMessage(ApiConstants.NONETWORK) }
    }

    private fun userLoginRequestApi() {
        changePasswordView.showProgressDialog()
        compositeDisposable.add(
            changePasswordModel.postChangePassword(changePasswordView.getChangePasswordRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::userLoginSuccessApi, this::userloginError
                ))
    }


    private fun userLoginSuccessApi(result: ChangePasswordResponse) {
            changePasswordView.hidProgressDialog()
            UserInfo.username = result.toString()
            UserInfo.refreshToken = result.refresh.toString()
            RetailerInfo.retailerName = convertToUpperCase(result.retailerName.toString())

            UserInfo.userId = result.userId.toString()!!
            loginStatus = true
            if (loginStatus && isSavePassword) {
                isSavePassword = true
            } else {
                isSavePassword = false
                val error = result.username
            }
        changePasswordView.getErrorMessage("Your Password is Changed.")
    }

    private fun userloginError(e: Throwable) {
        changePasswordView.hidProgressDialog()

        val errorResponse = handleErrorResponse(e)

        if (errorResponse.isNullOrEmpty()) {
            changePasswordView.getErrorMessage(changePasswordView.errorMessage)
            return
        }

        try {
            val json = JSONObject(errorResponse)

            if (json.has("detail")) {
                val detail = json.getString("detail")
                changePasswordView.getErrorMessage(changePasswordView.errorMessage)
            } else {
                changePasswordView.getErrorMessage(changePasswordView.errorMessage)
            }

        } catch (ex: JSONException) {

            changePasswordView.getErrorMessage(changePasswordView.errorMessage)
        }
    }
}