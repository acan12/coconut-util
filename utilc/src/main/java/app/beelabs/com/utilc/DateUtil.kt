package app.beelabs.com.utilc

import java.text.SimpleDateFormat
import java.util.*

class DateUtil {

    companion object {
        @JvmStatic
        fun convertToEpoch(date : Date) : Long? {
            val cal = Calendar.getInstance()
            cal.timeZone = TimeZone.getTimeZone("UTC")
            cal.time = date
            cal.set(Calendar.HOUR_OF_DAY, 0)            // set hour to midnight
            cal.set(Calendar.MINUTE, 0)                 // set minute in hour
            cal.set(Calendar.SECOND, 0)                 // set second in minute
            cal.set(Calendar.MILLISECOND, 0)
            return (cal.getTimeInMillis() / 1000) + 86400
        }

        @JvmStatic
        fun convertToDate(epoch: Long): Date {
            return Date(epoch * 1000L)
        }

        @JvmStatic
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
    }
}