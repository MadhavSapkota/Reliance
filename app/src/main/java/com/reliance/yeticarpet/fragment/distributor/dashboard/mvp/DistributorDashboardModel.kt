package com.reliance.yeticarpet.fragment.distributor.dashboard.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.distributor.retailerlist.PartyListActivity
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.MonthlyTrackerActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.apputlis.AppConstant.clickedTPosition
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse
import io.reactivex.Observable


class DistributorDashboardModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice
) {

    fun getFiscalYearResponse(status:Boolean): Observable<FiscalYearResponse> {
        return webservice.getFiscalYears(status)
    }

    fun getLoginActivityResponse(){
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getMonthlyTracker(){
        MonthlyTrackerActivity.start(appCompatActivity,clickedTPosition)
    }

    fun getFiscalYeaResponse(): Observable<FiscalYearResponse> {
        return webservice.getFiscalYear()
    }

    fun getRetailerList(){
        PartyListActivity.start(appCompatActivity)
    }

    fun getDistributorResponse(fiscalYear:Int): Observable<DistributorDashboardResponse> {
        return webservice.getDistributorDashboardList(fiscalYear)
    }

    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }

}