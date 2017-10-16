package cn.openadr.payload.rpt;

/** 由UN发起，要求DN按照规范要求创建的自定义报表 */
public class CreateReportResponse extends ReportResponse<CreateReportRequest> {
	private static final long serialVersionUID = 1L;

	private final String reportSpecifierID;

	public CreateReportResponse(CreateReportRequest request) {
		super(request);

		this.reportSpecifierID = request.getReportSpecifier()
			.getReportSpecifierID();
	}

	public String getReportSpecifierID() {
		return reportSpecifierID;
	}
}
