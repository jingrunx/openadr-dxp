package cn.openadr.payload.rpt;

import org.joda.time.DateTime;

import cn.openadr.payload.DNRequest;

public abstract class DataReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private String reportRequestID;
	private String reportSpecifierID;
	private DateTime createdDateTime;

	public String getReportRequestID() {
		return reportRequestID;
	}

	public void setReportRequestID(String reportRequestID) {
		this.reportRequestID = reportRequestID;
	}

	public String getReportSpecifierID() {
		return reportSpecifierID;
	}

	public void setReportSpecifierID(String reportSpecifierID) {
		this.reportSpecifierID = reportSpecifierID;
	}

	public DateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(DateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
}
