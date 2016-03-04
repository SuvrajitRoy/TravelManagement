package com.cste.nstu06.suvro.travelmanagement;


import android.os.Bundle;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.view.animation.AnimationUtils;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {
	ViewPager pager;
	DummyAdapter adapter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ActionBar actionBar = getSupportActionBar();

		
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		//actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2DA1F2")));
		
				
		
		adapter = new DummyAdapter(getSupportFragmentManager());
		
		pager = (ViewPager) findViewById(R.id.pager);
		pager.setAdapter(adapter);
		
		pager.startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
		
	//	pager.startAnimation(AnimationUtils.loadAnimation(Train.class, R.anim.left_in));
		
		actionBar.addTab(actionBar.newTab().setText("BUS").setTabListener(tablistener));
		actionBar.addTab(actionBar.newTab().setText("TRAIN").setTabListener(tablistener));
		
		
		

	}
	
public ActionBar.TabListener tablistener = new ActionBar.TabListener() {
		


    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {
        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

    }
};
	
public class DummyAdapter extends FragmentPagerAdapter{
		
		public DummyAdapter (FragmentManager fm){
			super(fm);
			
		}

		@Override
		public Fragment getItem(int position) {
			Fragment fragment = null;
	        switch (position) {
			case 0:
				fragment = new Bus();
				break;
			case 1:
				fragment = new Train();
				break;
			

			default:
				break;
			}
			return fragment;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 2;
		}


}	
}
