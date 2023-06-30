package com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp
import android.annotation.SuppressLint
import android.view.View
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.AppConstant.hashMap
import com.reliance.yeticarpet.apputlis.RetailerInfo.currentMonth
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.fiscalId
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.json.JSONObject

class MonthlyTrackerPresenter(
    private val monthlyTrackerModel: MonthlyTrackerModel,
    private val monthlyTrackerView: MonthlyTrackerView
) {
    private val compositeDisposable = CompositeDisposable()


    fun onCreateView() {
        getMonthlyTrackerRequest(fiscalId)
        monthlyTrackerView.getOkObserable().doOnNext { monthlyTrackerModel.getLoginActivityResponse()
            monthlyTrackerView.getDismissDialog() }.subscribe()

        monthlyTrackerView.getBackArrow().doOnNext { monthlyTrackerModel.getBackActivity() }.subscribe()
    }

    fun getMonthlyTrackerRequest(fiscalId: Int) {
        when {
            monthlyTrackerView.checkNetwork() -> {
                getMonthlyApi(fiscalId)
            }
            else -> monthlyTrackerView.getErrorMessage(ApiConstants.NONETWORK)
        }
    }


    private fun getMonthlyApi(fiscalId: Int) {
        monthlyTrackerView.showProgressDialog()
        compositeDisposable.add(
            monthlyTrackerModel.getRetailerDashboard(fiscalId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::getMonthlySuccess, this::credentialError)
        )
    }

    private fun getMonthlySuccess(result: RetailerDashboardResponse) {
        monthlyTrackerView.hidProgressDialog()
        monthlyTrackerView.binding?.idPbar?.visibility = View.GONE
        monthlyTrackerView.binding?.rlHorizontalPercentage?.visibility = View.VISIBLE
        monthlyTrackerView.binding?.rlMonthlyDetails?.visibility = View.VISIBLE
        val offers: List<Offer>? = result.schemeDetail?.flatMap { schemeDetail ->
            schemeDetail.offers!!
        }

        currentMonth = result.month?.toInt()!!

        hashMap = HashMap<String, String>()
        for (brand in result.billBrand!!) {
            hashMap[brand.category.toString()] = brand.totalSell.toString()
        }
        monthlyTrackerView.showMonthlyTrackerListData(offers, true)
        monthlyTrackerView.showHorizontalListData(offers, true)
    }

    private fun credentialError(e: Throwable) {
        UserInfo.tokenStatus = false
        userRefreshRequestTokenApi()
        monthlyTrackerView.dismissDialog()
    }

    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            monthlyTrackerModel.postRefresh( monthlyTrackerView.postRefreshRequest())
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
        monthlyTrackerView.getCredentialErrorMessage("Your session has expired. Please log in again to continue using the app.")
    }
}




