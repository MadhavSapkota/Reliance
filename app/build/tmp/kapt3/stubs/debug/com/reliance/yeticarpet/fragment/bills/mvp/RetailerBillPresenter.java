package com.reliance.yeticarpet.fragment.bills.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0003J\u0010\u0010<\u001a\u0002092\u0006\u0010:\u001a\u00020=H\u0003J\u0010\u0010>\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0003J\u0010\u0010>\u001a\u0002092\u0006\u0010:\u001a\u00020=H\u0003J\u0010\u0010?\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0003J\u0010\u0010@\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0003J\u0016\u0010A\u001a\u0002092\u0006\u0010B\u001a\u00020C2\u0006\u0010\u001b\u001a\u00020\u000eJ\u0016\u0010D\u001a\u0002092\u0006\u0010B\u001a\u00020C2\u0006\u0010E\u001a\u00020\u000eJ\u0018\u0010F\u001a\u0002092\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000eH\u0002J\u000e\u0010H\u001a\u0002092\u0006\u0010I\u001a\u00020\u000eJ\u000e\u0010J\u001a\u0002092\u0006\u0010I\u001a\u00020\u000eJ\u0016\u0010K\u001a\u0002092\u0006\u0010I\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020CJ\u000e\u0010L\u001a\u0002092\u0006\u0010E\u001a\u00020\u000eJ\u0016\u0010M\u001a\u0002092\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000eJ\u000e\u0010N\u001a\u0002092\u0006\u0010E\u001a\u00020\u000eJ\b\u0010O\u001a\u000209H\u0002J\u0010\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010S\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0003J\u0010\u0010T\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010U\u001a\u0002092\u0006\u0010:\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010X\u001a\u0002092\u0006\u0010:\u001a\u00020YH\u0002J\u0010\u0010Z\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010[\u001a\u0002092\u0006\u0010:\u001a\u00020YH\u0002J\u0006\u0010\\\u001a\u000209J\b\u0010]\u001a\u000209H\u0002J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020`0_H\u0002J\u0018\u0010a\u001a\u0002092\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000eH\u0002J(\u0010b\u001a\u0002092\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020eH\u0002J\b\u0010h\u001a\u000209H\u0007J\u0010\u0010i\u001a\u0002092\u0006\u0010+\u001a\u00020\u000eH\u0002J\u0010\u0010j\u001a\u0002092\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0016\u0010k\u001a\u0002092\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u000eJ0\u0010l\u001a\u0002092\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020e2\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020eH\u0002J\u000e\u0010n\u001a\u0002092\u0006\u0010o\u001a\u00020pJ\u0006\u0010q\u001a\u000209J\u0010\u0010r\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0002J\u0010\u0010s\u001a\u0002092\u0006\u0010:\u001a\u00020tH\u0002J\u0006\u0010u\u001a\u000209J\b\u00103\u001a\u000209H\u0002J\u0010\u0010v\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0003J\u0010\u0010w\u001a\u0002092\u0006\u0010:\u001a\u00020xH\u0002J\b\u0010y\u001a\u000209H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010!\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u000e\u0010\'\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR \u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0018\"\u0004\b7\u0010\u001a\u00a8\u0006z"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillPresenter;", "", "retailerBillView", "Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView;", "retailerBillModel", "Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillModel;", "(Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView;Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillModel;)V", "_calendar", "Ljava/util/Calendar;", "get_calendar", "()Ljava/util/Calendar;", "set_calendar", "(Ljava/util/Calendar;)V", "billId", "", "getBillId", "()Ljava/lang/Integer;", "setBillId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "day", "getDay", "()I", "setDay", "(I)V", "distributorId", "getDistributorId", "setDistributorId", "finalCompletedCount", "getFinalCompletedCount", "setFinalCompletedCount", "finalIncompleteCount", "getFinalIncompleteCount", "setFinalIncompleteCount", "month", "getMonth", "setMonth", "page", "pageR", "getPageR", "setPageR", "retailerId", "getRetailerId", "setRetailerId", "statusList", "Ljava/util/ArrayList;", "Lcom/reliance/yeticarpet/fragment/bills/dto/StatusData;", "getStatusList", "()Ljava/util/ArrayList;", "setStatusList", "(Ljava/util/ArrayList;)V", "year", "getYear", "setYear", "apiClickedSuccess", "", "result", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/BillsResponse;", "apiDistributorMonthListForGraphStatusSuccess", "Lcom/reliance/yeticarpet/fragment/bills/dto/MonthBillStatusResponse;", "apiRetailerStatusSuccess", "apiRetailerWithoutStatusSuccess", "apiSuccess", "billListCompletedDistributorList", "status", "", "billListCompletedRequest", "retailer_id", "billListDistributorMonthDataForGraphRequest", "fiscalYearId", "billListInDistributorNormalRequest", "distributor_id", "billListInDistributorRequest", "billListInPendingDistributorRequest", "billListRetailerAllRequest", "billListRetailerMonthDataForGraphRequest", "billListRetailerNormalRequest", "click", "credentialError", "e", "", "distributorApiClickedSuccess", "distributorApiError", "distributorApiSuccess", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/DistributorListResponse;", "distributorSectionRetailerFilterApiError", "distributorSectionRetailerFilterApiSuccess", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/FilterResponse;", "filterApiError", "filterApiSuccess", "getBillList", "getBillsItemClick", "getBillsItemsClickObserver", "Lio/reactivex/observers/DisposableObserver;", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/ResultData;", "getDistributionApi", "getDistributorFilterDataApi", "bill_no", "retailer", "", "date_np_min", "date_np_max", "getFilterRequest", "getNestedRetailerScrollActionListner", "getNestedScrollActionListner", "getRetailerApi", "getRetailerFilterDataApi", "distributor", "getStringWithId", "userInfo", "Lcom/reliance/yeticarpet/apputlis/UserInfo;", "onCreate", "retailerApiError", "retailerApiSuccess", "Lcom/reliance/yeticarpet/fragment/bills/dto/RetailerListResponse;", "setPartyName", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userRefreshRequestTokenApi", "app_debug"})
public final class RetailerBillPresenter {
    private final com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView retailerBillView = null;
    private final com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillModel retailerBillModel = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    public java.util.Calendar _calendar;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer billId;
    private int day = 0;
    private int year = 0;
    private int month = 0;
    private int page = 2;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.reliance.yeticarpet.fragment.bills.dto.StatusData> statusList;
    private int retailerId = 0;
    private int distributorId = 0;
    private int finalCompletedCount = 0;
    private int finalIncompleteCount = 0;
    private int pageR = 1;
    
    public RetailerBillPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView retailerBillView, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillModel retailerBillModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar get_calendar() {
        return null;
    }
    
    public final void set_calendar(@org.jetbrains.annotations.NotNull()
    java.util.Calendar p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBillId() {
        return null;
    }
    
    public final void setBillId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final int getDay() {
        return 0;
    }
    
    public final void setDay(int p0) {
    }
    
    public final int getYear() {
        return 0;
    }
    
    public final void setYear(int p0) {
    }
    
    public final int getMonth() {
        return 0;
    }
    
    public final void setMonth(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.reliance.yeticarpet.fragment.bills.dto.StatusData> getStatusList() {
        return null;
    }
    
    public final void setStatusList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.reliance.yeticarpet.fragment.bills.dto.StatusData> p0) {
    }
    
    public final int getRetailerId() {
        return 0;
    }
    
    public final void setRetailerId(int p0) {
    }
    
    public final int getDistributorId() {
        return 0;
    }
    
    public final void setDistributorId(int p0) {
    }
    
    public final int getFinalCompletedCount() {
        return 0;
    }
    
    public final void setFinalCompletedCount(int p0) {
    }
    
    public final int getFinalIncompleteCount() {
        return 0;
    }
    
    public final void setFinalIncompleteCount(int p0) {
    }
    
    public final int getPageR() {
        return 0;
    }
    
    public final void setPageR(int p0) {
    }
    
    public final void onCreate() {
    }
    
    private final void click() {
    }
    
    public final void getBillList() {
    }
    
    public final void setPartyName() {
    }
    
    public final void getStringWithId(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.apputlis.UserInfo userInfo) {
    }
    
    public final void billListRetailerMonthDataForGraphRequest(int retailer_id, int fiscalYearId) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void apiRetailerStatusSuccess(com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse result) {
    }
    
    public final void billListRetailerNormalRequest(int retailer_id) {
    }
    
    public final void billListRetailerAllRequest(int retailer_id) {
    }
    
    public final void billListCompletedRequest(boolean status, int retailer_id) {
    }
    
    public final void billListInPendingDistributorRequest(int distributor_id, boolean status) {
    }
    
    public final void billListCompletedDistributorList(boolean status, int distributorId) {
    }
    
    public final void billListInDistributorRequest(int distributor_id) {
    }
    
    public final void billListInDistributorNormalRequest(int distributor_id) {
    }
    
    private final void billListDistributorMonthDataForGraphRequest(int distributorId, int fiscalYearId) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void apiDistributorMonthListForGraphStatusSuccess(com.reliance.yeticarpet.fragment.bills.dto.MonthBillStatusResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void apiRetailerStatusSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void apiRetailerWithoutStatusSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void apiSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void distributorApiClickedSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void apiClickedSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.BillsResponse result) {
    }
    
    private final void getNestedScrollActionListner(int distributorId) {
    }
    
    private final void getNestedRetailerScrollActionListner(int retailerId) {
    }
    
    private final void credentialError(java.lang.Throwable e) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void getFilterRequest() {
    }
    
    private final void getRetailerFilterDataApi(int retailer_id, int bill_no, java.lang.String distributor, java.lang.String date_np_min, java.lang.String date_np_max) {
    }
    
    private final void filterApiSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse result) {
    }
    
    private final void filterApiError(java.lang.Throwable e) {
    }
    
    private final void getDistributorFilterDataApi(int bill_no, java.lang.String retailer, java.lang.String date_np_min, java.lang.String date_np_max) {
    }
    
    private final void distributorSectionRetailerFilterApiSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.FilterResponse result) {
    }
    
    private final void distributorSectionRetailerFilterApiError(java.lang.Throwable e) {
    }
    
    private final void getDistributionApi(int fiscalYearId, int retailer_id) {
    }
    
    private final void distributorApiSuccess(com.reliance.yeticarpet.activity.retailer.bill.dto.DistributorListResponse result) {
    }
    
    private final void distributorApiError(java.lang.Throwable e) {
    }
    
    public final void getRetailerApi(int fiscalYearId, int page) {
    }
    
    private final void retailerApiSuccess(com.reliance.yeticarpet.fragment.bills.dto.RetailerListResponse result) {
    }
    
    private final void retailerApiError(java.lang.Throwable e) {
    }
    
    private final void userRefreshRequestTokenApi() {
    }
    
    private final void setStatusList() {
    }
    
    private final void tokenSuccess(com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void tokenError(java.lang.Throwable e) {
    }
    
    private final void getBillsItemClick() {
    }
    
    private final io.reactivex.observers.DisposableObserver<com.reliance.yeticarpet.activity.retailer.bill.dto.ResultData> getBillsItemsClickObserver() {
        return null;
    }
}