package com.reliance.yeticarpet.fragment.bills;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/RetailerBillFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dashboardPresenter", "Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillPresenter;", "getDashboardPresenter", "()Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillPresenter;", "setDashboardPresenter", "(Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillPresenter;)V", "dashboardView", "Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView;", "getDashboardView", "()Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView;", "setDashboardView", "(Lcom/reliance/yeticarpet/fragment/bills/mvp/RetailerBillView;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "Companion", "MyGestureListener", "app_debug"})
public final class RetailerBillFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView dashboardView;
    @javax.inject.Inject()
    public com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillPresenter dashboardPresenter;
    @org.jetbrains.annotations.NotNull()
    public static final com.reliance.yeticarpet.fragment.bills.RetailerBillFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public RetailerBillFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView getDashboardView() {
        return null;
    }
    
    public final void setDashboardView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillPresenter getDashboardPresenter() {
        return null;
    }
    
    public final void setDashboardPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillPresenter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/RetailerBillFragment$MyGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/reliance/yeticarpet/fragment/bills/RetailerBillFragment;)V", "MIN_DISTANCE", "", "onFling", "", "e1", "Landroid/view/MotionEvent;", "e2", "velocityX", "", "velocityY", "app_debug"})
    public final class MyGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        private final int MIN_DISTANCE = 50;
        
        public MyGestureListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onFling(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e1, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/reliance/yeticarpet/fragment/bills/RetailerBillFragment$Companion;", "", "()V", "start", "Lcom/reliance/yeticarpet/fragment/bills/RetailerBillFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.reliance.yeticarpet.fragment.bills.RetailerBillFragment start() {
            return null;
        }
    }
}