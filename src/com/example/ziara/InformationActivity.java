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
		}
		Bundle extras2 = getIntent().getExtras();
		locationArray = extras2.getStringArray("STRING_ARRAY");
		locationName.setText(locationArray[value]);
		

		switch(value) {
			case 0:
				historyString = getResources().getString(R.string.location1history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.mtonipalace);
				geographyString = getResources().getString(R.string.location1geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location1wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 1:
				historyString = getResources().getString(R.string.location2history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.pajebeach);
				geographyString = getResources().getString(R.string.location2geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location2wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 2:
				historyString = getResources().getString(R.string.location3history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.slavechamber);
				geographyString = getResources().getString(R.string.location3geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location3wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 3:
				historyString = getResources().getString(R.string.location4history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.palacemuseum);
				geographyString = getResources().getString(R.string.location4geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location4wildlife);
				wildlife.setText(wildlifeString);
				break;
				
			//NEW
			case 4:
				historyString = getResources().getString(R.string.location5history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.persianbath);
				geographyString = getResources().getString(R.string.location5geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location5wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 5:
				historyString = getResources().getString(R.string.location6history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.livingstonehouse);
				geographyString = getResources().getString(R.string.location6geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location6wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 6:
				historyString = getResources().getString(R.string.location7history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.minarachurch);
				geographyString = getResources().getString(R.string.location7geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location7wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 7:
				historyString = getResources().getString(R.string.location8history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.kanisa);
				geographyString = getResources().getString(R.string.location8geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location8wildlife);
				wildlife.setText(wildlifeString);
				break;
				
				
				
			//NEW NEW
			case 8:
				historyString = getResources().getString(R.string.location9history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.beitalajaib);
				geographyString = getResources().getString(R.string.location9geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location9wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 9:
				historyString = getResources().getString(R.string.location10history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.maruhubi);
				geographyString = getResources().getString(R.string.location10geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location10wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 10:
				historyString = getResources().getString(R.string.location11history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.ngome);
				geographyString = getResources().getString(R.string.location11geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location11wildlife);
				wildlife.setText(wildlifeString);
				break;
			case 11:
				historyString = getResources().getString(R.string.location12history);
				history.setText(historyString);
				locationImage.setBackgroundResource(R.drawable.oldindian);
				geographyString = getResources().getString(R.string.location12geography);
				geography.setText(geographyString);
				wildlifeString = getResources().getString(R.string.location12wildlife);
				wildlife.setText(wildlifeString);
				break;
		}
		
		//Toast.makeText(getApplicationContext(), value, Toast.LENGTH_LONG).show();
	}
}