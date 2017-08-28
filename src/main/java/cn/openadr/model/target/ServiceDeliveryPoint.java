package cn.openadr.model.target;

import cn.openadr.domain.GeoPoint;

public class ServiceDeliveryPoint extends Node implements GeoPoint {
	private static final long serialVersionUID = 1L;

	private double Latitude;
	private double longitude;
	private String location;

	public ServiceDeliveryPoint() {
		super();
	}

	public ServiceDeliveryPoint(String id) {
		super(id);
	}

	@Override
	public double getLatitude() {
		return Latitude;
	}

	public void setLatitude(double latitude) {
		Latitude = latitude;
	}

	@Override
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
