package com.example.administrator.weather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2015/10/7.
 */
public class AutoUpdateReceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context,AutoUpdateService.class);
        context.startActivity(intent1);
    }
}
