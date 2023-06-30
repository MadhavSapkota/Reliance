package com.reliance.yeticarpet.activity.retailer.bill_details.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsAdapter
import com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsModel
import com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsPresenter
import com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsView
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import dagger.Module
import dagger.Provides

@Module
class BillDetailsModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getBillsDetailsView(loginErrorDialog: CredentialsErrorDialog,billsDetailsAdapter: BillsDetailsAdapter): BillDetailsView {
        return BillDetailsView(appCompatActivity,loginErrorDialog,billsDetailsAdapter)
    }

    @Provides
    fun getBillsDetailsModel(webservice: Webservice): BillDetailsModel {
        return BillDetailsModel(appCompatActivity,webservice)
    }

    @Provides
    fun getBillsAdapter(): BillsDetailsAdapter {
        return BillsDetailsAdapter(appCompatActivity)
    }

    @Provides
    fun getBillsDetailsPresenter(
        billDetailsModel: BillDetailsModel,
        billDetailsView: BillDetailsView
    ): BillDetailsPresenter {
        return BillDetailsPresenter(billDetailsModel,billDetailsView)
    }

    @Provides
    fun getBillDetailsDialog(errorMessage:String): CredentialsErrorDialog {
        return CredentialsErrorDialog(appCompatActivity,errorMessage)
    }

    @Provides
    fun getErrorMessage():String{
        return String.Companion.toString()
    }
}