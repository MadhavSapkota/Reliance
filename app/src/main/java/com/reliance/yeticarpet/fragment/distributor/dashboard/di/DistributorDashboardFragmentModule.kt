package com.reliance.yeticarpet.fragment.distributor.dashboard.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.FiscalYearDialog
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.RetailerListAdapter
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter
import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardModel
import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardPresenter
import com.reliance.yeticarpet.fragment.distributor.dashboard.mvp.DistributorDashboardView
import dagger.Module
import dagger.Provides

@Module
class DistributorDashboardFragmentModule(private val appCompatActivity: AppCompatActivity) {
    @AppActivity
    @Provides
    fun getDistributorDashboardView(credentialsErrorDialog: CredentialsErrorDialog,
                                    retailerListAdapter: RetailerListAdapter,
                                    monthlySalesItemsAdapter: MonthlySalesItemsAdapter,
                                    monthListAdapter: MonthListAdapter,fiscalYearDialog: FiscalYearDialog
    ): DistributorDashboardView {
        return DistributorDashboardView(appCompatActivity,retailerListAdapter,
            monthlySalesItemsAdapter,credentialsErrorDialog,monthListAdapter,fiscalYearDialog,)
    }

    @Provides
    fun getFiscalYearDialog(): FiscalYearDialog {
        return FiscalYearDialog(appCompatActivity)
    }

    @Provides
    fun getDistributorDashboardModel(webservice: Webservice): DistributorDashboardModel {
        return DistributorDashboardModel(appCompatActivity,webservice)
    }

    @Provides
    fun getDistributorDashboardAdapter(): RetailerListAdapter {
        return RetailerListAdapter(appCompatActivity)
    }

    @Provides
    fun getMonthlySalesItemAdapter(): MonthlySalesItemsAdapter {
        return MonthlySalesItemsAdapter(appCompatActivity)
    }

    @Provides
    fun getMonthListAdapter(): MonthListAdapter {
        return MonthListAdapter(appCompatActivity)
    }


    @Provides
    fun getDistributorDashboardPresenter(
        distributorDashboardView: DistributorDashboardView,
        distributorDashboardModel: DistributorDashboardModel
    ): DistributorDashboardPresenter {
        return DistributorDashboardPresenter(distributorDashboardView, distributorDashboardModel)
    }

    @Provides
    fun getCredentialErrorDialog(errorMessage: String): CredentialsErrorDialog {
        return CredentialsErrorDialog(appCompatActivity, errorMessage)
    }
    @Provides
    fun getErrorMessage(): String {
        return String.Companion.toString()
    }
}
