package cn.openadr.domain;

public enum ReportName implements EnumeratedType {
	METADATA_HISTORY_USAGE, //
	HISTORY_USAGE, //
	METADATA_HISTORY_GREENBUTTON, //
	HISTORY_GREENBUTTON, //
	METADATA_TELEMETRY_USAGE, //
	TELEMETRY_USAGE, //
	METADATA_TELEMETRY_STATUS, //
	TELEMETRY_STATUS;

	@Override
	public String value() {
		return name();
	}
}
