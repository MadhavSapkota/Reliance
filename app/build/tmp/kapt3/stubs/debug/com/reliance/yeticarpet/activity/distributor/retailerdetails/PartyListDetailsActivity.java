package com.reliance.yeticarpet.activity.distributor.retailerdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/PartyListDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/reliance/yeticarpet/databinding/PartyListDetailsLayoutBinding;", "partyListDetailsPresenter", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsPresenter;", "getPartyListDetailsPresenter", "()Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsPresenter;", "setPartyListDetailsPresenter", "(Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsPresenter;)V", "partyListDetailsView", "Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsView;", "getPartyListDetailsView", "()Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsView;", "setPartyListDetailsView", "(Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/mvp/PartyListDetailsView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "info", "app_debug"})
public final class PartyListDetailsActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView partyListDetailsView;
    @javax.inject.Inject()
    public com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsPresenter partyListDetailsPresenter;
    private com.reliance.yeticarpet.databinding.PartyListDetailsLayoutBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final com.reliance.yeticarpet.activity.distributor.retailerdetails.PartyListDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public PartyListDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView getPartyListDetailsView() {
        return null;
    }
    
    public final void setPartyListDetailsView(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsPresenter getPartyListDetailsPresenter() {
        return null;
    }
    
    public final void setPartyListDetailsPresenter(@org.jetbrains.annotations.NotNull()
    com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/PartyListDetailsActivity$info;", "", "()V", "partyListId", "", "getPartyListId", "()Ljava/lang/Integer;", "setPartyListId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_debug"})
    public static final class info {
        @org.jetbrains.annotations.NotNull()
        public static final com.reliance.yeticarpet.activity.distributor.retailerdetails.PartyListDetailsActivity.info INSTANCE = null;
        @org.jetbrains.annotations.Nullable()
        private static java.lang.Integer partyListId;
        
        private info() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPartyListId() {
            return null;
        }
        
        public final void setPartyListId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/reliance/yeticarpet/activity/distributor/retailerdetails/PartyListDetailsActivity$Companion;", "", "()V", "start", "", "context", "Landroid/content/Context;", "id", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int id) {
        }
    }
}