package cn.openadr.payload.rpt;

import cn.openadr.model.report.ReportSpecifier;

/** 固定格式报表 */
public class RegisterReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	/** 报表规范 */
	private final ReportSpecifier reportSpecifier = new ReportSpecifier();

	public ReportSpecifier getReportSpecifier() {
		return reportSpecifier;
	}
}
