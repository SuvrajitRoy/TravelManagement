package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class TrainSomotot extends Activity{
	TextView tv1,tv2,tv3;
	View v1,v2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.train_somottot);
		v1 = findViewById(R.id.viewS1);
		v2 = findViewById(R.id.viewS2);
		tv1=  (TextView) findViewById(R.id.tvS1);
		tv2=  (TextView) findViewById(R.id.tvS2);
		tv3= (TextView) findViewById(R.id.tvS3);
		(findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		(findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		(findViewById(R.id.layout3)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
	}
	
	
}
