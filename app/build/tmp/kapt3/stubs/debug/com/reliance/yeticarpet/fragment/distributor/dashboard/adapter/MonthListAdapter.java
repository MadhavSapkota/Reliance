package com.reliance.yeticarpet.fragment.distributor.dashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u0015H\u0017J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0016J \u0010!\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0015J \u0010\"\u001a\u00020\u00172\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u0010\u001c\u001a\u00020\u0015H\u0007J\u001e\u0010&\u001a\u00020\u00172\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010(\u001a\u00020)J\u001e\u0010*\u001a\u00020\u00172\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00072\u0006\u0010(\u001a\u00020)R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthListHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "category", "Ljava/util/ArrayList;", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/Category;", "clickSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/MonthData;", "kotlin.jvm.PlatformType", "getClickSubject", "()Lio/reactivex/subjects/PublishSubject;", "setClickSubject", "(Lio/reactivex/subjects/PublishSubject;)V", "monthData", "onItemsClickListener", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthListAdapter$OnItemsClickListener;", "selectedItemsPosition", "", "OnItemsClickListener", "", "listener", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setBackground", "setClickedTarget", "targets", "", "Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/MonthCategory;", "showGraphList", "categoryList", "aboolean", "", "showMonthList", "monthList", "app_debug"})
public final class MonthListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListHolder> {
    private final android.content.Context context = null;
    private java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> monthData;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> clickSubject;
    private com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter.OnItemsClickListener onItemsClickListener;
    private java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category> category;
    private int selectedItemsPosition = 0;
    
    public MonthListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> getClickSubject() {
        return null;
    }
    
    public final void setClickSubject(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ResourceAsColor"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListHolder holder, @android.annotation.SuppressLint(value = {"RecyclerView"})
    int position) {
    }
    
    public final void setBackground(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void showMonthList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthData> monthList, boolean aboolean) {
    }
    
    public final void showGraphList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.Category> categoryList, boolean aboolean) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setClickedTarget(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.distributor.dashboard.dto.MonthCategory> targets, int position) {
    }
    
    public final void OnItemsClickListener(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.fragment.distributor.dashboard.adapter.MonthListAdapter.OnItemsClickListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/adapter/MonthListAdapter$OnItemsClickListener;", "", "onItemsClick", "", "position", "", "app_debug"})
    public static abstract interface OnItemsClickListener {
        
        public abstract void onItemsClick(int position);
    }
}