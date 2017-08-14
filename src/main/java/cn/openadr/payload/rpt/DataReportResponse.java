package cn.openadr.payload.rpt;

public class DataReportResponse extends ReportResponse<DataReportRequest> {
	private static final long serialVersionUID = 1L;

	public DataReportResponse(DataReportRequest request) {
		super(request);
	}

	public String getReportSpecifierID() {
		return request.getReportSpecifierID();
	}
}
