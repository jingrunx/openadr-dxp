package cn.openadr.payload.rpt;

import cn.openadr.model.report.ReportSpecifier;

/** 由DN主动创建的或者由UN发起创建的报告，作为定期传送数据的规范 */
public class CreateReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	/** 报表规范 */
	private final ReportSpecifier reportSpecifier = new ReportSpecifier();

	public ReportSpecifier getReportSpecifier() {
		return reportSpecifier;
	}
}
