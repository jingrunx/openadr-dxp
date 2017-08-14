package cn.openadr.model.report;

import java.io.Serializable;

/** 采样频率 */
public class SamplingRate implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 最小间隔: 单位(分钟) */
	private int minPeriod;
	/** 最大间隔: 单位(分钟) */
	private int maxPeriod;
	/** 变位上送 */
	private boolean onChange;

	public int getMinPeriod() {
		return minPeriod;
	}

	public void setMinPeriod(int minPeriod) {
		this.minPeriod = minPeriod;
	}

	public int getMaxPeriod() {
		return maxPeriod;
	}

	public void setMaxPeriod(int maxPeriod) {
		this.maxPeriod = maxPeriod;
	}

	public boolean isOnChange() {
		return onChange;
	}

	public void setOnChange(boolean onChange) {
		this.onChange = onChange;
	}
}
