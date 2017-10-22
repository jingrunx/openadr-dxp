package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.Report;

// OadrRegisterReportType
public class RegisterReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	private final List<Report> report = new ArrayList<>();

	public List<Report> getReport() {
		return report;
	}
}
