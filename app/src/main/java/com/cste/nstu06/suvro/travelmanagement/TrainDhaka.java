package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class TrainDhaka extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.traindhaka);
		
		(findViewById(R.id.btnDha)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		(findViewById(R.id.btnNoa)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		
	}
	public void showNoakhali(View v) {
		Intent intent = new Intent(this, TrainNoaEx.class);
		startActivity(intent);
		
	}
	public void showDhaka(View v) {
		Intent intent = new Intent(this, TrainUpkEx.class);
		startActivity(intent);
		
	}
}
