package cn.openadr.model.target;

import java.io.Serializable;

public class GeoPoint implements Serializable {
	private static final long serialVersionUID = 1L;

	private double Latitude;
	private double longitude;
	private String location;

	public double getLatitude() {
		return Latitude;
	}

	public void setLatitude(double latitude) {
		Latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
