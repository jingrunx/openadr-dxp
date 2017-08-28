package cn.openadr.payload.rpt;

import cn.openadr.payload.DRRequest;

public class ReportRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	/** 报表请求编号 */
	private String reportRequestID;

	public String getReportRequestID() {
		return reportRequestID;
	}

	public void setReportRequestID(String reportRequestID) {
		this.reportRequestID = reportRequestID;
	}
}
