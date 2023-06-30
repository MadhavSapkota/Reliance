package com.reliance.yeticarpet.fragment.retailer.dashboard.mvp
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.retailer.dashboard.RetailerDashboardActivity
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.MonthlyTrackerActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.apputlis.AppConstant.clickedTPosition
import com.reliance.yeticarpet.fragment.retailer.dashboard.RetailerDashboardFragment
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import io.reactivex.Observable


class RetailerDashboardModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice
) {

    fun getFiscalYearResponse(status:Boolean): Observable<FiscalYearResponse> {
        return webservice.getFiscalYears(status)
    }

    fun getFiscalYeaResponse(): Observable<FiscalYearResponse> {
        return webservice.getFiscalYear()
    }

    fun getLoginActivityResponse(){
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }


    fun loadFragment(fragment: Fragment) {
        val transaction=appCompatActivity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view_dashboard, fragment)
        transaction.commit()
    }

    fun getRetailerDashboard(id:Int): Observable<RetailerDashboardResponse> {
        return webservice.getRetailerDashboard(id)
    }

    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }
}