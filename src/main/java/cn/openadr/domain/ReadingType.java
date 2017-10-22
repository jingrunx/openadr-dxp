package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/** 读数类型 */
public enum ReadingType implements EnumeratedType {
	/** 示值 */
	DIRECT_READ("Direct Read"),
	/** 净值 */
	NET("Net"),
	/** 分配 */
	ALLOCATED("Allocated"),
	/** 估计 */
	ESTIMATED("Estimated"),
	/** 合计 */
	SUMMED("Summed"),
	/** 派生 */
	DERIVED("Derived"),
	/** 均值 */
	MEAN("Mean"),
	/** 峰值 */
	PEAK("Peak"),
	/** 混合 */
	HYBRID("Hybrid"),
	/** 合同 */
	CONTRACT("Contract"),
	/** 设计 */
	PROJECTED("Projected"),
	/** RMS */
	X_RMS("x-RMS"),
	/** 不适用 */
	X_NOT_APPLICABLE("x-notApplicable");

	private final String value;

	ReadingType(String value) {
		this.value = value;
	}

	@Override
	public String value() {
		return value;
	}

	public static class ReadingTypeDeserializer extends EnumeratedDeserializer<ReadingType> {
		public ReadingTypeDeserializer() {
			super(ReadingType.class);
		}
	}
}
