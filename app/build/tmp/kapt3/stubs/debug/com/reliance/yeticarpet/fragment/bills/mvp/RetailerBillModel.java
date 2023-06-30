package com.reliance.yeticarpet.fragment.bills.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\nJ\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nJ,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\bJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nJ\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\nJ4\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\f2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillModel;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "webservice", "Lcom/reliance/yeticarpet/app/Webservice;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/app/Webservice;)V", "getBillsDetailsActivity", "", "newsId", "", "getBillsListDistributorResponse", "Lio/reactivex/Observable;", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/BillsResponse;", "distributor_id", "page", "status", "", "getBillsResponse", "getDistributorBillsListWithoutStatus", "getDistributorList", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/DistributorListResponse;", "fiscalYearId", "retailerId", "getDistributorRetailerFilterResponse", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/FilterResponse;", "bill_no", "retailer", "", "date_np_min", "date_np_max", "getLoginActivityResponse", "getMonthBillDataDistributorList", "Lcom/reliance/yeticarpet/fragment/bills/dto/MonthBillStatusResponse;", "getMonthBillDataRetailerList", "getRetailerBillsListWithoutStatus", "getRetailerFilterResponse", "distributor", "getRetailerList", "Lcom/reliance/yeticarpet/fragment/bills/dto/RetailerListResponse;", "postRefresh", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "info", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "app_debug"})
public final class RetailerBillModel {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.app.Webservice webservice = null;
    
    public RetailerBillModel(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.Webservice webservice) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse> getBillsResponse(boolean status, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse> getBillsListDistributorResponse(int distributor_id, int page, boolean status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse> getDistributorBillsListWithoutStatus(int distributor_id, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse> getRetailerBillsListWithoutStatus(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse> getRetailerFilterResponse(int retailerId, int bill_no, @org.jetbrains.annotations.NotNull()
    java.lang.String distributor, @org.jetbrains.annotations.NotNull()
    java.lang.String date_np_min, @org.jetbrains.annotations.NotNull()
    java.lang.String date_np_max) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse> getDistributorRetailerFilterResponse(int bill_no, @org.jetbrains.annotations.NotNull()
    java.lang.String retailer, @org.jetbrains.annotations.NotNull()
    java.lang.String date_np_min, @org.jetbrains.annotations.NotNull()
    java.lang.String date_np_max) {
        return null;
    }
    
    public final void getLoginActivityResponse() {
    }
    
    public final void getBillsDetailsActivity(int newsId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.retailer.bill.dto.DistributorListResponse> getDistributorList(int fiscalYearId, int retailerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.fragment.bills.dto.RetailerListResponse> getRetailerList(int fiscalYearId, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse> getMonthBillDataRetailerList(int fiscalYearId, int retailerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse> getMonthBillDataDistributorList(int fiscalYearId, int distributor_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse> postRefresh(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest info) {
        return null;
    }
}