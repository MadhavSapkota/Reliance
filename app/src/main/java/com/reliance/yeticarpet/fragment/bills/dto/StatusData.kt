package com.reliance.yeticarpet.fragment.bills.dto

class StatusData
    (
    var statusId:Int,
    var statusName:String
)
{
    @JvmName("getStatusId1")
    fun getStatusId():Int{
        return statusId
    }

    @JvmName("getStatusName1")
    fun getStatusName():String{
        return statusName
    }

}