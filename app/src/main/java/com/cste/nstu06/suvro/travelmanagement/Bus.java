package com.cste.nstu06.suvro.travelmanagement;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Bus extends Fragment {
	Button btndhk , btnctg ,btncomilla ,btnsylhet , btnfeni;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.bus, container, false);
		
		btndhk = (Button) view.findViewById(R.id.busbutton1);
		btndhk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , BusDhaka.class);
				startActivity(i);
			}
		});
		
		btnctg = (Button) view.findViewById(R.id.busbutton2);
		btnctg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , BusCtg.class);
				startActivity(i);
			}
		});
		
		btncomilla = (Button) view.findViewById(R.id.busbutton3);
		btncomilla.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , BusComilla.class);
				startActivity(i);
			}
		});
		btnsylhet = (Button) view.findViewById(R.id.busbutton4);
		btnsylhet.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , BusSylhet.class);
				startActivity(i);
			}
		});
		btnfeni = (Button) view.findViewById(R.id.busbutton5);
		btnfeni.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , BusFeni.class);
				startActivity(i);
			}
		});
		return view;
	}
	

	


}
