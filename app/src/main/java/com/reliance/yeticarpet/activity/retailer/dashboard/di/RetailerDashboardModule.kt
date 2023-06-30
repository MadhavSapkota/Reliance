package com.reliance.yeticarpet.activity.retailer.dashboard.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardModel
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardPresenter
import com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.FilterDialog
import com.reliance.yeticarpet.dialog.FiscalYearDialog
import com.reliance.yeticarpet.dialog.NepaliDatePickerDialog
import dagger.Module
import dagger.Provides

@Module
class RetailerDashboardModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getRetailerDashboardView(fiscalYearDialog: FiscalYearDialog): RetailerDashboardView {
        return RetailerDashboardView(appCompatActivity,fiscalYearDialog)
    }
    @Provides
    fun getRetailerDashboardModel(webservice: Webservice): RetailerDashboardModel {
        return RetailerDashboardModel(appCompatActivity,webservice)
    }

    @Provides
    fun getFiscalYearDialog(): FiscalYearDialog {
        return FiscalYearDialog(appCompatActivity)
    }
    @Provides
    fun getRetailerDashboardPresenter(
        retailerDashboardView: RetailerDashboardView,
        retailerDashboardModel: RetailerDashboardModel
    ): RetailerDashboardPresenter {
        return RetailerDashboardPresenter(retailerDashboardView,retailerDashboardModel)
    }
}