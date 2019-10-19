package cn.openadr.model.target;

import java.util.List;

public class GeoPolygon {
	public List<GeoPoint> polygon;

	public List<GeoPoint> getPolygon() {
		return polygon;
	}

	public void setPolygon(List<GeoPoint> polygon) {
		this.polygon = polygon;
	}
}
