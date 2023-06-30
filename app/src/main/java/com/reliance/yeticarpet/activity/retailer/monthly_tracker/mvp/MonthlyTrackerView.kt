package com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp
import android.app.ProgressDialog
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.PercentageAdapter
import com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerAdapter
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.AppConstant.clickedTPosition
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.MonthlyTargetTrackerBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer
import io.reactivex.Observable

class MonthlyTrackerView(private val appCompatActivity: AppCompatActivity,
                         private val loginErrorDialog: CredentialsErrorDialog,
                         private val trackerAdapter: TrackerAdapter,
                         private val percentageAdapter: PercentageAdapter
) {
    var binding: MonthlyTargetTrackerBinding? = null
    private val progressDialog = ProgressDialog(appCompatActivity, R.style.MyProgressDialogStyle)
    fun start(binding_tracker: MonthlyTargetTrackerBinding) {
        binding = binding_tracker
        setRetailerDashboardAdapter()
        setHorizontalAdapter()
    }

    fun showProgressDialog() {
        progressDialog.show()
        progressDialog.setMessage(appCompatActivity.getString(R.string.processing))
    }

    fun hidProgressDialog() {
        progressDialog.dismiss()
    }

    fun checkNetwork(): Boolean {
        return NetworkUtil.checkInternetConnection(appCompatActivity)
    }

    fun getErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            ErrorDailog(appCompatActivity, message!!)
        })
    }

    fun getCredentialErrorMessage(message: String) {
        appCompatActivity.runOnUiThread(Runnable {
            loginErrorDialog.showDialog(message!!)
        })
    }


    fun setRetailerDashboardAdapter() {
        var layoutmanager: LinearLayoutManager? =
            LinearLayoutManager(appCompatActivity, LinearLayoutManager.VERTICAL, false)
        binding?.myDashboardTrackerRecylerView?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.myDashboardTrackerRecylerView?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.myDashboardTrackerRecylerView?.dashboardRecyclerView?.adapter = trackerAdapter
    }


    fun setHorizontalAdapter() {
        var layoutmanager: LinearLayoutManager? =
            LinearLayoutManager(appCompatActivity, LinearLayoutManager.HORIZONTAL, false)
        binding?.retailerTrackerRecyclerview?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.retailerTrackerRecyclerview?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.retailerTrackerRecyclerview?.dashboardRecyclerView?.adapter = percentageAdapter
    }

    fun showMonthlyTrackerListData(termlist: List<Offer>?, aboolean: Boolean) {
        percentageAdapter.setOnPercentageClickListener(object : PercentageAdapter.OnPercentageClickListener {
            override fun onPercentageClick(position: Int) {
                if (termlist!!.get(0).target!!.isEmpty()) {
                    var clickedOffer = termlist?.get(position + 1)
                    val targetList = clickedOffer?.target
                    if (targetList != null && targetList.isNotEmpty()) {
                        trackerAdapter.setClickedTarget(targetList, position)
                        trackerAdapter.showBillsItem(targetList, true)  // Pass targetList instead of clickedOffer.target
                    } else {
                        trackerAdapter.showBillsItem(
                            emptyList(),
                            true
                        )  // Empty list when targetList is null or empty
                    }
                }
                else{
                    var clickedOffer = termlist?.get(position)
                    val targetList = clickedOffer?.target
                    if (targetList != null && targetList.isNotEmpty()) {
                        trackerAdapter.setClickedTarget(targetList, position)
                        trackerAdapter.showBillsItem(targetList, true)  // Pass targetList instead of clickedOffer.target
                    } else {
                        trackerAdapter.showBillsItem(emptyList(), true)  // Empty list when targetList is null or empty
                    }
                }
            }
        })

        trackerAdapter.showItem(termlist, true)  // Pass termlist directly to showItem
        trackerAdapter.setOutSideClickedTarget(termlist?.get(clickedTPosition)?.target, clickedTPosition)
    }

    fun showHorizontalListData(termlist: List<Offer>?, aboolean: Boolean) {
        percentageAdapter.showBillsItem(termlist, aboolean)
    }

    fun dismissDialog() {
        binding!!.idPbar.visibility = View.GONE
    }

    fun getOkObserable(): Observable<Any> {
        return loginErrorDialog.getOKObservable()
    }

    fun getBackArrow(): Observable<Any> {
        return RxView.clicks(binding!!.rlHeader)
    }

    fun getDismissDialog(){
        loginErrorDialog.dismissDialog()
    }

    fun postRefreshRequest(): ApiRequest.RefreshTokenRequest {
        return ApiRequest.RefreshTokenRequest(
            refresh = UserInfo.refreshToken,
        )
    }
}



