package cn.openadr.domain;

/** 单位乘数 */
public enum UnitMultiplier {
	/** 皮 */
	p(-12, "Pico 10^-12"),
	/** 纳 */
	n(-9, "Nano 10^-9"),
	/** 微 */
	micro(-6, "Micro 10^-6"),
	/** 毫 */
	m(-3, "Milli 10^-3"),
	/** 厘 */
	c(-2, "Centi 10^-2"),
	/** 分 */
	d(-1, "Deci 10^-1"),
	/** - */
	none(0, "none"),
	/** 千 */
	k(3, "Kilo 10^3"),
	/** 兆 */
	M(6, "Mega 10^6"),
	/** 吉 */
	G(9, "Giga 10^9"),
	/** 特 */
	T(12, "Tera 10^12");

	public final int exp;
	public final String literal;

	private UnitMultiplier(int exp, String literal) {
		this.exp = exp;
		this.literal = literal;
	}

	public static UnitMultiplier valueOf(int value) {
		for (UnitMultiplier i : values()) {
			if (i.exp == value)
				return i;
		}
		return none;
	}
}
