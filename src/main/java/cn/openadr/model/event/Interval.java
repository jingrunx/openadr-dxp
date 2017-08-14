package cn.openadr.model.event;

import java.io.Serializable;

import cn.openadr.model.report.MetricMetaData;
import cn.openadr.tsdb.IrregularPart;
import cn.openadr.tsdb.RegularPart;

public class Interval implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 测点定义 */
	private final MetricMetaData metric = new MetricMetaData();
	/** 规则数据 */
	private final RegularPart regular = new RegularPart();
	/** 不规则数据 */
	private final IrregularPart irregular = new IrregularPart();

	public MetricMetaData getMetric() {
		return metric;
	}

	public RegularPart getRegular() {
		return regular;
	}

	public IrregularPart getIrregular() {
		return irregular;
	}
}
