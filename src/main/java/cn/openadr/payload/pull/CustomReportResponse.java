package cn.openadr.payload.pull;

import cn.openadr.model.report.ReportSpecifier;
import cn.openadr.payload.DRResponse;

/** 由UN向DN发起的注册自定义报表响应 */
public class CustomReportResponse extends DRResponse<PollRequest> {
	private static final long serialVersionUID = 1L;

	/** 报表规范 */
	private final ReportSpecifier reportSpecifier = new ReportSpecifier();

	public CustomReportResponse(PollRequest request) {
		super(request);
	}

	public ReportSpecifier getReportSpecifier() {
		return reportSpecifier;
	}
}
