package com.reliance.yeticarpet.activity.retailer.bill_details.mvp
import android.annotation.SuppressLint
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BrandDetailsResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.ResponseErrorHandler.handleErrorResponse
import com.reliance.yeticarpet.apputlis.RetailerInfo.billId
import com.reliance.yeticarpet.apputlis.UserInfo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class BillDetailsPresenter(
    private val billDetailsModel: BillDetailsModel,
    private val billDetailsView: BillDetailsView
) {
    private val compositeDisposable = CompositeDisposable()


    fun onCreateView(billId: Int) {
        billDetailsRequest(billId)
        billDetailsView.getOkObserable().doOnNext { billDetailsModel.getLoginView() }.subscribe()
        billDetailsView.getBackArrow().doOnNext { billDetailsModel.getBackActivity() }
            .subscribe()
    }

    fun billDetailsRequest(billId: Int) {
        when {
            billDetailsView.checkNetwork() -> {
                getBillsDetailsApi(billId)
            }
            else -> billDetailsView.getErrorMessage(ApiConstants.NONETWORK)
        }
    }

    private fun getBillsDetailsApi(billsId:Int) {
        billDetailsView.showProgressDialog()
        compositeDisposable.add(
            billDetailsModel.getBillsDetailsResponse(billsId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::billDetailsSuccess, this::billDetailsError)
        )
    }


    private fun billDetailsSuccess(result: BillDetailsResponse) {
        billDetailsView.setBillDetails(result)
        billId = result!!.data!!.id!!
        getBillsBrandApi(billId)
        billDetailsView.hidProgressDialog()
    }

    private fun billDetailsError(e: Throwable) {
        userRefreshRequestTokenApi()

        billDetailsView.hidProgressDialog()
    }



    private fun getBillsBrandApi(bill_id:Int) {
        compositeDisposable.add(
            billDetailsModel.getBillsBrandResponse(bill_id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::brandDetailsSuccess, this::brandDetailsError)
        )
    }

    private fun brandDetailsSuccess(result: BrandDetailsResponse) {
        billDetailsView.hidProgressDialog()
        billDetailsView.showBillListData(result.billData,true)
    }

    private fun brandDetailsError(e: Throwable) {
        billDetailsView.hidProgressDialog()
        userRefreshRequestTokenApi()
    }

    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            billDetailsModel.postRefresh( billDetailsView.postRefreshRequest())
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
        billDetailsView.getCredentialErrorMessage(billDetailsView.getSessionErrorMessage())
    }
}