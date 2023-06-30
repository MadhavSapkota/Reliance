package com.reliance.yeticarpet.dialog
import android.app.Dialog
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.retailer.bill.RetailerBillActivity
import com.reliance.yeticarpet.activity.retailer.dashboard.RetailerDashboardActivity
import com.reliance.yeticarpet.apputlis.AppConstant.billListChecked
import com.reliance.yeticarpet.apputlis.AppConstant.dashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.distributorDashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.fiscalFinancialYear
import com.reliance.yeticarpet.apputlis.AppConstant.hashMapFiscalYear
import com.reliance.yeticarpet.apputlis.AppConstant.retailerDashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.selectedFiscalYear
import com.reliance.yeticarpet.apputlis.FiscalYearInfo.fiscalYearId
import com.reliance.yeticarpet.fragment.distributor.dashboard.DistributorDashboardFragment
import com.reliance.yeticarpet.fragment.bills.RetailerBillFragment
import com.reliance.yeticarpet.fragment.retailer.dashboard.RetailerDashboardFragment
import io.reactivex.Observable

class FiscalYearDialog(private var appCompatActivity: AppCompatActivity){
    private var dialog: Dialog = Dialog(appCompatActivity)
    var spinnerFiscalYearValue: String = ""
    private var spinnerFiscalYear: Spinner?

    init {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.fiscal_year_dialoglayout)
        dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        spinnerFiscalYear = dialog.findViewById(R.id.sp_distributor)
    }

    fun showDialog() {
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.window!!.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        dialog.window!!.attributes = lp
        dialog.show()
    }

    fun dismissMenuDialog() {
        dialog.dismiss()
    }

    fun getSpinnerObservable(): Observable<Any>? {
        return spinnerFiscalYear?.let { RxView.clicks(it) }
    }


    fun setSpinner(fiscalYear: ArrayList<String>) {
        val adapter = ArrayAdapter(appCompatActivity, android.R.layout.simple_spinner_item, fiscalYear)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerFiscalYear?.adapter = adapter

        // Set OnClickListener on the spinner items
        spinnerFiscalYear?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                spinnerFiscalYearValue = parent?.getItemAtPosition(position) as String
                selectedFiscalYear = spinnerFiscalYearValue
                for ((key, value) in hashMapFiscalYear) {
                    if (value == spinnerFiscalYearValue) {
                        fiscalYearId = key
                        break

                    }
                    else if (value != spinnerFiscalYearValue) {
                        fiscalYearId = key
                        dismissMenuDialog()
                    }

                    if (dashboardChecked.equals(true)) {
                        if (distributorDashboardChecked.equals(true)){
                            loadFragment(DistributorDashboardFragment())
                            dismissMenuDialog()
                        }
                        else if (retailerDashboardChecked.equals(true)){
                            loadFragment(RetailerDashboardFragment())
                            dismissMenuDialog()
                        }
                    }
                    else if (billListChecked.equals(true)){
                        dismissMenuDialog()
                        loadFragment(RetailerBillFragment())
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle the case where no item is selected (optional)
            }
        }
    }



    fun loadFragment(fragment: Fragment) {
        val transaction=appCompatActivity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view_dashboard, fragment)
        transaction.commit()
    }
}
