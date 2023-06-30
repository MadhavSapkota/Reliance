package com.reliance.yeticarpet.activity.otp.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse
import com.reliance.yeticarpet.activity.otp.OtpActivity
import com.reliance.yeticarpet.activity.otp.dto.OtpResponse
import com.reliance.yeticarpet.activity.retailer.dashboard.RetailerDashboardActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.bills.dto.RetailerListResponse
import io.reactivex.Observable


class OtpModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice) {

    fun getDashboardRetailerView() {
        RetailerDashboardActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getLoginView() {
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getOtpView() {
        OtpActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun postOtpRequest(info: ApiRequest.OtpRequest): Observable<OtpResponse> {
        return webservice.postOtp(info.userId,info.otp)
    }

    fun checkDeviceVerifyOtp(token:Int): Observable<CheckDeviceResponse> {
        return webservice.getCheckDeviceOtp(token)
    }
}

