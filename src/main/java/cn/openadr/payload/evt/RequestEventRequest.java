package cn.openadr.payload.evt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.payload.OadrRequest;

public class RequestEventRequest extends OadrRequest {
	private static final long serialVersionUID = 1L;

	private final List<String> eventIDs = new ArrayList<>();

	public List<String> getEventIDs() {
		return eventIDs;
	}
}
