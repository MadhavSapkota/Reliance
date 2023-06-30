package com.reliance.yeticarpet.activity.distributor.retailerlist.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J$\u0010 \u001a\u00020\u00132\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t\u0018\u00010\"2\u0006\u0010$\u001a\u00020%R(\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerlist/adapter/PartyListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/adapter/PartyListHolder;", "Landroid/widget/Filterable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/reliance/yeticarpet/activity/distributor/retailerlist/dto/RetailerData;", "kotlin.jvm.PlatformType", "getClickSubject", "()Lio/reactivex/subjects/PublishSubject;", "setClickSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "filteredList", "Ljava/util/ArrayList;", "retailerPurchase", "CardViewListner", "", "viewHolder", "parent", "Landroid/view/ViewGroup;", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "viewType", "showRetailerListItem", "dashboardMap", "", "", "aboolean", "", "app_debug"})
public final class PartyListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListHolder> implements android.widget.Filterable {
    private final android.content.Context context = null;
    private java.util.ArrayList<com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> retailerPurchase;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> clickSubject;
    private java.util.ArrayList<com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> filteredList;
    
    public PartyListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> getClickSubject() {
        return null;
    }
    
    public final void setClickSubject(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final void CardViewListner(com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListHolder viewHolder, android.view.ViewGroup parent) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void showRetailerListItem(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, com.reliance.yeticarpet.activity.distributor.retailerlist.dto.RetailerData> dashboardMap, boolean aboolean) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
}