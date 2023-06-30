package com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\nH\u0017J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0016J\u001e\u0010\u001e\u001a\u00020\u00172\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\nJ\u001e\u0010 \u001a\u00020\u00172\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\nJ\u001e\u0010!\u001a\u00020\u00172\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010#\u001a\u00020$J\u001e\u0010%\u001a\u00020\u00172\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010\u00072\u0006\u0010#\u001a\u00020$R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/adapter/TrackerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reliance/yeticarpet/activity/retailer/monthly_tracker/adapter/TrackerHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickedTargets", "", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/Targets;", "currentValue", "", "getCurrentValue", "()I", "setCurrentValue", "(I)V", "requiredValue", "getRequiredValue", "setRequiredValue", "schemeList", "Ljava/util/ArrayList;", "selectedPosition", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickedTarget", "targets", "setOutSideClickedTarget", "showBillsItem", "dashboardItem", "clearList", "", "showItem", "dashboardList", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/Offer;", "app_debug"})
public final class TrackerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerHolder> {
    private final android.content.Context context = null;
    private java.util.ArrayList<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets> schemeList;
    private java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets> clickedTargets;
    private int selectedPosition = 0;
    private int currentValue = 0;
    private int requiredValue = 0;
    
    public TrackerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final int getCurrentValue() {
        return 0;
    }
    
    public final void setCurrentValue(int p0) {
    }
    
    public final int getRequiredValue() {
        return 0;
    }
    
    public final void setRequiredValue(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.monthly_tracker.adapter.TrackerHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void showItem(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer> dashboardList, boolean clearList) {
    }
    
    public final void showBillsItem(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets> dashboardItem, boolean clearList) {
    }
    
    public final void setClickedTarget(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets> targets, int position) {
    }
    
    public final void setOutSideClickedTarget(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets> targets, int position) {
    }
}