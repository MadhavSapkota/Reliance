package com.reliance.yeticarpet.activity.retailer.bill_details.mvp
import android.annotation.SuppressLint
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsAdapter
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDatum
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BrandDetailsResponse
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.AppUtils
import com.reliance.yeticarpet.apputlis.AppUtils.formatNumberWithCommasAndDecimals
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.RetailerInfo.context
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.BillDetailsBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import io.reactivex.Observable
import java.util.ArrayList

class BillDetailsView(private val appCompatActivity: AppCompatActivity,
                      private val loginErrorDialog: CredentialsErrorDialog,
                      private val billsDetailsAdapter: BillsDetailsAdapter
) {
    var binding: BillDetailsBinding? = null
    private val progressDialog = ProgressDialog(appCompatActivity, R.style.MyProgressDialogStyle)
    fun start(binding_login: BillDetailsBinding) {
        binding = binding_login
        setRetailerDashboardAdapter()
    }

    fun showProgressDialog() {
        progressDialog.show()
        progressDialog.setMessage(appCompatActivity.getString(R.string.processing))
    }

    fun hidProgressDialog() {
        progressDialog.dismiss()
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

    fun setRetailerDashboardAdapter() {
        var layoutmanager: LinearLayoutManager? = LinearLayoutManager(appCompatActivity, LinearLayoutManager.VERTICAL, false)
        binding?.billsDetailsItemsList?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.billsDetailsItemsList?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.billsDetailsItemsList?.dashboardRecyclerView?.adapter = billsDetailsAdapter
    }

    fun showBillListData(termlist: List<BillDatum>?, aboolean: Boolean) {
        billsDetailsAdapter.showBillsItem(termlist as ArrayList<BillDatum>?, aboolean)
    }

    @SuppressLint("SetTextI18n")
    fun setBillDetails(result: BillDetailsResponse) {
        binding!!.tvBillNo.text = context.getString(R.string.billNumber) + result.data!!.billNo
        binding!!.tvRetailerName.text = result.data!!.distributor!!.name
        binding!!.tvRetailerMetroName.text = result.data!!.retailer!!.location!!.name

        if (result!!.data!!.status == true) {
            binding!!.completedTextView.text = context.getString(R.string.bill_details_completed)
            binding!!.completedTextView.setTextColor(ContextCompat.getColor(appCompatActivity, R.color.colorLightGreen))
        }
        else{
            binding!!.completedTextView.text = context.getString(R.string.bill_details_not_completed)
            binding!!.completedTextView.setTextColor(ContextCompat.getColor(appCompatActivity, R.color.colorRed))
        }

        binding!!.billDateTextView.text = result.data!!.dateNp
        binding!!.tvRetailerProvinceName.text = result.data!!.retailer!!.location!!.district!!.province?.name
        binding!!.tvRetailerDistrictName.text = result.data!!.retailer!!.location!!.district!!.name

        binding!!.tvPhoneNumber.text = context.getString(R.string.bill_details_phone)+" " +result.data!!.retailer!!.contact

        val formattedResult = result.data!!.total?.toDouble()?.let { AppUtils.formatDecimalValue(it) }
        binding!!.tvVatAmount.text = formatNumberWithCommasAndDecimals(formattedResult.toString())
        val formattedResult1 = result.data!!.vatTotal?.toDouble()?.let { AppUtils.formatDecimalValue(it) }
        binding!!.tvTotalVatAmountDigit.text = formatNumberWithCommasAndDecimals(formattedResult1.toString())
    }

    fun getOkObserable(): Observable<Any> {
        return loginErrorDialog.getOKObservable()
    }

    fun getBackArrow(): Observable<Any> {
        return RxView.clicks(binding!!.myToolbarLayout)
    }

    fun postRefreshRequest(): ApiRequest.RefreshTokenRequest {
        return ApiRequest.RefreshTokenRequest(
            refresh = UserInfo.refreshToken,
        )
    }
}