package com.reliance.yeticarpet.activity.login.mvp
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.forgotpassword.ForgotPasswordActivity
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse
import com.reliance.yeticarpet.activity.login.dto.LoginResponse
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.otp.OtpActivity
import com.reliance.yeticarpet.activity.retailer.dashboard.RetailerDashboardActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.ApiRequest.LoginRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.bills.RetailerBillFragment
import com.reliance.yeticarpet.fragment.retailer.dashboard.RetailerDashboardFragment
import io.reactivex.Observable


class LoginModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice
    ) {

    fun getOtpView() {
        OtpActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getForgetPasswordView(){
        ForgotPasswordActivity.start(appCompatActivity)
    }

    fun getRetailerDashboardView(){
        RetailerDashboardActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun postLogin(info: LoginRequest): Observable<LoginResponse> {
        return webservice.postLogin(info)
    }

    fun getCheckDevice(): Observable<CheckDeviceResponse> {
        return webservice.getCheckDevice()
    }

    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }
}

