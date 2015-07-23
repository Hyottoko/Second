package com.example.android23broadcastreceive;

import android.os.Bundle;
import android.app.Activity;
import android.content.IntentFilter;
import android.view.Menu;

public class MainActivity extends Activity {
	OtherReceive receive;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		receive=new OtherReceive();
		
		
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
//		IntentFilter filter=new IntentFilter("practice");
//		registerReceiver(receive, filter);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
//		unregisterReceiver(receive);
	}
}
