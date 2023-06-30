package com.reliance.yeticarpet.fragment.distributor.dashboard.mvp

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.jakewharton.rxbinding2.view.RxView
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.*
import com.reliance.yeticarpet.apputlis.AppConstant.CoilMat
import com.reliance.yeticarpet.apputlis.AppConstant.NonWovenCarpet
import com.reliance.yeticarpet.apputlis.AppConstant.PVCFlooring
import com.reliance.yeticarpet.apputlis.AppConstant.TuftedCarpet
import com.reliance.yeticarpet.apputlis.AppConstant.monthlyItemClicked
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.databinding.MainFragmentDistributorLayoutBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.dialog.FiscalYearDialog
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter
import com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.RetailerListAdapter
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase
import io.reactivex.Observable


@SuppressLint("ViewConstructor")
class DistributorDashboardView(
    private val appCompatActivity: AppCompatActivity,
    private val retailerListAdapter: RetailerListAdapter,
    private val monthlySalesItemsAdapter: MonthlySalesItemsAdapter,
    private val credentialsErrorDialog: CredentialsErrorDialog,
    private val monthListAdapter: MonthListAdapter,
    val fiscalYearDialog: FiscalYearDialog
) : FrameLayout(appCompatActivity) {
    var binding: MainFragmentDistributorLayoutBinding? = null
    private var progressBar = CustomProgressBar()
    private var clickedMonthItems:String = ""


    fun start(dashboardBinding: MainFragmentDistributorLayoutBinding) {
        binding = dashboardBinding
        setDistributorDashboardAdapter()
        setMonthlyCategoryAdapter()
        setMonthListAdapter()
    }

    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }

    fun dismissDialog() {
        binding!!.idPbar.visibility = View.GONE
    }

    fun showDialog() {
        binding!!.idPbar.visibility = View.VISIBLE
    }

    fun getCredentialErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            credentialsErrorDialog.showDialog(message!!)
        })
    }

    fun showDashboardContent() {
        binding!!.rlMain.setVisibility(View.VISIBLE)
    }

    fun getSessionErrorMessage(): String {
        return appCompatActivity.getString(R.string.login_session_error_message)
    }

    fun getOkObserable(): Observable<Any> {
        return credentialsErrorDialog.getOKObservable()
    }

    fun getDismissDialog() {
        credentialsErrorDialog.dismissDialog()
    }

    fun showProgressDialog(statusString: String) {
        progressBar.show(appCompatActivity, statusString)
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }

    fun setDistributorDashboardAdapter() {
        var layoutmanager: GridLayoutManager? =
            GridLayoutManager(appCompatActivity, 2, GridLayoutManager.VERTICAL, false)
        binding?.inDashboard!!.distributorDashboardRetailerListItemsRecyclerviewInclude!!.dashboardRecyclerView.setHasFixedSize(
            true
        )
        binding?.inDashboard!!.distributorDashboardRetailerListItemsRecyclerviewInclude?.dashboardRecyclerView?.layoutManager =
            layoutmanager
        binding?.inDashboard!!.distributorDashboardRetailerListItemsRecyclerviewInclude?.dashboardRecyclerView?.adapter =
            retailerListAdapter
    }

    fun setMonthListAdapter() {
        var layoutmanager: LinearLayoutManager? = LinearLayoutManager(appCompatActivity, LinearLayoutManager.HORIZONTAL, false)
        binding?.inDashboard!!.monthDataRecyclerviewInclude?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.inDashboard!!.monthDataRecyclerviewInclude?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.inDashboard!!.monthDataRecyclerviewInclude?.dashboardRecyclerView?.adapter = monthListAdapter
    }


    fun showRetailerListData(termlist: Map<String, RetailerPurchase>?, aboolean: Boolean) {
        retailerListAdapter.showRetailerListItem(termlist, aboolean)
    }

    fun setMonthlyCategoryAdapter() {
        var layoutmanager: LinearLayoutManager? = LinearLayoutManager(appCompatActivity, LinearLayoutManager.HORIZONTAL, false)
        binding?.inDashboard!!.monthlyCategoryRecyclerviewInclude?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.inDashboard!!.monthlyCategoryRecyclerviewInclude?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.inDashboard!!.monthlyCategoryRecyclerviewInclude?.dashboardRecyclerView?.adapter =
            monthlySalesItemsAdapter
    }

    fun showMonthlyCategoryData(
        category: List<Category>?,
        aboolean: Boolean,
        monthCategory: Map<String, MonthCategory>
    ) {
        monthlySalesItemsAdapter.OnItemsClickListener(object :
            MonthlySalesItemsAdapter.OnItemsClickListener {
            override fun onItemsClick(position: Int) {
                if (category != null) {
                    clickedMonthItems = category.get(position).name.toString()
                }

                val targetList = category
                if (targetList != null && targetList.isNotEmpty()) {
                    monthlySalesItemsAdapter.setClickedTarget(targetList, position)
                    monthlySalesItemsAdapter.showMonthlySalesItem(category as ArrayList<Category>?, true)
                    setGraph(monthCategory) // Call setGraph with monthCategory parameter
                }
            }
        })

        setGraph(monthCategory)
        monthlySalesItemsAdapter.showMonthlySalesItem(category as ArrayList<Category>?, true)
    }


    fun showMonthListData(
        monthData: List<MonthData>?,
        aboolean: Boolean,
        monthCategory: Map<String, MonthCategory>
    ) {
        monthListAdapter.OnItemsClickListener(object : MonthListAdapter.OnItemsClickListener {
            override fun onItemsClick(position: Int) {
                val targetList = monthCategory.values.toList()
                monthlyItemClicked = clickedMonthItems

                if (targetList.isNotEmpty()) {
                    monthListAdapter.setClickedTarget(targetList, position)

                    when (AppConstant.monthId) {
                        0 -> {

                            val filteredData = if (targetList.size >= 12) {
                                targetList.subList(targetList.size - 11, targetList.size - 7)
                                    .associateBy { it.month.toString() } // Convert List<MonthCategory> to Map<String, MonthCategory>
                            } else {
                                emptyMap()
                            }
                            setGraph(filteredData)
                        }
                        1 -> {
                            val filteredData = if (targetList.size >= 12) {
                                targetList.subList(targetList.size - 12, targetList.size - 6)
                                    .associateBy { it.month.toString() }
                            } else {
                                emptyMap()
                            }
                            setGraph(filteredData)
                        }
                        2 -> {
                            val filteredData = if (targetList.size >= 12) {
                                targetList.subList(targetList.size - 12, targetList.size - 3)
                                    .associateBy { it.month.toString() }
                            } else {
                                emptyMap()
                            }
                            setGraph(filteredData)

                        }
                        3 -> {
                            setGraph(targetList.associateBy { it.month.toString() })
                        }
                    }
                }
            }
        })
        setGraph(monthCategory)
        monthListAdapter.showMonthList(monthData as ArrayList<MonthData>?, true)
    }



    @SuppressLint("SetTextI18n")
    fun setDistributorDashboardDetails(result: DistributorDashboardResponse) {
        binding?.inDashboard!!.tvDistributorName?.text = result.distributorDetail
        binding?.inDashboard!!.inDashboard!!.tvTranscationAmount.text = result.totalSell?.let {
            formatNumberWithCommasAndDecimals(
                it
            )
        }
        binding?.inDashboard!!.inDashboard!!.tvSchemeAmount.text =
            formatNumberWithCommasAndDecimals(result.scheme.toString())
        binding?.inDashboard!!.inDashboard!!.tvSchemeApprovedTranscation.text =
            result.totalActiveSell!!.total?.let {
                formatNumberWithCommasAndDecimals(
                    it
                )
            }
        binding?.inDashboard!!.tvMonthlySalesCost!!.text = result.totalSell?.let {
            formatNumberWithCommasAndDecimals(
                it
            )
        }
    }

    fun viewRetailerList(): Observable<Any> {
        return RxView.clicks(binding!!.inDashboard.rlTopRetailers)
    }

    fun postRefreshRequest(): ApiRequest.RefreshTokenRequest {
        return ApiRequest.RefreshTokenRequest(
            refresh = UserInfo.refreshToken,
        )
    }


    fun setGraph(monthCategory: Map<String, MonthCategory>) {
        val entries = mutableListOf<Entry>()
        var index = 0
        for ((_, value) in monthCategory) {

            var monthlyItems = when (monthlyItemClicked) {
                PVCFlooring -> value.pvcFlooring?.toFloatOrNull() ?: 0f
                TuftedCarpet -> value.tuftedCarpet?.toFloatOrNull() ?: 0f
                CoilMat-> value.coilMat?.toFloatOrNull() ?: 0f
                NonWovenCarpet -> value.nonWovenCarpet?.toFloatOrNull() ?: 0f
                else -> value.pvcFlooring?.toFloatOrNull() ?: 0f
            }
            val month = value.month?.toFloat() ?: 0f
            entries.add(Entry(month,monthlyItems))
            index++
        }

        // Create a LineDataSet with the data and customize its appearance
        val dataSet = LineDataSet(entries, "Label")
        dataSet.color = ContextCompat.getColor(context, R.color.lightgreen)
        dataSet.lineWidth = 2f
        dataSet.circleRadius = 4f
        dataSet.setDrawCircleHole(true)
        dataSet.setCircleColor(ContextCompat.getColor(context, R.color.lightgreen))
        dataSet.valueTextSize = 12f
        dataSet.setDrawValues(false)

        // Create a LineData object and add the LineDataSet to it
        val lineData = LineData(dataSet)

        // Configure the X-axis
        val xAxis = binding!!.inDashboard.lineChart.xAxis
        xAxis.setDrawAxisLine(false)
        xAxis.setDrawLabels(false)
        xAxis.setDrawGridLines(false)

        // Configure the Y-axis
        val yAxisLeft = binding!!.inDashboard.lineChart.axisLeft
        yAxisLeft.isEnabled = false

        val yAxisRight = binding!!.inDashboard.lineChart.axisRight
        yAxisRight.setDrawGridLines(false)
        yAxisRight.setDrawZeroLine(true)
        yAxisRight.axisMinimum = 0f

        // Set the LineData to the chart
        binding!!.inDashboard.lineChart.data = lineData

        // Set the chart description label to null
        binding!!.inDashboard.lineChart.description = null

        // Invalidate the chart to refresh its appearance
        binding!!.inDashboard.lineChart.invalidate()
    }


}