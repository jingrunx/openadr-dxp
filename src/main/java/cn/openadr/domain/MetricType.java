package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/**
 * Author: jrxian
 * Date: 2019-10-18 10:41
 */
public enum MetricType implements EnumeratedType {
	IA, IB, IC, U,
	UA, UB, UC, UAB, UBC, UCA,
	AP, PAP, RAP, RP, PRP, RRP,
	S, F, PF,
	AP_E, PAP_E, RAP_E,
	RP_E, PRP_E, RRP_E,
	SP_E,
	AP_R, PAP_R, RAP_R,
	RP_R, PRP_R, RRP_R,
	SP_R;

	@Override
	public String value() {
		return name();
	}

	public static class Deserializer extends EnumeratedDeserializer<MetricType> {
		public Deserializer() {
			super(MetricType.class);
		}
	}
}
