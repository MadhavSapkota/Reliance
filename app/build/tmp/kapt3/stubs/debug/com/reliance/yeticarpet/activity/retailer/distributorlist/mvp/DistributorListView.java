package com.reliance.yeticarpet.activity.retailer.distributorlist.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016J\u0006\u0010\u001d\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0014J\u001e\u0010!\u001a\u00020\u00142\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\u0006\u0010%\u001a\u00020\u0012J\u0006\u0010&\u001a\u00020\u0014J\u000e\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/distributorlist/mvp/DistributorListView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "distributorListAdapter", "Lcom/reliance/yeticarpet/activity/retailer/distributorlist/adapter/DistributorListAdapter;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;Lcom/reliance/yeticarpet/activity/retailer/distributorlist/adapter/DistributorListAdapter;)V", "binding", "Lcom/reliance/yeticarpet/databinding/ActivityDistributorListBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/ActivityDistributorListBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/ActivityDistributorListBinding;)V", "progressDialog", "Landroid/app/ProgressDialog;", "checkNetwork", "", "dismissDialog", "", "getBackArrow", "Lio/reactivex/Observable;", "getCredentialErrorMessage", "message", "", "getDismissDialog", "getErrorMessage", "getOkObserable", "hidProgressDialog", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "setDistributorListAdapter", "showBillListData", "termlist", "", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/Result;", "aboolean", "showProgressDialog", "start", "binding_tracker", "app_debug"})
public final class DistributorListView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog = null;
    private final com.reliance.yeticarpet.activity.retailer.distributorlist.adapter.DistributorListAdapter distributorListAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.ActivityDistributorListBinding binding;
    private final android.app.ProgressDialog progressDialog = null;
    
    public DistributorListView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.distributorlist.adapter.DistributorListAdapter distributorListAdapter) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.ActivityDistributorListBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.ActivityDistributorListBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.ActivityDistributorListBinding binding_tracker) {
    }
    
    public final void showProgressDialog() {
    }
    
    public final void hidProgressDialog() {
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
    
    public final void showBillListData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.activity.retailer.bill.dto.Result> termlist, boolean aboolean) {
    }
    
    public final void setDistributorListAdapter() {
    }
    
    public final void dismissDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    public final void getDismissDialog() {
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