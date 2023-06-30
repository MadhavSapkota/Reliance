package com.reliance.yeticarpet.activity.distributor.retailerlist.mvp
import android.annotation.SuppressLint
import androidx.core.widget.NestedScrollView
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.distributorId
import com.reliance.yeticarpet.apputlis.UserInfo.fiscalId
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

class PartyListPresenter(
    private val partyListModel: PartyListModel,
    private val partyListView: PartyListView
) {
    private val compositeDisposable = CompositeDisposable()
    private var startPageNumber:Int = 0
    private var endPageNumber:Int = 20


    fun onCreateView() {
        getPartyListRequest(fiscalId)
        partyListView.getOkObserable().doOnNext { partyListModel.getLoginActivity()
            partyListView.getDismissDialog() }.subscribe()
        partyListView.getBackArrow().doOnNext { partyListModel.getBackActivity() }.subscribe()
        partyListView.getSearchObservable().doOnNext { partyListView.searchBoxImplementation() }.subscribe()
    }

    fun getPartyListRequest(fiscalId: Int) {
        when {
            partyListView.checkNetwork() -> {
                partyListView.showDialog()
                getPartyListApi(fiscalId)
                getNestedScrollActionListner(fiscalId)

            }
            else -> partyListView.getErrorMessage(ApiConstants.NONETWORK)
        }
    }

//    functionality for the pagination in nested srcollbar as of unlimited scrollbar.
    private fun getNestedScrollActionListner(fiscalId: Int){
        partyListView.binding!!.nestedScreen.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { nsv, scrollX, scrollY, oldScrollX, oldScrollY ->
            if (scrollY == nsv.getChildAt(0).getMeasuredHeight() - nsv.getMeasuredHeight()) {
                partyListView.showPaginationProgressDialog()
                startPageNumber = endPageNumber +1
                endPageNumber=startPageNumber +10
                getPartyListApi(fiscalId)
            }
        })
    }


    private fun getPartyListApi(fiscalId: Int) {
        compositeDisposable.add(
            partyListModel.getPartyListData(fiscalId, distributorId, endPageNumber,startPageNumber)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::getPartyListSuccess, this::credentialError)
        )
    }

    @SuppressLint("SetTextI18n")
    private fun getPartyListSuccess(result: PartyListResponse) {
        partyListView.dismissDialog()
        partyListView.showRetailerListData(result.retailerData,true)
        partyListView.binding!!.tvShowingEnteries.text = "Showing" + " " + result.retailerData!!.size +" "+ "enteries"
    }

    private fun credentialError(e: Throwable) {
        UserInfo.tokenStatus = false
        userRefreshRequestTokenApi()
        partyListView.dismissDialog()
    }


    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            partyListModel.postRefresh(  partyListView.postRefreshRequest())
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
        partyListView.getCredentialErrorMessage(partyListView.getSessionErrorMessage())
    }

}





