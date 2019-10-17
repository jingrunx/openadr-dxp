package cn.openadr.payload.evt;

import java.util.EnumSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.joda.time.Period;

import cn.openadr.domain.EventStatus;
import cn.openadr.payload.DNRequest;

// OadrRequestEventType
@lombok.Getter
@lombok.Setter
public class QueryEventRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	/**
	 * 限制返回的事件数目
	 */
	private int replyLimit;
	/**
	 * 要查询的事件开始时间
	 */
	private DateTime dtstart;
	/**
	 * 要查询的事件时间范围
	 */
	private Period duration;
	/**
	 * 要查询的事件状态
	 */
	private final Set<EventStatus> status = EnumSet.of(EventStatus.FAR, EventStatus.NEAR, EventStatus.ACTIVE);
}
