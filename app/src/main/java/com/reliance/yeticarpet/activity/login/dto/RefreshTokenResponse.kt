package com.reliance.yeticarpet.activity.login.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RefreshTokenResponse {
    @SerializedName("access")
    @Expose
    val access: String? = null

}