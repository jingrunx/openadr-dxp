package cn.openadr.model.report;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

// OadrReportRequestType
public class ReportRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	private String reportRequestID;
	@NotNull
	private final ReportSpecifier reportSpecifier = new ReportSpecifier();

	public String getReportRequestID() {
		return reportRequestID;
	}

	public void setReportRequestID(String reportRequestID) {
		this.reportRequestID = reportRequestID;
	}

	public ReportSpecifier getReportSpecifier() {
		return reportSpecifier;
	}
}
