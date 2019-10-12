package cn.openadr.model.event;

import java.util.Objects;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;
import org.joda.time.Period;

public class EventActivePeriod {
	/**
	 * 开始时间
	 */
	@NotNull
	private DateTime dtstart;

	/**
	 * 持续时间(单位:分钟)
	 */
	@NotNull
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

	public DateTime getDtstart() {
		return dtstart;
	}

	public void setDtstart(DateTime dtstart) {
		Objects.requireNonNull(dtstart);
		this.dtstart = dtstart;
	}

	public Period getDuration() {
		return duration;
	}

	public void setDuration(Period duration) {
		Objects.requireNonNull(duration);
		this.duration = duration;
	}

	public Period getTolerance() {
		return tolerance;
	}

	public void setTolerance(Period tolerance) {
		this.tolerance = tolerance;
	}

	public Period getNotification() {
		return notification;
	}

	public void setNotification(Period notification) {
		this.notification = notification;
	}

	public Period getRampup() {
		return rampup;
	}

	public void setRampup(Period rampup) {
		this.rampup = rampup;
	}

	public Period getRecovery() {
		return recovery;
	}

	public void setRecovery(Period recovery) {
		this.recovery = recovery;
	}
}
