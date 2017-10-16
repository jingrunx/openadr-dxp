package cn.openadr.payload.poll;

import cn.openadr.model.report.ReportSpecifier;

/** 由UN向DN发起的注册自定义报表响应 */
public class PendingReportResponse extends PollResponse {
	private static final long serialVersionUID = 1L;

	/** 报表规范 */
	private final ReportSpecifier reportSpecifier = new ReportSpecifier();

	public PendingReportResponse(PollRequest request) {
		super(request);
	}

	public ReportSpecifier getReportSpecifier() {
		return reportSpecifier;
	}
}
