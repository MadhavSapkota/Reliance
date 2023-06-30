package com.reliance.yeticarpet.fragment.retailer.dashboard.mvp

import android.annotation.SuppressLint
import com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.apputlis.AppConstant.fiscalFinancialYear
import com.reliance.yeticarpet.apputlis.AppConstant.hashMapFiscalYear
import com.reliance.yeticarpet.apputlis.AppConstant.minAmountArray
import com.reliance.yeticarpet.apputlis.AppConstant.target
import com.reliance.yeticarpet.apputlis.AppConstant.totalBillAmount
import com.reliance.yeticarpet.apputlis.FiscalYearInfo
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.fiscalId
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

class RetailerDashboardPresenter(
    private val retailerDashboardView: RetailerDashboardView,
    private val retailerDashboardModel: RetailerDashboardModel
) {
    private val compositeDisposable = CompositeDisposable()

    fun onCreate() {
        retailerDashboardView.getOkObserable().doOnNext {
            retailerDashboardModel.getLoginActivityResponse()
            retailerDashboardView.getDismissDialog()
        }.subscribe()



        fiscalYearApiRequest(true)
        getDropButtonItemClick()

        fiscalYearDialogApiRequest()

    }

    private fun fiscalYearDialogApiRequest() {
        compositeDisposable.add(
            retailerDashboardModel.getFiscalYeaResponse()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::fiscalYearDialogapiSuccess, this::fiscalYearError)
        )
    }

    @SuppressLint("SuspiciousIndentation")
    private fun fiscalYearDialogapiSuccess(result: FiscalYearResponse) {
        val fiscalYearList = ArrayList<String>()
        var newFiscalYear = ""
        for (i in 0 until result.billData!!.results?.size!!) {
            val startDate = result.billData!!.results?.get(i)!!.startDateNp

            val yearRegex = Regex("""(\d{4})-\d{2}-\d{2}""")
            val yearMatch = yearRegex.find((startDate ?: "") as CharSequence)
            val startYear = yearMatch?.groupValues?.get(1)

            val endDate = result.billData!!.results?.get(i)!!.endDateNp
            val endYearRegex = Regex("""\d{2}(\d{2})-\d{2}-\d{2}""")
            val endYearMatch = endYearRegex.find(endDate ?: "")
            val endYear = endYearMatch?.groupValues?.get(1)
            newFiscalYear = startYear + "-" + endYear
            fiscalYearList.add(newFiscalYear)
            fiscalFinancialYear = fiscalYearList
        }

        hashMapFiscalYear = HashMap<String, String>()
        for (i in 0 until result.billData!!.results!!.size) {
            hashMapFiscalYear[result.billData!!.results?.get(i)?.id.toString()] =
                fiscalFinancialYear[i]
        }
        retailerDashboardView.fiscalYearDialog.setSpinner(fiscalFinancialYear)

    }

    private fun fiscalYearApiRequest(status: Boolean) {
        compositeDisposable.add(
            retailerDashboardModel.getFiscalYearResponse(status)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiSuccess, this::credentialError)
        )
    }

    private fun apiSuccess(result: FiscalYearResponse) {
        retailerDashboardView.showDialog()
        if (result.status == "error") {
            // Handle error response
            val errorMessage = result.message
            UserInfo.tokenStatus = false
            if (errorMessage != null) {
                retailerDashboardView.getCredentialErrorMessage(errorMessage)
            }
            retailerDashboardView.dismissDialog()
        } else {
            // Handle successful response
            fiscalId = result.billData!!.results!!.get(0).id!!.toInt()
            var fiscalYear = fiscalId

//            getRetailerDashboardApiRequest(FiscalYearInfo.fiscalYearId.toInt())
          getRetailerDashboardApiRequest(fiscalYear)
        }
    }

    private fun getRetailerDashboardApiRequest(id: Int) {
        compositeDisposable.add(
            retailerDashboardModel.getRetailerDashboard(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::retailerDashboardSuccess, this::loginError)
        )
    }

    @SuppressLint("SuspiciousIndentation")
    private fun retailerDashboardSuccess(result: RetailerDashboardResponse) {
        if (result.status == "success") {
            retailerDashboardView.showRetailerListData(result.schemeDetail, true)

            var totalBillAmount1 = result.totalBillAmount?.toDoubleOrNull() ?: 0.0
            val wholeNumber = totalBillAmount1.toInt()
            totalBillAmount = wholeNumber


            minAmountArray = ArrayList<Int>()
            val offers: List<Offer>? = result.schemeDetail?.flatMap { schemeDetail ->
                schemeDetail.offers!!
            }
            val percentages = ArrayList<String>()

            offers?.forEach { offer ->

                val minAmount = offer.minAmount?.toDoubleOrNull() ?: 0.0
                val roundedAmount = (minAmount).toInt()
                if (roundedAmount != 0) {
                    minAmountArray.add(roundedAmount)
                }


                if (offer.target?.isNotEmpty() == true) {
                    offer.percentage?.let { percentage ->
                        percentages.add(percentage)
                    }
                }
            }
            target = percentages


             var pointList = arrayListOf<Int>()
            for (i in 0 until minAmountArray.size) {
                pointList.add(totalBillAmount)
            }
            retailerDashboardView.getGranularity(pointList)
            retailerDashboardView.setGraphRecyclerViewAdapter(pointList)


            retailerDashboardView.showDashboardContent()
            retailerDashboardView.setRetailerDashboardDetails(result)
        } else {
            UserInfo.tokenStatus = false
            retailerDashboardView.getCredentialErrorMessage(retailerDashboardView.getUserPortalErrorMessage())
            retailerDashboardView.dismissDialog()
        }
    }

    private fun fiscalYearError(e: Throwable) {
        System.err.println(e.message.toString())
    }


    private fun loginError(e: Throwable) {
        UserInfo.tokenStatus = false
        retailerDashboardView.getCredentialErrorMessage(retailerDashboardView.getUserPortalErrorMessage())
        retailerDashboardView.dismissDialog()
    }

    private fun credentialError(e: Throwable) {
        UserInfo.tokenStatus = false
        userRefreshRequestTokenApi()
        fiscalYearApiRequest(true)
        retailerDashboardView.dismissDialog()
    }


    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            retailerDashboardModel.postRefresh(retailerDashboardView.postRefreshRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                    this::tokenSuccess, this::tokenError
                )
        )
    }

    private fun tokenSuccess(result: RefreshTokenResponse) {
        UserInfo.accessToken = result.access.toString()
        UserInfo.tokenStatus = true
    }

    @SuppressLint("SuspiciousIndentation")
    private fun tokenError(e: Throwable) {
        retailerDashboardView.getCredentialErrorMessage(retailerDashboardView.getSessionErrorMessage())
    }

    private fun getDropButtonItemClick() {
        val disposableObserver = getBillsItemsClickObserver()
        retailerDashboardView.getDropDownClickedObservable().subscribe(disposableObserver)
        compositeDisposable.add(disposableObserver)
    }


    private fun getBillsItemsClickObserver(): DisposableObserver<SchemeDetail> {
        return object : DisposableObserver<SchemeDetail>() {
            override fun onNext(newslistdata: SchemeDetail) {

            }

            override fun onError(e: Throwable) {
                System.err.println("Error" + e)
            }

            override fun onComplete() {
                Timber.e("Clicked")
            }
        }
    }
}

