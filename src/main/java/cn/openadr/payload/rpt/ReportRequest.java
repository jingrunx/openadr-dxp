package cn.openadr.payload.rpt;

import cn.openadr.payload.OadrRequest;

public class ReportRequest extends OadrRequest {
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
