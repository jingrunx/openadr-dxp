package cn.openadr.model.event;

import java.io.Serializable;

import org.joda.time.DateTime;
import org.joda.time.Period;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventActivePeriod implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 开始时间
	 */
	public DateTime dtstart;

	/**
	 * 持续时间(单位:分钟)
	 */
	public Period duration;

	/**
	 * 降低同时率
	 */
	public Period tolerance;

	/**
	 * 提前通知时间(单位:分钟)
	 */
	public Period notification;

	/**
	 * 从开始执行到满足要求所需时间(单位:分钟)
	 */
	public Period rampup;

	/**
	 * 恢复时间(单位:分钟)
	 */
	public Period recovery;
}
