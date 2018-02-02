package cn.openadr.model.report;

import java.io.Serializable;

import org.joda.time.DateTime;

import cn.openadr.domain.ReportName;

// OadrReportType
public class MetaDataReport implements Serializable {
	private static final long serialVersionUID = 1L;

	private ReportName reportName;
	private DateTime createdDateTime;
	private final ReportDescription reportDescription = new ReportDescription();

	public ReportName getReportName() {
		return reportName;
	}

	public void setReportName(ReportName reportName) {
		this.reportName = reportName;
	}

	public DateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(DateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public ReportDescription getReportDescription() {
		return reportDescription;
	}
}
