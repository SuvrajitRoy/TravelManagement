package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class TrainComilla extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.traincomilla);
		
		(findViewById(R.id.btnComilla)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
	}

	public void showComilla(View v) {
		Intent intent = new Intent(this, DemoTrain.class);
		startActivity(intent);
	}
}
