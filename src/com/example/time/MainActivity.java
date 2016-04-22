package com.example.time;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	TextView tv;
	Button button;
	TextView tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		button = (Button) findViewById(R.id.button);
		tv2 = (TextView) findViewById(R.id.textView1);
		Context c=ContextUtil.getInstance();
		GetUid get=new GetUid(c);
		String uid=get.getUid();
        tv.setText("uid==="+uid);
		// GetTeleInfo g=new GetTeleInfo(getApplicationContext());
		// String imei=g.getUidOrimei();
		// Toast.makeText(getApplicationContext(), imei,
		// Toast.LENGTH_LONG).show();
		// tv.setText(imei);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});

		// TelephonyManager telephonyManager=(TelephonyManager)
		// this.getSystemService(TELEPHONY_SERVICE);
		// String imei=telephonyManager.getDeviceId();
		// String num=telephonyManager.getLine1Number();
		// String imsi=telephonyManager.getSubscriberId();
		// tv.setText(imei+"111"+num+"111"+imsi);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
