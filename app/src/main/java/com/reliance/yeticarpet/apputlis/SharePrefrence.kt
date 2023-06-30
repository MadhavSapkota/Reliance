package com.reliance.yeticarpet.apputlis
import com.chibatching.kotpref.KotprefModel

object UserInfo : KotprefModel() {
    var token by stringPref()
    var refreshToken by stringPref()
    var accessToken by stringPref()
    var loginStatus by booleanPref(default = false)
    var tokenStatus by booleanPref(default = false)
    var verifyOtp:Boolean by booleanPref(default = false)

    var checkDeviceStatus by booleanPref(default = false)

    var username by stringPref()
    var userId by stringPref()
    var retailerId by intPref()
    var distributorId by intPref()
    var fiscalId by intPref()
}

object RetailerInfo : KotprefModel() {
    var retailerListSize by stringPref()
    var billId by intPref()
    var retailerName by stringPref()
    var retailerId by intPref()
    var retailerScheme by stringPref()
    var totalBillAmount by stringPref()
    var currentMonth by intPref()
}


object FiscalYearInfo:KotprefModel(){
    var fiscalYearId by stringPref()
}


object DateInfo:KotprefModel(){
    var nepaliConvertedDate by stringPref()
}


