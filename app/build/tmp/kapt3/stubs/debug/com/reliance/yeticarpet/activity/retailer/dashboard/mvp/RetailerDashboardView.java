package com.reliance.yeticarpet.activity.retailer.dashboard.mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006#"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardView;", "", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "fiscalYearDialog", "Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;)V", "binding", "Lcom/reliance/yeticarpet/databinding/ActivityDashboardRetailerBinding;", "getBinding", "()Lcom/reliance/yeticarpet/databinding/ActivityDashboardRetailerBinding;", "setBinding", "(Lcom/reliance/yeticarpet/databinding/ActivityDashboardRetailerBinding;)V", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getFiscalYearDialog", "()Lcom/reliance/yeticarpet/dialog/FiscalYearDialog;", "actionListenerFloatingButton", "Lio/reactivex/Observable;", "getNavigationListner", "", "getStringWithId", "userInfo", "Lcom/reliance/yeticarpet/apputlis/UserInfo;", "getTabPosition", "", "gotoHome", "loadFragment", "fragment", "Landroidx/fragment/app/Fragment;", "start", "binding_dashboard", "Companion", "getTab", "app_debug"})
public final class RetailerDashboardView {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog = null;
    @org.jetbrains.annotations.Nullable()
    private com.reliance.yeticarpet.databinding.ActivityDashboardRetailerBinding binding;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<androidx.constraintlayout.widget.ConstraintLayout> bottomSheetBehavior;
    @org.jetbrains.annotations.NotNull()
    public static final com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView.Companion Companion = null;
    
    public RetailerDashboardView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.dialog.FiscalYearDialog fiscalYearDialog) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.dialog.FiscalYearDialog getFiscalYearDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.databinding.ActivityDashboardRetailerBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.databinding.ActivityDashboardRetailerBinding p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.ActivityDashboardRetailerBinding binding_dashboard) {
    }
    
    public final void getNavigationListner() {
    }
    
    public final void getStringWithId(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.apputlis.UserInfo userInfo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.Object> actionListenerFloatingButton() {
        return null;
    }
    
    public final boolean getTabPosition() {
        return false;
    }
    
    public final void gotoHome() {
    }
    
    public final void loadFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardView$getTab;", "", "()V", "tab", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "getTab", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "setTab", "(Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V", "app_debug"})
    public static final class getTab {
        @org.jetbrains.annotations.NotNull()
        public static final com.reliance.yeticarpet.activity.retailer.dashboard.mvp.RetailerDashboardView.getTab INSTANCE = null;
        @org.jetbrains.annotations.Nullable()
        private static com.google.android.material.bottomnavigation.BottomNavigationView tab;
        
        private getTab() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.google.android.material.bottomnavigation.BottomNavigationView getTab() {
            return null;
        }
        
        public final void setTab(@org.jetbrains.annotations.Nullable()
        com.google.android.material.bottomnavigation.BottomNavigationView p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/dashboard/mvp/RetailerDashboardView$Companion;", "", "()V", "start", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start() {
        }
    }
}