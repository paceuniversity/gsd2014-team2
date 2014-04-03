package com.example.ziara;

public class LocationItem {
	private int locationId;
	private int imageId;
	private String name;

	public LocationItem(int locationId, int imageId, String name) {
		this.locationId = locationId;
		this.imageId = imageId;
		this.name = name;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "\n";
	}

}
