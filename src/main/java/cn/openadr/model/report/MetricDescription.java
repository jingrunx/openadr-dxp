package cn.openadr.model.report;

import java.io.Serializable;

import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * 计量单位
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class MetricDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@NonNull
	private String/* MetricType2 */ metricName;
	/**
	 * 倍率
	 */
	private UnitMultiplier multiplier;
	/**
	 * 单位
	 */
	private UnitSymbol symbol;
}
