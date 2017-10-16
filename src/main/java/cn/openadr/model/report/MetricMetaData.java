package cn.openadr.model.report;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;

/** 计量单位 */
public class MetricMetaData implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	private /* MetricType */ String metric;
	/** 倍率 */
	private UnitMultiplier multiplier;
	/** 单位 */
	private UnitSymbol symbol;

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public UnitMultiplier getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(UnitMultiplier multiplier) {
		this.multiplier = multiplier;
	}

	public UnitSymbol getSymbol() {
		return symbol;
	}

	public void setSymbol(UnitSymbol symbol) {
		this.symbol = symbol;
	}
}
