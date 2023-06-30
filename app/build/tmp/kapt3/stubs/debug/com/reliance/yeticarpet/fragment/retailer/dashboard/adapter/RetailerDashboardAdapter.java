package com.reliance.yeticarpet.fragment.retailer.dashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0010H\u0017J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0010H\u0016J\u001e\u0010$\u001a\u00020\u001a2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\u0006\u0010&\u001a\u00020\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/adapter/RetailerDashboardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/adapter/RetailerDashboardHolder;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "(Landroidx/appcompat/app/AppCompatActivity;)V", "clickSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/SchemeDetail;", "kotlin.jvm.PlatformType", "getClickSubject", "()Lio/reactivex/subjects/PublishSubject;", "setClickSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "pointList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getPointList", "()Ljava/util/ArrayList;", "setPointList", "(Ljava/util/ArrayList;)V", "schemeList", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "CardViewListner", "", "viewHolder", "parent", "Landroid/view/ViewGroup;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "viewType", "showBillsItem", "dashboardlist", "aboolean", "", "app_debug"})
public final class RetailerDashboardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardHolder> {
    private final androidx.appcompat.app.AppCompatActivity appCompatActivity = null;
    private java.util.ArrayList<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> schemeList;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> clickSubject;
    private androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool;
    public java.util.ArrayList<java.lang.Integer> pointList;
    
    public RetailerDashboardAdapter(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> getClickSubject() {
        return null;
    }
    
    public final void setClickSubject(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getPointList() {
        return null;
    }
    
    public final void setPointList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final void CardViewListner(com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardHolder viewHolder, android.view.ViewGroup parent) {
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor", "SetTextI18n", "SuspiciousIndentation"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.retailer.dashboard.adapter.RetailerDashboardHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void showBillsItem(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.SchemeDetail> dashboardlist, boolean aboolean) {
    }
}