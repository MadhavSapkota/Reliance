package com.reliance.yeticarpet.fragment.bills.mvp
import android.annotation.SuppressLint
import android.provider.Settings.Global.getString
import android.view.View
import androidx.core.widget.NestedScrollView
import com.reliance.yeticarpet.R
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.*
import com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData


import com.reliance.yeticarpet.apputlis.ApiConstants
import com.reliance.yeticarpet.apputlis.AppConstant

import com.reliance.yeticarpet.apputlis.AppConstant.checkedFilterDialog
import com.reliance.yeticarpet.apputlis.AppConstant.distributorCompleteCount
import com.reliance.yeticarpet.apputlis.AppConstant.distributorDashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.distributorNames
import com.reliance.yeticarpet.apputlis.AppConstant.distributorPendingCount
import com.reliance.yeticarpet.apputlis.AppConstant.filterChecked

import com.reliance.yeticarpet.apputlis.AppConstant.nestedScrollChecked
import com.reliance.yeticarpet.apputlis.AppConstant.normalChecked
import com.reliance.yeticarpet.apputlis.AppConstant.pageCount
import com.reliance.yeticarpet.apputlis.AppConstant.retailerCompleteCount
import com.reliance.yeticarpet.apputlis.AppConstant.retailerDashboardChecked
import com.reliance.yeticarpet.apputlis.AppConstant.retailerNames
import com.reliance.yeticarpet.apputlis.AppConstant.retailerPendingCount
import com.reliance.yeticarpet.apputlis.AppConstant.selectedDistributorName
import com.reliance.yeticarpet.apputlis.AppConstant.selectedRetailerName
import com.reliance.yeticarpet.apputlis.AppConstant.statusAllDistributorClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusAllRetailerClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusCompletedDistributorClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusCompletedRetailerClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusPendingDistributorClicked
import com.reliance.yeticarpet.apputlis.AppConstant.statusPendingRetailerClicked
import com.reliance.yeticarpet.apputlis.UserInfo
import com.reliance.yeticarpet.apputlis.UserInfo.context
import com.reliance.yeticarpet.apputlis.UserInfo.tokenStatus
import com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse
import com.reliance.yeticarpet.fragment.bills.dto.RetailerListResponse
import com.reliance.yeticarpet.fragment.bills.dto.StatusData
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Deferred
import timber.log.Timber
import java.util.*


