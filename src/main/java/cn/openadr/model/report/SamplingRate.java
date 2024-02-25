package cn.openadr.model.report;

import java.io.Serial;
import java.io.Serializable;
import java.time.Duration;
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
	public Duration minPeriod;
	/**
	 * 最大间隔: 单位(分钟)
	 */
	public Duration maxPeriod;
	/**
	 * 变位上送
	 */
	public boolean onChange;
}
