package com.reliance.yeticarpet.dialog
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.apputlis.AppConstant.distributorDashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.retailerDashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.selectedDistributorName
import com.reliance.yeticarpet.apputlis.AppConstant.selectedRetailerName
import com.reliance.yeticarpet.fragment.bills.adapter.CustomSpinnerAdapter
import io.reactivex.Observable

class FilterDialog(private var appCompatActivity: AppCompatActivity,
                   private var nepaliDatePickerDialog: NepaliDatePickerDialog
) :
    AdapterView.OnItemSelectedListener {

    private var dialog: BottomSheetDialog=BottomSheetDialog(appCompatActivity, R.style.SheetDialog)
    var spinnerValue: String = ""
    var et_from_date:EditText? = null
    var  et_to_date:EditText? = null
    var spinnerDistributor:Spinner?
    private  var et_bill_number:EditText? =null
    private  var applyButton: RelativeLayout? = null
    var nameOfParty:TextView?=null
    lateinit var adapter: CustomSpinnerAdapter
    private var currentPage = 1 // Starting page


    init {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.filter_layout)
        dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        et_from_date=dialog.findViewById(R.id.et_from_date)
        et_to_date=dialog.findViewById(R.id.et_to_date)
        spinnerDistributor = dialog.findViewById(R.id.sp_distributor)
        nameOfParty = dialog.findViewById(R.id.tv_partyName)
        et_bill_number= dialog.findViewById(R.id.sp_bill_no)
        applyButton = dialog.findViewById(R.id.rlSubmit)

    }


    fun showDialog() {
        val lp=WindowManager.LayoutParams()
        lp.copyFrom(dialog.window!!.attributes)
        lp.width=WindowManager.LayoutParams.MATCH_PARENT
        dialog.window!!.attributes=lp
        dialog.show()

    }

    fun getUserFromDate(): String {
        return et_from_date?.text.toString()
    }

    fun getUserToDate(): String {
        return et_to_date?.text.toString()
    }

    fun getBillNumber(): String {
        return et_bill_number?.text.toString()
    }

    fun dismissMenuDialog(){
        dialog.dismiss()
    }

    fun getSubmitObserable():Observable<Any>{
        return  RxView.clicks(applyButton!!)
    }

    fun geToDateObservable(): Observable<Any>? {
        return et_to_date?.let { RxView.clicks(it) }
    }

    fun geFromDateObservable(): Observable<Any>? {
        return et_from_date?.let { RxView.clicks(it) }
    }

    fun getToDate(): String {
        return et_to_date?.text.toString()
    }

    fun getFromDate(): String {
        return et_from_date?.text.toString()
    }


    fun setSpinner() {
        if (retailerDashboardChecked.equals(true)){
        val adapter = ArrayAdapter(appCompatActivity, android.R.layout.simple_spinner_item, AppConstant.distributorNames)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerDistributor?.adapter = adapter
          }
        else if (distributorDashboardChecked.equals(true)){


        val retailerAdapter = ArrayAdapter(appCompatActivity, android.R.layout.simple_spinner_item, AppConstant.retailerNames)
            retailerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerDistributor?.adapter = retailerAdapter

            }
        spinnerDistributor?.onItemSelectedListener = this
    }


    override fun onItemSelected(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        val textView = parent?.getChildAt(0) as TextView
        spinnerValue = parent?.getItemAtPosition(position) as String

        if (retailerDashboardChecked.equals(true)){
        selectedDistributorName = spinnerValue
        if (spinnerValue.length > 5) {
            textView.text = "${spinnerValue.substring(0, 8)}..."
        } else {
            spinnerValue = "Select"
            textView.text = spinnerValue
        }
       }
        else if (distributorDashboardChecked.equals(true)){
            selectedRetailerName = spinnerValue
            if (spinnerValue.length > 5) {
                textView.text = "${spinnerValue.substring(0, 8)}..."
            } else {
                spinnerValue = "Select"
                textView.text = spinnerValue
            }
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        Toast.makeText(appCompatActivity, "Select Manufacturer Name ", Toast.LENGTH_SHORT).show()
    }
}