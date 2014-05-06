package com.example.ziara;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {

	public static final String[] name = new String[] { "Mtoni Palace Ruins",
			"Paje Beach", "Mangapwani Slave Chamber", "Palace Museum",
			"Kijichi Persian Baths", "Living Stone House",
			"Minara Miwili Church", "Kanisa la Mkunazini", "Beit al Ajaib",
			"Maruhubi Palace Ruins", "Ngome Kongwe", "Old Indian Dispensary" };

	public static final int[] locationId = new int[name.length];

	public static final Integer[] image = { R.drawable.forest,
			R.drawable.sandle, R.drawable.camera, R.drawable.tent,
			R.drawable.camera, R.drawable.camera, R.drawable.forest,
			R.drawable.tent, R.drawable.tent, R.drawable.camera,
			R.drawable.tent, R.drawable.camera, };

	ListView listView;
	List<LocationItem> locationItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		locationItem = new ArrayList<LocationItem>();
		for (int i = 0; i < name.length; i++) {
			LocationItem item = new LocationItem(locationId[i], image[i],
					name[i]);
			locationItem.add(item);
		}

		listView = (ListView) findViewById(R.id.list);
		LocationListViewAdapter adapter = new LocationListViewAdapter(this,
				R.layout.row_layout, locationItem);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		Intent intent = new Intent(getApplicationContext(),
				InformationActivity.class);
		Bundle bundle = new Bundle();
		bundle.putStringArray("STRING_ARRAY", name);
		bundle.putInt("POSITION", position);
		intent.putExtras(bundle);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.exit) {
			System.exit(0);
		} else if (id == R.id.aboutus) {
			Intent intent = new Intent(getApplicationContext(),
					AboutUsActivity.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}
	
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
