package com.reliance.yeticarpet.fragment.bills.mvp
import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Context
import android.graphics.Color
import android.os.AsyncTask
import android.view.GestureDetector
import android.view.View
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.LegendEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.apputlis.*
import com.reliance.yeticarpet.apputlis.AppConstant.filterChecked
import com.reliance.yeticarpet.apputlis.AppConstant.nestedScrollChecked
import com.reliance.yeticarpet.apputlis.AppConstant.normalChecked
import com.reliance.yeticarpet.apputlis.AppConstant.selectedFromDate
import com.reliance.yeticarpet.apputlis.AppConstant.selectedToDate
import com.reliance.yeticarpet.apputlis.AppConstant.retailerListSize
import com.reliance.yeticarpet.apputlis.AppConstant.searchChecked
import com.reliance.yeticarpet.apputlis.AppConstant.selectedEndDate
import com.reliance.yeticarpet.apputlis.AppConstant.selectedStartDate
import com.reliance.yeticarpet.apputlis.AppConstant.statusAllDistributorClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusAllRetailerClicked

import com.reliance.yeticarpet.apputlis.AppConstant.statusCompletedDistributorClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusCompletedRetailerClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusId
import com.reliance.yeticarpet.apputlis.AppConstant.statusPendingDistributorClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusPendingRetailerClicked
import com.reliance.yeticarpet.apputlis.AppUtils.getNepalMonthValue
import com.reliance.yeticarpet.databinding.FragmentRetailerBillBinding
import com.reliance.yeticarpet.dialog.*
import com.reliance.yeticarpet.fragment.bills.adapter.BillsAdapter
import com.reliance.yeticarpet.fragment.bills.adapter.CustomSpinnerAdapter
import com.reliance.yeticarpet.fragment.bills.adapter.StatusAdapter
import com.reliance.yeticarpet.fragment.bills.dto.MonthBillDataStatus
import com.reliance.yeticarpet.fragment.bills.dto.StatusData
import io.reactivex.Observable
import kotlinx.android.synthetic.main.dashboard_recyclerview.view.dashboardRecyclerView



