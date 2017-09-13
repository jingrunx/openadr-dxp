package cn.openadr.payload.rpt;

public class DataReportResponse extends ReportResponse<DataReportRequest> {
	private static final long serialVersionUID = 1L;

	private final String reportSpecifierID;

	public DataReportResponse(DataReportRequest request) {
		super(request);

		this.reportSpecifierID = request.getReportSpecifierID();
	}

	public String getReportSpecifierID() {
		return reportSpecifierID;
	}
}
