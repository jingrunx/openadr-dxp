package cn.openadr.domain;

public enum DataQuality2 implements EnumeratedType {
	NON_SPECIFIC(QualityType.QUALITY_GOOD, "Non Specific"),
	LOCAL_OVERRIDE(QualityType.QUALITY_GOOD, "Local Override"),
	BAD_NON_SPECIFIC(QualityType.QUALITY_BAD, "Non Specific"),
	CONFIGURATION_ERROR(QualityType.QUALITY_BAD, "Configuration Error"),
	NOT_CONNECTED(QualityType.QUALITY_BAD, "Not Connected"),
	DEVICE_FAILURE(QualityType.QUALITY_BAD, "Device Failure"),
	SENSOR_FAILURE(QualityType.QUALITY_BAD, "Sensor Failure"),
	LAST_KNOWN_VALUE(QualityType.QUALITY_BAD, "Last Known Value"),
	COMM_FAILURE(QualityType.QUALITY_BAD, "Comm Failure"),
	OUT_OF_SERVICE(QualityType.QUALITY_BAD, "Out of Service"),
	UNCERTAIN_NON_SPECIFIC(QualityType.QUALITY_UNCERTAIN, "Non Specific"),
	LAST_USABLE_VALUE(QualityType.QUALITY_UNCERTAIN, "Last Usable Value"),
	SENSOR_NOT_ACCURATE(QualityType.QUALITY_UNCERTAIN, "Sensor Not Accurate"),
	EU_UNITS_EXCEEDED(QualityType.QUALITY_UNCERTAIN, "EU Units Exceeded"),
	SUB_NORMAL(QualityType.QUALITY_UNCERTAIN, "Sub Normal"),
	FIELD_NOT(QualityType.QUALITY_LIMIT, "Field/Not"),
	FIELD_LOW(QualityType.QUALITY_LIMIT, "Field/Low"),
	FIELD_HIGH(QualityType.QUALITY_LIMIT, "Field/High"),
	FIELD_CONSTANT(QualityType.QUALITY_LIMIT, "Field/Constant"),
	PREVIOUS_VALUE_USED(QualityType.NO_NEW_VALUE, "Previous Value Used"),
	NO_VALUE(QualityType.NO_QUALITY, "No Value");

	public final QualityType type;
	private final String value;

	DataQuality2(QualityType type, String value) {
		this.type = type;
		this.value = value;
	}

	@Override
	public String value() {
		return type.value() + " - " + value;
	}
}
