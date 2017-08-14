package cn.openadr.domain;

public enum MetricType implements EnumeratedType {
	CURRENT("current"), //
	VOLTAGE("voltage"), //
	FREQUENCY("frequency"), //

	POWER_ACTIVE("power.active"), //
	POWER_REACTIVE("power.reactive"), //
	POWER_APPARENT("power.apparent"), //

	ENERGY_ACTIVE("energy.active"), //
	ENERGY_REACTIVE("energy.reactive"), //
	ENERGY_APPARENT("energy.apparent"), //

	THERM("therm"), //
	TEMPERATURE("temperature"), //
	PLUSE("pulse"), //

	BASE_UNIT("");

	private final String value;

	private MetricType(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}
}
