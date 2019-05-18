package app.beelabs.com.utilc

import java.text.SimpleDateFormat
import java.util.*

class DateUtil {

    companion object {
        fun convertToEpoch(date: Date): Long {
            val cal = Calendar.getInstance()
            cal.timeZone = TimeZone.getTimeZone("UTC")
            cal.time = date
            return cal.timeInMillis
        }

        fun convertToDate(epoch: Long): Date {
            val cal = Calendar.getInstance()
            cal.timeZone = TimeZone.getTimeZone("UTC")
            cal.timeInMillis = epoch
            return cal.time
        }

        fun formatStringMonthBahasa(date: Date, pattern: String): String {

            val form = SimpleDateFormat(pattern)
            val format = form.format(date)

            var dateString = ""
            for (month in IConfig.monthLabels) {
                val labels = month.split("_".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
                dateString = format.replace(labels[0].toRegex(), labels[1])
                if (dateString != format) break
            }

            return dateString
        }

        fun getPersonAge(date: Date): Int {

            if (date == null) return 0

            val calDob: Calendar = Calendar.getInstance()
            val calNow: Calendar = Calendar.getInstance()
            calDob.time = date
            calNow.time = Date()

            val difInMonths: Int = calNow.get(Calendar.MONTH) - calDob.get(Calendar.MONTH)
            val age: Int = calNow.get(Calendar.YEAR) - calDob.get(Calendar.YEAR)

            return if (difInMonths < 0) (age - 1) else age
        }


    }
}