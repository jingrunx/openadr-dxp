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
	private OptType optType;
	private OptReason optReason;

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
	public OptType getOptType() {
		return optType;
	}

	public void setOptType(OptType optType) {
		this.optType = optType;
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public OptReason getOptReason() {
		return optReason;
	}

	public void setOptReason(OptReason optReason) {
		this.optReason = optReason;
	}
}
