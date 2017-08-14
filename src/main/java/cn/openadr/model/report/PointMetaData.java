package cn.openadr.model.report;

import java.util.EnumMap;
import java.util.Map;

import cn.openadr.tsdb.TagKey;

/** 采样点元数据 */
public class PointMetaData {
	/** 测点规范 */
	private final MetricMetaData metric = new MetricMetaData();
	/** 设备编号/名称 */
	private final Map<TagKey, Map.Entry<String, String>> tags = new EnumMap<>(TagKey.class);
	/** 采样周期 */
	private final SamplingRate samplingRate = new SamplingRate();

	public MetricMetaData getMetric() {
		return metric;
	}

	public Map<TagKey, Map.Entry<String, String>> getTags() {
		return tags;
	}

	public SamplingRate getSamplingRate() {
		return samplingRate;
	}
}
