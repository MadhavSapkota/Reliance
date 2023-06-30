package com.reliance.yeticarpet.activity.distributor.retailerdetails.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.distributor.retailerdetails.adapter.PartyListDetailsAdapter
import com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsModel
import com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsPresenter
import com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import dagger.Module
import dagger.Provides

@Module
class PartyListDetailsModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getPartyListDetailsTrackerView(
        loginErrorDialog: CredentialsErrorDialog,
        partyListDetailsAdapter: PartyListDetailsAdapter
    ): PartyListDetailsView {
        return PartyListDetailsView(appCompatActivity, loginErrorDialog, partyListDetailsAdapter)
    }

    @Provides
    fun getPartyListDetailsModel(webservice: Webservice): PartyListDetailsModel {
        return PartyListDetailsModel(appCompatActivity, webservice)
    }

    @Provides
    fun getPartyListDetailsAdapter(): PartyListDetailsAdapter {
        return PartyListDetailsAdapter(appCompatActivity)
    }

    @Provides
    fun getPartyListDetailsPresenter(
        partyListDetailsModel: PartyListDetailsModel,
        partyListDetailsView: PartyListDetailsView
    ): PartyListDetailsPresenter {
        return PartyListDetailsPresenter(partyListDetailsModel, partyListDetailsView)
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