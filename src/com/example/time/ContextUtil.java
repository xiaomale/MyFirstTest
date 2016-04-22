package com.example.time;

import android.app.Application;
import android.content.Context;

public class ContextUtil extends Application {
	private static Context instance;

	public static Context getInstance() {
		return instance;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		instance = this.getApplicationContext();
	}
}
