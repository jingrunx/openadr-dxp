package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/** 信号类别 */
public enum SignalType implements EnumeratedType {
	/** 等级 */
	LEVEL("level"),
	/** 价格 */
	PRICE("price"),
	/** 设定值 */
	SETPOINT("setpoint"),
	/** 偏移 */
	DELTA("delta"),
	/** 倍率 */
	MULTIPLIER("multiplier"),
	/** 价格倍数 */
	PRICE_MULTIPLIER("priceMultiplier"),
	/** 相对价格 */
	PRICE_RELATIVE("priceRelative"),
	/** 它指示负荷控制器在某一个水平运行，即占最大负荷消耗容量的百分比 */
	X_LOAD_CONTROL_CAPACITY("x-loadControlCapacity"),
	/** 与正常运行（0是正常运行）相关的离散整型水平 */
	X_LOAD_CONTROL_LEVEL_OFFSET("x-loadControlLevelOffset"),
	/** 负荷正常运行的百分比变化 */
	X_LOAD_CONTROL_PERCENT_OFFSET("x-loadControlPercentOffset"),
	/** 负荷控制器设定值 */
	X_LOAD_CONTROL_SETPOINT("x-loadControlSetpoint");

	private final String value;

	SignalType(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}

	public static class SignalTypeDeserializer extends EnumeratedDeserializer<SignalType> {
		public SignalTypeDeserializer() {
			super(SignalType.class);
		}
	}
}
