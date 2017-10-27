package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.MetaDataReport;
import cn.openadr.payload.DNRequest;

// OadrRegisterReportType
public class RegisterReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private String reportRequestID;
	private final List<MetaDataReport> report = new ArrayList<>();

	public List<MetaDataReport> getReport() {
		return report;
	}

	public String getReportRequestID() {
		return reportRequestID;
	}

	public void setReportRequestID(String reportRequestID) {
		this.reportRequestID = reportRequestID;
	}
}
