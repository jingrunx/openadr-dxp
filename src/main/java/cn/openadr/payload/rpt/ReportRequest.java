package cn.openadr.payload.rpt;

import cn.openadr.payload.DNResponse;

public class ReportRequest extends DNResponse {
	private static final long serialVersionUID = 1L;

	private String reportRequestID;

	public String getReportRequestID() {
		return reportRequestID;
	}

	public void setReportRequestID(String reportRequestID) {
		this.reportRequestID = reportRequestID;
	}
}
