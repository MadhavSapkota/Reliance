package com.reliance.yeticarpet.dialog

import java.util.*
import kotlin.collections.HashMap

object MediaDateConvertor {

    fun getNepaliDate(year: Int, month: Int, day: Int): String {
        var startingNepDay=1
        when {
            month == 0||month==2||month==4||month==6 ||month==7 ||month==9||month==11-> startingNepDay=0
            month==1-> startingNepDay=3
            else -> startingNepDay=1
        }
        val startingNepYear=1970

        val startingNepMonth=1


        var dayOfWeek: Int=Calendar.WEDNESDAY
        val startingEngYear=1913
        val startingEngMonth=4
        val startingEngDay=13

        val engYear: Int=year
        val engMonth: Int=month + 1
        val engDay: Int=day
        var nepYear=startingNepYear
        var nepMonth=startingNepMonth
        var nepDay=startingNepDay

        val currentEngDate: Calendar=GregorianCalendar()

        currentEngDate[engYear, engMonth]=engDay

        val baseEngDate: Calendar=GregorianCalendar()

        baseEngDate[startingEngYear, startingEngMonth]=startingEngDay
        var totalEngDaysCount: Long= daysBetween(
            baseEngDate,
            currentEngDate
        )


        while (totalEngDaysCount != 0L) {
            val daysInIthMonth= getHasMap()!![nepYear]!![nepMonth]
            nepDay++
            if (nepDay > daysInIthMonth) {
                nepMonth++
                nepDay=1
            }
            if (nepMonth > 12) {
                nepYear++
                nepMonth=1
            }
            dayOfWeek++ // count the days in terms of 7 days
            if (dayOfWeek > 7) {
                dayOfWeek=1
            }
            totalEngDaysCount--
        }


        val daysInIthMonth= getHasMap()!![nepYear]!![nepMonth]
        return "${nepYear}/${nepMonth}/$nepDay"
    }

