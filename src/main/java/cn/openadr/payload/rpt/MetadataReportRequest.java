package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.PointMetaData;

/** 元数据报告，由终端向主站报送拥有的资源和资源模型，定义的测点rID */
public class MetadataReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	/** 要报告的测点及数据类型 */
	private final List<PointMetaData> points = new ArrayList<>();

	public List<PointMetaData> getPoints() {
		return points;
	}
}
