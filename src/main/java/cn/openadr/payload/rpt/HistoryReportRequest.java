package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.PointValues;

public class HistoryReportRequest extends DataReportRequest {
	private static final long serialVersionUID = 1L;

	private final List<PointValues> values = new ArrayList<>();

	public List<PointValues> getValues() {
		return values;
	}
}
