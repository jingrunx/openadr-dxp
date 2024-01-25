package cn.openadr.model.target;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@lombok.Getter
@lombok.Setter
public class GeoPolygon implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<GeoPoint> polygon = new ArrayList<>();
}
