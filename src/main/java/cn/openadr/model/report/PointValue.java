package cn.openadr.model.report;

import java.util.Map;

import cn.openadr.tsdb.Point;
import cn.openadr.tsdb.TagKey;
import cn.openadr.tsdb.ValuePart;

public class PointValue extends Point {
	private static final long serialVersionUID = 1L;

	private final ValuePart value = new ValuePart();

	public PointValue() {
		super();
	}

	public PointValue(String metric, Map<TagKey, String> tags) {
		super(metric, tags);
	}

	public ValuePart getValue() {
		return value;
	}
}
