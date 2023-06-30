package com.reliance.yeticarpet.dialog
import android.annotation.SuppressLint
import android.app.Dialog
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.reliance.yeticarpet.R
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.Observable


class NepaliToDatePickerDialog(private var appCompatActivity: AppCompatActivity) {
    private var dialog: Dialog = Dialog(appCompatActivity)
    private var yearPicker: Spinner
    private var monthPicker: Spinner
    private var DayPicker: Spinner
    private var okButton: Button
    private var btnCancel: Button
    var selectedToMonth: Int=1
    var selectedToYear: Int=0
    var selectedToDay: Int=0

    var yearList: ArrayList<String>?=null
    var dayList: ArrayList<String>?=null
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
    fun showToDialog(stringArray: List<String>) {
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
        getToListOfYear()
        getToMonthList()


        RxView.clicks(btnCancel).doOnNext { dialog.dismiss() }.subscribe()
        dialog.show()
    }


    fun getOkObserable(): Observable<Any> {
        return RxView.clicks(okButton)

    }

    fun getNepaliToSelectedDate(): String {
        return "${yearPicker.selectedItem}-${monthPicker.selectedItem}-${DayPicker.selectedItem} "
    }


    fun getToListOfYear() {
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
                selectedToYear=Yearadapter.getItem(arg2)!!.toInt()
                getToListOfDays()
            }
            override fun onNothingSelected(arg0: AdapterView<*>) {

            }
        }
    }

    fun getToMonthList() {
        val Monthadapter=ArrayAdapter(
            appCompatActivity,
            R.layout.spinner_item, appCompatActivity.resources.getStringArray(R.array.months_array)
        )
        monthPicker.adapter=Monthadapter
        monthPicker.setSelection(currentMonth - 1)
        monthPicker.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                arg0: AdapterView<*>, arg1: View,
                arg2: Int, arg3: Long
            ) {
                selectedToMonth=arg2 + 1
                getToListOfDays()
            }

            override fun onNothingSelected(arg0: AdapterView<*>) {

            }
        }
    }


    fun getToListOfDays() {
        dayList = ArrayList()

        val daysInIthMonth = MediaDateConvertor.getHasMap()!![selectedToYear]!![selectedToMonth]

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
                selectedToDay = DayPicker.selectedItem!!.toString().toInt()
            }

            override fun onNothingSelected(arg0: AdapterView<*>) {
            }
        }
    }

    fun getDismissDialog() {
        dialog.dismiss()
    }
}