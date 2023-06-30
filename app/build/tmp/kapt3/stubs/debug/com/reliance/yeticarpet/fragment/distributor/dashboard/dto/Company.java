package com.reliance.yeticarpet.fragment.distributor.dashboard.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0016\u0010\u0015\u001a\u00020\r8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0017\u001a\u00020\u00118\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/reliance/yeticarpet/fragment/distributor/dashboard/dto/Company;", "", "()V", "createdAt", "", "getCreatedAt", "()Ljava/lang/String;", "createdBy", "getCreatedBy", "()Ljava/lang/Object;", "deletedAt", "getDeletedAt", "id", "", "getId", "()I", "isDeleted", "", "()Z", "name", "getName", "rank", "getRank", "status", "getStatus", "updatedAt", "getUpdatedAt", "updatedBy", "getUpdatedBy", "app_debug"})
public final class Company {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "is_deleted")
    private final boolean isDeleted = false;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "deleted_at")
    private final java.lang.String deletedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "status")
    private final boolean status = false;
    @com.google.gson.annotations.SerializedName(value = "rank")
    private final int rank = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "created_by")
    private final java.lang.Object createdBy = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_by")
    private final java.lang.Object updatedBy = null;
    
    public Company() {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean isDeleted() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeletedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean getStatus() {
        return false;
    }
    
    public final int getRank() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCreatedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUpdatedBy() {
        return null;
    }
}