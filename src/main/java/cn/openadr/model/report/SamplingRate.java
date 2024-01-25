package cn.openadr.model.report;

import java.io.Serial;
import java.io.Serializable;
import java.time.temporal.TemporalAmount;
import lombok.NoArgsConstructor;

/**
 * 采样频率
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class SamplingRate implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 最小间隔: 单位(分钟)
	 */
	public TemporalAmount minPeriod;
	/**
	 * 最大间隔: 单位(分钟)
	 */
	public TemporalAmount maxPeriod;
	/**
	 * 变位上送
	 */
	public boolean onChange;
}
