package cn.openadr.model.event;

import org.joda.time.DateTime;
import org.joda.time.Period;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventActivePeriod {
	/**
	 * 开始时间
	 */
	@NonNull
	private DateTime dtstart;

	/**
	 * 持续时间(单位:分钟)
	 */
	@NonNull
	private Period duration;

	/**
	 * 降低同时率
	 */
	private Period tolerance;

	/**
	 * 提前通知时间(单位:分钟)
	 */
	private Period notification;

	/**
	 * 从开始执行到满足要求所需时间(单位:分钟)
	 */
	private Period rampup;

	/**
	 * 恢复时间(单位:分钟)
	 */
	private Period recovery;
}
