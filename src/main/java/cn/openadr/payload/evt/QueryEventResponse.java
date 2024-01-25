package cn.openadr.payload.evt;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.event.Event;
import cn.openadr.payload.DNResponse;

/**
 * Author: jrxian
 * Date: 2019-10-17 14:32
 */
public class QueryEventResponse extends DNResponse {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final List<Event> events = new ArrayList<>();
}
