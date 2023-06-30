package com.reliance.yeticarpet.fragment.retailer.dashboard.mvp
import android.annotation.SuppressLint
import android.view.View
import android.widget.FrameLayout
import android.widget.TableLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.mikephil.charting.charts.HorizontalBarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.ValueFormatter
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.apputlis.AppConstant.fiscalFinancialYear
import com.reliance.yeticarpet.apputlis.AppConstant.totalBillAmounts
import com.reliance.yeticarpet.apputlis.AppConstant.totalPurchase
import com.reliance.yeticarpet.apputlis.AppUtils.formatDecimalTwoDigitValue
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.RetailerInfo.retailerName
import com.reliance.yeticarpet.apputlis.RetailerInfo.retailerScheme
import com.reliance.yeticarpet.apputlis.RetailerInfo.totalBillAmount
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.MainFragmentDashboardRetailerLayoutBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.dialog.FiscalYearDialog
import com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.HorizontalBarChartAdapter
import com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardAdapter
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail
import io.reactivex.Observable
import kotlinx.android.synthetic.main.fragment_dashboard_retailer.view.*
import kotlinx.android.synthetic.main.main_fragment_dashboard_retailer_layout.view.*
import java.text.DecimalFormat

@SuppressLint("ViewConstructor")
class RetailerDashboardView(
    private val appCompatActivity: AppCompatActivity,
    private val retailerDashboardAdapter: RetailerDashboardAdapter,
    private val credentialsErrorDialog: CredentialsErrorDialog,
    val fiscalYearDialog: FiscalYearDialog
) : FrameLayout(appCompatActivity) {
    var binding: MainFragmentDashboardRetailerLayoutBinding? = null
    private lateinit var mChart: HorizontalBarChart
    private lateinit var adapter: HorizontalBarChartAdapter


    var maxValue = 0
    private var maxValueOnXAxis = 0
    private var granularity = 0


    fun start(dashboardBinding: MainFragmentDashboardRetailerLayoutBinding) {
        binding = dashboardBinding
        setRetailerDashboardAdapter()
        addTextViewForXAxis(maxValue)
    }

    fun setGraphRecyclerViewAdapter(pointList:ArrayList<Int>) {
        adapter = HorizontalBarChartAdapter(pointList, maxValueOnXAxis, appCompatActivity)
        binding!!.inDashboard.graph.recyclerView.adapter = adapter

    }

    fun addTextViewForXAxis(maxValue: Int) {
        when {
            maxValue > 10 -> createTextView(5)
            maxValue > 8 -> createTextView(5)
            maxValue > 6 -> createTextView(4)
            maxValue > 4 -> createTextView(3)
            maxValue > 2 -> createTextView(2)
            else -> createTextView(1)
        }
    }

    private fun createTextView(numberOfTextView: Int) {
        generateOriginalLabelForXAxis()
        for (index in 1..numberOfTextView) {
            generateXAxisTextView((index * granularity).toString())
        }
    }

    private fun generateOriginalLabelForXAxis() {
        val textView = TextView(appCompatActivity)
        textView.text = appCompatActivity.getString(R.string.zero)
        binding!!.inDashboard.graph.xAxisTextviewContainer.addView(textView)

    }

    private fun generateXAxisTextView(value: String) {
        val textView = TextView(appCompatActivity)
        textView.text = value
        textView.textAlignment = View.TEXT_ALIGNMENT_TEXT_END
        textView.layoutParams = TableLayout.LayoutParams(
            TableLayout.LayoutParams.WRAP_CONTENT,
            TableLayout.LayoutParams.WRAP_CONTENT,
            1f
        )
        binding!!.inDashboard.graph.xAxisTextviewContainer.addView(textView)
    }

    fun getGranularity(pointList:ArrayList<Int>) {
        maxValue = pointList.maxOrNull() ?: 0
        calculateGranularity(maxValue)
    }

    private fun calculateGranularity(maxValue: Int) {
        when {
            maxValue > 10 -> {
                maxValueOnXAxis = maxValue + (5 - (maxValue % 5))
                granularity = maxValueOnXAxis / 5
            }
            maxValue > 6 -> {
                maxValueOnXAxis = 8
                granularity = 2
            }

            maxValue > 4 -> {
                maxValueOnXAxis = 6
                granularity = 2

            }
        }
    }


    fun dismissDialog() {
        binding!!.idPbar.visibility = View.GONE
    }

    fun showDialog() {
        binding!!.idPbar.visibility = View.VISIBLE
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }


    class CenterValueFormatter : ValueFormatter() {
        override fun getBarLabel(barEntry: BarEntry?): String {
            return barEntry?.y?.toString() ?: ""
        }
    }


    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }

    fun getCredentialErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            credentialsErrorDialog.showDialog(message!!)
        })
    }

    fun getOkObserable(): Observable<Any> {
        return credentialsErrorDialog.getOKObservable()
    }

    fun getDismissDialog() {
        credentialsErrorDialog.dismissDialog()
    }

    fun getSessionErrorMessage(): String {
        return appCompatActivity.getString(R.string.login_session_error_message)
    }

    fun getUserPortalErrorMessage(): String {
        return appCompatActivity.getString(R.string.login_user_portal_message)
    }

    fun showDashboardContent() {
        binding!!.rlMain.setVisibility(View.VISIBLE)
    }

    fun showRetailerListData(termlist: List<SchemeDetail>?, aboolean: Boolean) {
        retailerDashboardAdapter.showBillsItem(termlist as ArrayList<SchemeDetail>?, aboolean)
    }


    fun setRetailerDashboardAdapter() {
        var layoutmanager: LinearLayoutManager? = LinearLayoutManager(appCompatActivity, LinearLayoutManager.VERTICAL, false)
        binding?.inDashboard?.schemeGraph?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.inDashboard?.schemeGraph?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.inDashboard?.schemeGraph?.dashboardRecyclerView?.adapter = retailerDashboardAdapter
    }

    //drop down clickable icon8
    fun getDropDownClickedObservable(): Observable<SchemeDetail> {
        return retailerDashboardAdapter.clickSubject
    }

    fun postRefreshRequest(): ApiRequest.RefreshTokenRequest {
        return ApiRequest.RefreshTokenRequest(
            refresh = UserInfo.refreshToken,
        )
    }

    @SuppressLint("SetTextI18n")
    fun setRetailerDashboardDetails(result: RetailerDashboardResponse) {
        totalBillAmount = result.totalBillAmount.toString()
        totalBillAmounts.add(totalBillAmount)
        binding!!.inDashboard.tvRetailerDashboardHeader.text = retailerName
        totalPurchase = result.totalBillAmount!!.toString()

        retailerScheme = result.totalBillAmount?.toDouble().toString()
        binding!!.inDashboard.tvTranscationAmount.text = "Rs. " + formatNumberWithCommasAndDecimals( result.totalBillAmount!!.toString())
        binding!!.inDashboard.tvSchemeAmount.text = "Rs. " + result.totalScheme?.let { formatDecimalTwoDigitValue(it) }?.let { formatNumberWithCommasAndDecimals(it) }
    }



}














