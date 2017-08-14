package cn.openadr.payload.evt;

import cn.openadr.payload.OadrRequest;

public class RequestEventRequest extends OadrRequest {
	private static final long serialVersionUID = 1L;

	private String eventID;

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}
}
