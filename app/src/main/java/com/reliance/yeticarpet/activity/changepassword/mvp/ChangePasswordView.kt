package com.reliance.yeticarpet.activity.changepassword.mvp
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding2.view.RxView
import com.jakewharton.rxbinding2.widget.RxTextView
import com.reliance.yeticarpet.activity.retailer.dashboard.RetailerDashboardActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.CustomProgressBar
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.ActivityLoginBinding
import com.reliance.yeticarpet.databinding.ChangePasswordBinding
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.dialog.LoginErrorDialog
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit


class ChangePasswordView(private val appCompatActivity: AppCompatActivity,
                private val loginErrorDialog: LoginErrorDialog) {
    var binding: ChangePasswordBinding? = null
    var isEmailUsernameValid: Boolean = false
    var isPasswordvalid: Boolean = false
    private val progressDialog = ProgressDialog(appCompatActivity,
        com.reliance.yeticarpet.R.style.MyProgressDialogStyle)
    val errorMessage: String = appCompatActivity.getResources().getString(com.reliance.yeticarpet.R.string.login_error_message)



    fun start(binding_login: ChangePasswordBinding) {
        binding = binding_login
        getNewPasswordListner()
        getPasswordListner()
        getOldPasswordListner()
    }

    fun getLoginObservable(): Observable<Any> {
        return RxView.clicks(binding!!.rlSubmit)
    }

    fun getDiscardObservable(): Observable<Any> {
        return RxView.clicks(binding!!.rlDiscard)
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

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }

    fun getNewPassword(): String {
        return binding!!.etNewPassword.text.toString()
    }

    fun getReEnterNewPassword(): String {
        return binding!!.etRePassword.text.toString()
    }

    fun getOldPassword(): String {
        return binding!!.etOldPassword.text.toString()
    }


    fun getChangePasswordRequest(): ApiRequest.ChangePasswordRequest {
        return ApiRequest.ChangePasswordRequest(
            password = getNewPassword(),
            passwordRe = getReEnterNewPassword(),
            oldPassword = getOldPassword()
        )
    }


    private fun getNewPasswordListner() {
        RxTextView.textChanges(binding!!.etNewPassword).skip(1)
            .map(CharSequence::toString)
            .debounce(200, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext {
                when {
                    getNewPassword().isEmpty() -> {
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
        RxTextView.textChanges(binding!!.etRePassword).skip(1)
            .map(CharSequence::toString)
            .debounce(200, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext {
                when {
                    getReEnterNewPassword().isEmpty() -> {
                        isPasswordvalid = false
                    }
                    else -> {
                        isPasswordvalid = true
                    }
                }
            }
            .subscribe()
    }


    private fun getOldPasswordListner() {
        RxTextView.textChanges(binding!!.etOldPassword).skip(1)
            .map(CharSequence::toString)
            .debounce(200, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext {
                when {
                    getReEnterNewPassword().isEmpty() -> {
                        isPasswordvalid = false
                    }
                    else -> {
                        isPasswordvalid = true
                    }
                }
            }
            .subscribe()
    }



    fun postRefreshRequest(): ApiRequest.RefreshTokenRequest {
        return ApiRequest.RefreshTokenRequest(
            refresh = UserInfo.refreshToken,
        )
    }
}