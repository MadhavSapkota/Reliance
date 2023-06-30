package com.reliance.yeticarpet.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH\'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\'J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u000eH\'J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003H\'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u0006H\'J,\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\'J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\'J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010$\u001a\u00020\u0006H\'J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\'\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020\u0006H\'J6\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u00062\b\b\u0001\u0010,\u001a\u00020\u0006H\'J@\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010.\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010/\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH\'J\u000e\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0003H\'J\u0018\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\'J\"\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u00105\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u0006H\'J\"\u00106\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u00105\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020\u0006H\'J,\u00107\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u0006H\'J\"\u00108\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010$\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u0006H\'J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\'J\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00032\b\b\u0001\u0010$\u001a\u00020\u0006H\'J\"\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0006H\'J\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00032\b\b\u0001\u0010@\u001a\u00020\u000eH\'J\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00032\b\b\u0001\u0010C\u001a\u00020DH\'J\"\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00032\b\b\u0001\u0010G\u001a\u00020\u000e2\b\b\u0001\u0010H\u001a\u00020\u000eH\'J\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00032\b\b\u0001\u0010K\u001a\u00020\u000eH\'\u00a8\u0006L"}, d2 = {"Lcom/reliance/yeticarpet/app/Webservice;", "", "getBillsBrand", "Lio/reactivex/Observable;", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/BrandDetailsResponse;", "bill_id", "", "getBillsDetails", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/BillDetailsResponse;", "id", "getBillsFilterList", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/FilterResponse;", "bill_no", "retailerName", "", "date_np_min", "date_np_max", "getBillsList", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/BillsResponse;", "status", "", "page", "getChangePasswordRespose", "Lcom/reliance/yeticarpet/activity/changepassword/dto/ChangePasswordResponse;", "password", "password2", "old_password", "getCheckDevice", "Lcom/reliance/yeticarpet/activity/login/dto/CheckDeviceResponse;", "getCheckDeviceOtp", "token", "getDistributorBillsList", "distributorId", "getDistributorBillsListWithoutStatus", "getDistributorDashboardList", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/DistributorDashboardResponse;", "fiscal_year", "getDistributorList", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/DistributorListResponse;", "fiscalYearId", "retailerId", "getDistributorRetailerList", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/dto/PartyListResponse;", "end", "start", "getFilterList", "retailer_id", "distributor", "getFiscalYear", "Lcom/reliance/yeticarpet/activity/login/dto/FiscalYearResponse;", "getFiscalYears", "getMonthBillDistributorList", "Lcom/reliance/yeticarpet/fragment/bills/dto/MonthBillStatusResponse;", "fiscalYear", "getMonthBillRetailerList", "getPartyDetails", "getPartyList", "getRetailerBillsListWithoutStatus", "getRetailerDashboard", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/RetailerDashboardResponse;", "getRetailerList", "Lcom/reliance/yeticarpet/fragment/bills/dto/RetailerListResponse;", "postForgotPassword", "Lcom/reliance/yeticarpet/activity/forgotpassword/dto/ForgotPasswordResponse;", "username", "postLogin", "Lcom/reliance/yeticarpet/activity/login/dto/LoginResponse;", "info", "Lcom/reliance/yeticarpet/app/ApiRequest$LoginRequest;", "postOtp", "Lcom/reliance/yeticarpet/activity/otp/dto/OtpResponse;", "userId", "otp", "postRefreshToken", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "refresh", "app_debug"})
public abstract interface Webservice {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/auth/login/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.LoginResponse> postLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.reliance.yeticarpet.app.ApiRequest.LoginRequest info);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/auth/token/check_device/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse> getCheckDevice();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/auth/forget_password/")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.forgotpassword.dto.ForgotPasswordResponse> postForgotPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/auth/otp/")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.otp.dto.OtpResponse> postOtp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_id")
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "otp")
    java.lang.String otp);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/auth/token/verify/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.CheckDeviceResponse> getCheckDeviceOtp(@retrofit2.http.Query(value = "token")
    int token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/auth/login/refresh/")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse> postRefreshToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "refresh")
    java.lang.String refresh);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/bill/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse> getBillsList(@retrofit2.http.Query(value = "status")
    boolean status, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/bill/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse> getDistributorBillsList(@retrofit2.http.Query(value = "distributor_id")
    int distributorId, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "status")
    boolean status);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/bill/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse> getDistributorBillsListWithoutStatus(@retrofit2.http.Query(value = "distributor_id")
    int distributorId, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/bill/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse> getRetailerBillsListWithoutStatus(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = " /api/master/fiscal_year/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse> getFiscalYears(@retrofit2.http.Query(value = "status")
    boolean status);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = " /api/master/fiscal_year/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.FiscalYearResponse> getFiscalYear();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/bill/{id}")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse> getBillsDetails(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/billbrand")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill_details.dto.BrandDetailsResponse> getBillsBrand(@retrofit2.http.Query(value = "bill_id")
    int bill_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/distributor_list/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.DistributorListResponse> getDistributorList(@retrofit2.http.Query(value = "fiscal_year")
    int fiscalYearId, @retrofit2.http.Query(value = "retailer_id")
    int retailerId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/bill/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse> getFilterList(@retrofit2.http.Query(value = "retailer_id")
    int retailer_id, @retrofit2.http.Query(value = "bill_no")
    int bill_no, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "distributor")
    java.lang.String distributor, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date_np_min")
    java.lang.String date_np_min, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date_np_max")
    java.lang.String date_np_max);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/bill/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse> getBillsFilterList(@retrofit2.http.Query(value = "bill_no")
    int bill_no, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "retailer")
    java.lang.String retailerName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date_np_min")
    java.lang.String date_np_min, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date_np_max")
    java.lang.String date_np_max);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/dashboard/retailer_dashboard/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse> getRetailerDashboard(@retrofit2.http.Query(value = "fiscal_year")
    int fiscal_year);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "/auth/change_password/1/")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.changepassword.dto.ChangePasswordResponse> getChangePasswordRespose(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password2")
    java.lang.String password2, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "old_password")
    java.lang.String old_password);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/dashboard/retailer_dashboard/")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse> getPartyList(@retrofit2.http.Query(value = "fiscal_year")
    int fiscal_year, @retrofit2.http.Query(value = "retailer_id")
    int retailer_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/dashboard/distributor_dashboard")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse> getDistributorDashboardList(@retrofit2.http.Query(value = "fiscal_year")
    int fiscal_year);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/retailer_list")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse> getDistributorRetailerList(@retrofit2.http.Query(value = "fiscal_year")
    int fiscal_year, @retrofit2.http.Query(value = "distributor_id")
    int distributorId, @retrofit2.http.Query(value = "end")
    int end, @retrofit2.http.Query(value = "start")
    int start);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/bills/retailer_list")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.activity.distributor.retailerlist.dto.PartyListResponse> getPartyDetails(@retrofit2.http.Query(value = "fiscal_year")
    int fiscal_year, @retrofit2.http.Query(value = "distributor_id")
    int distributorId, @retrofit2.http.Query(value = "retailer_id")
    int retailer_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/api/retailer/retailer")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.fragment.bills.dto.RetailerListResponse> getRetailerList(@retrofit2.http.Query(value = "status")
    int status, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/bills/month_bill_status")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse> getMonthBillRetailerList(@retrofit2.http.Query(value = "fiscal_year")
    int fiscalYear, @retrofit2.http.Query(value = "retailer_id")
    int retailerId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "api/bills/month_bill_status")
    public abstract io.reactivex.Observable<com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse> getMonthBillDistributorList(@retrofit2.http.Query(value = "fiscal_year")
    int fiscalYear, @retrofit2.http.Query(value = "distributor_id")
    int distributorId);
}