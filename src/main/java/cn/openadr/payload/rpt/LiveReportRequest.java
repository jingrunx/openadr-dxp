package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.PointData;

public class LiveReportRequest extends DataReportRequest {
	private static final long serialVersionUID = 1L;

	private final List<PointData> values = new ArrayList<>();

	public List<PointData> getValues() {
		return values;
	}
}
