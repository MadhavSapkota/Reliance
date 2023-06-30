package com.reliance.yeticarpet.activity.retailer.bill.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class DistributorListResponse{
        @SerializedName("data")
        @Expose
        var data: Datas? = null

        @SerializedName("message")
        @Expose
        var message: Int? = null

        @SerializedName("status")
        @Expose
        var status: String? = null
}

class Datas {
    @SerializedName("result")
    @Expose
    var result: List<Result>? = null
}


class Result {
    @SerializedName("current_scheme")
    @Expose
    var currentScheme: String? = null

    @SerializedName("distributor")
    @Expose
    var distributor: String? = null

    @SerializedName("total")
    @Expose
    var total: String? = null

    @SerializedName("vat_total")
    @Expose
    var vatTotal: String? = null
}