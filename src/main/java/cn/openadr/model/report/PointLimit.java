package cn.openadr.model.report;

import java.util.Map;

import cn.openadr.tsdb.LimitPart;
import cn.openadr.tsdb.Point;
import cn.openadr.tsdb.TagKey;

public class PointLimit extends Point {
	private static final long serialVersionUID = 1L;

	private final LimitPart limit = new LimitPart();

	public PointLimit() {
		super();
	}

	public PointLimit(String metric, Map<TagKey, String> tags) {
		super(metric, tags);
	}

	public LimitPart getLimit() {
		return limit;
	}
}
