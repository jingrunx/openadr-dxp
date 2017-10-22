package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

public enum ServiceName implements EnumeratedType {
	EI_REGISTER_PARTY("EiRegisterParty"), //
	EI_EVENT("EiEvent"), //
	EI_OPT("EiOpt"), //
	EI_REPORT("EiReport"), //
	EI_POLL("EiPoll");

	private final String value;

	private ServiceName(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}

	public static class ServiceNameDeserializer extends EnumeratedDeserializer<ServiceName> {
		public ServiceNameDeserializer() {
			super(ServiceName.class);
		}
	}
}
