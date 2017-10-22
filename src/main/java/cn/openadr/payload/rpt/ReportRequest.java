package cn.openadr.payload.rpt;

import cn.openadr.payload.DNRequest;

public abstract class ReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private String reportRequestID;

	public String getReportRequestID() {
		return reportRequestID;
	}

	public void setReportRequestID(String reportRequestID) {
		this.reportRequestID = reportRequestID;
	}
}
