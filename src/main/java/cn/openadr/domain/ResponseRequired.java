package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

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

	public static class Deserializer extends EnumeratedDeserializer<ResponseRequired> {
		public Deserializer() {
			super(ResponseRequired.class);
		}
	}
}