class RetailerBillPresenter(
    private val retailerBillView: RetailerBillView,
    private val retailerBillModel: RetailerBillModel
) {
    private val compositeDisposable = CompositeDisposable()
    lateinit var _calendar: Calendar
    var billId: Int? = null
    var day: Int = 0
    var year: Int = 0
    var month: Int = 0
    private var page:Int = 2
    var statusList = ArrayList<StatusData>()
    var retailerId:Int =0
    var distributorId:Int =0
    var finalCompletedCount = 0
    var finalIncompleteCount = 0
    var pageR:Int =1


    fun onCreate() {
        getBillList()
        getBillsItemClick()
        click()
        setStatusList()
        _calendar = Calendar.getInstance()
        year = _calendar.get(Calendar.YEAR)
        day = _calendar.get(Calendar.DAY_OF_MONTH)
        month = _calendar.get(Calendar.MONTH)

    }

    private fun click() {
        retailerBillView.getOkObserable().doOnNext { retailerBillModel.getLoginActivityResponse() }
            .subscribe()
        retailerBillView.getSearchObservable()
            .doOnNext { retailerBillView.searchBoxImplementation() }.subscribe()
        retailerBillView.filterDialog.getSubmitObserable().doOnNext { getFilterRequest() }
            .subscribe()
        retailerBillView.getFilterObservable().doOnNext { retailerBillView.showOptionDialog() }
            .subscribe()

        //from date
        retailerBillView.getOkObservable().doOnNext { retailerBillView.nepaliDatePickerDialog.getDismissDialog()
            retailerBillView.setFromNepaliDate() }?.subscribe()

        retailerBillView.filterDialog.geFromDateObservable()!!.doOnNext{ retailerBillView.showFromCalender(retailerBillView.getNepaliString()) }.subscribe()

        //to date
        retailerBillView.getToOkObservable().doOnNext {
            retailerBillView.nepaliToDatePickerDialog.getDismissDialog()
            retailerBillView.setToNepaliDate() }?.subscribe()

        retailerBillView.filterDialog.geToDateObservable()!!.doOnNext{ retailerBillView.showToCalender(retailerBillView.getNepaliString()) }.subscribe()

    }


    fun getBillList() {
        getStringWithId(UserInfo)
        setPartyName()
    }

    //Responsible for naming either retailer or distributor in filterdialog retailer/distributor
    fun setPartyName() {
        if (retailerDashboardChecked.equals(true)) {
            retailerBillView.filterDialog.nameOfParty!!.text = "Distributor"

        } else if (distributorDashboardChecked.equals(true)) {
            retailerBillView.filterDialog.nameOfParty!!.text = "Retailer"
        }
    }


    //This is operation,so an user can redirect to retailer or distributor depending upon their
    // user id i.e retailer id or distributor id

    fun getStringWithId(userInfo: UserInfo) {
       retailerId = userInfo.retailerId ?: 0
        distributorId = userInfo.distributorId
        when {
            retailerId != 0 -> {
                    getNestedRetailerScrollActionListner(retailerId)
                    billListRetailerMonthDataForGraphRequest(retailerId, 2)
                    billListRetailerNormalRequest(retailerId)
            }

            distributorId != null -> {
                    getNestedScrollActionListner(distributorId)
                    billListDistributorMonthDataForGraphRequest(distributorId, 2)
                    billListInDistributorNormalRequest(distributorId)
            }
        }
    }




//  retailer section
    fun billListRetailerMonthDataForGraphRequest(retailer_id: Int,fiscalYearId: Int) {
        compositeDisposable.add(
            retailerBillModel.getMonthBillDataRetailerList( fiscalYearId,retailer_id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiRetailerStatusSuccess, this::credentialError)
        )
    }



    @SuppressLint("SetTextI18n")
    private fun apiRetailerStatusSuccess(result: MonthBillStatusResponse) {
        retailerBillView.hidProgressDialog1()
        retailerCompleteCount = result.totalSales!!.approvedSales!!
        retailerPendingCount = result.totalSales!!.pendingSales!!
        result.datas?.let { retailerBillView.setGraph(it) }
    }

    fun billListRetailerNormalRequest(retailer_id: Int) {
        compositeDisposable.add(
            retailerBillModel.getRetailerBillsListWithoutStatus(page)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiRetailerStatusSuccess, this::credentialError)
        )
    }






    fun billListRetailerAllRequest(retailer_id: Int) {
        compositeDisposable.add(
            retailerBillModel.getRetailerBillsListWithoutStatus(page)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiRetailerWithoutStatusSuccess, this::credentialError)
        )
    }


    fun billListCompletedRequest(status: Boolean, retailer_id: Int) {
        compositeDisposable.add(
            retailerBillModel.getBillsResponse(status, page)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiClickedSuccess, this::credentialError)
        )
    }


    //distributor section
    fun billListInPendingDistributorRequest(distributor_id: Int,status: Boolean) {
        compositeDisposable.add(
            retailerBillModel.getBillsListDistributorResponse(
                distributor_id,page,status
            )
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiClickedSuccess, this::credentialError)
        )
    }




    fun billListCompletedDistributorList(status: Boolean, distributorId: Int) {
        retailerBillView.showProgressDialog1(ApiConstants.PROCESSING)
        compositeDisposable.add(
            retailerBillModel.getBillsListDistributorResponse(
                distributorId, page,status
            )
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiClickedSuccess, this::credentialError)
        )
    }


    fun billListInDistributorRequest(distributor_id: Int) {
        retailerBillView.showProgressDialog1(ApiConstants.PROCESSING)
        compositeDisposable.add(
            retailerBillModel.getDistributorBillsListWithoutStatus(
                 distributor_id,page
            )
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::distributorApiClickedSuccess, this::credentialError)
        )
    }

    fun billListInDistributorNormalRequest(distributor_id: Int) {
        retailerBillView.showProgressDialog1(ApiConstants.PROCESSING)
        compositeDisposable.add(
            retailerBillModel.getDistributorBillsListWithoutStatus(
                distributor_id,page
            )
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiSuccess, this::credentialError)
        )
    }

    private fun billListDistributorMonthDataForGraphRequest(distributorId: Int, fiscalYearId: Int) {
        compositeDisposable.add(
            retailerBillModel.getMonthBillDataDistributorList( fiscalYearId,distributorId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::apiDistributorMonthListForGraphStatusSuccess, this::credentialError)
        )
    }


    @SuppressLint("SetTextI18n")
    private fun apiDistributorMonthListForGraphStatusSuccess(result: MonthBillStatusResponse) {
        retailerBillView.hidProgressDialog1()
        distributorCompleteCount = result.totalSales!!.approvedSales!!
        distributorPendingCount = result.totalSales!!.pendingSales!!
        result.datas?.let { retailerBillView.setGraph(it) }
    }





    @SuppressLint("SetTextI18n")
    private fun apiRetailerStatusSuccess(result: BillsResponse) {
        normalChecked = true
        filterChecked = false
        retailerBillView.hidProgressDialog1()
        val searchResults = result.billData?.results
        retailerBillView.setShowingEntriesText(result.billData!!.results, null,null)
        retailerBillView.showBillsListItems(searchResults, true,false)
        retailerBillView.countBillCount = searchResults!!.size
        retailerBillView.binding?.rlMain?.visibility = View.VISIBLE
        retailerBillView.binding?.idPbarMain?.visibility = View.GONE
        retailerBillView.binding?.tvShowingEnteries?.visibility = View.VISIBLE
        retailerBillView.setBillsAdapter()
        retailerBillView.setStatusListAdapter()
        retailerBillView.showStatusListData(statusList,true)

        finalCompletedCount = retailerCompleteCount
        finalIncompleteCount = retailerPendingCount


        retailerBillView.pieChart(finalCompletedCount,finalIncompleteCount)

        when {
            retailerId != 0 -> {
                getDistributionApi(2, retailerId)
            }

            distributorId != null -> {
                pageR= pageR+1
                getRetailerApi(2, pageR)
            }
        }

    }








    @SuppressLint("SetTextI18n")
    private fun apiRetailerWithoutStatusSuccess(result: BillsResponse) {
        normalChecked = true
        filterChecked = false
        retailerBillView.hidProgressDialog1()
        val searchResults = result.billData?.results
        retailerBillView.setShowingEntriesText(result.billData!!.results, null,null)
        if (nestedScrollChecked.equals(true)){
            retailerBillView.showNestedListItems(searchResults, true,false)
        }
        else{
            retailerBillView.showBillsListItems(searchResults, true,false)
        }

        retailerBillView.countBillCount = searchResults!!.size

        retailerBillView.binding?.rlMain?.visibility = View.VISIBLE
        retailerBillView.binding?.idPbarMain?.visibility = View.GONE
        retailerBillView.binding?.tvShowingEnteries?.visibility = View.VISIBLE

        retailerBillView.setBillsAdapter()
        retailerBillView.setStatusListAdapter()

    }




    @SuppressLint("SetTextI18n")
    private fun apiSuccess(result: BillsResponse) {
        normalChecked = true
        filterChecked = false
        retailerBillView.hidProgressDialog1()
        val searchResults = result.billData?.results

        pageCount = result.billData!!.count!!/10
        System.out.println("PageCount" + pageCount)

        retailerBillView.setShowingEntriesText(result.billData!!.results, null,null)

        if (nestedScrollChecked.equals(true)){
            retailerBillView.showNestedListItems(searchResults, true,false)
        }
        else{
            retailerBillView.showBillsListItems(searchResults, true,false)
        }


        retailerBillView.countBillCount = searchResults!!.size
        retailerBillView.binding?.rlMain?.visibility = View.VISIBLE
        retailerBillView.binding?.idPbarMain?.visibility = View.GONE
        retailerBillView.binding?.tvShowingEnteries?.visibility = View.VISIBLE
        retailerBillView.setBillsAdapter()
        retailerBillView.setStatusListAdapter()
        retailerBillView.showStatusListData(statusList,true)

        finalCompletedCount = distributorCompleteCount
        finalIncompleteCount = distributorPendingCount

        retailerBillView.pieChart(finalCompletedCount,finalCompletedCount)

        when {
            retailerId != 0 -> {
                getDistributionApi(2, retailerId)
            }

            distributorId != null -> {
                pageR = pageR+1
                getRetailerApi(2, pageR)
            }
        }
    }


    @SuppressLint("SetTextI18n")
    private fun distributorApiClickedSuccess(result: BillsResponse) {
        normalChecked = true
        filterChecked = false
        retailerBillView.hidProgressDialog1()
        val searchResults = result.billData?.results

        if (searchResults!!.isEmpty()){
            retailerBillView.disablePaginationProgressDialog()
        }

        retailerBillView.setShowingEntriesText(result.billData!!.results, null,null)

        if (nestedScrollChecked.equals(true)){
            retailerBillView.showNestedListItems(searchResults, true,false)
        }
        else{
            retailerBillView.showBillsListItems(searchResults, true,false)
        }

        retailerBillView.countBillCount = searchResults!!.size

        retailerBillView.binding?.rlMain?.visibility = View.VISIBLE
        retailerBillView.binding?.idPbarMain?.visibility = View.GONE
        retailerBillView.binding?.tvShowingEnteries?.visibility = View.VISIBLE
        retailerBillView.setBillsAdapter()
        retailerBillView.setStatusListAdapter()
    }



    @SuppressLint("SetTextI18n")
    private fun apiClickedSuccess(result: BillsResponse) {
        normalChecked = true
        filterChecked = false
        retailerBillView.hidProgressDialog1()
        val searchResults = result.billData?.results

        if (searchResults!!.isEmpty()){
            retailerBillView.disablePaginationProgressDialog()

        }
        retailerBillView.setShowingEntriesText(result.billData!!.results, null,null)

        if (nestedScrollChecked.equals(true)){
            System.out.println("NestedScrollTrue"+ nestedScrollChecked)
            retailerBillView.showNestedListItems(searchResults, true,false)
        }
        else{
            System.out.println("NestedScrollFalse"+ nestedScrollChecked)
            retailerBillView.showBillsListItems(searchResults, true,false)
        }



        retailerBillView.countBillCount = searchResults!!.size

        retailerBillView.binding?.rlMain?.visibility = View.VISIBLE
        retailerBillView.binding?.idPbarMain?.visibility = View.GONE
        retailerBillView.binding?.tvShowingEnteries?.visibility = View.VISIBLE
        retailerBillView.setBillsAdapter()
        retailerBillView.setStatusListAdapter()

    }


    private fun getNestedScrollActionListner(distributorId: Int){
        retailerBillView.binding!!.nestedScreen.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { nsv, scrollX, scrollY, oldScrollX, oldScrollY ->
            if (scrollY == nsv.getChildAt(0).getMeasuredHeight() - nsv.getMeasuredHeight()) {
                page = page + 1
                nestedScrollChecked = true

                if (statusCompletedDistributorClicked.equals(true)) {
                    retailerBillView.showPaginationProgressDialog()
                    filterChecked = false
                    billListCompletedDistributorList(true, distributorId)

                } else if (statusPendingDistributorClicked.equals(true)) {
                    retailerBillView.showPaginationProgressDialog()
                    filterChecked = false

                    billListInPendingDistributorRequest(distributorId, false)
                }
                else if (statusAllDistributorClicked.equals(true)) {
                    retailerBillView.showPaginationProgressDialog()
                    filterChecked = false
                    billListInDistributorRequest(distributorId)
                }
                else if(filterChecked.equals(true)){
                    retailerBillView.disablePaginationProgressDialog()
                    getFilterRequest()

                }

                else {
                    retailerBillView.showPaginationProgressDialog()
                    billListInDistributorRequest(distributorId)
                }
            }
        })
    }



    private fun getNestedRetailerScrollActionListner(retailerId: Int){
        retailerBillView.binding!!.nestedScreen.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { nsv, scrollX, scrollY, oldScrollX, oldScrollY ->
            if (scrollY == nsv.getChildAt(0).getMeasuredHeight() - nsv.getMeasuredHeight()) {
                page = page + 1
                nestedScrollChecked = true


                //retailer

                if (statusAllRetailerClicked.equals(true)) {
                    retailerBillView.showPaginationProgressDialog()
                    billListRetailerAllRequest(retailerId)
                }

                else if (statusCompletedRetailerClicked.equals(true)) {
                    retailerBillView.showPaginationProgressDialog()
                    billListCompletedRequest(true, retailerId)
                }
                else if (checkedFilterDialog.equals(true)) {

                    retailerBillView.disablePaginationProgressDialog()
                    getFilterRequest()
                } else {
                    retailerBillView.showPaginationProgressDialog()
                    billListRetailerAllRequest(retailerId)
                }

            }
        })
    }




    private fun credentialError(e: Throwable) {
        retailerBillView.hidProgressDialog1()
        retailerBillView.hidePieProgessDialog()
        tokenStatus = false
        userRefreshRequestTokenApi()
    }


    //Filter Request
    @SuppressLint("SetTextI18n")
    fun getFilterRequest() {
        val billNumberString = retailerBillView.filterDialog.getBillNumber()
        var billNo = 0
        if (retailerBillView.filterDialog.getBillNumber().isEmpty()) {
            billNo = 0
        } else {
            billNo = billNumberString.toString().toInt()
        }
        val fromDate = retailerBillView.filterDialog.getUserFromDate()

        val toDate = retailerBillView.filterDialog.getUserToDate()


        if (retailerDashboardChecked.equals(true)) {
            val distributorName = selectedDistributorName
            getRetailerFilterDataApi(retailerId, billNo, distributorName, fromDate, toDate)
        } else if (distributorDashboardChecked.equals(true)) {
            val retailerName = selectedRetailerName
            getDistributorFilterDataApi(billNo, retailerName, fromDate, toDate)
        }
    }


    //filter data in retailer dashboard
    private fun getRetailerFilterDataApi(
        retailer_id: Int,
        bill_no: Int,
        distributor: String,
        date_np_min: String,
        date_np_max: String
    ) {
        compositeDisposable.add(
            retailerBillModel.getRetailerFilterResponse(
                retailer_id,
                bill_no,
                distributor,
                date_np_min,
                date_np_max
            )
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::filterApiSuccess, this::filterApiError)
        )
    }

    private fun filterApiSuccess(result: FilterResponse) {
        filterChecked = true
        normalChecked = false
        checkedFilterDialog = true
        retailerBillView.showBillsListItems(result.billData?.results, true,false)

        if (result.billData?.results!!.isEmpty()){
            retailerBillView.disablePaginationProgressDialog()
        }
      retailerBillView.setShowingEntriesText(null, result,null)
        retailerBillView.filterDialog.dismissMenuDialog()
    }


    private fun filterApiError(e: Throwable) {
        userRefreshRequestTokenApi()
    }


    //distributor dashboard retailer list
    private fun getDistributorFilterDataApi(
        bill_no: Int,
        retailer: String,
        date_np_min: String,
        date_np_max: String
    ) {
        compositeDisposable.add(
            retailerBillModel.getDistributorRetailerFilterResponse(
                bill_no,
                retailer,
                date_np_min,
                date_np_max
            )
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                    this::distributorSectionRetailerFilterApiSuccess,
                    this::distributorSectionRetailerFilterApiError
                )
        )
    }

    private fun distributorSectionRetailerFilterApiSuccess(result: FilterResponse) {
        filterChecked = true
        normalChecked = false
        retailerBillView.showBillsListItems(result.billData?.results, true,false)
        if (result.billData?.results!!.isEmpty() ||(result.billData!!.results!!.size.equals(result.billData!!.results!!.size))){
            retailerBillView.disablePaginationProgressDialog()
        }
        retailerBillView.setShowingEntriesText(null, result,null)
        retailerBillView.filterDialog.dismissMenuDialog()
    }


    private fun distributorSectionRetailerFilterApiError(e: Throwable) {
        userRefreshRequestTokenApi()
    }


