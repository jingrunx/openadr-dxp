package cn.openadr.payload.evt;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.EnumSet;
import java.util.Set;

import cn.openadr.domain.EventStatus;
import cn.openadr.payload.DNRequest;

// OadrRequestEventType
@lombok.Getter
@lombok.Setter
public class QueryEventRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 要查询的事件状态
	 */
	public final Set<EventStatus> status = EnumSet.of(EventStatus.FAR, EventStatus.NEAR, EventStatus.ACTIVE);
	/**
	 * 限制返回的事件数目
	 */
	public int replyLimit;
	/**
	 * 要查询的事件开始时间
	 */
	public LocalDateTime dtstart;
	/**
	 * 要查询的事件时间范围
	 */
	public TemporalAmount duration;
}
