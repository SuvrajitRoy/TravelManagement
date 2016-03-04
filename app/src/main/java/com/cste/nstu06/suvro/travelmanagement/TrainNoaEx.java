package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class TrainNoaEx extends Activity{
	TextView tv1,tv2;
	View v1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.train_noa_ex);
		v1 = findViewById(R.id.viewN1);
		tv1=  (TextView) findViewById(R.id.tvN1);
		tv2=  (TextView) findViewById(R.id.tvN2);
		(findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		(findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		
		}
	
	
}
