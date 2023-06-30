package com.reliance.yeticarpet.activity.otp.mvp
import android.app.ProgressDialog
import android.os.Handler
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding2.view.RxView
import com.jakewharton.rxbinding2.widget.RxTextView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.CustomProgressBar
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.ActivityOtpBinding
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.dialog.LoginErrorDialog
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

class OtpView(private val appCompatActivity: AppCompatActivity,private val loginErrorDialog: LoginErrorDialog) {
    var binding: ActivityOtpBinding? = null
    private var isOtpValid: Boolean = false

    private val progressDialog= ProgressDialog(appCompatActivity, R.style.MyProgressDialogStyle)
    fun start(binding_otp: ActivityOtpBinding) {
        binding = binding_otp
        getUserOtpListener()
    }

    fun getDirectToLoginObservable(): Observable<Any> {
        return RxView.clicks(binding!!.tvRedirectLogin)
    }
    fun getSubmitOtpObservable(): Observable<Any> {
        return RxView.clicks(binding!!.btnSubmit)
    }


    fun showProgressDialog() {
        progressDialog.show()
        progressDialog.setMessage("Processing...")
    }

    fun hidProgressDialog() {
        progressDialog!!.dismiss()
    }

    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!) })
    }

    fun getOtpCode(): String {
        return binding!!.etOtp.text.toString()
    }

    private fun getUserOtpListener() {
        RxTextView.textChanges(binding!!.etOtp).skip(1)
            .map(CharSequence::toString)
            .debounce(200, TimeUnit.MILLISECONDS)
            .observeOn(AndroidSchedulers.mainThread())
            .doOnNext {
                when {
                    getOtpCode().isEmpty() -> {
                        isOtpValid = false
                    }
                    else -> {
                        when {
                            else -> {
                                isOtpValid = false
                            }
                        }
                    }
                }
            }
            .subscribe()
    }

    fun getOtpRequest(): ApiRequest.OtpRequest {
        return ApiRequest.OtpRequest(
            userId = UserInfo.userId,
            otp = getOtpCode())
    }

    fun loadDialog(message: String) {
        return loginErrorDialog.showDialog(message)
    }
}