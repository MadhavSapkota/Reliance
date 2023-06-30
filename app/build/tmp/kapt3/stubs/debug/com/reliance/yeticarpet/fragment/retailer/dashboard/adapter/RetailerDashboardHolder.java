package com.reliance.yeticarpet.fragment.retailer.dashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010%\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001a\u0010(\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u00061"}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/adapter/RetailerDashboardHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/reliance/yeticarpet/databinding/RetailerDashboardDataBinding;", "(Lcom/reliance/yeticarpet/databinding/RetailerDashboardDataBinding;)V", "getBinding", "()Lcom/reliance/yeticarpet/databinding/RetailerDashboardDataBinding;", "clickDown", "Landroid/widget/CheckBox;", "getClickDown", "()Landroid/widget/CheckBox;", "setClickDown", "(Landroid/widget/CheckBox;)V", "monthlyTargetTracker", "Landroid/widget/RelativeLayout;", "getMonthlyTargetTracker", "()Landroid/widget/RelativeLayout;", "setMonthlyTargetTracker", "(Landroid/widget/RelativeLayout;)V", "rlPurchase", "getRlPurchase", "setRlPurchase", "rvGraphs", "Landroidx/recyclerview/widget/RecyclerView;", "getRvGraphs", "()Landroidx/recyclerview/widget/RecyclerView;", "setRvGraphs", "(Landroidx/recyclerview/widget/RecyclerView;)V", "tvAnnualScheme", "Landroid/widget/TextView;", "getTvAnnualScheme", "()Landroid/widget/TextView;", "setTvAnnualScheme", "(Landroid/widget/TextView;)V", "tvPercentage", "getTvPercentage", "setTvPercentage", "tvSchemeAmount", "getTvSchemeAmount", "setTvSchemeAmount", "tvTotalPurchasePrice", "getTvTotalPurchasePrice", "setTvTotalPurchasePrice", "viewLine", "Landroid/view/View;", "getViewLine", "()Landroid/view/View;", "setViewLine", "(Landroid/view/View;)V", "app_debug"})
public final class RetailerDashboardHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final com.reliance.yeticarpet.databinding.RetailerDashboardDataBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView tvAnnualScheme;
    @org.jetbrains.annotations.NotNull()
    private android.widget.RelativeLayout rlPurchase;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView tvPercentage;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView tvSchemeAmount;
    @org.jetbrains.annotations.NotNull()
    private android.widget.TextView tvTotalPurchasePrice;
    @org.jetbrains.annotations.NotNull()
    private android.widget.CheckBox clickDown;
    @org.jetbrains.annotations.NotNull()
    private android.widget.RelativeLayout monthlyTargetTracker;
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.RecyclerView rvGraphs;
    @org.jetbrains.annotations.NotNull()
    private android.view.View viewLine;
    
    public RetailerDashboardHolder(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.databinding.RetailerDashboardDataBinding binding) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.databinding.RetailerDashboardDataBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvAnnualScheme() {
        return null;
    }
    
    public final void setTvAnnualScheme(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getRlPurchase() {
        return null;
    }
    
    public final void setRlPurchase(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvPercentage() {
        return null;
    }
    
    public final void setTvPercentage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvSchemeAmount() {
        return null;
    }
    
    public final void setTvSchemeAmount(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTvTotalPurchasePrice() {
        return null;
    }
    
    public final void setTvTotalPurchasePrice(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.CheckBox getClickDown() {
        return null;
    }
    
    public final void setClickDown(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.RelativeLayout getMonthlyTargetTracker() {
        return null;
    }
    
    public final void setMonthlyTargetTracker(@org.jetbrains.annotations.NotNull()
    android.widget.RelativeLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRvGraphs() {
        return null;
    }
    
    public final void setRvGraphs(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getViewLine() {
        return null;
    }
    
    public final void setViewLine(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
}