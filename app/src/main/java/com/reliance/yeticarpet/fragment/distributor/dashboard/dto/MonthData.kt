package com.reliance.yeticarpet.fragment.distributor.dashboard.dto

class MonthData
(
    var monthId:Int,
    var monthNumber:String
)
{
    @JvmName("getMonthId1")
    fun getMonthId():Int{
        return monthId
    }

    @JvmName("getMonthNumber1")
    fun gerMonthNumber():String{
        return monthNumber
    }

}