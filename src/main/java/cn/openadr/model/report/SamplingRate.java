package cn.openadr.model.report;

import java.io.Serializable;

import org.joda.time.Period;
import lombok.NoArgsConstructor;

/**
 * 采样频率
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class SamplingRate implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 最小间隔: 单位(分钟)
	 */
	public Period minPeriod;
	/**
	 * 最大间隔: 单位(分钟)
	 */
	public Period maxPeriod;
	/**
	 * 变位上送
	 */
	public boolean onChange;
}
