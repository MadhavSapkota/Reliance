package com.reliance.yeticarpet.activity.retailer.distributordetails.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.setting.SettingActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import io.reactivex.Observable

class DistributorDetailsModel(
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
}

