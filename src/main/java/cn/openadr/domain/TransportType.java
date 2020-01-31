package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/**
 * 传输类型
 */
public enum TransportType implements EnumeratedType {
	REST, MQTT;

	@Override
	public String value() {
		return name();
	}

	public static class Deserializer extends EnumeratedDeserializer<TransportType> {
		public Deserializer() {
			super(TransportType.class);
		}
	}
}
