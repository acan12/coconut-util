package app.beelabs.com.utilc

import android.app.Activity
import android.util.DisplayMetrics

class ScreenUtil {

    companion object {

        fun getScreenWidth(x: Activity): Int {
            val metrics = DisplayMetrics()
            x.windowManager.defaultDisplay.getMetrics(metrics)
            return metrics.widthPixels
        }

        fun getScreenHeight(x: Activity): Int {
            val metrics = DisplayMetrics()
            x.windowManager.defaultDisplay.getMetrics(metrics)
            return metrics.heightPixels
        }
    }
}