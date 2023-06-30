package com.reliance.yeticarpet.fragment.distributor.dashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\fH\u0017J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J \u0010\u0018\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fJ \u0010\u0019\u001a\u00020\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001b2\u0006\u0010\u0013\u001a\u00020\fH\u0007J*\u0010\u001c\u001a\u00020\u000e2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u001e2\u0006\u0010\u001f\u001a\u00020 R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthlySalesItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthlySalesItemsHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "category", "Ljava/util/ArrayList;", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/Category;", "onItemsClickListener", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthlySalesItemsAdapter$OnItemsClickListener;", "selectedItemsPosition", "", "OnItemsClickListener", "", "listener", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setBackground", "setClickedTarget", "targets", "", "showMonthlySalesItem", "categoryList", "Lkotlin/collections/ArrayList;", "aboolean", "", "app_debug"})
public final class MonthlySalesItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsHolder> {
    private final android.content.Context context = null;
    private java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category> category;
    private com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter.OnItemsClickListener onItemsClickListener;
    private int selectedItemsPosition = 0;
    
    public MonthlySalesItemsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsHolder holder, @android.annotation.SuppressLint(value = {"RecyclerView"})
    int position) {
    }
    
    public final void setBackground(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsHolder holder, int position) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setClickedTarget(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category> targets, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void showMonthlySalesItem(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category> categoryList, boolean aboolean) {
    }
    
    public final void OnItemsClickListener(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthlySalesItemsAdapter.OnItemsClickListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthlySalesItemsAdapter$OnItemsClickListener;", "", "onItemsClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemsClickListener {
        
        public abstract void onItemsClick(int position);
    }
}