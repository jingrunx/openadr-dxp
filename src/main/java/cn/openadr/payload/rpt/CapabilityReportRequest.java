package cn.openadr.payload.rpt;

import cn.openadr.model.report.CapabilitySpecifier;

public class CapabilityReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	private final CapabilitySpecifier capabilitySpecifier = new CapabilitySpecifier();

	public CapabilitySpecifier getCapabilitySpecifier() {
		return capabilitySpecifier;
	}
}
