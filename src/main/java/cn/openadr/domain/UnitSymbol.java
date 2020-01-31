package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/**
 * 单元符号
 */
public enum UnitSymbol implements EnumeratedType {
	/**
	 * Dimension less quantity
	 */
	none("Dimension less quantity"),
	/**
	 * 频率
	 */
	Hz("Frequency in hertz"),
	/**
	 * 伏
	 */
	V("Voltage in volt"),
	/**
	 * 安
	 */
	A("Current in ampere"),
	/**
	 * 伏安
	 */
	VA("Apparent power in volt ampere"),
	/**
	 * 瓦
	 */
	W("Active power in watt"),
	/**
	 * 乏
	 */
	VAr("Reactive power in volt ampere reactive"),
	/**
	 * 伏安时
	 */
	VAh("Apparent energy in volt ampere hours"),
	/**
	 * 瓦时
	 */
	Wh("Real energy in what hours"),
	/**
	 * 乏时
	 */
	VArh("Reactive energy in volt ampere hours"),
	/**
	 * 欧姆(电阻)
	 */
	ohm("Resistance in ohm"),
	/**
	 * 法拉(电容)
	 */
	farad("Capacitance in farad"),
	/**
	 * 亨利(电感)
	 */
	henry("Inductance in henry"),
	/**
	 * 西门子(电导)
	 */
	siemens("Conductance in siemens"),
	/**
	 * 摄氏度
	 */
	C("Relative temperature in degrees Celsius"),
	/**
	 * 秒
	 */
	sec("Time in seconds"),
	/**
	 * 分
	 */
	min("Time in minutes"),
	/**
	 * 时
	 */
	hour("Time in hours"),
	/**
	 * 角度
	 */
	deg("Plane angle in degrees"),
	/**
	 * 弧度
	 */
	rad("Plane angle in radians"),
	/**
	 * 焦耳(能量)
	 */
	J("Energy in joule"),
	/**
	 * 牛(力)
	 */
	N("Force in newton"),
	/**
	 * 千克(质量)
	 */
	kg("Mass in kilogram"),
	/**
	 * 帕(压力)
	 */
	Pa("Pressure in pascal (n/m2)"),
	/**
	 * 米(长度)
	 */
	m("Length in meter"),
	/**
	 * 平方米(面积)
	 */
	m2("Area in square meters"),
	/**
	 * 立方米(体积)
	 */
	m3("Volume in cubic meters"),
	/**
	 * 伏特/伏安
	 */
	V_VAr("Volt per volt ampere reactive"),
	/**
	 * 瓦/赫兹
	 */
	W_Hz("Watt per hertz"),
	/**
	 * 焦/秒
	 */
	J_s("Joule per second"),
	/**
	 * 每秒
	 */
	s_1("per second"),
	/**
	 * 千克/焦
	 */
	kg_J("Mass per energy"),
	/**
	 * 瓦/秒
	 */
	W_s("Watt per second");

	public final String literal;

	UnitSymbol(String literal) {
		this.literal = literal;
	}

	@Override
	public String value() {
		return name();
	}

	public static UnitSymbol valueOf(int value) {
		for(UnitSymbol i : values()) {
			if(i.ordinal() == value) {
				return i;
			}
		}
		return none;
	}

	public static class Deserializer extends EnumeratedDeserializer<UnitSymbol> {
		public Deserializer() {
			super(UnitSymbol.class);
		}
	}
}
