package com.reliance.yeticarpet.activity.retailer.bill_details.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R \u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\"\u0010*\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\"\u0010-\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR \u00100\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0005\"\u0004\b2\u0010\u0007R \u00103\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0005\"\u0004\b5\u0010\u0007\u00a8\u00066"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/District;", "", "()V", "createdAt", "getCreatedAt", "()Ljava/lang/Object;", "setCreatedAt", "(Ljava/lang/Object;)V", "createdBy", "getCreatedBy", "setCreatedBy", "deletedAt", "getDeletedAt", "setDeletedAt", "districtpcode", "", "getDistrictpcode", "()Ljava/lang/String;", "setDistrictpcode", "(Ljava/lang/String;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isDeleted", "", "()Ljava/lang/Boolean;", "setDeleted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "name", "getName", "setName", "province", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Province;", "getProvince", "()Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Province;", "setProvince", "(Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Province;)V", "rank", "getRank", "setRank", "status", "getStatus", "setStatus", "updatedAt", "getUpdatedAt", "setUpdatedAt", "updatedBy", "getUpdatedBy", "setUpdatedBy", "app_debug"})
public final class District {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "province")
    private com.reliance.yeticarpet.activity.retailer.bill_details.dto.Province province;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "is_deleted")
    private java.lang.Boolean isDeleted;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "deleted_at")
    private java.lang.Object deletedAt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private java.lang.Object createdAt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private java.lang.Object updatedAt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "districtpcode")
    private java.lang.String districtpcode;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.Boolean status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "rank")
    private java.lang.Integer rank;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "created_by")
    private java.lang.Object createdBy;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "updated_by")
    private java.lang.Object updatedBy;
    
    public District() {
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
    public final com.reliance.yeticarpet.activity.retailer.bill_details.dto.Province getProvince() {
        return null;
    }
    
    public final void setProvince(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.activity.retailer.bill_details.dto.Province p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isDeleted() {
        return null;
    }
    
    public final void setDeleted(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDeletedAt() {
        return null;
    }
    
    public final void setDeletedAt(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDistrictpcode() {
        return null;
    }
    
    public final void setDistrictpcode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRank() {
        return null;
    }
    
    public final void setRank(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCreatedBy() {
        return null;
    }
    
    public final void setCreatedBy(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUpdatedBy() {
        return null;
    }
    
    public final void setUpdatedBy(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
}