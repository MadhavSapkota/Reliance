package com.reliance.yeticarpet.fragment.bills.mvp
import androidx.appcompat.app.AppCompatActivity
import com.reliance.yeticarpet.activity.retailer.bill_details.BillDetailsActivity
import com.reliance.yeticarpet.activity.login.LoginActivity
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.DistributorListResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse
import com.reliance.yeticarpet.app.ApiRequest
import com.reliance.yeticarpet.app.Webservice
import com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse
import com.reliance.yeticarpet.fragment.bills.dto.RetailerListResponse
import io.reactivex.Observable


class RetailerBillModel(private val appCompatActivity: AppCompatActivity, private val webservice: Webservice) {

    fun getBillsResponse(status: Boolean, page: Int): Observable<BillsResponse> {
        return webservice.getBillsList(status,page)
    }

    fun getBillsListDistributorResponse(distributor_id:Int,page:Int,status: Boolean): Observable<BillsResponse> {
        return webservice.getDistributorBillsList(distributor_id,page,status)
    }

    fun getDistributorBillsListWithoutStatus(distributor_id:Int,page:Int): Observable<BillsResponse> {
        return webservice.getDistributorBillsListWithoutStatus(distributor_id,page)
    }

    fun getRetailerBillsListWithoutStatus(page:Int): Observable<BillsResponse> {
        return webservice.getRetailerBillsListWithoutStatus(page)
    }

    fun getRetailerFilterResponse(retailerId:Int,bill_no:Int,distributor:String,date_np_min:String, date_np_max:String): Observable<FilterResponse>{
        return webservice.getFilterList(retailerId,bill_no, distributor, date_np_min, date_np_max)
    }

    fun getDistributorRetailerFilterResponse(bill_no:Int,retailer:String,date_np_min:String, date_np_max:String): Observable<FilterResponse>{
        return webservice.getBillsFilterList(bill_no, retailer, date_np_min, date_np_max)
    }

    fun getLoginActivityResponse(){
        LoginActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }

    fun getBillsDetailsActivity(newsId: Int) {
        BillDetailsActivity.start(appCompatActivity,newsId)
    }

    fun getDistributorList(fiscalYearId:Int,retailerId: Int): Observable<DistributorListResponse> {
        return webservice.getDistributorList(fiscalYearId,retailerId)
    }

    fun getRetailerList(fiscalYearId:Int,page: Int): Observable<RetailerListResponse> {
        return webservice.getRetailerList(fiscalYearId,page)
    }

    fun getMonthBillDataRetailerList(fiscalYearId:Int,retailerId: Int): Observable<MonthBillStatusResponse> {
        return webservice.getMonthBillRetailerList(fiscalYearId,retailerId)
    }

    fun getMonthBillDataDistributorList(fiscalYearId:Int,distributor_id: Int): Observable<MonthBillStatusResponse> {
        return webservice.getMonthBillDistributorList(fiscalYearId,distributor_id)
    }

    fun postRefresh(info: ApiRequest.RefreshTokenRequest): Observable<RefreshTokenResponse> {
        return webservice.postRefreshToken(info.refresh)
    }
}