package cn.openadr.model.report;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

import org.joda.time.Period;

/**
 * 采样频率
 */
public class SamplingRate implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 最小间隔: 单位(分钟)
	 */
	@NotNull
	private Period minPeriod;
	/**
	 * 最大间隔: 单位(分钟)
	 */
	@NotNull
	private Period maxPeriod;
	/**
	 * 变位上送
	 */
	private boolean onChange;

	public Period getMinPeriod() {
		return minPeriod;
	}

	public void setMinPeriod(Period minPeriod) {
		this.minPeriod = minPeriod;
	}

	public Period getMaxPeriod() {
		return maxPeriod;
	}

	public void setMaxPeriod(Period maxPeriod) {
		this.maxPeriod = maxPeriod;
	}

	public boolean isOnChange() {
		return onChange;
	}

	public void setOnChange(boolean onChange) {
		this.onChange = onChange;
	}
}
