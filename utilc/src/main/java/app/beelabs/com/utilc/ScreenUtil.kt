package app.beelabs.com.utilc

import android.util.DisplayMetrics

class ScreenUtil {

    companion object {

        fun getScreenWidth(): Int {
            val metrics = DisplayMetrics()
            return metrics.widthPixels
        }

        fun getScreenHeight(): Int {
            val metrics = DisplayMetrics()
            return metrics.heightPixels
        }
    }
}