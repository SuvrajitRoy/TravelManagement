package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DemoTrain extends Activity{
	TextView tv1,tv2,tv3;
	View v1,v2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo_train);
		v1 = findViewById(R.id.viewDemo1);
		v2 = findViewById(R.id.viewDemo2);
		tv1=  (TextView) findViewById(R.id.tvDemo1);
		tv2=  (TextView) findViewById(R.id.tvDemo2);
		tv3= (TextView) findViewById(R.id.tvDemo3);
	}
	
	
}
