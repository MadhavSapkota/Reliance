package com.reliance.yeticarpet.fragment.userprofile.mvp
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.changepassword.ChangePasswordActivity
import com.reliance.yeticarpet.activity.retailer.distributorlist.DistributorListActivity
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.bills.RetailerBillFragment


class UserProfileModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice
) {
    fun getLoginActivity(){
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getChangePassword(){
        ChangePasswordActivity.start(appCompatActivity)
    }

}