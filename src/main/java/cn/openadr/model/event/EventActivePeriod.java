package cn.openadr.model.event;

import org.joda.time.DateTime;

public class EventActivePeriod {
	/** 开始时间 */
	private DateTime dtstart;
	/** 持续时间(单位:分钟) */
	private int duration;
	/** 提前通知时间(单位:分钟) */
	private Integer notification;
	/** 从开始执行到满足要求所需时间(单位:分钟) */
	private Integer rampup;
	/** 恢复时间(单位:分钟) */
	private Integer recovery;

	public DateTime getDtstart() {
		return dtstart;
	}

	public void setDtstart(DateTime dtstart) {
		this.dtstart = dtstart;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Integer getNotification() {
		return notification;
	}

	public void setNotification(Integer notification) {
		this.notification = notification;
	}

	public Integer getRampup() {
		return rampup;
	}

	public void setRampup(Integer rampup) {
		this.rampup = rampup;
	}

	public Integer getRecovery() {
		return recovery;
	}

	public void setRecovery(Integer recovery) {
		this.recovery = recovery;
	}
}
