package com.reliance.yeticarpet.fragment.setting.mvp
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.distributor.retailerlist.PartyListActivity
import com.reliance.yeticarpet.activity.retailer.distributorlist.DistributorListActivity
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.bills.RetailerBillFragment


class SettingModel(
    private val appCompatActivity: AppCompatActivity,
    private val webservice: Webservice
) {
    fun getLoginActivity(){
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getBillList(){
        loadFragment(RetailerBillFragment())
        RetailerDashboardView.getTab.tab!!.selectedItemId =R.id.navigation_bill
    }

    fun loadFragment(fragment: Fragment) {
        val transaction=appCompatActivity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view_dashboard, fragment)
        transaction.commit()
    }

    fun getPartyListActivity(){
        PartyListActivity.start(appCompatActivity)
    }

    fun getDistributorListActivity(){
        DistributorListActivity.start(appCompatActivity)
    }
}