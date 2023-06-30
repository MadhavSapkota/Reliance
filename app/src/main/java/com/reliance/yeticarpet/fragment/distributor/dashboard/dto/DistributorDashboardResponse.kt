package com.reliance.yeticarpet.fragment.distributor.dashboard.dto

import com.google.gson.annotations.SerializedName


class DistributorDashboardResponse {
    @SerializedName("title")
     val title: String? = null

    @SerializedName("distributor_detail")
     val distributorDetail: String? = null

    @SerializedName("total_sell")
     val totalSell: String? = null

    @SerializedName("total_active_sell")
     val totalActiveSell: TotalActiveSell? = null

    @SerializedName("retailer_purchase")
     val retailerPurchase: Map<String, RetailerPurchase>? = null

    @SerializedName("month_category")
     val monthCategory: Map<String, MonthCategory>? = null

    @SerializedName("months")
     val months: List<String>? = null

    @SerializedName("categories")
     val categories: List<Category>? = null

    @SerializedName("scheme")
     val scheme = 0.0
}

 class TotalActiveSell {
    @SerializedName("status")
     val status = false

    @SerializedName("total")
     val total: String? = null // Getters and setters
}

 class RetailerPurchase {
    @SerializedName("retailer_name")
     val retailerName: String? = null

    @SerializedName("total")
     val total: String? = null

    @SerializedName("retailer_id")
     val retailerId = 0

    @SerializedName("PVC FLOORING")
     val pvcFlooring: String? = null

    @SerializedName("COIL MAT")
     val coilMat: String? = null

    @SerializedName("TUFTED CARPET")
     val tuftedCarpet :Double = 0.0

    @SerializedName("NON-WOVEN CARPET")
     val nonWovenCarpet:Double = 0.0
}

 class MonthCategory {
    @SerializedName("PVC FLOORING")
     val pvcFlooring: String? = null

    @SerializedName("COIL MAT")
     val coilMat: String? = null

    @SerializedName("TUFTED CARPET")
     val tuftedCarpet: String? = null

    @SerializedName("NON-WOVEN CARPET")
     val nonWovenCarpet: String? = null

    @SerializedName("month")
     val month = 0

    @SerializedName("nepali_month")
     val nepaliMonth: String? = null

    @SerializedName("total")
     val total: String? = null

    @SerializedName("vat_total")
     val vatTotal: String? = null
}

 class Category {
    @SerializedName("id")
     val id = 0

    @SerializedName("company")
     val company: Company? = null

    @SerializedName("is_deleted")
     val isDeleted = false

    @SerializedName("deleted_at")
     val deletedAt: String? = null

    @SerializedName("created_at")
     val createdAt: String? = null

    @SerializedName("updated_at")
     val updatedAt: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("status")
     val status = false

    @SerializedName("rank")
     val rank = 0

    @SerializedName("created_by")
     val createdBy: Any? = null

    @SerializedName("updated_by")
     val updatedBy: Any? = null
}

 class Company {
    @SerializedName("id")
     val id = 0

    @SerializedName("is_deleted")
     val isDeleted = false

    @SerializedName("deleted_at")
     val deletedAt: String? = null

    @SerializedName("created_at")
     val createdAt: String? = null

    @SerializedName("updated_at")
     val updatedAt: String? = null

    @SerializedName("name")
     val name: String? = null

    @SerializedName("status")
     val status = false

    @SerializedName("rank")
     val rank = 0

    @SerializedName("created_by")
     val createdBy: Any? = null

    @SerializedName("updated_by")
     val updatedBy: Any? = null
}




