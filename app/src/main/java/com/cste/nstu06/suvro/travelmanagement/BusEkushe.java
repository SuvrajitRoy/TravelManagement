package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class BusEkushe extends Activity{
	TextView tv1,tv2,tv3,tv4,tv5,tv6;
	View v1, v2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bus_ekushe);
		v1 = findViewById(R.id.view1);
		v2 = findViewById(R.id.view2);
		tv1=  (TextView) findViewById(R.id.tv1);
		tv2=  (TextView) findViewById(R.id.tv2);
		tv3=  (TextView) findViewById(R.id.tv3);
		tv4=  (TextView) findViewById(R.id.tv4);
		tv5=  (TextView) findViewById(R.id.tv5);
		tv6=  (TextView) findViewById(R.id.tv6);
		
		(findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		(findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		(findViewById(R.id.layout3)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
	}
	public void call1(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01678047365"));
		startActivity(intent);
	}
	public void call2(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01839942829"));
		startActivity(intent);
	}
	public void call3(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01678022855"));
		startActivity(intent);
	}
	public void call4(View view){
		Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:01678047383"));
		startActivity(intent);
	}
	
}
