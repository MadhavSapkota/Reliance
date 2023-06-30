package com.reliance.yeticarpet.activity.distributor.retailerlist.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.distributor.retailerdetails.PartyListDetailsActivity
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.setting.SettingActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import io.reactivex.Observable

class PartyListModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice) {

    fun getRetailerDashboard(id:Int): Observable<RetailerDashboardResponse> {
        return webservice.getRetailerDashboard(id)
    }

    fun getSettings(){
        SettingActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getLoginActivity(){
        LoginActivity.start(appCompatActivity)
    }


    fun getPartyListData(fiscal_year: Int, distributorId: Int, end: Int,start:Int): Observable<PartyListResponse> {
        return webservice.getDistributorRetailerList(fiscal_year,distributorId, end,start)
    }
    fun getBackActivity(){
        appCompatActivity.finish()
    }
    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }

    fun getPartyListDetailsActivity(retailerPartyId:Int) {
        PartyListDetailsActivity.start(appCompatActivity,retailerPartyId)
    }

}

