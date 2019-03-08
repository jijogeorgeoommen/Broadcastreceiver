package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class broadcastclass extends BroadcastReceiver {

    String num;

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bun=intent.getExtras();
        if (bun != null){
            String state=bun.getString(TelephonyManager.EXTRA_STATE);

            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                num=intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);

                Toast.makeText(context, "app"+num, Toast.LENGTH_SHORT).show();
            }
        }

    }
}
