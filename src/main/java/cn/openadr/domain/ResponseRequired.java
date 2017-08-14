package cn.openadr.domain;

public enum ResponseRequired implements EnumeratedType {
	ALWAYS("always"), NEVER("never");

	private final String value;

	ResponseRequired(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}
}