//Retailer list display in distributor section

    private fun getDistributionApi(fiscalYearId: Int, retailer_id: Int) {
        compositeDisposable.add(
            retailerBillModel.getDistributorList(fiscalYearId, retailerId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::distributorApiSuccess, this::distributorApiError)
        )
    }

    private fun distributorApiSuccess(result: DistributorListResponse) {
        val names = ArrayList<String>()
        result.data?.result?.forEach { resultData ->
            resultData.let {
                names.add(it.distributor ?: "")
            }
        }
        distributorNames = names
        System.out.println("Distributor name$distributorNames")
        retailerBillView.filterDialog.setSpinner()
    }


    private fun distributorApiError(e: Throwable) {
        getBillList()
        userRefreshRequestTokenApi()
    }


    //Distributor list display in Retailer Section
     fun getRetailerApi(fiscalYearId: Int, page: Int) {
        compositeDisposable.add(
            retailerBillModel.getRetailerList(fiscalYearId,page)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::retailerApiSuccess, this::retailerApiError)
        )
    }

    private fun retailerApiSuccess(result: RetailerListResponse) {
        val retailerList = ArrayList<String>()
        result.billDatas?.results?.forEach { resultData ->
            resultData.let {
                retailerList.add((it.name ?: "") as String)
            }
        }
        retailerNames = retailerList
        retailerBillView.filterDialog.setSpinner()
    }

    private fun retailerApiError(e: Throwable) {
        getBillList()
        userRefreshRequestTokenApi()
    }


    private fun userRefreshRequestTokenApi() {
        compositeDisposable.add(
            retailerBillModel.postRefresh(retailerBillView.postRefreshRequest())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                    this::tokenSuccess, this::tokenError
                )
        )
    }

    private fun setStatusList(){
        statusList.add(StatusData(0,"All"))
        statusList.add(StatusData(1,"Completed"))
        statusList.add(StatusData(2,"Pending"))
    }


    private fun tokenSuccess(result: RefreshTokenResponse) {
        UserInfo.accessToken = result.access.toString()
        tokenStatus = true
    }

    @SuppressLint("SuspiciousIndentation")
    private fun tokenError(e: Throwable) {
        retailerBillView.getCredentialErrorMessage(retailerBillView.getSessionErrorMessage())
    }


    private fun getBillsItemClick() {
        val disposableObserver = getBillsItemsClickObserver()
        retailerBillView.getCardViewClickedObservable().subscribe(disposableObserver)
        compositeDisposable.add(disposableObserver)
    }

    private fun getBillsItemsClickObserver(): DisposableObserver<ResultData> {
        return object : DisposableObserver<ResultData>() {
            override fun onNext(newslistdata: ResultData) {
                billId = newslistdata.id
                billId?.let { retailerBillModel.getBillsDetailsActivity(it) }
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