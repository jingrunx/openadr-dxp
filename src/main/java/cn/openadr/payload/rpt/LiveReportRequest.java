package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.tsdb.PointValue;

public class LiveReportRequest extends DataReportRequest {
	private static final long serialVersionUID = 1L;

	private final List<PointValue> values = new ArrayList<>();

	public List<PointValue> getValues() {
		return values;
	}
}
