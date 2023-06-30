package com.reliance.yeticarpet.activity.distributor.retailerlist.mvp
import android.app.ProgressDialog
import android.app.SearchManager
import android.content.Context
import android.view.View
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.jakewharton.rxbinding2.view.RxView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListAdapter
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.apputlis.NetworkUtil
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.databinding.PartyListActivityBinding
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog
import com.reliance.yeticarpet.dialog.ErrorDailog
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase
import io.reactivex.Observable

class PartyListView(private val appCompatActivity: AppCompatActivity,
                      private val loginErrorDialog: CredentialsErrorDialog,
                      private val retailerListAdapter: PartyListAdapter,
                    var searchManager: SearchManager = appCompatActivity.getSystemService(Context.SEARCH_SERVICE) as SearchManager
): SearchView.OnQueryTextListener  {
    var binding: PartyListActivityBinding? = null
    private val progressDialog = ProgressDialog(appCompatActivity, R.style.MyProgressDialogStyle)
    fun start(binding_tracker: PartyListActivityBinding) {
        binding = binding_tracker
        setDistributorListAdapter()
    }



    fun searchBoxImplementation() {
        binding!!.searchView.setSearchableInfo(searchManager.getSearchableInfo(appCompatActivity!!.componentName))
        binding!!.searchView.setIconified(false);
        binding!!.searchView.setOnQueryTextListener(this)
    }

    fun showPaginationProgressDialog(){
        binding!!.progressBar.visibility = View.VISIBLE
    }

    fun getSessionErrorMessage(): String {
        return appCompatActivity.getString(R.string.login_session_error_message)
    }

    fun getSearchObservable(): Observable<Any> {
        return RxView.clicks(binding!!.llSearch)
    }

    fun dismissDialog() {
      progressDialog.dismiss()
    }
    fun showDialog() {
      progressDialog.show()
        progressDialog.setMessage("Processing")
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

    override fun onQueryTextSubmit(query: String?): Boolean {
       return false
    }

    override fun onQueryTextChange(textChange: String?): Boolean {
        retailerListAdapter.getFilter().filter(textChange)
        return true
    }
}



