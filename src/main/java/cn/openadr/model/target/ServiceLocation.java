package cn.openadr.model.target;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class ServiceLocation implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public GeoPolygon geoPolygon;

	@JsonUnwrapped
	public GeoPolygon getGeoPolygon() {
		return geoPolygon;
	}

	public void setGeoPolygon(GeoPolygon geoPolygon) {
		this.geoPolygon = geoPolygon;
	}
}
