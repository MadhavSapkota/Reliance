package com.reliance.yeticarpet.activity.retailer.distributordetails.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsModel
import com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsPresenter
import com.reliance.yeticarpet.activity.retailer.distributordetails.mvp.DistributorDetailsView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import dagger.Module
import dagger.Provides

@Module
class DistributorDetailsModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getMonthlyTrackerView(
        loginErrorDialog: CredentialsErrorDialog): DistributorDetailsView {
        return DistributorDetailsView(appCompatActivity, loginErrorDialog)
    }

    @Provides
    fun getMonthlyTrackerModel(webservice: Webservice): DistributorDetailsModel {
        return DistributorDetailsModel(appCompatActivity, webservice)
    }

    @Provides
    fun getDistributorListPresenter(
        distributorDetailsModel: DistributorDetailsModel,
        distributorDetailsView: DistributorDetailsView
    ): DistributorDetailsPresenter {
        return DistributorDetailsPresenter(distributorDetailsModel, distributorDetailsView)
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