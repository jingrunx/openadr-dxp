package cn.openadr.tsdb;

import java.util.EnumMap;
import java.util.Map;

public class PointLimit extends LimitPart {
	private static final long serialVersionUID = 1L;

	private String metric;
	private final Map<TagKey, String> tags = new EnumMap<>(TagKey.class);

	public PointLimit() {
		super();
	}

	public PointLimit(String metric, Map<TagKey, String> tags) {
		super();

		this.metric = metric;
		this.tags.putAll(tags);
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public Map<TagKey, String> getTags() {
		return tags;
	}
}
