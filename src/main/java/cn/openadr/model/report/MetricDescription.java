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
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@NonNull
	public String/* MetricType2 */ metricName;
	/**
	 * 倍率
	 */
	public UnitMultiplier multiplier;
	/**
	 * 单位
	 */
	public UnitSymbol symbol;
}
