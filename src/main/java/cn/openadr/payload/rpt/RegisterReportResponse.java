package cn.openadr.payload.rpt;

public class RegisterReportResponse extends ReportResponse<RegisterReportRequest> {
	private static final long serialVersionUID = 1L;

	public RegisterReportResponse(RegisterReportRequest request) {
		super(request);
	}

	public String getReportSpecifierID() {
		return request.getReportSpecifier()
			.getId();
	}
}
