package com.reliance.yeticarpet.dialog
import android.annotation.SuppressLint
import android.app.Dialog
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.R
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable

//this is for FromDatePicker Date in bill section filter portion.
class NepaliDatePickerDialog(private var appCompatActivity: AppCompatActivity) {
    private var dialog: Dialog = Dialog(appCompatActivity)
    private var yearPicker: Spinner
    private var monthPicker: Spinner
    private var DayPicker: Spinner
    private var okButton: Button
    private var btnCancel: Button
    var selectedFromMonth: Int=1
    var selectedFromYear: Int=0
    var selectedFromDay: Int=0

    var yearList: ArrayList<String>?=null
    var dayList: ArrayList<String>?=null
    var monthList: ArrayList<String>?=null
    var currentYear: Int=0
    var currentMonth: Int=0
    var currentDays: Int=0

    init {
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)

        dialog.setContentView(R.layout.nepali_date_picker_layout)
        yearPicker=dialog.findViewById(R.id.spYear)
        monthPicker=dialog.findViewById(R.id.spMonth)
        DayPicker=dialog.findViewById(R.id.spDay)
        btnCancel=dialog.findViewById(R.id.btn_cancel)
        okButton = dialog.findViewById(R.id.btn_ok)
    }

    @SuppressLint("CheckResult")
    fun showFromDialog(stringArray: List<String>) {
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(dialog.window!!.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        dialog.window!!.attributes = lp
        dialog.setCanceledOnTouchOutside(false)
        dialog.setCancelable(false)

        if (stringArray.isNotEmpty() && stringArray[0].length >= 2) {
            currentYear = stringArray[0].substring(2).toInt()
        }

        if (stringArray.size >= 2) {
            currentMonth = stringArray[1].toInt()
        }

        if (stringArray.size >= 3) {
            currentDays = stringArray[2].toInt()
        }
        getFromListOfYear()
        getFromMonthList()


        RxView.clicks(btnCancel).doOnNext { dialog.dismiss() }.subscribe()
        dialog.show()
    }


    fun getOkObserable(): Observable<Any> {
        return RxView.clicks(okButton)

    }

    fun getNepaliFromSelectedDate(): String {
        return "${yearPicker.selectedItem}-${monthPicker.selectedItem}-${DayPicker.selectedItem} "
    }


    fun getFromListOfYear() {
        yearList=ArrayList()
        for (i in 2085 downTo 2000) {
            yearList!!.add(i.toString())
        }
        val Yearadapter=ArrayAdapter(
            appCompatActivity,
            R.layout.spinner_date, yearList!!
        )
        yearPicker.adapter=Yearadapter
        yearPicker.setSelection(currentYear)
        yearPicker.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                arg0: AdapterView<*>, arg1: View,
                arg2: Int, arg3: Long
            ) {
                selectedFromYear=Yearadapter.getItem(arg2)!!.toInt()
                getFromListOfDays()
            }
            override fun onNothingSelected(arg0: AdapterView<*>) {

            }
        }
    }

    fun getFromMonthList() {
        monthList = ArrayList()
        val monthsArray = appCompatActivity.resources.getStringArray(R.array.months_array)
        monthList!!.addAll(monthsArray.toList())
        val Monthadapter=ArrayAdapter(appCompatActivity, R.layout.spinner_item, monthList!!)
        monthPicker.adapter=Monthadapter
        monthPicker.setSelection(currentMonth - 1)
        monthPicker.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                arg0: AdapterView<*>, arg1: View,
                arg2: Int, arg3: Long
            ) {
                selectedFromMonth=arg2 + 1
                getFromListOfDays()
            }

            override fun onNothingSelected(arg0: AdapterView<*>) {

            }
        }
    }


    fun getFromListOfDays() {
        dayList = ArrayList()

        val daysInIthMonth = MediaDateConvertor.getHasMap()!![selectedFromYear]!![selectedFromMonth]

        for (i in 1..daysInIthMonth) {
            val formattedDay = if (i < 10) "0$i" else i.toString()
            dayList!!.add(formattedDay)
        }
        when {currentDays > daysInIthMonth -> currentDays = daysInIthMonth }
        val dayAdapter = ArrayAdapter(appCompatActivity, R.layout.spinner_item, dayList!!)
        DayPicker.adapter = dayAdapter
        DayPicker.setSelection(currentDays - 1)
        DayPicker.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                arg0: AdapterView<*>, arg1: View,
                arg2: Int, arg3: Long
            ) {
                selectedFromDay = DayPicker.selectedItem!!.toString().toInt()
            }

            override fun onNothingSelected(arg0: AdapterView<*>) {
            }
        }
    }

    fun getDismissDialog() {
        dialog.dismiss()
    }
}