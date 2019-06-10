package app.beelabs.com.coconututil;

import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import app.beelabs.com.utilc.DateUtil;
import app.beelabs.com.utilc.MoneyUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long now = DateUtil.Companion.convertToEpoch(Calendar.getInstance().getTime());
        MoneyUtil.Companion.convertIDRCurrencyFormat(20000d, 0);

        Log.e("", "");
    }
}
