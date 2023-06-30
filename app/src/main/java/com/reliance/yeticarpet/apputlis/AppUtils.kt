package com.reliance.yeticarpet.apputlis
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.Locale
import java.util.regex.Pattern

object AppUtils {
    fun isEmailValid(email: String): Boolean {
        val regExpn = ("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$")
        val pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE)
        val matcher = pattern.matcher(email)
        return matcher.matches()
    }

    //firstnamevalidation
    fun isFirstNameValid(firstname: String): Boolean {
        val regExpn = ("[a-zA-z]+([ '-][a-zA-Z]+)*")
        val pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE)
        val matcher = pattern.matcher(firstname)
        return matcher.matches()

    }

    fun getFormattedRetailerName(result: String): String? {
        return if ((result.length ?: 0) > 15) {
            "${result.substring(0, 15)}.."
        } else {
            result
        }
    }

    fun formatDecimalValue(value: Double): String {
        val df = DecimalFormat("###.###")
        return df.format(value)
    }

    fun getMonth(month: Int): String {
        return when {
            month.toString().length == 1 -> {
                "0$month"
            }
            else -> "$month"
        }
    }

    fun convertToNepaliDate(englishDate: String): String {
        // Extracting year, month, and day from the English date
        val parts = englishDate.split("-")
        val englishYear = parts[0].toInt()
        val englishMonth = parts[1].toInt()
        val englishDay = parts[2].toInt()

        // Nepali calendar starts from B.S. 2000
        val nepaliYear = englishYear - 1943
        var nepaliMonth = englishMonth
        var nepaliDay = englishDay

        // Adjust the Nepali date if it exceeds the valid range
        if (nepaliDay > 32 || (nepaliMonth == 4 && nepaliDay > 31) || (nepaliMonth == 6 && nepaliDay > 31)
            || (nepaliMonth == 9 && nepaliDay > 30) || (nepaliMonth == 11 && nepaliDay > 30)
        ) {
            nepaliDay -= 32
            nepaliMonth++
        }

        // Format the Nepali date as a string
        val nepaliDate = "$nepaliYear-${String.format("%02d", nepaliMonth)}-${String.format("%02d", nepaliDay)}"
        return nepaliDate
    }


    fun convertToFormattedText(input: String): String {
        val words = input.split(" ")
        val formattedText = buildString {
            words.forEachIndexed { index, word ->
                if (index != 0) {
                    append(" ")
                }
                append(word.trim().capitalize())
            }
        }
        return formattedText
    }


    fun convertToTitleCase(input: String): String {
        val words = input.toLowerCase().split(" ")
        val titleCaseWords = words.map { it.capitalize() }
        return titleCaseWords.joinToString(" ")
    }

    fun formatNumber(number: Double): String {
        return when {
            number % 1 == 0.0 -> "${number.toInt()}"
            else -> String.format("%.2f", number)
        }
    }

    fun convertToUpperCase(input: String): String {
        val words = input.split(" ")
        val mergedString = words.joinToString(" ") { if (it.length > 1) it else it.toUpperCase() }
        return mergedString.replaceFirst(" ", "")
    }



    fun formatDecimalTwoDigitValue(value: Double): String {
        val decimalFormat = DecimalFormat("#.##")
        decimalFormat.maximumFractionDigits = 2
        val formattedValue = decimalFormat.format(value)
        return "$formattedValue"
    }

    fun formatNumberWithCommasAndDecimals(number: String): String {
        val numberWithoutCommas = number.replace(",", "")
        val formatter = DecimalFormat("#,##,##0.00") //"#,##,##0.00

        return formatter.format(numberWithoutCommas.toDoubleOrNull() ?: 0.0)
    }



    fun mapNepalMonths(): Map<String, Int> {
        val nepalMonths = mapOf(
            "BAISAKH" to 10,
            "JESTHA" to 11,
            "ASHAD" to 12,
            "SHRAWAN" to 1,
            "BHADRA" to 2,
            "ASWIN" to 3,
            "KARTIK" to 4,
            "MANGSHIR" to 5,
            "POUSH" to 6,
            "MAGH" to 7,
            "FALGUN" to 8,
            "CHAITRA" to 9
        )
        return nepalMonths
    }

    fun getNepalMonthValue(monthName: String): Int? {
        val nepalMonths = mapNepalMonths()
        return nepalMonths[monthName.toUpperCase()]
    }



}