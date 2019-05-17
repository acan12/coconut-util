package app.beelabs.com.coconututil;

import android.annotation.TargetApi;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import app.beelabs.com.utilc.DateUtil;
import app.beelabs.com.utilc.MoneyUtil;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long now = DateUtil.convertToEpoch(Calendar.getInstance().getTime());
        MoneyUtil.convertIDRCurrencyFormat(20000d);

        Log.e("", "");
    }
}
