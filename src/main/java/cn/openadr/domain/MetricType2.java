package cn.openadr.domain;

import java.time.temporal.TemporalAmount;

public interface MetricType2 {
	/* public */ String prefix_elec = "e";

	/* ====================模拟量类==================== */
	/* public */ String prefix_e = prefix_elec;

	//电流
	String I = prefix_e + '.' + ElectricType.I.code();
	String I_A = I + '.' + Phase.a.code;
	String I_B = I + '.' + Phase.b.code;
	String I_C = I + '.' + Phase.c.code;
	String I_N = I + '.' + 'n';
	String I_0 = I + '.' + Phase.zeroSequence.code;

	//相电压
	String U = prefix_e + '.' + ElectricType.U.code();
	String U_AN = U + '.' + Phase.a.code;
	String U_BN = U + '.' + Phase.b.code;
	String U_CN = U + '.' + Phase.c.code;
	String U_ABCN = U + ".abcn";

	//线电压
	String U_wire = U + ".wire";
	String U_AB = U_wire + ".ab";
	String U_BC = U_wire + ".bc";
	String U_CA = U_wire + ".ca";
	String U_ABC = U_wire + ".abc";

	//功率因素
	String PF = prefix_e + '.' + ElectricType.PF.code();
	String PF_A = PF + '.' + Phase.a.code;
	String PF_B = PF + '.' + Phase.b.code;
	String PF_C = PF + '.' + Phase.c.code;

	//温度
	String T = prefix_e + '.' + 't';
	String T_A = T + '.' + Phase.a.code;
	String T_B = T + '.' + Phase.b.code;
	String T_C = T + '.' + Phase.c.code;

	//频率
	String Hz = prefix_e + '.' + ElectricType.Hz.code();

	//相角
	String Z = prefix_e + ".z";
	String Z_I = Z + '.' + ElectricType.I.code();
	String Z_U = Z + '.' + ElectricType.U.code();
	String Z_IA = Z_I + '.' + Phase.a.code;
	String Z_IB = Z_I + '.' + Phase.b.code;
	String Z_IC = Z_I + '.' + Phase.c.code;
	String Z_UA = Z_U + '.' + Phase.a.code;
	String Z_UB = Z_U + '.' + Phase.b.code;
	String Z_UC = Z_U + '.' + Phase.c.code;

	/* ====================功率类==================== */
	/* public */ String prefix_p = prefix_elec;

	//有功功率
	String P = prefix_p + '.' + ElectricType.P.code();
	String P_A = P + '.' + Phase.a.code;
	String P_B = P + '.' + Phase.b.code;
	String P_C = P + '.' + Phase.c.code;

	//无功功率
	String Q = prefix_p + '.' + ElectricType.Q.code();
	String Q_A = Q + '.' + Phase.a.code;
	String Q_B = Q + '.' + Phase.b.code;
	String Q_C = Q + '.' + Phase.c.code;

	//视在功率
	String S = prefix_p + '.' + ElectricType.S.code();
	String S_A = S + '.' + Phase.a.code;
	String S_B = S + '.' + Phase.b.code;
	String S_C = S + '.' + Phase.c.code;

	/* ====================电量类==================== */
	/* public */ String prefix_ee = prefix_elec;
	// 正向
	/* public */ String pos = ".imp";
	// 反向
	/* public */ String rev = ".exp";

	String EP = prefix_ee + '.' + ElectricType.EP.code();
	String EP_pos = EP + pos;
	String EP_rev = EP + rev;

	String EQ = prefix_ee + '.' + ElectricType.EQ.code();
	String EQ_pos = EQ + pos;
	String EQ_rev = EQ + rev;
	String EQ_Q1 = EQ + '.' + Direction.q1.code;
	String EQ_Q2 = EQ + '.' + Direction.q2.code;
	String EQ_Q3 = EQ + '.' + Direction.q3.code;
	String EQ_Q4 = EQ + '.' + Direction.q4.code;

	String ES = prefix_ee + '.' + ElectricType.ES.code();
	/* ====================电能示值类==================== */
	/* public */ String prefix_r = "r";
	String EPr = prefix_r + '.' + ElectricType.EP.code();
	String EPr_pos = EPr + pos;
	String EPr_rev = EPr + rev;
	String EQr = prefix_r + '.' + ElectricType.EQ.code();
	String EQr_pos = EQr + pos;
	String EQr_rev = EQr + rev;
	String ESr = prefix_r + '.' + ElectricType.ES.code();

	/**
	 * 根据电量测点和积分时段产生与时段相关的测点名
	 * <li>如有功电量为[e.ep]，15分钟有功电量为[e.ep.pt15m]，日有功电量为[e.ep.p1d]
	 */
	default String periodMetric(String eMetric, TemporalAmount period) {
		String periodStr = period.toString();
		return eMetric + '.' + periodStr.toLowerCase();
	}
}
