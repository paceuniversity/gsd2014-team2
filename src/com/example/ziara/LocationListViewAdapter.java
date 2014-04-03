package com.example.ziara;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LocationListViewAdapter extends ArrayAdapter<LocationItem> {

	Context context;

	public LocationListViewAdapter(Context context, int resourceId,
			List<LocationItem> items) {
		super(context, resourceId, items);
		this.context = context;
	}

	/* private view holder class */
	private class ViewHolder {
		ImageView imageView;
		TextView txtName;
		//TextView txtDesc;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder = null;
		LocationItem rowItem = getItem(position);

		LayoutInflater mInflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.row_layout, null);
			holder = new ViewHolder();
			//holder.txtDesc = (TextView) convertView.findViewById(R.id.desc);
			holder.txtName = (TextView) convertView.findViewById(R.id.title);
			holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
			convertView.setTag(holder);
		} else
			holder = (ViewHolder) convertView.getTag();

		//holder.txtDesc.setText(rowItem.getDesc());
		holder.txtName.setText(rowItem.getName());
		holder.imageView.setImageResource(rowItem.getImageId());

		return convertView;
	}
}