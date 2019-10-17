package cn.openadr.model.report;

import java.io.Serializable;

import org.joda.time.Period;

import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * 采样频率
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class SamplingRate implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 最小间隔: 单位(分钟)
	 */
	@NonNull
	private Period minPeriod;
	/**
	 * 最大间隔: 单位(分钟)
	 */
	@NonNull
	private Period maxPeriod;
	/**
	 * 变位上送
	 */
	private boolean onChange;
}