    fun daysBetween(startDate: Calendar, endDate: Calendar): Long {
        val date=startDate.clone() as Calendar
        var daysBetween: Long=0
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1)
            daysBetween++
        }
        return daysBetween
    }

    fun getHasMap(): HashMap<Int, IntArray>? {
        var nepaliMap: HashMap<Int, IntArray> =HashMap()
        //nepali date calendar

        /*
         The 0s at index 0 are dummy values so as to make the int array of
         days in months seems more intuitive that index 1 refers to first
         month "Baisakh", index 2 refers to second month "Jesth" and so on.
         */


        /*  INFO
         *  this is a dummy data, last month value is an educated guess but other are dummy,
         *  do not rely on this and its of no use except to prevent null
         *  don't believe the values of year 1969
         *  however it does not effect the conversion
         */
        nepaliMap.put(1969, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 31))

        /*
         *  below dates are based on
         *  based on https://github.com/bahadurbaniya/Date-Converter-Bikram-Sambat-to-English-Date/blob/master/src/main/java/np/com/converter/date/nepali/Lookup.java
         */

        /*
         *  below dates are based on
         *  based on https://github.com/bahadurbaniya/Date-Converter-Bikram-Sambat-to-English-Date/blob/master/src/main/java/np/com/converter/date/nepali/Lookup.java
         */
        nepaliMap.put(1970, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1971, intArrayOf(0, 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1972, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(1973, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(1974, intArrayOf(0, 30, 32, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1975, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1976, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(1977, intArrayOf(0, 30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31))
        nepaliMap.put(1978, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1979, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))

        nepaliMap.put(1980, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(1981, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30))
        nepaliMap.put(1982, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1983, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1984, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(1985, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30))
        nepaliMap.put(1986, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1987, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1988, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(1989, intArrayOf(0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30))

        nepaliMap.put(1990, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1991, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30))
        nepaliMap.put(1992, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(1993, intArrayOf(0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1994, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1995, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30))
        nepaliMap.put(1996, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(1997, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1998, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(1999, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))


        //old


        //old
        nepaliMap.put(2000, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2001, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2002, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2003, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2004, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2005, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2006, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2007, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2008, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31))
        nepaliMap.put(2009, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2010, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2011, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2012, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30))
        nepaliMap.put(2013, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2014, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2015, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2016, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30))
        nepaliMap.put(2017, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2018, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2019, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2020, intArrayOf(0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2021, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2022, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30))
        nepaliMap.put(2023, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2024, intArrayOf(0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2025, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2026, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2027, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2028, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2029, intArrayOf(0, 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2030, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2031, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2032, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2033, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2034, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2035, intArrayOf(0, 30, 32, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31))
        nepaliMap.put(2036, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2037, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2038, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2039, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30))
        nepaliMap.put(2040, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2041, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2042, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2043, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30))
        nepaliMap.put(2044, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2045, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2046, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2047, intArrayOf(0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2048, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2049, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30))
        nepaliMap.put(2050, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2051, intArrayOf(0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2052, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2053, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30))
        nepaliMap.put(2054, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2055, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2056, intArrayOf(0, 31, 31, 32, 31, 32, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2057, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2058, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2059, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2060, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2061, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2062, intArrayOf(0, 30, 32, 31, 32, 31, 31, 29, 30, 29, 30, 29, 31))
        nepaliMap.put(2063, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2064, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2065, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2066, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 29, 31))
        nepaliMap.put(2067, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2068, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2069, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2070, intArrayOf(0, 31, 31, 31, 32, 31, 31, 29, 30, 30, 29, 30, 30))
        nepaliMap.put(2071, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2072, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2073, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 31))
        nepaliMap.put(2074, intArrayOf(0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2075, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2076, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30))
        nepaliMap.put(2077, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 30, 29, 31))
        nepaliMap.put(2078, intArrayOf(0, 31, 31, 31, 32, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2079, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 29, 30, 29, 30, 30))
        nepaliMap.put(2080, intArrayOf(0, 31, 32, 31, 32, 31, 30, 30, 30, 29, 29, 30, 30))
        nepaliMap.put(2081, intArrayOf(0, 31, 31, 32, 32, 31, 30, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2082, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2083, intArrayOf(0, 31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2084, intArrayOf(0, 31, 31, 32, 31, 31, 30, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2085, intArrayOf(0, 31, 32, 31, 32, 30, 31, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2086, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2087, intArrayOf(0, 31, 31, 32, 31, 31, 31, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2088, intArrayOf(0, 30, 31, 32, 32, 30, 31, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2089, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30))
        nepaliMap.put(2090, intArrayOf(0, 30, 32, 31, 32, 31, 30, 30, 30, 29, 30, 30, 30))
        return nepaliMap
    }

    fun getEnglishDate(year: Int, month: Int, day: Int): String {
        val startingNepYear=1970
        val startingNepMonth=1
        val startingNepDay=1

        var dayOfWeek: Int=Calendar.WEDNESDAY
        val startingEngYear=1913
        val startingEngMonth=4
        val startingEngDay=13

        var nepYear=year
        var nepMonth=month
        var nepDay=day

        var totalNepDaysCount: Long=0

        var endDayOfMonth=0

        var engYear=startingEngYear
        var engMonth=startingEngMonth
        var engDay=startingEngDay

        val daysInMonth=intArrayOf(
            0, 31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31
        )
        val daysInMonthOfLeapYear=intArrayOf(
            0, 31, 29, 31, 30,
            31, 30, 31, 31, 30, 31, 30, 31
        )


        // count total days in-terms of year
        for (i in startingNepYear until nepYear) {
            for (j in 1..12) {
                totalNepDaysCount+= getHasMap()!!.get(i)!!.get(j)
            }
        }

        // count total days in-terms of month
        for (j in startingNepMonth until nepMonth) {
            totalNepDaysCount+= getHasMap()!!.get(nepYear)!!.get(j)
        }


        // count total days in-terms of date
        totalNepDaysCount+=(nepDay - startingNepDay).toLong()


        while (totalNepDaysCount != 0L) {
            endDayOfMonth=if (isLeapYear(engYear)) {
                daysInMonthOfLeapYear[engMonth]
            } else {
                daysInMonth[engMonth]
            }
            engDay++
            dayOfWeek++
            if (engDay > endDayOfMonth) {
                engMonth++
                engDay=1
                if (engMonth > 12) {
                    engYear++
                    engMonth=1
                }
            }
            if (dayOfWeek > 7) {
                dayOfWeek=1
            }
            totalNepDaysCount--
        }
        return "${engYear}/${engMonth}/$engDay"
    }

    fun isLeapYear(year: Int): Boolean {
        return if (year % 100 == 0) {
            year % 400 == 0
        } else {
            year % 4 == 0
        }
    }

}