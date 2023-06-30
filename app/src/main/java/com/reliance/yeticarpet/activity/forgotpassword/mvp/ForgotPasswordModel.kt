package com.reliance.yeticarpet.activity.forgotpassword.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.forgotpassword.dto.ForgotPasswordResponse
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.otp.OtpActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import io.reactivex.Observable

class ForgotPasswordModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice

) {
    fun getLoginView() {
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getOtpView() {
        OtpActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun postForgotPassword(info: ApiRequest.ForgotPasswordRequest): Observable<ForgotPasswordResponse> {
        return webservice.postForgotPassword(info.username)
    }
}

