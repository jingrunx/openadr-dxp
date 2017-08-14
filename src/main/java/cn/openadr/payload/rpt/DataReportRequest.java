package cn.openadr.payload.rpt;

import org.joda.time.DateTime;

/** 数据报送请求 */
public class DataReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	/** 报表规范编号 */
	private String reportSpecifierID;
	/** 生成时间 */
	private DateTime createdDateTime;

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
