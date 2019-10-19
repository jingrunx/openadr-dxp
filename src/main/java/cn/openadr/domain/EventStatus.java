package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

public enum EventStatus implements EnumeratedType {
	/**
	 * 无
	 */
	NONE("none"),
	/**
	 * 准备
	 */
	FAR("far"),
	/**
	 * 就绪
	 */
	NEAR("near"),
	/**
	 * 激活
	 */
	ACTIVE("active"),
	/**
	 * 完成
	 */
	COMPLETED("completed"),
	/**
	 * 取消
	 */
	CANCELLED("cancelled");

	private final String value;

	EventStatus(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}

	public static class EventStatusDeserializer extends EnumeratedDeserializer<EventStatus> {
		public EventStatusDeserializer() {
			super(EventStatus.class);
		}
	}
}
