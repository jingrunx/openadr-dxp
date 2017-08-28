package cn.openadr.payload.rpt;

import cn.openadr.model.report.AbilitySpecifier;

public class AbilityReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	private final AbilitySpecifier abilitySpecifier = new AbilitySpecifier();

	public AbilitySpecifier getAbilitySpecifier() {
		return abilitySpecifier;
	}
}
