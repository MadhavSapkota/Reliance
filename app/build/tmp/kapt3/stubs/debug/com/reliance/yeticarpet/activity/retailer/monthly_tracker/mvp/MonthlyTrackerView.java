package com.reliance.yeticarpet.activity.retailer.monthly_tracker.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018J\u0006\u0010\u001f\u001a\u00020\u0016J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u001e\u0010$\u001a\u00020\u00162\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0014J\u001e\u0010)\u001a\u00020\u00162\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0014J\u0006\u0010*\u001a\u00020\u0016J\u000e\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/mvp/MonthlyTrackerView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "loginErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "trackerAdapter", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/adapter/TrackerAdapter;", "percentageAdapter", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/adapter/PercentageAdapter;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/adapter/TrackerAdapter;Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/adapter/PercentageAdapter;)V", "binding", "Lcom/reliance/yeticarpet/databinding/MonthlyTargetTrackerBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/MonthlyTargetTrackerBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/MonthlyTargetTrackerBinding;)V", "progressDialog", "Landroid/app/ProgressDialog;", "checkNetwork", "", "dismissDialog", "", "getBackArrow", "Lio/reactivex/Observable;", "getCredentialErrorMessage", "message", "", "getDismissDialog", "getErrorMessage", "getOkObserable", "hidProgressDialog", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "setHorizontalAdapter", "setRetailerDashboardAdapter", "showHorizontalListData", "termlist", "", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/Offer;", "aboolean", "showMonthlyTrackerListData", "showProgressDialog", "start", "binding_tracker", "app_debug"})
public final class MonthlyTrackerView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog = null;
    private final com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerAdapter trackerAdapter = null;
    private final com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.PercentageAdapter percentageAdapter = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.MonthlyTargetTrackerBinding binding;
    private final android.app.ProgressDialog progressDialog = null;
    
    public MonthlyTrackerView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog loginErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerAdapter trackerAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.PercentageAdapter percentageAdapter) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.MonthlyTargetTrackerBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.MonthlyTargetTrackerBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.MonthlyTargetTrackerBinding binding_tracker) {
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
    
    public final void setRetailerDashboardAdapter() {
    }
    
    public final void setHorizontalAdapter() {
    }
    
    public final void showMonthlyTrackerListData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer> termlist, boolean aboolean) {
    }
    
    public final void showHorizontalListData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer> termlist, boolean aboolean) {
    }
    
    public final void dismissDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getBackArrow() {
        return null;
    }
    
    public final void getDismissDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest postRefreshRequest() {
        return null;
    }
}