package com.reliance.yeticarpet.app

class ApiRequest {

    data class LoginRequest(
        var username: String,
        var password: String
    )

    data class ForgotPasswordRequest (
        var username:String
    )

    data class OtpRequest (
        var userId:String,
        var otp:String
    )

    data class RefreshTokenRequest (
        var refresh:String
    )

    data class ChangePasswordRequest (
        var password:String,
        var passwordRe:String,
        var oldPassword:String)
}