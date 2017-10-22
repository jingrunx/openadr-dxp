package cn.openadr.payload.evt;

import java.util.EnumSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.joda.time.Period;

import cn.openadr.domain.EventStatus;
import cn.openadr.payload.DNRequest;

// OadrRequestEventType
public class QueryEventRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	/** 限制返回的事件数目 */
	private int replyLimit;
	/** 要查询的事件开始时间 */
	private DateTime dtstart;
	/** 要查询的事件时间范围 */
	private Period duration;
	/** 要查询的事件状态 */
	private Set<EventStatus> status = EnumSet.of(EventStatus.FAR, EventStatus.NEAR, EventStatus.ACTIVE);

	public int getReplyLimit() {
		return replyLimit;
	}

	public void setReplyLimit(int replyLimit) {
		this.replyLimit = replyLimit;
	}

	public DateTime getDtstart() {
		return dtstart;
	}

	public void setDtstart(DateTime dtstart) {
		this.dtstart = dtstart;
	}

	public Period getDuration() {
		return duration;
	}

	public void setDuration(Period duration) {
		this.duration = duration;
	}

	public Set<EventStatus> getStatus() {
		return status;
	}

	public void setStatus(Set<EventStatus> status) {
		this.status = status;
	}
}
