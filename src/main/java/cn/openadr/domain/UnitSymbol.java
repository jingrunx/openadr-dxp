package cn.openadr.domain;

/** 单元符号 */
public enum UnitSymbol {
	/** Dimension less quantity */
	none("Dimension less quantity"),
	/** 伏安 */
	VA("Apparent power in volt ampere"),
	/** 瓦 */
	W("Active power in watt"),
	/** 乏 */
	VAr("Reactive power in volt ampere reactive"),
	/** 伏安时 */
	VAh("Apparent energy in volt ampere hours"),
	/** 瓦时 */
	Wh("Real energy in what hours"),
	/** 乏时 */
	VArh("Reactive energy in volt ampere hours"),
	/** 伏 */
	V("Voltage in volt"),
	/** 欧姆 */
	ohm("Resistance in ohm"),
	/** 安 */
	A("Current in ampere"),
	/** Capacitance in farad */
	F("Capacitance in farad"),
	/** Inductance in henry */
	H("Inductance in henry"),
	/** Relative temperature in degrees Celsius */
	c("Relative temperature in degrees Celsius"),
	/** Time in seconds */
	s("Time in seconds"),
	/** Time in minutes */
	min("Time in minutes"),
	/** Time in hours */
	h("Time in hours"),
	/** Plane angle in degrees */
	deg("Plane angle in degrees"),
	/** Plane angle in radians */
	rad("Plane angle in radians"),
	/** Energy in joule */
	J("Energy in joule"),
	/** Force in newton */
	N("Force in newton"),
	/** Conductance in siemens */
	S("Conductance in siemens"),
	/** Frequency in hertz */
	Hz("Frequency in hertz"),
	/** Mass in kilogram */
	kg("Mass in kilogram"),
	/** Pressure in pascal (n/m2) */
	Pa("Pressure in pascal (n/m2)"),
	/** Length in meter */
	m("Length in meter"),
	/** Area in square meters */
	m2("Area in square meters"),
	/** Volume in cubic meters */
	m3("Volume in cubic meters"),
	/** Volt per volt ampere reactive */
	V_VAr("Volt per volt ampere reactive"),
	/** Watt per hertz */
	W_Hz("Watt per hertz"),
	/** Joule per second */
	J_s("Joule per second"),
	/** per second */
	s_1("per second"),
	/** Mass per energy */
	kg_J("Mass per energy"),
	/** Watt per second */
	W_s("Watt per second");

	public final String literal;

	private UnitSymbol(String literal) {
		this.literal = literal;
	}

	public static UnitSymbol valueOf(int value) {
		for (UnitSymbol i : values()) {
			if (i.ordinal() == value)
				return i;
		}
		return none;
	}
}
