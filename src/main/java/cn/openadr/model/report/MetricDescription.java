package cn.openadr.model.report;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import cn.openadr.domain.UnitMultiplier;
import cn.openadr.domain.UnitSymbol;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 计量单位
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class MetricDescription implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String/* MetricType */ metricName;
	/**
	 * 倍率
	 */
	@JsonDeserialize(using = UnitMultiplier.Deserializer.class)
	public UnitMultiplier multiplier;
	/**
	 * 单位
	 */
	@JsonDeserialize(using = UnitSymbol.Deserializer.class)
	public UnitSymbol symbol;
}
