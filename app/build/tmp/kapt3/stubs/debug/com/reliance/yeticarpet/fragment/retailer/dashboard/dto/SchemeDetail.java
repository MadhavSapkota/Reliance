package com.reliance.yeticarpet.fragment.retailer.dashboard.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/SchemeDetail;", "", "()V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "offers", "", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/Offer;", "getOffers", "()Ljava/util/List;", "setOffers", "(Ljava/util/List;)V", "retailerScheme", "Lcom/reliance/yeticarpet/fragment/retailer/dashboard/dto/RetailerScheme;", "getRetailerScheme", "setRetailerScheme", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_debug"})
public final class SchemeDetail {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "retailer_scheme")
    private java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerScheme> retailerScheme;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "offers")
    private java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer> offers;
    
    public SchemeDetail() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerScheme> getRetailerScheme() {
        return null;
    }
    
    public final void setRetailerScheme(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.RetailerScheme> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer> getOffers() {
        return null;
    }
    
    public final void setOffers(@org.jetbrains.annotations.Nullable()
    java.util.List<com.reliance.yeticarpet.fragment.retailer.dashboard.dto.Offer> p0) {
    }
}