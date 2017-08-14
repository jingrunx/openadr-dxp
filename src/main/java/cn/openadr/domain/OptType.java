package cn.openadr.domain;

public enum OptType implements EnumeratedType {
	OPT_IN("optIn"), OPT_OUT("optOut");

	private final String value;

	private OptType(String paramString) {
		this.value = paramString;
	}

	@Override
	public String value() {
		return value;
	}
}
