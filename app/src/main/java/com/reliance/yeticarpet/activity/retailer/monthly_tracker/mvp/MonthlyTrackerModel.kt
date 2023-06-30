package com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.otp.OtpActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import io.reactivex.Observable

class MonthlyTrackerModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice

) {
    fun getRetailerDashboard(id:Int): Observable<RetailerDashboardResponse> {
        return webservice.getRetailerDashboard(id)
    }
    fun getLoginActivityResponse(){
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getBackActivity(){
        appCompatActivity.finish()
    }

    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }
}

