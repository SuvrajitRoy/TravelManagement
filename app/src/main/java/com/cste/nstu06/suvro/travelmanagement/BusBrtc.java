package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class BusBrtc extends Activity{
	TextView tv1, tv2, tv3, tv4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bus_brtc);
		tv1=  (TextView) findViewById(R.id.tv1);
		tv2=  (TextView) findViewById(R.id.tv2);
		tv3=  (TextView) findViewById(R.id.tv3);
		tv4=  (TextView) findViewById(R.id.tv4);
		(findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		(findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
	
	}

}
