package cn.openadr.payload.evt;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.event.EventDescriptor;
import cn.openadr.payload.DRRequest;

public class ReplyEventRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	private final EventDescriptor evtDescriptor;
	private OptType opt;
	private OptReason reason;

	public ReplyEventRequest(EventDescriptor evtDescriptor) {
		super();

		this.evtDescriptor = evtDescriptor;
	}

	public String getEventID() {
		return evtDescriptor.getEventID();
	}

	public int getModificationNumber() {
		return evtDescriptor.getModificationNumber();
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public OptType getOpt() {
		return opt;
	}

	public void setOpt(OptType opt) {
		this.opt = opt;
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public OptReason getReason() {
		return reason;
	}

	public void setReason(OptReason reason) {
		this.reason = reason;
	}
}
