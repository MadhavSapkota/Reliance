package com.reliance.yeticarpet.activity.retailer.bill_details.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsPresenter;", "", "billDetailsModel", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsModel;", "billDetailsView", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsView;", "(Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsModel;Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsView;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "billDetailsError", "", "e", "", "billDetailsRequest", "billId", "", "billDetailsSuccess", "result", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/BillDetailsResponse;", "brandDetailsError", "brandDetailsSuccess", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/BrandDetailsResponse;", "getBillsBrandApi", "bill_id", "getBillsDetailsApi", "billsId", "onCreateView", "tokenError", "tokenSuccess", "Lcom/reliance/yeticarpet/activity/login/dto/RefreshTokenResponse;", "userRefreshRequestTokenApi", "app_debug"})
public final class BillDetailsPresenter {
    private final com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsModel billDetailsModel = null;
    private final com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsView billDetailsView = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    public BillDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsModel billDetailsModel, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.mvp.BillDetailsView billDetailsView) {
        super();
    }
    
    public final void onCreateView(int billId) {
    }
    
    public final void billDetailsRequest(int billId) {
    }
    
    private final void getBillsDetailsApi(int billsId) {
    }
    
    private final void billDetailsSuccess(com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse result) {
    }
    
    private final void billDetailsError(java.lang.Throwable e) {
    }
    
    private final void getBillsBrandApi(int bill_id) {
    }
    
    private final void brandDetailsSuccess(com.reliance.yeticarpet.activity.retailer.bill_details.dto.BrandDetailsResponse result) {
    }
    
    private final void brandDetailsError(java.lang.Throwable e) {
    }
    
    private final void userRefreshRequestTokenApi() {
    }
    
    private final void tokenSuccess(com.reliance.yeticarpet.activity.login.dto.RefreshTokenResponse result) {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void tokenError(java.lang.Throwable e) {
    }
}