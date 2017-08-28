package cn.openadr.model.event;

import org.joda.time.DateTime;

import cn.openadr.domain.EventStatus;
import cn.openadr.model.target.Market;

public class EventDescriptor {
	/** 事件状态 */
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
	/** 市场信息 */
	private Market market;
	/** 注解 */
	private String comment;

	public EventStatus getStatus() {
		return status;
	}

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

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
