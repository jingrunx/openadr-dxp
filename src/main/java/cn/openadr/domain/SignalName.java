package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

public enum SignalName implements EnumeratedType {
	SIMPLE,
	ELECTRICITY_PRICE,
	ENERGY_PRICE,
	DEMAND_CHARGE,
	BID_PRICE,
	BID_LOAD,
	BID_ENERGY,
	CHARGE_STATE,
	LOAD_DISPATCH,
	LOAD_CONTROL;

	@Override
	public String value() {
		return name();
	}

	public static SignalName fromString(String value) {
		for(SignalName signalName : values()) {
			if(0 == String.CASE_INSENSITIVE_ORDER.compare(signalName.name(), value)) {
				return signalName;
			}
		}
		return null;
	}

	public static class Deserializer extends EnumeratedDeserializer<SignalName> {
		public Deserializer() {
			super(SignalName.class);
		}
	}
}
