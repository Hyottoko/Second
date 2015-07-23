package com.example.android23broadcastreceive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OtherReceive extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		if(arg1.getAction().equals("practice")){
			Toast.makeText(arg0, "Other接收到fffffffffff", 0).show();
		}

	}

}
