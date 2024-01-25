package cn.openadr.model.event;

import java.io.Serial;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventActivePeriod implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 开始时间
	 */
	public LocalDateTime dtstart;

	/**
	 * 持续时间(单位:分钟)
	 */
	public Duration duration;

	/**
	 * 降低同时率
	 */
	public Duration tolerance;

	/**
	 * 提前通知时间(单位:分钟)
	 */
	public Duration notification;

	/**
	 * 从开始执行到满足要求所需时间(单位:分钟)
	 */
	public Duration rampup;

	/**
	 * 恢复时间(单位:分钟)
	 */
	public Duration recovery;
}
