package cn.openadr.payload.rpt;

public class AbilityReportResponse extends ReportResponse {
	private static final long serialVersionUID = 1L;

	private final String abilitySpecifierID;

	public AbilityReportResponse(AbilityReportRequest request) {
		super(request);

		this.abilitySpecifierID = request.getAbilitySpecifier()
			.getId();
	}

	public String getCapabilitySpecifierID() {
		return abilitySpecifierID;
	}
}
