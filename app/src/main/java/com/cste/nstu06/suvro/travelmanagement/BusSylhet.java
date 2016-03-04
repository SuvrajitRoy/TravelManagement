package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class BusSylhet extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bussylhet);
		(findViewById(R.id.button1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
	}
	public void brtc(View v) {
		Intent intent = new Intent(this, BusBrtc.class);
		startActivity(intent);
		
	}

}
