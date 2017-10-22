package cn.openadr.model.report;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import cn.openadr.domain.ReportName;

// OadrReportType
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;

	private String reportID;
	private ReportName reportName;
	private String reportRequestID;
	private String reportSpecifierID;
	private DateTime createdDateTime;
	private final List<ReportDescription> reportDescription = new ArrayList<>();

	public String getReportID() {
		return reportID;
	}

	public void setReportID(String reportID) {
		this.reportID = reportID;
	}

	public ReportName getReportName() {
		return reportName;
	}

	public void setReportName(ReportName reportName) {
		this.reportName = reportName;
	}

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

	public List<ReportDescription> getReportDescription() {
		return reportDescription;
	}
}
