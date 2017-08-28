package cn.openadr.payload.rpt;

import cn.openadr.model.report.AbilitySpecifier;

public class CapabilityReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	private final AbilitySpecifier capabilitySpecifier = new AbilitySpecifier();

	public AbilitySpecifier getCapabilitySpecifier() {
		return capabilitySpecifier;
	}
}
