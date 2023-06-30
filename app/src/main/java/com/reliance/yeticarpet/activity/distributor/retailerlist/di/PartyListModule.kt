package com.reliance.yeticarpet.activity.distributor.retailerlist.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListAdapter
import com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListModel
import com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListPresenter
import com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import dagger.Module
import dagger.Provides

@Module
class PartyListModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getPartyTrackerView(
        loginErrorDialog: CredentialsErrorDialog,
        partyListAdapter: PartyListAdapter
    ): PartyListView {
        return PartyListView(appCompatActivity, loginErrorDialog, partyListAdapter)
    }

    @Provides
    fun getPartyModel(webservice: Webservice): PartyListModel {
        return PartyListModel(appCompatActivity, webservice)
    }

    @Provides
    fun getPartyDashboardAdapter(): PartyListAdapter {
        return PartyListAdapter(appCompatActivity)
    }


    @Provides
    fun getPartyListPresenter(
        partyListModel: PartyListModel,
        partyListView: PartyListView
    ): PartyListPresenter {
        return PartyListPresenter(partyListModel, partyListView)
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