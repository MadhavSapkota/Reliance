package com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.setting.SettingActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import io.reactivex.Observable

class PartyListDetailsModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice) {

    fun getRetailerDashboard(id:Int): Observable<RetailerDashboardResponse> {
        return webservice.getRetailerDashboard(id)
    }

    fun getLoginActivity(){
        LoginActivity.start(appCompatActivity)
    }

    fun getPartyDetailsListData(fiscal_year:Int,distributor_id:Int,retailer_id:Int): Observable<PartyListResponse> {
        return webservice.getPartyDetails(fiscal_year,distributor_id,retailer_id)
    }
    fun getBackActivity(){
        appCompatActivity.finish()
    }
    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }

}

