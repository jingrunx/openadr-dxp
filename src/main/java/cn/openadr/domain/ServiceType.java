package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

public enum ServiceType implements EnumeratedType {
	REGISTER("Register"),
	EVENT("Event"),
	REPORT("Report"),
	OPT("Opt"),
	POLL("Poll");

	private final String value;

	ServiceType(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}

	public static class ServiceTypeDeserializer extends EnumeratedDeserializer<ServiceType> {
		public ServiceTypeDeserializer() {
			super(ServiceType.class);
		}
	}
}
