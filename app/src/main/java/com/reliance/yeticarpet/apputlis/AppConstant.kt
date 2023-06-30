package com.reliance.yeticarpet.apputlis

object AppConstant {
    var distributorNames = ArrayList<String>()
    var retailerNames = ArrayList<String>()
    var fiscalFinancialYear = ArrayList<String>()
    var selectedFiscalYear = ""
    var checkedDeviceUserStatus:Boolean = false
    var checkedFilterDialog:Boolean = false

    var pageCount:Int = 0

    var selectedDistributorName = ""
    var selectedRetailerName = ""

    var normalChecked: Boolean = false
    var filterChecked: Boolean = false
    var searchChecked: Boolean = false

    var monthlyItemClicked:String = ""
    var monthNumberClicked:String = ""
    var monthId:Int = 0

    var statusClicked:String = ""
    var statusId:Int = 0

    var statusAllRetailerClicked:Boolean = false
    var statusPendingRetailerClicked:Boolean = false
    var statusCompletedRetailerClicked:Boolean = false

    var statusAllDistributorClicked:Boolean = false
    var statusPendingDistributorClicked:Boolean = false
    var statusCompletedDistributorClicked:Boolean = false
    var nestedScrollChecked:Boolean = false



    var selectedBillNo = ""
    var selectedStartDate = ""
    var selectedEndDate = ""
    var totalPurchase = ""
    var target = ArrayList<String>()
    var selectedFromDate = ""
    var selectedToDate = ""
    var totalBillAmounts = ArrayList<String>()
    var totalBillAmount =0
    var minAmountArray = java.util.ArrayList<Int>()
    var retailerListSize =0
    var retailerCompleteCount =0
    var retailerPendingCount =0

    var distributorCompleteCount =0
    var distributorPendingCount =0

    var normalCount:Boolean = false
    var searchCount:Boolean = false
    var searchListCount = 0
    var countSearchListCount = 0
    var clickedTPosition:Int = 0
    var chartClickedStatus:Boolean = false
    var monthlyItemsClickStatus:Boolean = false

    var hashMap = HashMap<String, String>()
    var hashMapFiscalYear = HashMap<String, String>()
    var dashboardChecked:Boolean = false
    var distributorDashboardChecked:Boolean=false
    var retailerDashboardChecked:Boolean=false

    var billListChecked:Boolean = false

    var PVCFlooring:String = "PVC FLOORING"
    var TuftedCarpet:String = "TUFTED CARPET"
    var CoilMat:String = "COIL MAT"
    var NonWovenCarpet:String = "NON-WOVEN CARPET"

}