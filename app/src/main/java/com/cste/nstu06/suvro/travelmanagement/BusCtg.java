package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class BusCtg extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.busctg);
		
		(findViewById(R.id.btnBadhan)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		(findViewById(R.id.btnResalah)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		
	}

	public void showBadhan(View v) {
		Intent intent = new Intent(this, BusBadhan.class);
		startActivity(intent);
		
	}
	public void showResalah(View v) {
		Intent intent = new Intent(this, BusResalah.class);
		startActivity(intent);
		
	}

}
