package com.reliance.yeticarpet.app

object Apiurl {
    const val BASE_URL = "https://scheme.yetiflooring.com.np"
    const val LOGIN = "/auth/login/"
    const val FORGOTPASSWORD = "/auth/forget_password/"
    const val OTP = "/auth/otp/"
    const val BILLS = "/api/bills/bill/"
    const val REFRESHTOKEN = "/auth/login/refresh/"
    const val FISCALYEAR = " /api/master/fiscal_year/"
    const val BILLSDETAILS = "/api/bills/bill/{id}"
    const val BILLBRAND = "/api/bills/billbrand"
    const val DISTRIBUTOR = "/api/distributor/distributor"
    const val DISTRIBUTORLIST = "/api/bills/distributor_list/"
    const val RETAILERDASHBOARD = "api/dashboard/retailer_dashboard/"
    const val CHANGEPASSWORD ="/auth/change_password/1/"
    const val DISTRIBUTORDASHBOARD = "/api/dashboard/distributor_dashboard"
    const val PARTYLIST = "/api/bills/retailer_list"
    const val RETAILERlIST = "/api/retailer/retailer"
    const val MONTHLISTDATA = "api/bills/month_bill_status"
    const val CHECKDEVICE = "/auth/token/check_device/"
    const val CHECKEDDEVICEOTP = "/auth/token/verify/"
}

