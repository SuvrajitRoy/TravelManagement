package com.cste.nstu06.suvro.travelmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;


public class BusDhaka extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.busdhaka);
		
		(findViewById(R.id.btnEkushe)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		(findViewById(R.id.btnAsia)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
		
		
		}
	
	public void showEkushe(View v) {
		Intent intent = new Intent(this, BusEkushe.class);
		startActivity(intent);
		
	}
	public void showAsia(View v) {
		Intent intent = new Intent(this, BusAsia.class);
		startActivity(intent);
		
	}

	
	}

	
	




//OnClickListener listnr = new OnClickListener() {
//@Override
//public void onClick(View v) {
//    Intent i= new Intent(getActivity(),BusDhaka.class);
//    startActivity(i);
//}
//};
//
//Button btn =(Button) view.findViewById(R.id.busbutton1);
//btn.setOnClickListener(listnr);
