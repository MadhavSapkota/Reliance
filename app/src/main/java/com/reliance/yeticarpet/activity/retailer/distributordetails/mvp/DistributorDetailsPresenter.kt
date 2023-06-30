package com.reliance.yeticarpet.activity.retailer.distributordetails.mvp
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.fiscalId
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DistributorDetailsPresenter(
    private val distributorDetailsModel: DistributorDetailsModel,
    private val distributorDetailsView: DistributorDetailsView
) {
    private val compositeDisposable = CompositeDisposable()


    fun onCreateView() {
        getMonthlyTrackerRequest(fiscalId)
        distributorDetailsView.getOkObserable().doOnNext { distributorDetailsModel.getLoginActivity()
            distributorDetailsView.getDismissDialog() }.subscribe()
    }

    fun getMonthlyTrackerRequest(fiscalId: Int) {
        when {
            distributorDetailsView.checkNetwork() -> {
                getMonthlyApi(fiscalId)
            }
            else -> distributorDetailsView.getErrorMessage(ApiConstants.NONETWORK)
        }
    }


    private fun getMonthlyApi(fiscalId: Int) {
        distributorDetailsView.showProgressDialog()
        compositeDisposable.add(
            distributorDetailsModel.getRetailerDashboard(fiscalId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::getMonthlySuccess, this::credentialError)
        )
    }

    private fun getMonthlySuccess(result: RetailerDashboardResponse) {
        distributorDetailsView.hidProgressDialog()
    }

    private fun credentialError(e: Throwable) {
        System.out.println("ErrorValue"+ e.message)
        UserInfo.tokenStatus = false
        distributorDetailsView.getCredentialErrorMessage(" Your session has expired. Please log in again to continue using the app.")
    }
}





