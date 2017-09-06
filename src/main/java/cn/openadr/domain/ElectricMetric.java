package cn.openadr.domain;

public interface ElectricMetric {
	static final String CURRENT = "current";
	static final String CURRENT_A = "current.a";
	static final String CURRENT_B = "current.b";
	static final String CURRENT_C = "current.c";

	static final String VOLTAGE = "voltage";
	static final String VOLTAGE_AN = "voltage.an";
	static final String VOLTAGE_BN = "voltage.bn";
	static final String VOLTAGE_CN = "voltage.cn";

	static final String VOLTAGE_AB = "voltage.ab";
	static final String VOLTAGE_BC = "voltage.bc";
	static final String VOLTAGE_CA = "voltage.ca";
	static final String VOLTAGE_ABC = "voltage.abc";
	static final String VOLTAGE_ABCN = "voltage.abcn";

	static final String POWER_ACTIVE = "power.active";
	static final String POWER_ACTIVE_A = "power.active.a";
	static final String POWER_ACTIVE_B = "power.active.b";
	static final String POWER_ACTIVE_C = "power.active.c";
	static final String POWER_ACTIVE_POSITIVE = "power.active.positive";
	static final String POWER_ACTIVE_REVERSE = "power.active.reverse";

	static final String POWER_REACTIVE = "power.reactive";
	static final String POWER_REACTIVE_A = "power.reactive.a";
	static final String POWER_REACTIVE_B = "power.reactive.b";
	static final String POWER_REACTIVE_C = "power.reactive.c";
	static final String POWER_REACTIVE_POSITIVE = "power.reactive.positive";
	static final String POWER_REACTIVE_REVERSE = "power.reactive.reverse";

	static final String POWER_REACTIVE_Q1 = "power.reactive.q1";
	static final String POWER_REACTIVE_Q2 = "power.reactive.q2";
	static final String POWER_REACTIVE_Q3 = "power.reactive.q3";
	static final String POWER_REACTIVE_Q4 = "power.reactive.q4";

	static final String POWER_APPARENT = "power.apparent";
	static final String POWER_APPARENT_A = "power.apparent.a";
	static final String POWER_APPARENT_B = "power.apparent.b";
	static final String POWER_APPARENT_C = "power.apparent.c";

	static final String FREQUENCY = "frequency";

	static final String POWER_FACTOR = "power.factor";
	static final String POWER_FACTOR_A = "power.factor.a";
	static final String POWER_FACTOR_B = "power.factor.b";
	static final String POWER_FACTOR_C = "power.factor.c";

	static final String PHASE_ANGLE_IA = "phase.angle.ia";
	static final String PHASE_ANGLE_IB = "phase.angle.ib";
	static final String PHASE_ANGLE_IC = "phase.angle.ic";
	static final String PHASE_ANGLE_UA = "phase.angle.ua";
	static final String PHASE_ANGLE_UB = "phase.angle.ub";
	static final String PHASE_ANGLE_UC = "phase.angle.uc";

	static final String ENERGY_ACTIVE = "energy.active";
	static final String ENERGY_ACTIVE_A = "energy.active.a";
	static final String ENERGY_ACTIVE_B = "energy.active.b";
	static final String ENERGY_ACTIVE_C = "energy.active.c";

	static final String ENERGY_ACTIVE_POSITIVE = "energy.active.positive";
	static final String ENERGY_ACTIVE_REVERSE = "energy.active.reverse";

	static final String ENERGY_REACTIVE = "energy.reactive";
	static final String ENERGY_REACTIVE_A = "energy.reactive.a";
	static final String ENERGY_REACTIVE_B = "energy.reactive.b";
	static final String ENERGY_REACTIVE_C = "energy.reactive.c";

	static final String ENERGY_REACTIVE_POSITIVE = "energy.reactive.positive";
	static final String ENERGY_REACTIVE_REVERSE = "energy.reactive.reverse";

	static final String ENERGY_REACTIVE_Q1 = "energy.reactive.q1";
	static final String ENERGY_REACTIVE_Q2 = "energy.reactive.q2";
	static final String ENERGY_REACTIVE_Q3 = "energy.reactive.q3";
	static final String ENERGY_REACTIVE_Q4 = "energy.reactive.q4";

	static final String ENERGY_APPARENT = "energy.apparent";
	static final String ENERGY_APPARENT_A = "energy.apparent.a";
	static final String ENERGY_APPARENT_B = "energy.apparent.b";
	static final String ENERGY_APPARENT_C = "energy.apparent.c";

	static final String POWER_ACTIVE_DEMAND_MAX = "power.active.demand.max";
	static final String POWER_ACTIVE_DEMAND_MAX_OCCUR = "power.active.demand.max.occur";
	static final String POWER_ACTIVE_DEMAND_MIN = "power.active.demand.min";
	static final String POWER_ACTIVE_DEMAND_MIN_OCCUR = "power.active.demand.min.occur";

	static final String POWER_REACTIVE_DEMAND_MAX = "power.reactive.demand.max";
	static final String POWER_REACTIVE_DEMAND_MAX_OCCUR = "power.reactive.demand.max.occur";
	static final String POWER_REACTIVE_DEMAND_MIN = "power.reactive.demand.min";
	static final String POWER_REACTIVE_DEMAND_MIN_OCCUR = "power.reactive.demand.min.occur";

	static final String ENERGY_ACTIVE_DEMAND_MAX = "energy.active.demand.max";
	static final String ENERGY_ACTIVE_DEMAND_MAX_OCCUR = "energy.active.demand.max.occur";
	static final String ENERGY_ACTIVE_DEMAND_MIN = "energy.active.demand.min";
	static final String ENERGY_ACTIVE_DEMAND_MIN_OCCUR = "energy.active.demand.min.occur";

	static final String ENERGY_REACTIVE_DEMAND_MAX = "energy.reactive.demand.max";
	static final String ENERGY_REACTIVE_DEMAND_MAX_OCCUR = "energy.reactive.demand.max.occur";
	static final String ENERGY_REACTIVE_DEMAND_MIN = "energy.reactive.demand.min";
	static final String ENERGY_REACTIVE_DEMAND_MIN_OCCUR = "energy.reactive.demand.min.occur";

	static final String QUALITY_CURRENT_UNBALANCE = "quality.current.unbalance";
	static final String QUALITY_VOLTAGE_UNBALANCE = "quality.voltage.unbalance";
}
