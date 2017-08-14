package cn.openadr.domain;

public enum QualityType implements EnumeratedType {
	QUALITY_GOOD("Quality Good"), //
	NO_NEW_VALUE("No New Value"), //
	QUALITY_BAD("Quality Bad"), //
	QUALITY_UNCERTAIN("Quality Uncertain"), //
	QUALITY_LIMIT("Quality Limit"), //
	NO_QUALITY("No Quality");

	private final String value;

	private QualityType(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}
}
