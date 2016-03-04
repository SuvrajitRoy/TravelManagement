package com.cste.nstu06.suvro.travelmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Train extends Fragment{
	Button btndhaka ,btncomilla ,btnlaksham;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.train, container, false);
		
		
		btndhaka = (Button) view.findViewById(R.id.trainbutton1);
		btndhaka.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , TrainDhaka.class);
				startActivity(i);
			}
		});
		
		btncomilla = (Button) view.findViewById(R.id.trainbutton2);
		btncomilla.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , TrainComilla.class);
				startActivity(i);
			}
		});
		
		btnlaksham = (Button) view.findViewById(R.id.trainbutton3);
		btnlaksham.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , TrainLaksham.class);
				startActivity(i);
			}
		});
		return view;
	}
	


}
