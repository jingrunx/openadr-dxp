package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/**
 * 选择理由
 */
public enum OptReason implements EnumeratedType {
	/**
	 * 经济
	 */
	ECONOMIC("economic"),
	/**
	 * 紧急
	 */
	EMERGENCY("emergency"),
	/**
	 * 必须
	 */
	MUST_RUN("mustRun"),
	/**
	 * 不参与
	 */
	NOT_PARTICIPATING("notParticipating"),
	/**
	 * 停运
	 */
	OUTAGE_RUN_STATUS("outageRunStatus"),
	/**
	 * 强制
	 */
	OVERRIDE_STATUS("overrideStatus"),
	/**
	 * 参与
	 */
	PARTICIPATING("participating"),
	/**
	 * 扩展：计划
	 */
	X_SCHEDULE("x-schedule");

	private final String value;

	OptReason(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}

	public static class Deserializer extends EnumeratedDeserializer<OptReason> {
		public Deserializer() {
			super(OptReason.class);
		}
	}
}
