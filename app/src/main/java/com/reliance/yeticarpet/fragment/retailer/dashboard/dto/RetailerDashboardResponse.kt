package com.reliance.yeticarpet.fragment.retailer.dashboard.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class RetailerDashboardResponse {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("total_bill_amount")
    @Expose
    var totalBillAmount: String? = null

    @SerializedName("total_scheme")
    @Expose
    var totalScheme: Double? = null

    @SerializedName("scheme_detail")
    @Expose
    var schemeDetail: List<SchemeDetail>? = null

    @SerializedName("bill_brand")
    @Expose
    var billBrand: List<BillBrand>? = null

    @SerializedName("month")
    @Expose
    var month: Int? = null

}

class Offer {
    @SerializedName("percentage")
    @Expose
    var percentage: String? = null

    @SerializedName("min_amount")
    @Expose
    var minAmount: String? = null

    @SerializedName("target")
    @Expose
    var target: List<Targets>? = null
}

class RetailerScheme {
    @SerializedName("scheme_amount")
    @Expose
    var schemeAmount: String? = null

    @SerializedName("offer_id")
    @Expose
    var offerId: Int? = null

    @SerializedName("offer")
    @Expose
    var offer: String? = null

    @SerializedName("status")
    @Expose
    var status: String? = null
}

class SchemeDetail {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("retailer_scheme")
    @Expose
    var retailerScheme: List<RetailerScheme>? = null

    @SerializedName("offers")
    @Expose
    var offers: List<Offer>? = null
}

class Targets {
    @SerializedName("target")
    @Expose
    var target: String? = null

    @SerializedName("category")
    @Expose
    var category: String? = null
}

class BillBrand {
    @SerializedName("category_id")
    @Expose
    var categoryId: Int? = null

    @SerializedName("category")
    @Expose
    var category: String? = null

    @SerializedName("total_sell")
    @Expose
    var totalSell: String? = null
}































