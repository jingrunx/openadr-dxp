package cn.openadr.model.target;

import java.io.Serializable;

public class GeoPoint implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public double Latitude;
	public double longitude;
	public String location;

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
