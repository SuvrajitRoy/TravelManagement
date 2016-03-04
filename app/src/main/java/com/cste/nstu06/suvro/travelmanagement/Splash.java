package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity{
	private final int SPLASH_TIME_OUT = 2000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				Intent intent = new Intent(Splash.this , MainActivity.class);
				startActivity(intent);
				
				finish();
				
			}
		}, SPLASH_TIME_OUT);
	}

}
