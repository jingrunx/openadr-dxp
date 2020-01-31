package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

public enum QualityType implements EnumeratedType {
	QUALITY_GOOD("DataQuality Good"),
	NO_NEW_VALUE("No New Value"),
	QUALITY_BAD("DataQuality Bad"),
	QUALITY_UNCERTAIN("DataQuality Uncertain"),
	QUALITY_LIMIT("DataQuality Limit"),
	NO_QUALITY("No DataQuality");

	private final String value;

	QualityType(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}

	public static class Deserializer extends EnumeratedDeserializer<QualityType> {
		public Deserializer() {
			super(QualityType.class);
		}
	}
}
