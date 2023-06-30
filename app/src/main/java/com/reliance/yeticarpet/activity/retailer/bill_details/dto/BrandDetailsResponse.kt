package com.reliance.yeticarpet.activity.retailer.bill_details.dto

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class BrandDetailsResponse {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("bill_data")
    @Expose
    var billData: List<BillDatum>? = null
}

class BillDatum {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("brand")
    @Expose
    var brand: Brand? = null

    @SerializedName("unit")
    @Expose
    var unit: Unit__1? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("quantity")
    @Expose
    var quantity: Double? = null

    @SerializedName("unit_price")
    @Expose
    var unitPrice: String? = null

    @SerializedName("total_price")
    @Expose
    var totalPrice: String? = null

    @SerializedName("discount_amount")
    @Expose
    var discountAmount: String? = null

    @SerializedName("discount_price")
    @Expose
    var discountPrice: String? = null

    @SerializedName("total_vat_price")
    @Expose
    var totalVatPrice: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null

    @SerializedName("bill")
    @Expose
    var bill: Int? = null
}
class Brand {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("category")
    @Expose
    var category: Category? = null

    @SerializedName("unit")
    @Expose
    var unit: List<Unit>? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("rank")
    @Expose
    var rank: Int? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null
}
class Category {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("company")
    @Expose
    var company: Company? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("rank")
    @Expose
    var rank: Int? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null
}

class Unit {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("rank")
    @Expose
    var rank: Int? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null
}
class Unit__1 {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("rank")
    @Expose
    var rank: Int? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null
}


class Company {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("rank")
    @Expose
    var rank: Int? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null
}


