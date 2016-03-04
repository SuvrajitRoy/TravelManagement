package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class BusBadhan extends Activity{
	TextView tv1,tv2,tv3,tv4,tv5,tv6;
	View v1, v2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bus_badhan);
		v1 = findViewById(R.id.viewB1);
		v2 = findViewById(R.id.viewB2);
		tv1=  (TextView) findViewById(R.id.tvB1);
		tv2=  (TextView) findViewById(R.id.tvB2);
		tv3=  (TextView) findViewById(R.id.tvB3);
		tv4=  (TextView) findViewById(R.id.tvB4);
		tv5=  (TextView) findViewById(R.id.tvB5);
		tv6=  (TextView) findViewById(R.id.tvB6);
		(findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		(findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		(findViewById(R.id.layout3)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
	}
	public void callB1(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01818958739"));
		startActivity(intent);
	}
	public void callB2(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01855906853"));
		startActivity(intent);
	}
	public void callB3(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01816707740"));
		startActivity(intent);
	}
	
	
}
