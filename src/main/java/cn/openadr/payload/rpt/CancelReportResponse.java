package cn.openadr.payload.rpt;

public class CancelReportResponse extends ReportResponse<CancelReportRequest> {
	private static final long serialVersionUID = 1L;

	public CancelReportResponse(CancelReportRequest request) {
		super(request);
	}
}
