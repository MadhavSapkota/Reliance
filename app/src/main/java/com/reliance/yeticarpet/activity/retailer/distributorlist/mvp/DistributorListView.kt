package com.reliance.yeticarpet.activity.retailer.distributorlist.mvp
import android.app.ProgressDialog
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.retailer.distributorlist.adapter.DistributorListAdapter
import com.reliance.yeticarpet.activity.retailer.bill.dto.Result
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.ActivityDistributorListBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import io.reactivex.Observable

class DistributorListView(private val appCompatActivity: AppCompatActivity,
                      private val loginErrorDialog: CredentialsErrorDialog,
                      private val distributorListAdapter: DistributorListAdapter
) {
    var binding: ActivityDistributorListBinding? = null
    private val progressDialog = ProgressDialog(appCompatActivity, R.style.MyProgressDialogStyle)
    fun start(binding_tracker: ActivityDistributorListBinding) {
        binding = binding_tracker
        setDistributorListAdapter()
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

    fun showBillListData(termlist: List<Result>?, aboolean: Boolean) {
        distributorListAdapter.showBillsItem(termlist,aboolean)
    }


    fun setDistributorListAdapter() {
        var layoutmanager: LinearLayoutManager? = LinearLayoutManager(appCompatActivity, LinearLayoutManager.VERTICAL, false)
        binding?.distributorListRecyclerView?.dashboardRecyclerView?.setHasFixedSize(true)
        binding?.distributorListRecyclerView?.dashboardRecyclerView?.layoutManager = layoutmanager
        binding?.distributorListRecyclerView?.dashboardRecyclerView?.adapter = distributorListAdapter
    }

    fun dismissDialog() {
        binding!!.idPbarMain.visibility = View.GONE
    }

    fun getOkObserable(): Observable<Any> {
        return loginErrorDialog.getOKObservable()
    }

    fun getDismissDialog(){
        loginErrorDialog.dismissDialog()
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



