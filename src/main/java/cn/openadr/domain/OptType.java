package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

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

	public static class OptTypeDeserializer extends EnumeratedDeserializer<OptType> {
		public OptTypeDeserializer() {
			super(OptType.class);
		}
	}
}
