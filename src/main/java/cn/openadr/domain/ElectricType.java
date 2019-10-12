package cn.openadr.domain;

/**
 * 电力量测点
 */
public enum ElectricType {
	/**
	 * 混合
	 */
	mix("mic"),
	/**
	 * 电流
	 */
	I("current"),
	/**
	 * 电压
	 */
	U("voltage"),
	/**
	 * 频率
	 */
	Hz("frequency"),
	/**
	 * 功率因素
	 */
	PF("power.factor"),
	/**
	 * 有功功率
	 */
	P("power.active"),
	/**
	 * 无功功率
	 */
	Q("power.reactive"),
	/**
	 * 视在功率
	 */
	S("power.apparent"),
	/**
	 * 有功电能
	 */
	EP("energy.active"),
	/**
	 * 无功电能
	 */
	EQ("energy.reactive"),
	/**
	 * 视在电能
	 */
	ES("energy.apparent"),
	/**
	 * 直流模拟量
	 */
	DC("analog");

	public final String literal;

	ElectricType(String literal) {
		this.literal = literal;
	}

	public String code() {
		return name().toLowerCase();
	}
}
