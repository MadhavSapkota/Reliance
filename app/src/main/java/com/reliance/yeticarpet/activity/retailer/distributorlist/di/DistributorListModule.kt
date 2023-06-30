package com.reliance.yeticarpet.activity.retailer.distributorlist.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.distributorlist.adapter.DistributorListAdapter
import com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListModel
import com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListPresenter
import com.reliance.yeticarpet.activity.retailer.distributorlist.mvp.DistributorListView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import dagger.Module
import dagger.Provides

@Module
class DistributorListModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getMonthlyTrackerView(
        loginErrorDialog: CredentialsErrorDialog,
        distributorListAdapter: DistributorListAdapter
    ): DistributorListView {
        return DistributorListView(appCompatActivity, loginErrorDialog, distributorListAdapter)
    }

    @Provides
    fun getMonthlyTrackerModel(webservice: Webservice): DistributorListModel {
        return DistributorListModel(appCompatActivity, webservice)
    }

    @Provides
    fun getRetailerDashboardAdapter(): DistributorListAdapter {
        return DistributorListAdapter(appCompatActivity)
    }

    @Provides
    fun getDistributorListPresenter(
        distributorListModel: DistributorListModel,
        distributorListView: DistributorListView
    ): DistributorListPresenter {
        return DistributorListPresenter(distributorListModel, distributorListView)
    }

    @Provides
    fun getCredentialsErrorDialog(errorMessage: String): CredentialsErrorDialog {
        return CredentialsErrorDialog(appCompatActivity, errorMessage)
    }

    @Provides
    fun getErrorMessage(): String {
        return String.Companion.toString()
    }
}