package app.beelabs.com.utilc

import java.text.NumberFormat
import java.util.*

class MoneyUtil {

    companion object {
        fun convertIDRCurrencyFormat(amount: Double?, decimal: Int): String {
            val localeID = Locale("in", "ID")
            val formatRupiah = NumberFormat.getCurrencyInstance(localeID)
            formatRupiah.maximumFractionDigits = decimal
            return formatRupiah.format(amount).replace("Rp", "Rp ")
        }
    }
}