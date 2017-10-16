package cn.openadr.payload.poll;

/** 要求DN主动报送报告 */
public class UpdateReportResponse extends PollResponse {
	private static final long serialVersionUID = 1L;

	/** @see cn.openadr.model.report.ReportSpecifier */
	private String reportSpecifierID;

	public UpdateReportResponse(PollRequest request) {
		super(request);
	}

	public String getReportSpecifierID() {
		return reportSpecifierID;
	}

	public void setReportSpecifierID(String reportSpecifierID) {
		this.reportSpecifierID = reportSpecifierID;
	}
}
