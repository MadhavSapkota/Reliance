package com.reliance.yeticarpet.fragment.distributor.dashboard.mvp
import android.annotation.SuppressLint
import com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.apputlis.AppConstant
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DistributorDashboardPresenter(
    private val distributorDashboardView: DistributorDashboardView,
    private val distributorDashboardModel: DistributorDashboardModel
) {
    private val compositeDisposable=CompositeDisposable()
    var monthList = ArrayList<MonthData>()

    fun onCreate() {
        distributorDashboardView.getOkObserable().doOnNext { distributorDashboardModel.getLoginActivityResponse()
            distributorDashboardView.getDismissDialog() }.subscribe()
        fiscalYearApiRequest(true)
        setMonthList()
        distributorDashboardView.viewRetailerList().doAfterNext{
            distributorDashboardModel.getRetailerList()
        }.subscribe()
        fiscalYearDialogApiRequest()
    }


    private fun fiscalYearDialogApiRequest() {
        compositeDisposable.add(
            distributorDashboardModel.getFiscalYeaResponse()
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
            AppConstant.fiscalFinancialYear = fiscalYearList
        }

        AppConstant.hashMapFiscalYear = HashMap<String, String>()
        for (i in 0 until result.billData!!.results!!.size) {
            AppConstant.hashMapFiscalYear[result.billData!!.results?.get(i)?.id.toString()] =
                AppConstant.fiscalFinancialYear[i]
        }
        distributorDashboardView.fiscalYearDialog.setSpinner(AppConstant.fiscalFinancialYear)
    }


    private fun fiscalYearError(e: Throwable) {
        System.err.println(e.message.toString())
    }

    private fun fiscalYearApiRequest(status:Boolean) {
        compositeDisposable.add(
            distributorDashboardModel.getFiscalYearResponse(status)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiSuccess, this::credentialError)
        )
    }

    private fun apiSuccess(result: FiscalYearResponse) {
        distributorDashboardView.showDialog()
        if (result.status == "error") {
            // Handle error response
            val errorMessage = result.message
            UserInfo.tokenStatus = false
            if (errorMessage != null) {
                distributorDashboardView.getCredentialErrorMessage(errorMessage)
            }

        } else {
            // Handle successful response
            UserInfo.fiscalId = result.billData!!.results!!.get(0).id!!.toInt()
            var fiscalYear = UserInfo.fiscalId
            distributorListRequest(fiscalYear)
        }
    }


    private fun distributorListRequest(fiscalYear:Int) {
        compositeDisposable.add(
            distributorDashboardModel.getDistributorResponse(fiscalYear)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiSuccess, this::credentialError)
        )
    }

    private fun apiSuccess(result: DistributorDashboardResponse) {
        distributorDashboardView.setDistributorDashboardDetails(result)
        distributorDashboardView.showRetailerListData(result.retailerPurchase,true)
        result.monthCategory?.let { distributorDashboardView.showMonthlyCategoryData(result.categories,true, it) }
        result.monthCategory?.let { distributorDashboardView.showMonthListData(monthList,true, it) }
        distributorDashboardView.showDashboardContent()
    }

    private fun graphUpdateRequest(fiscalYear:Int) {
        compositeDisposable.add(
            distributorDashboardModel.getDistributorResponse(fiscalYear)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::graphApiSuccess, this::credentialError))
    }

    private fun graphApiSuccess(result: DistributorDashboardResponse) {
        distributorDashboardView.setGraph(result.monthCategory ?: emptyMap())

    }

    private fun setMonthList(){
        monthList = ArrayList()
        monthList.add(MonthData(0,"4M"))
        monthList.add(MonthData(1,"6M"))
        monthList.add(MonthData(2,"9M"))
        monthList.add(MonthData(3,"12M"))
    }

    private fun credentialError(e: Throwable) {
        UserInfo.tokenStatus = false
        userRefreshRequestTokenApi()
        fiscalYearApiRequest(true)
        distributorDashboardView.dismissDialog()
    }

    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            distributorDashboardModel.postRefresh(distributorDashboardView.postRefreshRequest())
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
        distributorDashboardView.getCredentialErrorMessage(distributorDashboardView.getSessionErrorMessage())
    }


}

