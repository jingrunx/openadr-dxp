package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

public enum ReportName implements EnumeratedType {
	METADATA_HISTORY_USAGE,
	HISTORY_USAGE,
	METADATA_HISTORY_GREENBUTTON,
	HISTORY_GREENBUTTON,
	METADATA_TELEMETRY_USAGE,
	TELEMETRY_USAGE,
	METADATA_TELEMETRY_STATUS,
	TELEMETRY_STATUS;

	@Override
	public String value() {
		return name();
	}

	public static ReportName fromString(String value) {
		for(ReportName reportName : values()) {
			if(0 == String.CASE_INSENSITIVE_ORDER.compare(reportName.name(), value)) {
				return reportName;
			}
		}
		return null;
	}

	public static class Deserializer extends EnumeratedDeserializer<ReportName> {
		public Deserializer() {
			super(ReportName.class);
		}
	}
}
