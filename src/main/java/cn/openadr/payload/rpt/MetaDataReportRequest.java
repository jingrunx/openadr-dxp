package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.PointMetaData;

/** 报告DN支持的采样点 */
public class MetaDataReportRequest extends DataReportRequest {
	private static final long serialVersionUID = 1L;

	/** 要报告的测点及数据类型 */
	private final List<PointMetaData> points = new ArrayList<>();

	public List<PointMetaData> getPoints() {
		return points;
	}
}
