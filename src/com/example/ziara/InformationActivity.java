package com.example.ziara;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InformationActivity extends Activity {

	String locationArray[];
	int value;
	TextView locationName, history, geography, wildlife;
	ImageView locationImage;
	String historyString, geographyString, wildlifeString;
	//String value;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.information_main);

		locationName = (TextView) findViewById(R.id.locationName);
		history = (TextView) findViewById(R.id.history);
		geography = (TextView) findViewById(R.id.geography);
		wildlife = (TextView) findViewById(R.id.wildlife);
		locationImage = (ImageView) findViewById(R.id.locationImage);
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			value = extras.getInt("POSITION");
			//Converts the int to a string so you can TOAST it since int does not work
			//value = String.valueOf(extras.getInt("POSITION"));
		}
		Bundle extras2 = getIntent().getExtras();
		locationArray = extras2.getStringArray("STRING_ARRAY");
		locationName.setText(locationArray[value]);
		
		
		//Toast.makeText(getApplicationContext(), locationArray[value], Toast.LENGTH_LONG).show();

		switch(value) {
			case 0:
				historyString = getResources().getString(R.string.location1history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.zanzibardesert);
				geographyString = getResources().getString(R.string.location1geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location1wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 1:
				historyString = getResources().getString(R.string.location2history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.zanzibarbeach);
				geographyString = getResources().getString(R.string.location2geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location2wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 2:
				break;
			case 3:
				break;
		}
		
		//Toast.makeText(getApplicationContext(), value, Toast.LENGTH_LONG).show();
	}
}