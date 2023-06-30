package com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp
import android.annotation.SuppressLint
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.distributorId
import com.reliance.yeticarpet.apputlis.UserInfo.fiscalId
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class PartyListDetailsPresenter(
    private val partyListDetailsModel: PartyListDetailsModel,
    private val partyListDetailsView: PartyListDetailsView
) {
    private val compositeDisposable = CompositeDisposable()


    fun onCreateView(partyListId: Int) {
        getPartyListRequest(fiscalId, distributorId,partyListId)
        partyListDetailsView.getOkObserable().doOnNext { partyListDetailsModel.getLoginActivity()
        partyListDetailsView.getDismissDialog() }.subscribe()
        partyListDetailsView.getBackArrow().doOnNext { partyListDetailsModel.getBackActivity() }
            .subscribe()
    }

    fun getPartyListRequest(fiscalId: Int,distributor_id:Int,retailer_id:Int) {
        when {
            partyListDetailsView.checkNetwork() -> {
                partyListDetailsView.showDialog()
                getPartyListApi(fiscalId,distributor_id,retailer_id)
            }
            else -> partyListDetailsView.getErrorMessage(ApiConstants.NONETWORK)
        }
    }


    private fun getPartyListApi(fiscalId: Int,distributor_id:Int,retailer_id:Int) {
        compositeDisposable.add(
            partyListDetailsModel.getPartyDetailsListData(fiscalId,distributor_id,retailer_id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::getPartyListSuccess, this::credentialError)
        )
    }

    @SuppressLint("SetTextI18n")
    private fun getPartyListSuccess(result: PartyListResponse) {
        partyListDetailsView.dismissDialog()
        partyListDetailsView.showRetailerListData(result.retailerData,true)

        val firstRetailerData = result.retailerData?.values?.firstOrNull()
        if (firstRetailerData != null) {
            partyListDetailsView.setPartyDetails(firstRetailerData)
        } else {
            // Handle the case when the retailerData map is empty or null
        }
    }

    private fun credentialError(e: Throwable) {
        UserInfo.tokenStatus = false
        userRefreshRequestTokenApi()
        partyListDetailsView.dismissDialog()
    }


    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            partyListDetailsModel.postRefresh(  partyListDetailsView.postRefreshRequest())
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
        partyListDetailsView.getCredentialErrorMessage(partyListDetailsView.getSessionErrorMessage())
    }
}





