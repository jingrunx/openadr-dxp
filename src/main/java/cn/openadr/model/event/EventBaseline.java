package cn.openadr.model.event;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.DRObject;
import cn.openadr.model.report.MetricMetaData;
import cn.openadr.tsdb.CurveValues;

public class EventBaseline extends DRObject {
	private static final long serialVersionUID = 1L;

	private final MetricMetaData metric = new MetricMetaData();
	private final CurveValues intervals = new CurveValues();
	private final List<String> resourceIDs = new ArrayList<>();

	public MetricMetaData getMetric() {
		return metric;
	}

	public CurveValues getIntervals() {
		return this.intervals;
	}

	public List<String> getResourceIDs() {
		return resourceIDs;
	}
}
