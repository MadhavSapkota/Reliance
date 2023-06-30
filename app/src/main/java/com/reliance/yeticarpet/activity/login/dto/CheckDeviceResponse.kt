package com.reliance.yeticarpet.activity.login.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class CheckDeviceResponse {
    @SerializedName("msg")
    @Expose
    var msg: String? = null

    @SerializedName("status")
    @Expose
    var status: Boolean? = null
}