package com.reliance.yeticarpet.app
import com.reliance.yeticarpet.activity.changepassword.dto.ChangePasswordResponse
import com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse
import com.reliance.yeticarpet.activity.retailer.bill_details.dto.BrandDetailsResponse
import com.reliance.yeticarpet.activity.forgotpassword.dto.ForgotPasswordResponse
import com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse
import com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse
import com.reliance.yeticarpet.activity.login.dto.LoginResponse
import com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse
import com.reliance.yeticarpet.activity.otp.dto.OtpResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.DistributorListResponse
import com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse
import com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse
import com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse
import com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse
import com.reliance.yeticarpet.fragment.bills.dto.RetailerListResponse
import io.reactivex.Observable
import retrofit2.http.*

interface Webservice {

    @POST(Apiurl.LOGIN)
    fun postLogin(@Body info: ApiRequest.LoginRequest): Observable<LoginResponse>

    @GET(Apiurl.CHECKDEVICE)
    fun getCheckDevice(): Observable<CheckDeviceResponse>

    @FormUrlEncoded
    @POST(Apiurl.FORGOTPASSWORD)
    fun postForgotPassword(@Field("username") username:String): Observable<ForgotPasswordResponse>

    @FormUrlEncoded
    @POST(Apiurl.OTP)
    fun postOtp(@Field("user_id") userId:String,@Field("otp") otp:String): Observable<OtpResponse>


    @GET(Apiurl.CHECKEDDEVICEOTP)
    fun getCheckDeviceOtp(@Query("token") token:Int): Observable<CheckDeviceResponse>

    @FormUrlEncoded
    @POST(Apiurl.REFRESHTOKEN)
    fun postRefreshToken(@Field("refresh") refresh:String): Observable<RefreshTokenResponse>

    @GET(Apiurl.BILLS)
    fun getBillsList(@Query("status") status: Boolean,@Query("page") page:Int): Observable<BillsResponse>

    @GET(Apiurl.BILLS)
    fun getDistributorBillsList(@Query("distributor_id")distributorId:Int,@Query("page") page:Int,@Query("status")status: Boolean): Observable<BillsResponse>

    @GET(Apiurl.BILLS)
    fun getDistributorBillsListWithoutStatus(@Query("distributor_id")distributorId:Int,@Query("page") page:Int): Observable<BillsResponse>

    @GET(Apiurl.BILLS)
    fun getRetailerBillsListWithoutStatus(@Query("page") page:Int): Observable<BillsResponse>


    @GET(Apiurl.FISCALYEAR)
    fun getFiscalYears(@Query("status") status: Boolean): Observable<FiscalYearResponse>


    @GET(Apiurl.FISCALYEAR)
    fun getFiscalYear(): Observable<FiscalYearResponse>


    @GET(Apiurl.BILLSDETAILS)
    fun getBillsDetails(@Path("id") id: Int): Observable<BillDetailsResponse>

    @GET(Apiurl.BILLBRAND)
    fun getBillsBrand(@Query("bill_id") bill_id: Int): Observable<BrandDetailsResponse>

    @GET(Apiurl.DISTRIBUTORLIST)
    fun getDistributorList(@Query("fiscal_year") fiscalYearId: Int,@Query("retailer_id") retailerId: Int): Observable<DistributorListResponse>

    @GET(Apiurl.BILLS)
    fun getFilterList(
        @Query("retailer_id") retailer_id: Int,
        @Query("bill_no") bill_no: Int,
        @Query("distributor") distributor: String,
        @Query("date_np_min") date_np_min: String,
        @Query("date_np_max") date_np_max: String
    ): Observable<FilterResponse>


    @GET(Apiurl.BILLS)
    fun getBillsFilterList(
        @Query("bill_no") bill_no: Int,
        @Query("retailer") retailerName: String,
        @Query("date_np_min") date_np_min: String,
        @Query("date_np_max") date_np_max: String
    ): Observable<FilterResponse>


    @GET(Apiurl.RETAILERDASHBOARD)
    fun getRetailerDashboard(@Query("fiscal_year") fiscal_year: Int): Observable<RetailerDashboardResponse>

    @FormUrlEncoded
    @PUT(Apiurl.CHANGEPASSWORD)
    fun getChangePasswordRespose(@Field("password") password:String,@Field("password2") password2:String,@Field("old_password") old_password:String) :Observable<ChangePasswordResponse>

    @GET(Apiurl.RETAILERDASHBOARD)
    fun getPartyList(@Query("fiscal_year") fiscal_year: Int,@Query("retailer_id") retailer_id:Int): Observable<PartyListResponse>

    @GET(Apiurl.DISTRIBUTORDASHBOARD)
    fun getDistributorDashboardList(@Query("fiscal_year") fiscal_year: Int): Observable<DistributorDashboardResponse>

    @GET(Apiurl.PARTYLIST)
    fun getDistributorRetailerList(@Query("fiscal_year") fiscal_year: Int,@Query("distributor_id")distributorId:Int,@Query("end")end:Int,@Query("start")start:Int): Observable<PartyListResponse>

    @GET(Apiurl.PARTYLIST)
    fun getPartyDetails(@Query("fiscal_year") fiscal_year: Int,@Query("distributor_id")distributorId:Int,@Query("retailer_id")retailer_id:Int): Observable<PartyListResponse>

    @GET(Apiurl.RETAILERlIST)
    fun getRetailerList(@Query("status") status: Int,@Query("page") page: Int): Observable<RetailerListResponse>

    @GET(Apiurl.MONTHLISTDATA)
    fun getMonthBillRetailerList(@Query("fiscal_year") fiscalYear: Int,@Query("retailer_id") retailerId: Int): Observable<MonthBillStatusResponse>

    @GET(Apiurl.MONTHLISTDATA)
    fun getMonthBillDistributorList(@Query("fiscal_year") fiscalYear: Int,@Query("distributor_id") distributorId: Int): Observable<MonthBillStatusResponse>

}