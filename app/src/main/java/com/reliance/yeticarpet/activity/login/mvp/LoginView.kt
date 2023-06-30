package com.reliance.yeticarpet.activity.login.mvp
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding2.view.RxView
import com.jakewharton.rxbinding2.widget.RxTextView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.retailer.dashboard.RetailerDashboardActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.CustomProgressBar
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.verifyOtp
import com.reliance.yeticarpet.databinding.ActivityLoginBinding
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.dialog.LoginErrorDialog
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit


class LoginView(private val appCompatActivity: AppCompatActivity,
                private val loginErrorDialog: LoginErrorDialog) {
    var binding: ActivityLoginBinding? = null
    var isEmailUsernameValid: Boolean = false
    var isPasswordvalid: Boolean = false
    private val progressDialog = ProgressDialog(appCompatActivity, com.reliance.yeticarpet.R.style.MyProgressDialogStyle)
    private var progressBar = CustomProgressBar()
    var isSavePassword: Boolean = false
    var isUserInputEmpty: Boolean = false
    val errorMessage: String = appCompatActivity.getResources().getString(com.reliance.yeticarpet.R.string.login_error_message)



    fun start(binding_login: ActivityLoginBinding) {
        binding = binding_login
        getUsernameListner()
        getPasswordListner()
        savePassword()
        checkTokenStatus()
    }

    fun getLoginObservable(): Observable<Any> {
        return RxView.clicks(binding!!.btnLogin)
    }

    fun getForgotPasswordObservable(): Observable<Any> {
        return RxView.clicks(binding!!.tvForgetPassword)
    }

    fun showProgressDialog() {
        progressDialog.show()
        progressDialog.setMessage("Processing...")
    }

    fun hidProgressDialog() {
        progressDialog.dismiss()
    }

    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }

    fun getLoginErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            LoginErrorDialog(appCompatActivity, message)
        })
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }

    fun getUserName(): String {
        return binding!!.etUsername.text.toString()
    }

    fun getUserPassowrd(): String {
        return binding!!.etPassword.text.toString()
    }



    private fun getUsernameListner() {
        RxTextView.textChanges(binding!!.etUsername).skip(1)
            .map(CharSequence::toString)
            .debounce(200, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext {
                when {
                    getUserName().isEmpty() -> {
                        isEmailUsernameValid = false
                    }
                    else -> {
                        when {
                            else -> {
                                isEmailUsernameValid = false
                            }
                        }
                    }
                }
            }
            .subscribe()
    }


    private fun getPasswordListner() {
        RxTextView.textChanges(binding!!.etPassword).skip(1)
            .map(CharSequence::toString)
            .debounce(200, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext {
                when {
                    getUserPassowrd().isEmpty() -> {
                        isPasswordvalid = false
                    }
                    else -> {
                        isPasswordvalid = true
                    }
                }
            }
            .subscribe()
    }


    fun getLoginRequest(): ApiRequest.LoginRequest {
        return ApiRequest.LoginRequest(
            username = getUserName(),
            password = getUserPassowrd(),
        )
    }

    fun postRefreshRequest(): ApiRequest.RefreshTokenRequest {
        return ApiRequest.RefreshTokenRequest(
            refresh = UserInfo.refreshToken,
        )
    }




    private fun isValid(): Boolean {
        return when {
            isEmailUsernameValid && isPasswordvalid -> true
            else -> false
        }
    }

    fun checkEmptyOrNotEmpty(message: String){
        if (getUserName().isEmpty() || getUserPassowrd().isEmpty()){
            isUserInputEmpty = true
            loadDialog(message)
        }
    }



    private fun savePassword() {
        binding!!.cbRememberMe.setOnClickListener {
            if (binding!!.cbRememberMe.isChecked) {
                isSavePassword = true
            }else{
                isSavePassword = false

            }
        }
    }

    fun loadDialog(message: String) {
        return loginErrorDialog.showDialog(message)
    }


    private fun checkTokenStatus() {
        if (UserInfo.tokenStatus == true && verifyOtp.equals(true)
        ){
            RetailerDashboardActivity.start(appCompatActivity) // Redirect to dashboard activity
            appCompatActivity.finish() // Finish the login activity
        }
    }
}