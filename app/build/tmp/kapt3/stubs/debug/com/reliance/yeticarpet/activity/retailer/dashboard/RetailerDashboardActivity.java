package com.reliance.yeticarpet.activity.retailer.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/dashboard/RetailerDashboardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/reliance/yeticarpet/databinding/ActivityDashboardRetailerBinding;", "dashboardPresenter", "Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardPresenter;", "getDashboardPresenter", "()Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardPresenter;", "setDashboardPresenter", "(Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardPresenter;)V", "dashboardView", "Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardView;", "getDashboardView", "()Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardView;", "setDashboardView", "(Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardView;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showAlertDialog", "Companion", "app_debug"})
public final class RetailerDashboardActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView dashboardView;
    @javax.inject.Inject()
    public com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardPresenter dashboardPresenter;
    private com.reliance.yeticarpet.databinding.ActivityDashboardRetailerBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.reliance.yeticarpet.activity.retailer.dashboard.RetailerDashboardActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public RetailerDashboardActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView getDashboardView() {
        return null;
    }
    
    public final void setDashboardView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardPresenter getDashboardPresenter() {
        return null;
    }
    
    public final void setDashboardPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    @java.lang.Deprecated()
    public void onBackPressed() {
    }
    
    private final void showAlertDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/dashboard/RetailerDashboardActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}