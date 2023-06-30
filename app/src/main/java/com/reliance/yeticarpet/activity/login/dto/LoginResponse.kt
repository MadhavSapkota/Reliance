package com.reliance.yeticarpet.activity.login.dto
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoginResponse {
    @SerializedName("refresh")
    @Expose
    var refresh: String? = null

    @SerializedName("access")
    @Expose
    var access: String? = null

    @SerializedName("user_id")
    @Expose
    var userId: Int? = null

    @SerializedName("username")
    @Expose
    var username: String? = null

    @SerializedName("user_group")
    @Expose
    var userGroup: List<UserGroup>? = null

    @SerializedName("retailer_id")
    @Expose
    var retailerId: String? = null

    @SerializedName("retailer_name")
    @Expose
    var retailerName: Any? = null

    @SerializedName("distributor_id")
    @Expose
    var distributorId: Int? = null

    @SerializedName("distributor_name")
    @Expose
    var distributorName: String? = null

}


class UserGroup {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null
}


//    @SerializedName("refresh")
//    @Expose
//    var refresh: String? = null
//
//    @SerializedName("access")
//    @Expose
//    var access: String? = null
//
//    @SerializedName("user_id")
//    @Expose
//    var userId: Int? = null
//
//    @SerializedName("username")
//    @Expose
//    var username: String? = null
//
//    @SerializedName("user_group")
//    @Expose
//    var userGroup: List<Any>? = null
//
//    @SerializedName("retailer_id")
//    @Expose
//    var retailerId: String? = null
//
//    @SerializedName("retailer_name")
//    @Expose
//    var retailerName: Any? = null
//
//    @SerializedName("distributor_id")
//    @Expose
//    var distributorId: Any? = null
//
//    @SerializedName("distributor_name")
//    @Expose
//    var distributorName: Any? = null
//}
