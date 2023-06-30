package com.reliance.yeticarpet.activity.login.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FiscalYearResponse {
    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("bill_data")
    @Expose
    var billData: BillDatas? = null
}

class BillDatas {
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
    var results: List<Results>? = null
}

class Results {
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

    @SerializedName("start_date")
    @Expose
    var startDate: String? = null

    @SerializedName("end_date")
    @Expose
    var endDate: String? = null

    @SerializedName("start_date_np")
    @Expose
    var startDateNp: String? = null

    @SerializedName("end_date_np")
    @Expose
    var endDateNp: String? = null

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