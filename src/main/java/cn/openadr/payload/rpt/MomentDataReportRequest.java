package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.PointData;

@lombok.Getter
public class MomentDataReportRequest extends DataReportRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<PointData> pointData = new ArrayList<>();

	public void addPointData(PointData value) {
		this.pointData.add(value);
	}
}
