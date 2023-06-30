package com.reliance.yeticarpet.activity.distributor.retailerlist.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class PartyListResponse {
    @SerializedName("data")
    val retailerData: Map<String, RetailerData>? = null
    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("status")
    val status: String? = null
}

class RetailerData {
    @SerializedName("COIL MAT")
    val coilMat: String? = null

    @SerializedName("NON-WOVEN CARPET")
    val nonWovenCarpet: String? = null

    @SerializedName("PVC FLOORING")
    val pvcFlooring: String? = null

    @SerializedName("TUFTED CARPET")
    val tuftedCarpet: String? = null

    @SerializedName("retailer_id")
    val retailerId: Int? = null

    @SerializedName("retailer_name")
    val retailerName: String? = null

    @SerializedName("total")
    val total: String? = null
}


