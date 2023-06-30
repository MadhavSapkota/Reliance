package com.reliance.yeticarpet.activity.otp.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class OtpResponse {

    @SerializedName("success")
    @Expose
    val success: List<Boolean>? = null

    @SerializedName("message")
    @Expose
    val message: String? = null

    @SerializedName("user_id")
    @Expose
    val userId: String? = null


}