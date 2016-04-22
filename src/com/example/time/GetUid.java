package com.example.time;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.Log;

public class GetUid {
	static Context context;

	public GetUid(Context con) {
		// TODO Auto-generated constructor stub
		GetUid.context = con;
	}

	public String getUid() {
		String imei = "000000000000000";
		try {
			TelephonyManager telephonyManager = (TelephonyManager) context
					.getSystemService(context.TELEPHONY_SERVICE);
			imei = telephonyManager.getDeviceId();
			Log.i("imei", imei);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imei;
	}

}
