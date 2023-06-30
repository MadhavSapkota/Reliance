package com.reliance.yeticarpet.activity.retailer.bill.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BillsResponse {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("bill_data")
    @Expose
    var billData: BillData? = null

}

class BillData {
    @SerializedName("count")
    @Expose
    var count: Int? = null

    @SerializedName("next")
    @Expose
    var next: Any? = null

    @SerializedName("previous")
    @Expose
    var previous: Any? = null

    @SerializedName("results")
    @Expose
    var results: List<ResultData>? = null
}

class Distributor {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("location")
    @Expose
    var location: Locations? = null

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

    @SerializedName("vat_pan")
    @Expose
    var vatPan: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("contact")
    @Expose
    var contact: String? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null

    @SerializedName("user")
    @Expose
    var user: Int? = null

    @SerializedName("brands")
    @Expose
    var brands: List<Int>? = null
}


class District {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("province")
    @Expose
    var province: Provinces? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: Any? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: Any? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("districtpcode")
    @Expose
    var districtpcode: String? = null

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

class District__1 {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("province")
    @Expose
    var province: Province__11? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: Any? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: Any? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("districtpcode")
    @Expose
    var districtpcode: String? = null

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

class Example {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("bill_data")
    @Expose
    var billData: BillData? = null
}

class Locations {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("district")
    @Expose
    var district: District? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: Any? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: Any? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("nepali_name")
    @Expose
    var nepaliName: String? = null

    @SerializedName("census_code")
    @Expose
    var censusCode: String? = null

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

class Location__11 {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("district")
    @Expose
    var district: District__1? = null

    @SerializedName("is_deleted")
    @Expose
    var isDeleted: Boolean? = null

    @SerializedName("deleted_at")
    @Expose
    var deletedAt: Any? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: Any? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: Any? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("nepali_name")
    @Expose
    var nepaliName: String? = null

    @SerializedName("census_code")
    @Expose
    var censusCode: String? = null

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

class Provinces {
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


class Province__11 {
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

class ResultData {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("distributor")
    @Expose
    var distributor: Distributor? = null

    @SerializedName("retailer")
    @Expose
    var retailer: Retailer1? = null

    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null

    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null

    @SerializedName("bill_no")
    @Expose
    var billNo: String? = null

    @SerializedName("date_en")
    @Expose
    var dateEn: String? = null

    @SerializedName("date_np")
    @Expose
    var dateNp: String? = null

    @SerializedName("total")
    @Expose
    var total: String? = null

    @SerializedName("total_discount")
    @Expose
    var totalDiscount: String? = null

    @SerializedName("discounted_total")
    @Expose
    var discountedTotal: String? = null

    @SerializedName("vat_total")
    @Expose
    var vatTotal: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null

    @SerializedName("fiscal_year")
    @Expose
    var fiscalYear: Int? = null

    @SerializedName("month")
    @Expose
    var month: Int? = null
}

class Retailer1 {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("user")
    @Expose
    var user: User1? = null

    @SerializedName("location")
    @Expose
    var location: Location__11? = null

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

    @SerializedName("contact")
    @Expose
    var contact: String? = null

    @SerializedName("vat_pan")
    @Expose
    var vatPan: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("created_by")
    @Expose
    var createdBy: Any? = null

    @SerializedName("updated_by")
    @Expose
    var updatedBy: Any? = null
}

class User1 {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("password")
    @Expose
    var password: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("username")
    @Expose
    var username: String? = null

    @SerializedName("date_joined")
    @Expose
    var dateJoined: String? = null

    @SerializedName("last_login")
    @Expose
    var lastLogin: String? = null

    @SerializedName("is_admin")
    @Expose
    var isAdmin: Boolean? = null

    @SerializedName("is_active")
    @Expose
    var isActive: Boolean? = null

    @SerializedName("is_staff")
    @Expose
    var isStaff: Boolean? = null

    @SerializedName("is_superuser")
    @Expose
    var isSuperuser: Boolean? = null

    @SerializedName("otp")
    @Expose
    var otp: Any? = null

    @SerializedName("contact")
    @Expose
    var contact: String? = null

    @SerializedName("groups")
    @Expose
    var groups: List<Int>? = null

    @SerializedName("user_permissions")
    @Expose
    var userPermissions: List<Any>? = null
}
