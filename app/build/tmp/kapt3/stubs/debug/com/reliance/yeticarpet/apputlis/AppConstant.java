package com.reliance.yeticarpet.apputlis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bw\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001a\u0010-\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&R\u001a\u00100\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017R \u00103\u001a\b\u0012\u0004\u0012\u00020\u000404X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u001a\u0010<\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u000404X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00106\"\u0004\bA\u00108R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR \u0010K\u001a\b\u0012\u0004\u0012\u00020\"04X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u00106\"\u0004\bM\u00108R\u001a\u0010N\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0015\"\u0004\bY\u0010\u0017R\u001a\u0010Z\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0015\"\u0004\b\\\u0010\u0017R\u001a\u0010]\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0015\"\u0004\b_\u0010\u0017R\u001a\u0010`\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0015\"\u0004\bb\u0010\u0017R\u001a\u0010c\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010$\"\u0004\be\u0010&R\u001a\u0010f\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010$\"\u0004\bh\u0010&R\u001a\u0010i\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0015\"\u0004\bk\u0010\u0017R\u001a\u0010l\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010$\"\u0004\bn\u0010&R \u0010o\u001a\b\u0012\u0004\u0012\u00020\u000404X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u00106\"\u0004\bq\u00108R\u001a\u0010r\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010$\"\u0004\bt\u0010&R\u001a\u0010u\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0015\"\u0004\bw\u0010\u0017R\u001a\u0010x\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0015\"\u0004\bz\u0010\u0017R\u001a\u0010{\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010$\"\u0004\b}\u0010&R\u001b\u0010~\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR\u001d\u0010\u0081\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR\u001d\u0010\u0084\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\bR\u001d\u0010\u0087\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR\u001d\u0010\u008a\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0006\"\u0005\b\u008c\u0001\u0010\bR\u001d\u0010\u008d\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0006\"\u0005\b\u008f\u0001\u0010\bR\u001d\u0010\u0090\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0006\"\u0005\b\u0092\u0001\u0010\bR\u001d\u0010\u0093\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u0006\"\u0005\b\u0095\u0001\u0010\bR\u001d\u0010\u0096\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u0015\"\u0005\b\u0098\u0001\u0010\u0017R\u001d\u0010\u0099\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0015\"\u0005\b\u009b\u0001\u0010\u0017R\u001d\u0010\u009c\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0006\"\u0005\b\u009e\u0001\u0010\bR\u001d\u0010\u009f\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010\u0015\"\u0005\b\u00a1\u0001\u0010\u0017R\u001d\u0010\u00a2\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0001\u0010\u0015\"\u0005\b\u00a4\u0001\u0010\u0017R\u001d\u0010\u00a5\u0001\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0001\u0010$\"\u0005\b\u00a7\u0001\u0010&R\u001d\u0010\u00a8\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0001\u0010\u0015\"\u0005\b\u00aa\u0001\u0010\u0017R\u001d\u0010\u00ab\u0001\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ac\u0001\u0010\u0015\"\u0005\b\u00ad\u0001\u0010\u0017R#\u0010\u00ae\u0001\u001a\b\u0012\u0004\u0012\u00020\u000404X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00af\u0001\u00106\"\u0005\b\u00b0\u0001\u00108R\u001d\u0010\u00b1\u0001\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b2\u0001\u0010$\"\u0005\b\u00b3\u0001\u0010&R#\u0010\u00b4\u0001\u001a\b\u0012\u0004\u0012\u00020\u000404X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u00106\"\u0005\b\u00b6\u0001\u00108R\u001d\u0010\u00b7\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b8\u0001\u0010\u0006\"\u0005\b\u00b9\u0001\u0010\b\u00a8\u0006\u00ba\u0001"}, d2 = {"Lcom/reliance/yeticarpet/apputlis/AppConstant;", "", "()V", "CoilMat", "", "getCoilMat", "()Ljava/lang/String;", "setCoilMat", "(Ljava/lang/String;)V", "NonWovenCarpet", "getNonWovenCarpet", "setNonWovenCarpet", "PVCFlooring", "getPVCFlooring", "setPVCFlooring", "TuftedCarpet", "getTuftedCarpet", "setTuftedCarpet", "billListChecked", "", "getBillListChecked", "()Z", "setBillListChecked", "(Z)V", "chartClickedStatus", "getChartClickedStatus", "setChartClickedStatus", "checkedDeviceUserStatus", "getCheckedDeviceUserStatus", "setCheckedDeviceUserStatus", "checkedFilterDialog", "getCheckedFilterDialog", "setCheckedFilterDialog", "clickedTPosition", "", "getClickedTPosition", "()I", "setClickedTPosition", "(I)V", "countSearchListCount", "getCountSearchListCount", "setCountSearchListCount", "dashboardChecked", "getDashboardChecked", "setDashboardChecked", "distributorCompleteCount", "getDistributorCompleteCount", "setDistributorCompleteCount", "distributorDashboardChecked", "getDistributorDashboardChecked", "setDistributorDashboardChecked", "distributorNames", "Ljava/util/ArrayList;", "getDistributorNames", "()Ljava/util/ArrayList;", "setDistributorNames", "(Ljava/util/ArrayList;)V", "distributorPendingCount", "getDistributorPendingCount", "setDistributorPendingCount", "filterChecked", "getFilterChecked", "setFilterChecked", "fiscalFinancialYear", "getFiscalFinancialYear", "setFiscalFinancialYear", "hashMap", "Ljava/util/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "setHashMap", "(Ljava/util/HashMap;)V", "hashMapFiscalYear", "getHashMapFiscalYear", "setHashMapFiscalYear", "minAmountArray", "getMinAmountArray", "setMinAmountArray", "monthId", "getMonthId", "setMonthId", "monthNumberClicked", "getMonthNumberClicked", "setMonthNumberClicked", "monthlyItemClicked", "getMonthlyItemClicked", "setMonthlyItemClicked", "monthlyItemsClickStatus", "getMonthlyItemsClickStatus", "setMonthlyItemsClickStatus", "nestedScrollChecked", "getNestedScrollChecked", "setNestedScrollChecked", "normalChecked", "getNormalChecked", "setNormalChecked", "normalCount", "getNormalCount", "setNormalCount", "pageCount", "getPageCount", "setPageCount", "retailerCompleteCount", "getRetailerCompleteCount", "setRetailerCompleteCount", "retailerDashboardChecked", "getRetailerDashboardChecked", "setRetailerDashboardChecked", "retailerListSize", "getRetailerListSize", "setRetailerListSize", "retailerNames", "getRetailerNames", "setRetailerNames", "retailerPendingCount", "getRetailerPendingCount", "setRetailerPendingCount", "searchChecked", "getSearchChecked", "setSearchChecked", "searchCount", "getSearchCount", "setSearchCount", "searchListCount", "getSearchListCount", "setSearchListCount", "selectedBillNo", "getSelectedBillNo", "setSelectedBillNo", "selectedDistributorName", "getSelectedDistributorName", "setSelectedDistributorName", "selectedEndDate", "getSelectedEndDate", "setSelectedEndDate", "selectedFiscalYear", "getSelectedFiscalYear", "setSelectedFiscalYear", "selectedFromDate", "getSelectedFromDate", "setSelectedFromDate", "selectedRetailerName", "getSelectedRetailerName", "setSelectedRetailerName", "selectedStartDate", "getSelectedStartDate", "setSelectedStartDate", "selectedToDate", "getSelectedToDate", "setSelectedToDate", "statusAllDistributorClicked", "getStatusAllDistributorClicked", "setStatusAllDistributorClicked", "statusAllRetailerClicked", "getStatusAllRetailerClicked", "setStatusAllRetailerClicked", "statusClicked", "getStatusClicked", "setStatusClicked", "statusCompletedDistributorClicked", "getStatusCompletedDistributorClicked", "setStatusCompletedDistributorClicked", "statusCompletedRetailerClicked", "getStatusCompletedRetailerClicked", "setStatusCompletedRetailerClicked", "statusId", "getStatusId", "setStatusId", "statusPendingDistributorClicked", "getStatusPendingDistributorClicked", "setStatusPendingDistributorClicked", "statusPendingRetailerClicked", "getStatusPendingRetailerClicked", "setStatusPendingRetailerClicked", "target", "getTarget", "setTarget", "totalBillAmount", "getTotalBillAmount", "setTotalBillAmount", "totalBillAmounts", "getTotalBillAmounts", "setTotalBillAmounts", "totalPurchase", "getTotalPurchase", "setTotalPurchase", "app_debug"})
public final class AppConstant {
    @org.jetbrains.annotations.NotNull()
    public static final com.reliance.yeticarpet.apputlis.AppConstant INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.lang.String> distributorNames;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.lang.String> retailerNames;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.lang.String> fiscalFinancialYear;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String selectedFiscalYear = "";
    private static boolean checkedDeviceUserStatus = false;
    private static boolean checkedFilterDialog = false;
    private static int pageCount = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String selectedDistributorName = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String selectedRetailerName = "";
    private static boolean normalChecked = false;
    private static boolean filterChecked = false;
    private static boolean searchChecked = false;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String monthlyItemClicked = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String monthNumberClicked = "";
    private static int monthId = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String statusClicked = "";
    private static int statusId = 0;
    private static boolean statusAllRetailerClicked = false;
    private static boolean statusPendingRetailerClicked = false;
    private static boolean statusCompletedRetailerClicked = false;
    private static boolean statusAllDistributorClicked = false;
    private static boolean statusPendingDistributorClicked = false;
    private static boolean statusCompletedDistributorClicked = false;
    private static boolean nestedScrollChecked = false;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String selectedBillNo = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String selectedStartDate = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String selectedEndDate = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String totalPurchase = "";
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.lang.String> target;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String selectedFromDate = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String selectedToDate = "";
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.lang.String> totalBillAmounts;
    private static int totalBillAmount = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.lang.Integer> minAmountArray;
    private static int retailerListSize = 0;
    private static int retailerCompleteCount = 0;
    private static int retailerPendingCount = 0;
    private static int distributorCompleteCount = 0;
    private static int distributorPendingCount = 0;
    private static boolean normalCount = false;
    private static boolean searchCount = false;
    private static int searchListCount = 0;
    private static int countSearchListCount = 0;
    private static int clickedTPosition = 0;
    private static boolean chartClickedStatus = false;
    private static boolean monthlyItemsClickStatus = false;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, java.lang.String> hashMap;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, java.lang.String> hashMapFiscalYear;
    private static boolean dashboardChecked = false;
    private static boolean distributorDashboardChecked = false;
    private static boolean retailerDashboardChecked = false;
    private static boolean billListChecked = false;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String PVCFlooring = "PVC FLOORING";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String TuftedCarpet = "TUFTED CARPET";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CoilMat = "COIL MAT";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String NonWovenCarpet = "NON-WOVEN CARPET";
    
    private AppConstant() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getDistributorNames() {
        return null;
    }
    
    public final void setDistributorNames(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getRetailerNames() {
        return null;
    }
    
    public final void setRetailerNames(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getFiscalFinancialYear() {
        return null;
    }
    
    public final void setFiscalFinancialYear(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedFiscalYear() {
        return null;
    }
    
    public final void setSelectedFiscalYear(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getCheckedDeviceUserStatus() {
        return false;
    }
    
    public final void setCheckedDeviceUserStatus(boolean p0) {
    }
    
    public final boolean getCheckedFilterDialog() {
        return false;
    }
    
    public final void setCheckedFilterDialog(boolean p0) {
    }
    
    public final int getPageCount() {
        return 0;
    }
    
    public final void setPageCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedDistributorName() {
        return null;
    }
    
    public final void setSelectedDistributorName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedRetailerName() {
        return null;
    }
    
    public final void setSelectedRetailerName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getNormalChecked() {
        return false;
    }
    
    public final void setNormalChecked(boolean p0) {
    }
    
    public final boolean getFilterChecked() {
        return false;
    }
    
    public final void setFilterChecked(boolean p0) {
    }
    
    public final boolean getSearchChecked() {
        return false;
    }
    
    public final void setSearchChecked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonthlyItemClicked() {
        return null;
    }
    
    public final void setMonthlyItemClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonthNumberClicked() {
        return null;
    }
    
    public final void setMonthNumberClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getMonthId() {
        return 0;
    }
    
    public final void setMonthId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusClicked() {
        return null;
    }
    
    public final void setStatusClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getStatusId() {
        return 0;
    }
    
    public final void setStatusId(int p0) {
    }
    
    public final boolean getStatusAllRetailerClicked() {
        return false;
    }
    
    public final void setStatusAllRetailerClicked(boolean p0) {
    }
    
    public final boolean getStatusPendingRetailerClicked() {
        return false;
    }
    
    public final void setStatusPendingRetailerClicked(boolean p0) {
    }
    
    public final boolean getStatusCompletedRetailerClicked() {
        return false;
    }
    
    public final void setStatusCompletedRetailerClicked(boolean p0) {
    }
    
    public final boolean getStatusAllDistributorClicked() {
        return false;
    }
    
    public final void setStatusAllDistributorClicked(boolean p0) {
    }
    
    public final boolean getStatusPendingDistributorClicked() {
        return false;
    }
    
    public final void setStatusPendingDistributorClicked(boolean p0) {
    }
    
    public final boolean getStatusCompletedDistributorClicked() {
        return false;
    }
    
    public final void setStatusCompletedDistributorClicked(boolean p0) {
    }
    
    public final boolean getNestedScrollChecked() {
        return false;
    }
    
    public final void setNestedScrollChecked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedBillNo() {
        return null;
    }
    
    public final void setSelectedBillNo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedStartDate() {
        return null;
    }
    
    public final void setSelectedStartDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedEndDate() {
        return null;
    }
    
    public final void setSelectedEndDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotalPurchase() {
        return null;
    }
    
    public final void setTotalPurchase(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getTarget() {
        return null;
    }
    
    public final void setTarget(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedFromDate() {
        return null;
    }
    
    public final void setSelectedFromDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedToDate() {
        return null;
    }
    
    public final void setSelectedToDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getTotalBillAmounts() {
        return null;
    }
    
    public final void setTotalBillAmounts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final int getTotalBillAmount() {
        return 0;
    }
    
    public final void setTotalBillAmount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getMinAmountArray() {
        return null;
    }
    
    public final void setMinAmountArray(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    public final int getRetailerListSize() {
        return 0;
    }
    
    public final void setRetailerListSize(int p0) {
    }
    
    public final int getRetailerCompleteCount() {
        return 0;
    }
    
    public final void setRetailerCompleteCount(int p0) {
    }
    
    public final int getRetailerPendingCount() {
        return 0;
    }
    
    public final void setRetailerPendingCount(int p0) {
    }
    
    public final int getDistributorCompleteCount() {
        return 0;
    }
    
    public final void setDistributorCompleteCount(int p0) {
    }
    
    public final int getDistributorPendingCount() {
        return 0;
    }
    
    public final void setDistributorPendingCount(int p0) {
    }
    
    public final boolean getNormalCount() {
        return false;
    }
    
    public final void setNormalCount(boolean p0) {
    }
    
    public final boolean getSearchCount() {
        return false;
    }
    
    public final void setSearchCount(boolean p0) {
    }
    
    public final int getSearchListCount() {
        return 0;
    }
    
    public final void setSearchListCount(int p0) {
    }
    
    public final int getCountSearchListCount() {
        return 0;
    }
    
    public final void setCountSearchListCount(int p0) {
    }
    
    public final int getClickedTPosition() {
        return 0;
    }
    
    public final void setClickedTPosition(int p0) {
    }
    
    public final boolean getChartClickedStatus() {
        return false;
    }
    
    public final void setChartClickedStatus(boolean p0) {
    }
    
    public final boolean getMonthlyItemsClickStatus() {
        return false;
    }
    
    public final void setMonthlyItemsClickStatus(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> getHashMap() {
        return null;
    }
    
    public final void setHashMap(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> getHashMapFiscalYear() {
        return null;
    }
    
    public final void setHashMapFiscalYear(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> p0) {
    }
    
    public final boolean getDashboardChecked() {
        return false;
    }
    
    public final void setDashboardChecked(boolean p0) {
    }
    
    public final boolean getDistributorDashboardChecked() {
        return false;
    }
    
    public final void setDistributorDashboardChecked(boolean p0) {
    }
    
    public final boolean getRetailerDashboardChecked() {
        return false;
    }
    
    public final void setRetailerDashboardChecked(boolean p0) {
    }
    
    public final boolean getBillListChecked() {
        return false;
    }
    
    public final void setBillListChecked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPVCFlooring() {
        return null;
    }
    
    public final void setPVCFlooring(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTuftedCarpet() {
        return null;
    }
    
    public final void setTuftedCarpet(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoilMat() {
        return null;
    }
    
    public final void setCoilMat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNonWovenCarpet() {
        return null;
    }
    
    public final void setNonWovenCarpet(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}