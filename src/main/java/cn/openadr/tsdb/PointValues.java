package cn.openadr.tsdb;

import java.util.AbstractMap;

public class PointValues extends AbstractMap.SimpleEntry<Point, ValuesPart> {
	private static final long serialVersionUID = 1L;

	public PointValues(Point key, ValuesPart value) {
		super(key, value);
	}
}
