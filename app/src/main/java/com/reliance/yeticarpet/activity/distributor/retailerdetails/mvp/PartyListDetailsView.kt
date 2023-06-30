package com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp
import android.app.ProgressDialog
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.distributor.retailerdetails.adapter.PartyListDetailsAdapter
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.RetailerInfo
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.PartyListDetailsLayoutBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase
import io.reactivex.Observable

class PartyListDetailsView(private val appCompatActivity: AppCompatActivity,
                      private val loginErrorDialog: CredentialsErrorDialog,
                      private val retailerListAdapter: PartyListDetailsAdapter
) {
    var binding: PartyListDetailsLayoutBinding? = null
    fun start(binding_tracker: PartyListDetailsLayoutBinding) {
        binding = binding_tracker
        setDistributorListAdapter()
    }

    fun dismissDialog() {
        binding!!.idPbar.visibility = View.GONE
    }
    fun showDialog() {
        binding!!.idPbar.visibility = View.VISIBLE
    }

    fun getSessionErrorMessage(): String {
        return appCompatActivity.getString(R.string.login_session_error_message)
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

    fun showRetailerListData(termlist: Map<String, RetailerData>?, aboolean: Boolean) {
        retailerListAdapter.showRetailerListItem(termlist, aboolean)
    }


    fun setDistributorListAdapter() {
        var layoutmanager: LinearLayoutManager? = LinearLayoutManager(appCompatActivity, LinearLayoutManager.VERTICAL, false)
        binding?.myDashboardBillsListItemsRecyclerviewInclude?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.myDashboardBillsListItemsRecyclerviewInclude?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.myDashboardBillsListItemsRecyclerviewInclude?.dashboardRecyclerView?.adapter = retailerListAdapter
    }

    fun getOkObserable(): Observable<Any> {
        return loginErrorDialog.getOKObservable()
    }

    fun getDismissDialog(){
        loginErrorDialog.dismissDialog()
    }

    fun postRefreshRequest(): ApiRequest.RefreshTokenRequest {
        return ApiRequest.RefreshTokenRequest(
            refresh = UserInfo.refreshToken,
        )
    }

    fun getBackArrow(): Observable<Any> {
        return RxView.clicks(binding!!.myToolbarLayout)
    }


    fun setPartyDetails(result: RetailerData) {
        binding!!.tvRetailerName.text = result.retailerName
        var totalAmount = result.total?.let { formatNumberWithCommasAndDecimals(it) }
        binding!!.tvTotalPrice.text = "Rs"+" "+ totalAmount

        val vatAmount = result.total?.toDoubleOrNull() ?: 0.0
        println("Vat Amount is: ${1.13 * vatAmount}")
        binding!!.tvTotalVatAmountPrice.text ="Rs"+" "+ formatNumberWithCommasAndDecimals((1.13 * vatAmount).toString())
    }
}



