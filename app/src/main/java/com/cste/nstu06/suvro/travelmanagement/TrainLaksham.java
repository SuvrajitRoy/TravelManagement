package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrainLaksham extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.trainlaksham);
	}

	public void showLaksham(View v) {
		Intent intent = new Intent(this, TrainSomotot.class);
		startActivity(intent);
		
	}
}
