package cn.openadr.model.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.MetricMetaData;
import cn.openadr.tsdb.CurveData;

/** 基线 */
public class EventBaseline implements Serializable {
	private static final long serialVersionUID = 1L;

	private String baselineID;
	private String baselineName;
	private final MetricMetaData metric = new MetricMetaData();
	private final List<String> resourceID = new ArrayList<>();
	private final CurveData intervals = new CurveData();

	public String getBaselineID() {
		return baselineID;
	}

	public void setBaselineID(String baselineID) {
		this.baselineID = baselineID;
	}

	public String getBaselineName() {
		return baselineName;
	}

	public void setBaselineName(String baselineName) {
		this.baselineName = baselineName;
	}

	public MetricMetaData getMetric() {
		return metric;
	}

	public List<String> getResourceID() {
		return resourceID;
	}

	public CurveData getIntervals() {
		return this.intervals;
	}
}
