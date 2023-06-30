package com.reliance.yeticarpet.fragment.bills.di
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.app.AppActivity
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.FilterDialog
import com.reliance.yeticarpet.dialog.FiscalYearDialog
import com.reliance.yeticarpet.dialog.NepaliDatePickerDialog
import com.reliance.yeticarpet.dialog.NepaliToDatePickerDialog
import com.reliance.yeticarpet.fragment.bills.adapter.BillsAdapter
import com.reliance.yeticarpet.fragment.bills.adapter.CustomSpinnerAdapter
import com.reliance.yeticarpet.fragment.bills.adapter.StatusAdapter
import com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillModel
import com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillPresenter
import com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView
import dagger.Module
import dagger.Provides

@Module
class RetailerBillModule(private val appCompatActivity: AppCompatActivity) {
    @AppActivity
    @Provides
    fun getRetailerBillView(billsAdapter: BillsAdapter, credentialsErrorDialog: CredentialsErrorDialog,
                            filterDialog: FilterDialog, nepaliDatePickerDialog: NepaliDatePickerDialog, nepaliToDatePickerDialog: NepaliToDatePickerDialog,
                            statusAdapter: StatusAdapter, webservice: Webservice, customSpinnerAdapter: CustomSpinnerAdapter,fiscalYearDialog: FiscalYearDialog
    ): RetailerBillView {
        return RetailerBillView(appCompatActivity, billsAdapter,statusAdapter, credentialsErrorDialog, filterDialog, nepaliDatePickerDialog,
            nepaliToDatePickerDialog,webservice,customSpinnerAdapter,fiscalYearDialog
        )
    }

    @Provides
    fun getRetailerBillModel(webservice: Webservice): RetailerBillModel {
        return RetailerBillModel(appCompatActivity, webservice)
    }

    @Provides
    fun getRetailerBillPresenter(
        retailerBillView: RetailerBillView,
        retailerBillModel: RetailerBillModel
    ): RetailerBillPresenter {
        return RetailerBillPresenter(retailerBillView, retailerBillModel)
    }


    @Provides
    fun getBillsAdapter(): BillsAdapter {
        return BillsAdapter(appCompatActivity)
    }

    @Provides
    fun getCustomSpinnerAdapter(): CustomSpinnerAdapter {
        val items = mutableListOf<String>() // Provide the desired items for the spinner
        val loadMoreListener: (Any?) -> Unit = { /* Implement the logic for loading more data */ }
        return CustomSpinnerAdapter(appCompatActivity, items, loadMoreListener)
    }


    @Provides
    fun getCredentialErrorDialog(errorMessage: String): CredentialsErrorDialog {
        return CredentialsErrorDialog(appCompatActivity, errorMessage)
    }

    @Provides
    fun getFiscalYearDialog():FiscalYearDialog  {
        return FiscalYearDialog(appCompatActivity)
    }



    @Provides
    fun getStatusAdapter(): StatusAdapter {
        return StatusAdapter(appCompatActivity)
    }


    @Provides
    fun getBillSearchDialog(nepaliDatePickerDialog: NepaliDatePickerDialog): FilterDialog {
        return FilterDialog(appCompatActivity,nepaliDatePickerDialog)
    }

    @Provides
    fun getNepaliDatePickerDialog(): NepaliDatePickerDialog {
        return NepaliDatePickerDialog(appCompatActivity)
    }

    @Provides
    fun getNepaliToDatePickerDialog(): NepaliToDatePickerDialog {
        return NepaliToDatePickerDialog(appCompatActivity)
    }



    @Provides
    fun getErrorMessage(): String {
        return String.Companion.toString()
    }
}
