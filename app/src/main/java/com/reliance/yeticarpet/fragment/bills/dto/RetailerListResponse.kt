package com.reliance.yeticarpet.fragment.bills.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RetailerListResponse {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("bill_data")
    @Expose
    var billDatas: BillDatas? = null
}

class BillDatas {
    @SerializedName("count")
    @Expose
    var count: Int? = null

    @SerializedName("next")
    @Expose
    var next: String? = null

    @SerializedName("previous")
    @Expose
    var previous: Any? = null

    @SerializedName("results")
    @Expose
    var results: List<Results>? = null
}
class District {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("districtpcode")
    @Expose
    var districtpcode: String? = null

    @SerializedName("province")
    @Expose
    var province: Province? = null
}

class Location {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("nepali_name")
    @Expose
    var nepaliName: String? = null

    @SerializedName("census_code")
    @Expose
    var censusCode: String? = null

    @SerializedName("district")
    @Expose
    var district: District? = null
}

class Province {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null
}

class Results {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("contact")
    @Expose
    var contact: String? = null

    @SerializedName("vat_pan")
    @Expose
    var vatPan: String? = null

    @SerializedName("location")
    @Expose
    var location: Location? = null

    @SerializedName("user")
    @Expose
    var user: User? = null
}
class User {
    @SerializedName("contact")
    @Expose
    var contact: String? = null

    @SerializedName("last_login")
    @Expose
    var lastLogin: String? = null
}