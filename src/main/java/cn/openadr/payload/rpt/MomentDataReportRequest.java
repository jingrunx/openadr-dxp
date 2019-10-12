package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.PointData;

public class MomentDataReportRequest extends DataReportRequest {
	private static final long serialVersionUID = 1L;

	private final List<PointData> pointData = new ArrayList<>();

	public void addPointData(PointData value) {
		this.pointData.add(value);
	}

	public List<PointData> getPointData() {
		return pointData;
	}
}
