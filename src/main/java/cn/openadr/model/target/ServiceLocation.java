package cn.openadr.model.target;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

@lombok.Getter
@lombok.Setter
public class ServiceLocation implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@JsonUnwrapped
	public GeoPolygon geoPolygon;
}
