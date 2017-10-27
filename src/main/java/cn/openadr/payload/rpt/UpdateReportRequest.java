package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.MetaDataReport;
import cn.openadr.payload.DNRequest;

/** 数据报送请求 */
// OadrUpdateReportType
public class UpdateReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private final List<MetaDataReport> report = new ArrayList<>();

	public List<MetaDataReport> getReport() {
		return report;
	}
}
