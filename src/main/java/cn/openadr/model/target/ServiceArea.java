package cn.openadr.model.target;

import java.util.List;

import cn.openadr.domain.GeoPoint;
import cn.openadr.domain.GeoPolygon;

public class ServiceArea extends CimObject implements GeoPolygon {
	private static final long serialVersionUID = 1L;

	private List<GeoPoint> polygon;

	public ServiceArea() {
		super();
	}

	public ServiceArea(String id) {
		super(id);
	}

	@Override
	public List<GeoPoint> getPolygon() {
		return polygon;
	}

	public void setPolygon(List<GeoPoint> polygon) {
		this.polygon = polygon;
	}
}
