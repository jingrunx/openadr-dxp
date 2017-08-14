package cn.openadr.payload.rpt;

public class CapabilityReportResponse extends ReportResponse<CapabilityReportRequest> {
	private static final long serialVersionUID = 1L;

	public CapabilityReportResponse(CapabilityReportRequest request) {
		super(request);
	}

	public String getCapabilitySpecifierID() {
		return request.getCapabilitySpecifier()
			.getId();
	}
}
