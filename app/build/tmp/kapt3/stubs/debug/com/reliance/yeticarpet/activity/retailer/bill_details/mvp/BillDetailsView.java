package com.reliance.yeticarpet.activity.retailer.bill_details.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0016J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0007J\u0006\u0010\"\u001a\u00020\u0016J\u001e\u0010#\u001a\u00020\u00162\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0006\u0010\'\u001a\u00020\u0012J\u0006\u0010(\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/bill_details/mvp/BillDetailsView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "billsDetailsAdapter", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/adapter/BillsDetailsAdapter;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;Lcom/reliance/yeticarpet/activity/retailer/bill_details/adapter/BillsDetailsAdapter;)V", "binding", "Lcom/reliance/yeticarpet/databinding/BillDetailsBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/BillDetailsBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/BillDetailsBinding;)V", "progressDialog", "Landroid/app/ProgressDialog;", "checkNetwork", "", "getBackArrow", "Lio/reactivex/Observable;", "getCredentialErrorMessage", "", "message", "", "getErrorMessage", "getOkObserable", "getSessionErrorMessage", "hidProgressDialog", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "setBillDetails", "result", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/BillDetailsResponse;", "setRetailerDashboardAdapter", "showBillListData", "termlist", "", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/BillDatum;", "aboolean", "showProgressDialog", "start", "binding_login", "app_debug"})
public final class BillDetailsView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog = null;
    private final com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsAdapter billsDetailsAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.BillDetailsBinding binding;
    private final android.app.ProgressDialog progressDialog = null;
    
    public BillDetailsView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.adapter.BillsDetailsAdapter billsDetailsAdapter) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.BillDetailsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.BillDetailsBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.BillDetailsBinding binding_login) {
    }
    
    public final void showProgressDialog() {
    }
    
    public final void hidProgressDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionErrorMessage() {
        return null;
    }
    
    public final boolean checkNetwork() {
        return false;
    }
    
    public final void getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void getCredentialErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setRetailerDashboardAdapter() {
    }
    
    public final void showBillListData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDatum> termlist, boolean aboolean) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void setBillDetails(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.bill_details.dto.BillDetailsResponse result) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getBackArrow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest postRefreshRequest() {
        return null;
    }
}