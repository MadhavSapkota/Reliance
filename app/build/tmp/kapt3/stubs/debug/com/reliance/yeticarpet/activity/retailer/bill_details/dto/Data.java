package com.reliance.yeticarpet.activity.retailer.bill_details.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR \u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR \u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR \u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\'\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010*\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R \u0010-\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00109\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR \u0010=\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR \u0010@\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR \u0010C\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u000e\"\u0004\bE\u0010\u0010R \u0010F\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\b\u00a8\u0006I"}, d2 = {"Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Data;", "", "()V", "billNo", "", "getBillNo", "()Ljava/lang/String;", "setBillNo", "(Ljava/lang/String;)V", "createdAt", "getCreatedAt", "setCreatedAt", "createdBy", "getCreatedBy", "()Ljava/lang/Object;", "setCreatedBy", "(Ljava/lang/Object;)V", "dateEn", "getDateEn", "setDateEn", "dateNp", "getDateNp", "setDateNp", "discountedTotal", "getDiscountedTotal", "setDiscountedTotal", "distributor", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Distributor;", "getDistributor", "()Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Distributor;", "setDistributor", "(Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Distributor;)V", "fiscalYear", "", "getFiscalYear", "()Ljava/lang/Integer;", "setFiscalYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "id", "getId", "setId", "month", "getMonth", "setMonth", "retailer", "Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Retailer;", "getRetailer", "()Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Retailer;", "setRetailer", "(Lcom/reliance/yeticarpet/activity/retailer/bill_details/dto/Retailer;)V", "status", "", "getStatus", "()Ljava/lang/Boolean;", "setStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "total", "getTotal", "setTotal", "totalDiscount", "getTotalDiscount", "setTotalDiscount", "updatedAt", "getUpdatedAt", "setUpdatedAt", "updatedBy", "getUpdatedBy", "setUpdatedBy", "vatTotal", "getVatTotal", "setVatTotal", "app_debug"})
public final class Data {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "distributor")
    private com.reliance.yeticarpet.activity.retailer.bill_details.dto.Distributor distributor;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "retailer")
    private com.reliance.yeticarpet.activity.retailer.bill_details.dto.Retailer retailer;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private java.lang.String createdAt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private java.lang.String updatedAt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "bill_no")
    private java.lang.String billNo;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "date_en")
    private java.lang.String dateEn;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "date_np")
    private java.lang.String dateNp;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total")
    private java.lang.String total;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_discount")
    private java.lang.String totalDiscount;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "discounted_total")
    private java.lang.String discountedTotal;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "vat_total")
    private java.lang.String vatTotal;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.Boolean status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "created_by")
    private java.lang.Object createdBy;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "updated_by")
    private java.lang.Object updatedBy;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "fiscal_year")
    private java.lang.Integer fiscalYear;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "month")
    private java.lang.Integer month;
    
    public Data() {
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
    public final com.reliance.yeticarpet.activity.retailer.bill_details.dto.Distributor getDistributor() {
        return null;
    }
    
    public final void setDistributor(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.activity.retailer.bill_details.dto.Distributor p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.reliance.yeticarpet.activity.retailer.bill_details.dto.Retailer getRetailer() {
        return null;
    }
    
    public final void setRetailer(@org.jetbrains.annotations.Nullable()
    com.reliance.yeticarpet.activity.retailer.bill_details.dto.Retailer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    public final void setUpdatedAt(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBillNo() {
        return null;
    }
    
    public final void setBillNo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateEn() {
        return null;
    }
    
    public final void setDateEn(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateNp() {
        return null;
    }
    
    public final void setDateNp(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalDiscount() {
        return null;
    }
    
    public final void setTotalDiscount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscountedTotal() {
        return null;
    }
    
    public final void setDiscountedTotal(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVatTotal() {
        return null;
    }
    
    public final void setVatTotal(@org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFiscalYear() {
        return null;
    }
    
    public final void setFiscalYear(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMonth() {
        return null;
    }
    
    public final void setMonth(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}