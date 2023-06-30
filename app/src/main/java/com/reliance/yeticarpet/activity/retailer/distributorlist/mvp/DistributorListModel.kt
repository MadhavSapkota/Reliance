package com.reliance.yeticarpet.activity.retailer.distributorlist.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.DistributorListResponse
import com.reliance.yeticarpet.activity.setting.SettingActivity
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import io.reactivex.Observable

class DistributorListModel(
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


    fun getDistributorListData(fiscal_year:Int,retailer_id:Int): Observable<DistributorListResponse> {
        return webservice.getDistributorList(fiscal_year,retailer_id)
    }

    fun getBackActivity(){
        appCompatActivity.finish()
    }

    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }
}

