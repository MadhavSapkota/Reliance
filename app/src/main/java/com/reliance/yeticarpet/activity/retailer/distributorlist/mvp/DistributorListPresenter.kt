package com.reliance.yeticarpet.activity.retailer.distributorlist.mvp
import android.annotation.SuppressLint
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.DistributorListResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.fiscalId
import com.reliance.yeticarpet.apputlis.UserInfo.retailerId
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DistributorListPresenter(
    private val distributorListModel: DistributorListModel,
    private val distributorListView: DistributorListView
) {
    private val compositeDisposable = CompositeDisposable()


    fun onCreateView() {
        getDistributorListRequest(fiscalId)

        distributorListView.getOkObserable().doOnNext { distributorListModel.getLoginActivity()
            distributorListView.getDismissDialog() }.subscribe()
        distributorListView.getBackArrow().doOnNext { distributorListModel.getBackActivity() }
            .subscribe()
    }

    fun getDistributorListRequest(fiscalId: Int) {
        when {
            distributorListView.checkNetwork() -> {
                getDistributorListApi(fiscalId, retailerId)
            }
            else -> distributorListView.getErrorMessage(ApiConstants.NONETWORK)
        }
    }


    private fun getDistributorListApi(fiscalId: Int,retailerId: Int) {
        distributorListView.showProgressDialog()
        compositeDisposable.add(
            distributorListModel.getDistributorListData(fiscalId,retailerId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::getDistributorListSuccess, this::credentialError)
        )
    }

    private fun getDistributorListSuccess(result: DistributorListResponse) {
        distributorListView.hidProgressDialog()
        distributorListView.showBillListData(result.data?.result, true)
    }

    private fun credentialError(e: Throwable) {
        System.out.println("ErrorValue"+ e.message)
        UserInfo.tokenStatus = false
        userRefreshRequestTokenApi()
        distributorListView.dismissDialog()
    }


    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            distributorListModel.postRefresh( distributorListView.postRefreshRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::tokenSuccess, this::tokenError
                ))
    }

    private fun tokenSuccess(result: RefreshTokenResponse) {
        UserInfo.accessToken = result.access.toString()
        UserInfo.tokenStatus = true
    }


    @SuppressLint("SuspiciousIndentation")
    private fun tokenError(e: Throwable) {
        distributorListView.getCredentialErrorMessage("Your session has expired. Please log in again to continue using the app.")
    }


}





