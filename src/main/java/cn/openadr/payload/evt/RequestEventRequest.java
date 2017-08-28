package cn.openadr.payload.evt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.payload.DRRequest;

public class RequestEventRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	private final List<String> eventIDs = new ArrayList<>();

	public List<String> getEventIDs() {
		return eventIDs;
	}
}
