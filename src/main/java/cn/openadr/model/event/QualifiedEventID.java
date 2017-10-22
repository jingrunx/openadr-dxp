package cn.openadr.model.event;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class QualifiedEventID implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 事件ID */
	@NotNull
	private String eventID;

	/** 修改版本 */
	private int modificationNumber;

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public int getModificationNumber() {
		return modificationNumber;
	}

	public void setModificationNumber(int modificationNumber) {
		this.modificationNumber = modificationNumber;
	}

}
