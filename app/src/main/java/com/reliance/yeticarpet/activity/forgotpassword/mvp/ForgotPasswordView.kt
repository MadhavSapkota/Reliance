package com.reliance.yeticarpet.activity.forgotpassword.mvp
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding2.view.RxView
import com.jakewharton.rxbinding2.widget.RxTextView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.databinding.ActivityForgetPasswordBinding
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.dialog.LoginErrorDialog
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

class ForgotPasswordView(private val appCompatActivity: AppCompatActivity,private val loginErrorDialog: LoginErrorDialog) {
    var binding: ActivityForgetPasswordBinding? = null
    private val progressDialog = ProgressDialog(appCompatActivity, R.style.MyProgressDialogStyle)
    var isEmailUsernameValid: Boolean = false

    fun start(binding_login: ActivityForgetPasswordBinding) {
        binding = binding_login
        getUserNameListener()
    }

    fun showProgressDialog() {
        progressDialog.show()
        progressDialog.setMessage(appCompatActivity.getString(R.string.processing))
    }

    fun hidProgressDialog() {
        progressDialog.dismiss()
    }

    fun getUserName(): String {
        return binding!!.etPusername.text.toString()
    }


    fun getDirectToLoginObservable(): Observable<Any> {
        return RxView.clicks(binding!!.tvRedirectLogin)
    }

    fun submitButton(): Observable<Any> {
        return RxView.clicks(binding!!.btnSubmit)
    }

    private fun getUserNameListener() {
        RxTextView.textChanges(binding!!.etPusername).skip(1)
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


    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }

    fun getForgotRequest(): ApiRequest.ForgotPasswordRequest {
        return ApiRequest.ForgotPasswordRequest(
            username = getUserName()
        )
    }

    fun loadDialog(message: String) {
        return loginErrorDialog.showDialog(message)
    }

}