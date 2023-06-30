package com.reliance.yeticarpet.activity.retailer.dashboard.mvp
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView.getTab.tab
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.apputlis.AppConstant.billListChecked
import com.reliance.yeticarpet.apputlis.AppConstant.dashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.distributorDashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.fiscalFinancialYear
import com.reliance.yeticarpet.apputlis.AppConstant.retailerDashboardChecked
import com.reliance.yeticarpet.apputlis.BottomNavigationViewHelper
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.ActivityDashboardRetailerBinding
import com.reliance.yeticarpet.dialog.FilterDialog
import com.reliance.yeticarpet.dialog.FiscalYearDialog
import com.reliance.yeticarpet.fragment.distributor.dashboard.DistributorDashboardFragment
import com.reliance.yeticarpet.fragment.bills.RetailerBillFragment
import com.reliance.yeticarpet.fragment.retailer.dashboard.RetailerDashboardFragment
import com.reliance.yeticarpet.fragment.setting.SettingFragment
import com.reliance.yeticarpet.fragment.userprofile.UserProfileFragment
import io.reactivex.Observable


class RetailerDashboardView(
    private val appCompatActivity: AppCompatActivity,
    val fiscalYearDialog: FiscalYearDialog

    ) {
    var binding: ActivityDashboardRetailerBinding?=null
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>


    fun start(binding_dashboard: ActivityDashboardRetailerBinding) {
        binding=binding_dashboard
        getNavigationListner()
        tab=binding!!.bottomNavigation
        getStringWithId(UserInfo)

        BottomNavigationViewHelper.disableShiftMode(tab!!)
    }


    /*This functionaliy {@getNavigationListner} is for calling profile fragment, home fragment and to implement logout functionality
on clicking bottom navigations items.*/
    fun getNavigationListner() {
        binding!!.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.navigation_home -> {
                    dashboardChecked = true
                    billListChecked = false
                    getStringWithId(UserInfo)
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_bill -> {
                    billListChecked = true
                    dashboardChecked = false
                    loadFragment(RetailerBillFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_setting -> {
                    loadFragment(SettingFragment())

                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_userprofile -> {
                    loadFragment(UserProfileFragment())
                    return@setOnNavigationItemSelectedListener true
                }

            }
            false
        }
    }

    //Function that determines it is retailer or distributor based upon the user id and redirects to the user
   //in retailer dashboard or distributor dashboard

    fun getStringWithId(userInfo: UserInfo) {
        val retailerId = userInfo.retailerId ?: 0
        val distributorId = userInfo.distributorId

        when {
            retailerId != 0 -> {
                retailerDashboardChecked = true
                distributorDashboardChecked = false
                loadFragment(RetailerDashboardFragment())
            }
            distributorId != null -> {
                distributorDashboardChecked = true
                retailerDashboardChecked = false
                loadFragment(DistributorDashboardFragment())
            }
        }
    }




    object getTab {
        var tab: BottomNavigationView?=null
    }

    companion object {
        fun start() {
            tab!!.selectedItemId=R.id.home
        }
    }

    fun actionListenerFloatingButton():Observable<Any>{
        return RxView.clicks(binding!!.floatingActionButton)
    }



    fun getTabPosition():Boolean{
        when{
            tab!!.selectedItemId==R.id.navigation_home->return true
            else->return false
        }
    }

    fun gotoHome(){
        tab!!.selectedItemId=R.id.navigation_home
    }
    /*This {@loadFragment} functionality is to load the fragment with the transcations operations. */
    fun loadFragment(fragment: Fragment) {
        val transaction=appCompatActivity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view_dashboard, fragment)
        transaction.commit()
    }
}

