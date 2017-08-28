package cn.openadr.payload.rpt;

public class AbilityReportResponse extends ReportResponse<AbilityReportRequest> {
	private static final long serialVersionUID = 1L;

	public AbilityReportResponse(AbilityReportRequest request) {
		super(request);
	}

	public String getCapabilitySpecifierID() {
		return request.getAbilitySpecifier()
			.getId();
	}
}
