package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;

public class BusComilla extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buscomilla);
		(findViewById(R.id.button1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
	}

}
