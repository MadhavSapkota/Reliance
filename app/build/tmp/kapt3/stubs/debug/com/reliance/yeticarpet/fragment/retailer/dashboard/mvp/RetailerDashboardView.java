package com.reliance.yeticarpet.fragment.retailer.dashboard.mvp;

import java.lang.System;

@android.annotation.SuppressLint(value = {"ViewConstructor"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001IB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0016H\u0002J\u0006\u0010&\u001a\u00020 J\b\u0010\'\u001a\u00020 H\u0002J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0002J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020 J\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/J\u000e\u00101\u001a\u00020 2\u0006\u0010,\u001a\u00020*J\u001e\u00102\u001a\u00020 2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001604j\b\u0012\u0004\u0012\u00020\u0016`5J\f\u00106\u001a\b\u0012\u0004\u0012\u0002070/J\u0006\u00108\u001a\u00020*J\u0006\u00109\u001a\u00020*J\u0006\u0010:\u001a\u00020;J\u001e\u0010<\u001a\u00020 2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001604j\b\u0012\u0004\u0012\u00020\u0016`5J\u0006\u0010=\u001a\u00020 J\u0010\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020@H\u0007J\u0006\u0010A\u001a\u00020 J\u0006\u0010B\u001a\u00020 J\u001e\u0010C\u001a\u00020 2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010E2\u0006\u0010F\u001a\u00020#J\u000e\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020\u000eR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardView;", "Landroid/widget/FrameLayout;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "retailerDashboardAdapter", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/adapter/RetailerDashboardAdapter;", "credentialsErrorDialog", "Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;", "fiscalYearDialog", "Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/fragment/retailer/dashboard/adapter/RetailerDashboardAdapter;Lcom/reliance/yeticarpet/dialog/CredentialsErrorDialog;Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;)V", "adapter", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/adapter/HorizontalBarChartAdapter;", "binding", "Lcom/reliance/yeticarpet/databinding/MainFragmentDashboardRetailerLayoutBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/MainFragmentDashboardRetailerLayoutBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/MainFragmentDashboardRetailerLayoutBinding;)V", "getFiscalYearDialog", "()Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "granularity", "", "mChart", "Lcom/github/mikephil/charting/charts/HorizontalBarChart;", "maxValue", "getMaxValue", "()I", "setMaxValue", "(I)V", "maxValueOnXAxis", "addTextViewForXAxis", "", "calculateGranularity", "checkNetwork", "", "createTextView", "numberOfTextView", "dismissDialog", "generateOriginalLabelForXAxis", "generateXAxisTextView", "value", "", "getCredentialErrorMessage", "message", "getDismissDialog", "getDropDownClickedObservable", "Lio/reactivex/Observable;", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/SchemeDetail;", "getErrorMessage", "getGranularity", "pointList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getOkObserable", "", "getSessionErrorMessage", "getUserPortalErrorMessage", "postRefreshRequest", "Lcom/reliance/yeticarpet/app/ApiRequest$RefreshTokenRequest;", "setGraphRecyclerViewAdapter", "setRetailerDashboardAdapter", "setRetailerDashboardDetails", "result", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/RetailerDashboardResponse;", "showDashboardContent", "showDialog", "showRetailerListData", "termlist", "", "aboolean", "start", "dashboardBinding", "CenterValueFormatter", "app_debug"})
public final class RetailerDashboardView extends android.widget.FrameLayout {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private final com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardAdapter retailerDashboardAdapter = null;
    private final com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.MainFragmentDashboardRetailerLayoutBinding binding;
    private com.github.mikephil.charting.charts.HorizontalBarChart mChart;
    private com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.HorizontalBarChartAdapter adapter;
    private int maxValue = 0;
    private int maxValueOnXAxis = 0;
    private int granularity = 0;
    private java.util.HashMap _$_findViewCache;
    
    public RetailerDashboardView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardAdapter retailerDashboardAdapter, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.CredentialsErrorDialog credentialsErrorDialog, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.dialog.FiscalYearDialog getFiscalYearDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.MainFragmentDashboardRetailerLayoutBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.MainFragmentDashboardRetailerLayoutBinding p0) {
    }
    
    public final int getMaxValue() {
        return 0;
    }
    
    public final void setMaxValue(int p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.MainFragmentDashboardRetailerLayoutBinding dashboardBinding) {
    }
    
    public final void setGraphRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> pointList) {
    }
    
    public final void addTextViewForXAxis(int maxValue) {
    }
    
    private final void createTextView(int numberOfTextView) {
    }
    
    private final void generateOriginalLabelForXAxis() {
    }
    
    private final void generateXAxisTextView(java.lang.String value) {
    }
    
    public final void getGranularity(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> pointList) {
    }
    
    private final void calculateGranularity(int maxValue) {
    }
    
    public final void dismissDialog() {
    }
    
    public final void showDialog() {
    }
    
    public final void getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final boolean checkNetwork() {
        return false;
    }
    
    public final void getCredentialErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> getOkObserable() {
        return null;
    }
    
    public final void getDismissDialog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPortalErrorMessage() {
        return null;
    }
    
    public final void showDashboardContent() {
    }
    
    public final void showRetailerListData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> termlist, boolean aboolean) {
    }
    
    public final void setRetailerDashboardAdapter() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> getDropDownClickedObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.app.ApiRequest.RefreshTokenRequest postRefreshRequest() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public final void setRetailerDashboardDetails(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerDashboardResponse result) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/mvp/RetailerDashboardView$CenterValueFormatter;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "()V", "getBarLabel", "", "barEntry", "Lcom/github/mikephil/charting/data/BarEntry;", "app_debug"})
    public static final class CenterValueFormatter extends com.github.mikephil.charting.formatter.ValueFormatter {
        
        public CenterValueFormatter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getBarLabel(@org.jetbrains.annotations.Nullable()
        com.github.mikephil.charting.data.BarEntry barEntry) {
            return null;
        }
    }
}