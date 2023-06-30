package com.reliance.yeticarpet.fragment.retailer.dashboard.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/Offer;", "", "()V", "minAmount", "", "getMinAmount", "()Ljava/lang/String;", "setMinAmount", "(Ljava/lang/String;)V", "percentage", "getPercentage", "setPercentage", "target", "", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/Targets;", "getTarget", "()Ljava/util/List;", "setTarget", "(Ljava/util/List;)V", "app_debug"})
public final class Offer {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "percentage")
    private java.lang.String percentage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "min_amount")
    private java.lang.String minAmount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "target")
    private java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets> target;
    
    public Offer() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPercentage() {
        return null;
    }
    
    public final void setPercentage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMinAmount() {
        return null;
    }
    
    public final void setMinAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets> getTarget() {
        return null;
    }
    
    public final void setTarget(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Targets> p0) {
    }
}