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

	public static final int[] locationId = new int[] { 1, 2, 3, 4 };

	public static final String[] name = new String[] { "Mtoni Palace Ruins", "Paje Beach"};

	public static final Integer[] image = { R.drawable.blue, R.drawable.green,
			R.drawable.orange, R.drawable.red };

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
		/*Toast toast = Toast.makeText(getApplicationContext(), "Item "
				+ (position + 1) + ": " + locationItem.get(position),
				Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
		toast.show();*/
		Intent intent = new Intent(getApplicationContext(), InformationActivity.class);
		Bundle bundle = new Bundle();
		//Bundle bundle2 = new Bundle();
		bundle.putStringArray("STRING_ARRAY", name);
		bundle.putInt("POSITION", position);
		intent.putExtras(bundle);
		//intent.putExtras(bundle2);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
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
