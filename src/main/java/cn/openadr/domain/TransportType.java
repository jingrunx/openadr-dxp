package cn.openadr.domain;

public enum TransportType implements EnumeratedType {
	SIMPLE_HTTP("simpleHttp"), //
	XMPP("xmpp"), //
	JSON("json"), //
	MESSAGE("message");

	private final String value;

	private TransportType(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}
}
