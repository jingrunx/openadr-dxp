package cn.openadr.model.event;

import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.EventStatus;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;

class EventStatusDeserializer extends EnumeratedDeserializer<EventStatus> {
	public EventStatusDeserializer() {
		super(EventStatus.class);
	}
}

/** 事件描述 */
public class EventDescriptor {
	/** 事件ID */
	@NotNull
	private String eventID;

	/** 事件状态 */
	@NotNull
	private EventStatus status;

	/** 优先级 */
	private int priority;

	/** 测试事件 */
	private boolean test;

	/** 修改版本 */
	private int modificationNumber;

	/** 修改时间 */
	private DateTime modificationDateTime;

	/** 修改原因 */
	private String modificationReason;

	/** 创建时间 */
	private DateTime createdDateTime;

	/** 注释 */
	private String comment;

	/** 市场信息 */
	private String marketContext;

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public EventStatus getStatus() {
		return status;
	}

	@JsonDeserialize(using = EventStatusDeserializer.class)
	public void setStatus(EventStatus status) {
		this.status = status;
	}

	public int getModificationNumber() {
		return modificationNumber;
	}

	public void setModificationNumber(int modificationNumber) {
		this.modificationNumber = modificationNumber;
	}

	public DateTime getModificationDateTime() {
		return modificationDateTime;
	}

	public void setModificationDateTime(DateTime modificationDateTime) {
		this.modificationDateTime = modificationDateTime;
	}

	public String getModificationReason() {
		return modificationReason;
	}

	public void setModificationReason(String modificationReason) {
		this.modificationReason = modificationReason;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}

	public DateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(DateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMarketContext() {
		return marketContext;
	}

	public void setMarketContext(String marketContext) {
		this.marketContext = marketContext;
	}
}
