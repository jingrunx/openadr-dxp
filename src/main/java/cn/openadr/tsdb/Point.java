package cn.openadr.tsdb;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

public class Point implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 测点 */
	private String metric;
	/** 用户|设施|能耗目录|设备 */
	private final Map<TagKey, String> tags = new EnumMap<>(TagKey.class);

	public Point() {
	}

	public Point(String metric, Map<TagKey, String> tags) {
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
