package cn.openadr.model.target;

import java.io.Serial;
import java.io.Serializable;

@lombok.Getter
@lombok.Setter
public class GeoPoint implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public double Latitude;
	public double longitude;
	public String location;
}
