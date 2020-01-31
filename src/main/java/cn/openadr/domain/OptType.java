package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

public enum OptType implements EnumeratedType {
	OPT_IN("optIn"), OPT_OUT("optOut");

	private final String value;

	OptType(String paramString) {
		this.value = paramString;
	}

	@Override
	public String value() {
		return value;
	}

	public static class Deserializer extends EnumeratedDeserializer<OptType> {
		public Deserializer() {
			super(OptType.class);
		}
	}
}