class RetailerBillView(
    private val appCompatActivity: AppCompatActivity,
    private val billsAdapter: BillsAdapter,
    private val statusAdapter: StatusAdapter,
    private val credentialsErrorDialog: CredentialsErrorDialog,
    val filterDialog: FilterDialog,
    val nepaliDatePickerDialog: NepaliDatePickerDialog,
    val nepaliToDatePickerDialog: NepaliToDatePickerDialog,
    val webservice: Webservice,
    val customSpinnerAdapter: CustomSpinnerAdapter,
    val fiscalYearDialog: FiscalYearDialog
) : SearchView.OnQueryTextListener
{
    var searchManager: SearchManager = appCompatActivity.getSystemService(Context.SEARCH_SERVICE) as SearchManager
    var binding: FragmentRetailerBillBinding? = null
    private var progressBar = CustomProgressBar()
    var stringArray: List<String>?=null
    var countBillCount = retailerListSize

    private val presenter: RetailerBillPresenter = RetailerBillPresenter(this, RetailerBillModel(appCompatActivity, webservice))


    @SuppressLint("SetTextI18n", "ClickableViewAccessibility")
    fun start(
        fragmentRetailerBinding: FragmentRetailerBillBinding,
        gestureDetector: GestureDetector
    ) {
        binding = fragmentRetailerBinding
        setBillsAdapter()
        filterDialog.setSpinner()
        DateConvertor().execute()
        setDialogValue()

        binding?.root?.setOnTouchListener { _, event ->
            gestureDetector?.onTouchEvent(event)
            true
        }
    }

    fun getNepaliString(): List<String> {
        return stringArray!!
    }



    fun getOkObservable():Observable<Any>{
        return nepaliDatePickerDialog.getOkObserable()
    }
    fun showFromCalender(strArray: List<String>?) {
        nepaliDatePickerDialog.showFromDialog(strArray!!)
    }

    fun getToOkObservable():Observable<Any>{
        return nepaliToDatePickerDialog.getOkObserable()
    }

    fun showToCalender(strArray: List<String>?) {
        nepaliToDatePickerDialog.showToDialog(strArray!!)
    }


    private fun setDialogValue() {
        selectedStartDate = filterDialog.getFromDate()
        selectedEndDate = filterDialog.getToDate()
    }

    fun setShowingEntriesText(result: List<ResultData>?, filterResult: FilterResponse?, resultFilter: List<ResultData>?) {
        var count = when {
            normalChecked -> result?.size ?: 0
            filterChecked -> filterResult?.billData?.results?.size ?: 0
            searchChecked -> resultFilter?.size?:0
            else -> 0
        }
        val entriesText = "Showing $count entries"
       binding?.tvShowingEnteries?.text = entriesText
    }

    fun showProgressDialog(statusString: String) {
        progressBar.show(appCompatActivity, statusString)
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }

    fun hidProgressDialog1() {
        binding!!.idPbar.visibility = View.GONE
    }

    fun hidePieProgessDialog() {
        binding!!.idPbar1.visibility = View.GONE
    }


    fun setFromNepaliDate() {
        nepaliDatePickerDialog.getDismissDialog()
        selectedFromDate = nepaliDatePickerDialog.getNepaliFromSelectedDate()
       filterDialog.et_from_date?.setText(selectedFromDate)
    }

    fun setToNepaliDate() {
        nepaliToDatePickerDialog.getDismissDialog()
        selectedToDate = nepaliToDatePickerDialog.getNepaliToSelectedDate()
        filterDialog.et_to_date?.setText(selectedToDate)
    }

    fun showPaginationProgressDialog(){
        binding!!.progressBar.visibility = View.VISIBLE
    }

    fun disablePaginationProgressDialog(){
        binding!!.progressBar.visibility = View.GONE
    }

    fun getBillNumber(): String {
       return filterDialog.getBillNumber()
    }

    fun showBillsListItems(termlist: List<ResultData>?, aboolean: Boolean,nestedScrollClicked:Boolean) {
        billsAdapter.showBillsItem(termlist as ArrayList<ResultData>?, aboolean,nestedScrollClicked)
    }

    fun showNestedListItems(nestedlist: List<ResultData>?, aboolean: Boolean,nestedScrollClicked:Boolean) {
        billsAdapter.showNestedBillsItem(nestedlist as ArrayList<ResultData>?, aboolean,nestedScrollClicked)
    }


    fun setBillsAdapter() {
        var layoutmanager: LinearLayoutManager? = LinearLayoutManager(appCompatActivity, LinearLayoutManager.VERTICAL, false)
        binding?.myDashboardBillsListItemsRecyclerviewInclude?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.myDashboardBillsListItemsRecyclerviewInclude?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.myDashboardBillsListItemsRecyclerviewInclude?.dashboardRecyclerView?.adapter = billsAdapter
        binding?.myDashboardBillsListItemsRecyclerviewInclude?.dashboardRecyclerView?.adapter
    }

    fun setStatusListAdapter() {
        var layoutmanager: LinearLayoutManager? = LinearLayoutManager(appCompatActivity, LinearLayoutManager.HORIZONTAL, false)
        binding?.statusDataRecyclerviewInclude!!.dashboardRecyclerView?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.statusDataRecyclerviewInclude!!.dashboardRecyclerView?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.statusDataRecyclerviewInclude!!.dashboardRecyclerView?.dashboardRecyclerView?.adapter = statusAdapter
    }


    fun showProgressDialog1(statusString: String) {
        binding!!.idPbar.visibility = View.VISIBLE
    }

    fun getCredentialErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            credentialsErrorDialog.showDialog(message!!)
        })
    }

    //bill list clickable
    fun getCardViewClickedObservable(): Observable<ResultData> {
        return billsAdapter.clickSubject
    }

    fun showStatusListData(statusData: List<StatusData>?, aboolean: Boolean) {

        statusAdapter.OnItemsClickListener(object : StatusAdapter.OnItemsClickListener{
            override fun onItemsClick(position: Int) {
                statusId = position
                val distributorId = UserInfo.distributorId
                val retailerId = UserInfo.retailerId

                if (statusId == 0 && distributorId != null) {
                    statusAllDistributorClicked = true
                    statusCompletedDistributorClicked = false
                    statusPendingDistributorClicked = false
                    nestedScrollChecked = false
                    presenter.billListInDistributorRequest(distributorId)

                }
                if (statusId == 1 && distributorId != null) {
                    statusCompletedDistributorClicked = true
                    statusAllDistributorClicked = false
                    statusPendingDistributorClicked = false
                    nestedScrollChecked = false
                    presenter.billListCompletedDistributorList(true,distributorId)

                }
                else if (statusId == 2 && distributorId != null) {
                    statusPendingDistributorClicked = true
                    statusCompletedDistributorClicked = false
                    statusAllDistributorClicked = false
                    nestedScrollChecked = false
                    presenter.billListInPendingDistributorRequest(distributorId,false)


                }

                if (statusId == 0 && retailerId != null){
                    statusAllRetailerClicked = true
                    statusCompletedRetailerClicked = false
                    statusPendingRetailerClicked = false
                    nestedScrollChecked = false
                    presenter.billListRetailerAllRequest(retailerId)
                }

                else if (statusId == 1 && retailerId != null) {
                    statusCompletedRetailerClicked = true
                    statusAllRetailerClicked = false
                    statusPendingRetailerClicked = false
                    nestedScrollChecked = false
                    presenter.billListCompletedRequest(true,retailerId)
                }

                else if (statusId == 2 && retailerId != null) {
                    statusPendingRetailerClicked = true
                    statusAllRetailerClicked = false
                    statusCompletedRetailerClicked = false
                    nestedScrollChecked = false
                    presenter.billListCompletedRequest(false,retailerId)
                }
            }
        })
        statusAdapter.showStatusList(statusData as ArrayList<StatusData>?, true)
    }


    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }

    fun getOkObserable(): Observable<Any> {
        return credentialsErrorDialog.getOKObservable()
    }

    fun pieChart(countCompleted: Int,inCompleteCount:Int) {
        hidePieProgessDialog()

        val i = countCompleted // Complete count
        val j = inCompleteCount // inCompleteCount
        val k = i +j //totalCount

        val passPercent = (i*100/k).toFloat()
        val failPercent = (j*100/k).toFloat()

        val entries = listOf(
         PieEntry(passPercent, ""),
            PieEntry(failPercent, "")
        )

        val dataSet = PieDataSet(entries, "")
        val redColor = ContextCompat.getColor(appCompatActivity, R.color.colorRed)
        val lightGreenColor = ContextCompat.getColor(appCompatActivity, R.color.colorLightGreen)
        dataSet.valueTextColor = Color.WHITE
        dataSet.valueLinePart1OffsetPercentage = 20f // Set the distance of the value text from the pie chart

        val data = PieData(dataSet)
        binding?.pieBills?.data = data
        binding?.pieBills?.centerText = passPercent.toInt().toString() + "%\nCompleted"
        binding?.pieBills?.setUsePercentValues(true)
        binding?.pieBills?.description?.isEnabled = false
        binding?.pieBills?.legend?.isEnabled = true
        binding?.pieBills?.legend?.textSize = 14f
        binding?.pieBills?.legend?.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
        binding?.pieBills?.legend?.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER


        binding?.pieBills?.legend?.setCustom(
            listOf(
                LegendEntry("", Legend.LegendForm.SQUARE, 8f, 10f, null, redColor).apply {
                    binding?.pieBills?.legend?.formLineWidth = 10f // Adjust the spacing between the form and the label
                },
                LegendEntry("", Legend.LegendForm.SQUARE, 8f, 10f, null, lightGreenColor).apply {
                    binding?.pieBills?.legend?.formLineWidth =10f // Adjust the spacing between the form and the label
                }
            )
        )
        binding?.pieBills?.legend?.isWordWrapEnabled = true
        dataSet.colors = listOf(lightGreenColor, redColor)


        binding?.pieBills?.holeRadius = 60f
        binding?.pieBills?.transparentCircleRadius = 0f
        binding?.pieBills?.invalidate()
    }



    fun setGraph(monthBillStatus: Map<String, MonthBillDataStatus>) {
        val approvedEntries = mutableListOf<Entry>()
        val pendingEntries = mutableListOf<Entry>()


            for ((key, value) in monthBillStatus) {
               val approvedSales = value.approvedSales!!.toFloat()
                val pendingSales = value.pendingSales!!.toFloat()

                value.month?.let { getNepalMonthValue(it) }
                    ?.let { Entry(it.toFloat(), pendingSales) }?.let { approvedEntries.add(it) }

                value.month?.let { getNepalMonthValue(it) }
                    ?.let { Entry(it.toFloat(), approvedSales) }?.let { pendingEntries.add(it) }
            }


        val approvedDataSet = LineDataSet(approvedEntries, "Approved Sales")
        approvedDataSet.color = ContextCompat.getColor(appCompatActivity, R.color.lightgreen)
        approvedDataSet.lineWidth = 2f
        approvedDataSet.circleRadius = 4f
        approvedDataSet.setDrawCircleHole(true)
        approvedDataSet.setCircleColor(ContextCompat.getColor(appCompatActivity, R.color.lightgreen))
        approvedDataSet.valueTextSize = 12f
        approvedDataSet.setDrawValues(false)

        val pendingDataSet = LineDataSet(pendingEntries, "Pending Sales")
        pendingDataSet.color = ContextCompat.getColor(appCompatActivity, R.color.colorRed)
        pendingDataSet.lineWidth = 2f
        pendingDataSet.circleRadius = 4f
        pendingDataSet.setDrawCircleHole(true)
        pendingDataSet.setCircleColor(ContextCompat.getColor(appCompatActivity, R.color.colorRed))
        pendingDataSet.valueTextSize = 12f
        pendingDataSet.setDrawValues(false)

        val lineData = LineData(approvedDataSet, pendingDataSet)

        // Configure the X-axis
        val xAxis = binding!!.lineChart.xAxis
        xAxis.setDrawAxisLine(false)
        xAxis.setDrawLabels(false)
        xAxis.setDrawGridLines(false)

        // Configure the Y-axis
        val yAxisLeft = binding!!.lineChart.axisLeft
        yAxisLeft.isEnabled = false

        val yAxisRight = binding!!.lineChart.axisRight
        yAxisRight.setDrawGridLines(false)
        yAxisRight.setDrawZeroLine(true)
        yAxisRight.axisMinimum = 0f

        // Set the LineData to the chart
        binding!!.lineChart.data = lineData

        // Set the chart description label to null
        binding!!.lineChart.description = null

        // Invalidate the chart to refresh its appearance
        binding!!.lineChart.invalidate()
    }



    fun searchBoxImplementation() {
        binding!!.searchView.setSearchableInfo(searchManager.getSearchableInfo(appCompatActivity!!.componentName))
        binding!!.searchView.setIconified(false);
        binding!!.searchView.setOnQueryTextListener(this)
    }

    override fun onQueryTextSubmit(p0: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(textChange: String?): Boolean {
        billsAdapter.getFilter().filter(textChange)
        return true
    }

    fun showOptionDialog() {
        filterDialog.showDialog()
    }

    inner class DateConvertor() : AsyncTask<Void, Void, String>() {
        @SuppressLint("WrongThread")
        override fun doInBackground(vararg params: Void?): String? {
            stringArray= DateInfo.nepaliConvertedDate.split("/")
            return "success"
        }

        override fun onPreExecute() {
            super.onPreExecute()
        }

        override fun onPostExecute(result: String) {
            super.onPostExecute(result)
        }
    }

    fun dismissDialog() {
        filterDialog.dismissMenuDialog()
    }
    fun getFilterObservable(): Observable<Any> {
        return RxView.clicks(binding!!.btnFilter)
    }
    fun getSearchObservable(): Observable<Any> {
        return RxView.clicks(binding!!.llSearch)
    }

    fun hideGraph(){
        binding!!.rlCharts.visibility = View.GONE
    }

    fun hidePieChart(){
        binding!!.pieBills.visibility = View.GONE
    }

    fun showGraph(){
        binding!!.rlCharts.visibility = View.VISIBLE
    }

    fun showPieChart(){
        binding!!.pieBills.visibility = View.VISIBLE
    }


    fun postRefreshRequest(): ApiRequest.RefreshTokenRequest {
        return ApiRequest.RefreshTokenRequest(
            refresh = UserInfo.refreshToken,
        )
    }

    fun getSessionErrorMessage(): String {
        return appCompatActivity.getString(R.string.login_session_error_message)
    }

}








