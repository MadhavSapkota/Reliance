package com.reliance.yeticarpet.fragment.retailer.dashboard.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardModel
import com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardPresenter
import com.reliance.yeticarpet.fragment.retailer.dashboard.mvp.RetailerDashboardView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.FiscalYearDialog
import com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.AnnualSchemeAdapter
import com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardAdapter
import dagger.Module
import dagger.Provides

@Module
class RetailerDashboardFragmentModule(private val appCompatActivity: AppCompatActivity) {
    @AppActivity
    @Provides
    fun getRetailerDashboardView(credentialsErrorDialog: CredentialsErrorDialog,retailerDashboardAdapter: RetailerDashboardAdapter,fiscalYearDialog: FiscalYearDialog): RetailerDashboardView {
        return RetailerDashboardView(appCompatActivity,retailerDashboardAdapter, credentialsErrorDialog,fiscalYearDialog)
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
    fun getRetailerDashboardAdapter(): RetailerDashboardAdapter {
        return RetailerDashboardAdapter(appCompatActivity)
    }

    @Provides
    fun getAnnualSchemeAdapter(): AnnualSchemeAdapter {
        return AnnualSchemeAdapter(appCompatActivity)
    }


    @Provides
    fun getRetailerDashboardPresenter(
        retailerDashboardView: RetailerDashboardView,
        retailerDashboardModel: RetailerDashboardModel
    ): RetailerDashboardPresenter {
        return RetailerDashboardPresenter(retailerDashboardView, retailerDashboardModel)
    }

    @Provides
    fun getCredentialErrorDialog(errorMessage: String): CredentialsErrorDialog {
        return CredentialsErrorDialog(appCompatActivity, errorMessage)
    }

    @Provides
    fun providePointList(): ArrayList<Int> {
        return arrayListOf(AppConstant.totalBillAmount, AppConstant.totalBillAmount, AppConstant.totalBillAmount, AppConstant.totalBillAmount)
    }

    @Provides
    fun provideMaxValue(): Int {
        return AppConstant.totalBillAmount
    }

    @Provides
    fun getErrorMessage(): String {
        return String.Companion.toString()
    }
}
