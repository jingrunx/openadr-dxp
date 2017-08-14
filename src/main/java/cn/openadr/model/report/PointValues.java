package cn.openadr.model.report;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;

import cn.openadr.tsdb.IrregularPart;
import cn.openadr.tsdb.RegularPart;
import cn.openadr.tsdb.TagKey;

public class PointValues implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 测点 */
	private String metric;
	/** 用户|设施|能耗目录|设备 */
	private final Map<TagKey, String> tags = new EnumMap<>(TagKey.class);
	/** 规则数据，各数据之间间隔相同 */
	private final RegularPart regular = new RegularPart();
	/** 不规则数据，各数据之间间隔不同 */
	private final IrregularPart irregular = new IrregularPart();

	public PointValues() {
		super();
	}

	public PointValues(String metric, Map<TagKey, String> tags) {
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

	public RegularPart getRegular() {
		return regular;
	}

	public IrregularPart getIrregular() {
		return irregular;
	}
}
