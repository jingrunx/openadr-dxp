package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/** 报表类型 */
public enum ReportType implements EnumeratedType {
	READING("reading"), //
	USAGE("usage"), //
	DEMAND("demand"), //
	SET_POINT("setPoint"), //
	DELTA_USAGE("deltaUsage"), //
	DELTA_SET_POINT("deltaSetPoint"), //
	DELTA_DEMAND("deltaDemand"), //
	BASELINE("baseline"), //
	DEVIATION("deviation"), //
	AVG_USAGE("avgUsage"), //
	AVG_DEMAND("avgDemand"), //
	OPERATING_STATE("operatingState"), //
	UP_REGULATION_CAPACITY_AVAILABLE("upRegulationCapacityAvailable"), //
	DOWN_REGULATION_CAPACITY_AVAILABLE("downRegulationCapacityAvailable"), //
	REGULATION_SETPOINT("regulationSetpoint"), //
	STORED_ENERGY("storedEnergy"), //
	TARGET_ENERGY_STORAGE("targetEnergyStorage"), //
	AVAILABLE_ENERGY_STORAGE("availableEnergyStorage"), //
	PRICE("price"), //
	LEVEL("level"), //
	POWER_FACTOR("powerFactor"), //
	PERCENT_USAGE("percentUsage"), //
	PERCENT_DEMAND("percentDemand"), //
	X_RESOURCE_STATUS("x-resourceStatus");

	private final String value;

	ReportType(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}

	public static class ReportTypeDeserializer extends EnumeratedDeserializer<ReportType> {
		public ReportTypeDeserializer() {
			super(ReportType.class);
		}
	}
}
