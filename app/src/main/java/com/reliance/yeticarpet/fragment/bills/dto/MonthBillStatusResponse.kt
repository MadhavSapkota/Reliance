package com.reliance.yeticarpet.fragment.bills.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MonthBillStatusResponse {
    @SerializedName("data")
    @Expose
    val datas: Map<String, MonthBillDataStatus>? = null

    @SerializedName("message")
    @Expose
    var message: Int? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("total_sales")
    @Expose
    var totalSales: TotalSales? = null
}



class TotalSales {
    @SerializedName("approved_sales")
    @Expose
    var approvedSales: Int? = null

    @SerializedName("pending_sales")
    @Expose
    var pendingSales: Int? = null

    @SerializedName("total_sales")
    @Expose
    var totalSales: Int? = null
}

class MonthBillDataStatus {
    @SerializedName("approved_sales")
    @Expose
    var approvedSales: Int? = null

    @SerializedName("month")
    @Expose
    var month: String? = null

    @SerializedName("pending_sales")
    @Expose
    var pendingSales: Int? = null
}

