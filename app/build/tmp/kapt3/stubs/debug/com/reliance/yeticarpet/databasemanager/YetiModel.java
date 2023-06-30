package com.reliance.yeticarpet.databasemanager;

import java.lang.System;

@androidx.room.Entity(tableName = "tbl_yeti")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/reliance/yeticarpet/databasemanager/YetiModel;", "", "tblId", "", "carpetId", "carpetName", "", "carpetInfo", "(IILjava/lang/String;Ljava/lang/String;)V", "getCarpetId", "()I", "setCarpetId", "(I)V", "getCarpetInfo", "()Ljava/lang/String;", "setCarpetInfo", "(Ljava/lang/String;)V", "getCarpetName", "setCarpetName", "getTblId", "setTblId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class YetiModel {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int tblId;
    @androidx.room.ColumnInfo(name = "carpetId")
    private int carpetId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "carpetName")
    private java.lang.String carpetName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "carpetInfo")
    private java.lang.String carpetInfo;
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.databasemanager.YetiModel copy(int tblId, int carpetId, @org.jetbrains.annotations.NotNull()
    java.lang.String carpetName, @org.jetbrains.annotations.NotNull()
    java.lang.String carpetInfo) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public YetiModel(int tblId, int carpetId, @org.jetbrains.annotations.NotNull()
    java.lang.String carpetName, @org.jetbrains.annotations.NotNull()
    java.lang.String carpetInfo) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTblId() {
        return 0;
    }
    
    public final void setTblId(int p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getCarpetId() {
        return 0;
    }
    
    public final void setCarpetId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarpetName() {
        return null;
    }
    
    public final void setCarpetName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarpetInfo() {
        return null;
    }
    
    public final void setCarpetInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}