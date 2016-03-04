package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class BusAsia extends Activity{
	TextView tv1,tv2,tv3,tv4,tv5,tv6;
	View v1, v2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bus_asia);
		
		v1 = findViewById(R.id.viewA1);
		v2 = findViewById(R.id.viewA2);
		tv1=  (TextView) findViewById(R.id.tvA1);
		tv2=  (TextView) findViewById(R.id.tvA2);
		tv3=  (TextView) findViewById(R.id.tvA3);
		tv4=  (TextView) findViewById(R.id.tvA4);
		tv5=  (TextView) findViewById(R.id.tvA5);
		tv6=  (TextView) findViewById(R.id.tvA6);
		(findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		(findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		(findViewById(R.id.layout3)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
	}
	public void callA1(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01767441403"));
		startActivity(intent);
	}
	public void callA2(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01767441404"));
		startActivity(intent);
	}
	public void callA3(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01767441372"));
		startActivity(intent);
	}
	public void callA4(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01767441370"));
		startActivity(intent);
	}
	
}
