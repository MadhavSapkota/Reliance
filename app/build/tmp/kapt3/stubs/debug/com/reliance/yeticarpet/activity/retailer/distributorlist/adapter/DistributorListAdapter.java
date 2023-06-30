package com.reliance.yeticarpet.activity.retailer.distributorlist.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0017J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u001e\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/distributorlist/adapter/DistributorListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reliance/yeticarpet/activity/retailer/distributorlist/adapter/DistributorListHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "resultList", "Ljava/util/ArrayList;", "Lcom/reliance/yeticarpet/activity/retailer/bill/dto/Result;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showBillsItem", "dashboardItem", "", "clearList", "", "app_debug"})
public final class DistributorListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.reliance.yeticarpet.activity.retailer.distributorlist.adapter.DistributorListHolder> {
    private final android.content.Context context = null;
    private java.util.ArrayList<com.reliance.yeticarpet.activity.retailer.bill.dto.Result> resultList;
    
    public DistributorListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.reliance.yeticarpet.activity.retailer.distributorlist.adapter.DistributorListHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.retailer.distributorlist.adapter.DistributorListHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void showBillsItem(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.activity.retailer.bill.dto.Result> dashboardItem, boolean clearList) {
    }
}