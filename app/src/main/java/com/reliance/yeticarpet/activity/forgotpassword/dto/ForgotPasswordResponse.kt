package com.reliance.yeticarpet.activity.forgotpassword.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

 class ForgotPasswordResponse{
     @SerializedName("success")
     @Expose
     var success: Boolean? = null

     @SerializedName("message")
     @Expose
     var message: String? = null

     @SerializedName("user_id")
     @Expose
     var userId: Int? = null

 }