package com.reliance.yeticarpet.fragment.distributor.dashboard.mvp;

import java.lang.System;

@android.annotation.SuppressLint(value = {"ViewConstructor"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016J\u0006\u0010!\u001a\u00020\u001eJ\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010\'\u001a\u00020(J\u0006\u0010)\u001a\u00020\u001eJ\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0007J\u001a\u0010-\u001a\u00020\u001e2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002000/J\u0006\u00101\u001a\u00020\u001eJ\u0006\u00102\u001a\u00020\u001eJ\u0006\u00103\u001a\u00020\u001eJ\u0006\u00104\u001a\u00020\u001eJ2\u00105\u001a\u00020\u001e2\u000e\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u0006\u00109\u001a\u00020\u001c2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002000/J2\u0010:\u001a\u00020\u001e2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020<\u0018\u0001072\u0006\u00109\u001a\u00020\u001c2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002000/J\u000e\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0016J$\u0010?\u001a\u00020\u001e2\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020A\u0018\u00010/2\u0006\u00109\u001a\u00020\u001cJ\u000e\u0010B\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020\u0010J\f\u0010D\u001a\b\u0012\u0004\u0012\u00020%0$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/mvp/DistributorDashboardView;", "Landroid/widget/FrameLayout;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "retailerListAdapter", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/RetailerListAdapter;", "monthlySalesItemsAdapter", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthlySalesItemsAdapter;", "credentialsErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "monthListAdapter", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthListAdapter;", "fiscalYearDialog", "Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/RetailerListAdapter;Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthlySalesItemsAdapter;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthListAdapter;Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;)V", "binding", "Lcom/reliance/yeticarpet/databinding/MainFragmentDistributorLayoutBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/MainFragmentDistributorLayoutBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/MainFragmentDistributorLayoutBinding;)V", "clickedMonthItems", "", "getFiscalYearDialog", "()Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "progressBar", "Lcom/reliance/yeticarpet/apputlis/CustomProgressBar;", "checkNetwork", "", "dismissDialog", "", "getCredentialErrorMessage", "message", "getDismissDialog", "getErrorMessage", "getOkObserable", "Lio/reactivex/Observable;", "", "getSessionErrorMessage", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "setDistributorDashboardAdapter", "setDistributorDashboardDetails", "result", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/DistributorDashboardResponse;", "setGraph", "monthCategory", "", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/MonthCategory;", "setMonthListAdapter", "setMonthlyCategoryAdapter", "showDashboardContent", "showDialog", "showMonthListData", "monthData", "", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/MonthData;", "aboolean", "showMonthlyCategoryData", "category", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/Category;", "showProgressDialog", "statusString", "showRetailerListData", "termlist", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/RetailerPurchase;", "start", "dashboardBinding", "viewRetailerList", "app_debug"})
public final class DistributorDashboardView extends android.widget.FrameLayout {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.RetailerListAdapter retailerListAdapter = null;
    private final com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter monthlySalesItemsAdapter = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog = null;
    private final com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter monthListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.MainFragmentDistributorLayoutBinding binding;
    private com.reliance.yeticarpet.apputlis.CustomProgressBar progressBar;
    private java.lang.String clickedMonthItems = "";
    private java.util.HashMap _$_findViewCache;
    
    public DistributorDashboardView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.RetailerListAdapter retailerListAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter monthlySalesItemsAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter monthListAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.dialog.FiscalYearDialog getFiscalYearDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.MainFragmentDistributorLayoutBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.MainFragmentDistributorLayoutBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.MainFragmentDistributorLayoutBinding dashboardBinding) {
    }
    
    public final boolean checkNetwork() {
        return false;
    }
    
    public final void dismissDialog() {
    }
    
    public final void showDialog() {
    }
    
    public final void getCredentialErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showDashboardContent() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    public final void getDismissDialog() {
    }
    
    public final void showProgressDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String statusString) {
    }
    
    public final void getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setDistributorDashboardAdapter() {
    }
    
    public final void setMonthListAdapter() {
    }
    
    public final void showRetailerListData(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.distributor.dashboard.dto.RetailerPurchase> termlist, boolean aboolean) {
    }
    
    public final void setMonthlyCategoryAdapter() {
    }
    
    public final void showMonthlyCategoryData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category> category, boolean aboolean, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory> monthCategory) {
    }
    
    public final void showMonthListData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> monthData, boolean aboolean, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory> monthCategory) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void setDistributorDashboardDetails(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.dto.DistributorDashboardResponse result) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> viewRetailerList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest postRefreshRequest() {
        return null;
    }
    
    public final void setGraph(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory> monthCategory) {
    }
}