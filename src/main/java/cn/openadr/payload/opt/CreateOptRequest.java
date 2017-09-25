package cn.openadr.payload.opt;

import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.event.EventDescriptor;
import cn.openadr.model.target.Target;

class OptTypeDeserializer extends EnumeratedDeserializer<OptType> {
	public OptTypeDeserializer() {
		super(OptType.class);
	}
}

class OptReasonDeserializer extends EnumeratedDeserializer<OptReason> {
	public OptReasonDeserializer() {
		super(OptReason.class);
	}
}

public class CreateOptRequest extends OptRequest {
	private static final long serialVersionUID = 1L;

	private final EventDescriptor evtDescriptor;
	private OptType optType;
	private OptReason optReason;
	private DateTime createdDateTime;
	private final Target target = new Target();
	private final Target deviceClass = new Target();

	public CreateOptRequest(EventDescriptor evtDescriptor) {
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

	@JsonDeserialize(using = OptTypeDeserializer.class)
	public void setOptType(OptType optType) {
		this.optType = optType;
	}

	@JsonSerialize(using = EnumeratedSerializer.class)
	public OptReason getOptReason() {
		return optReason;
	}

	@JsonDeserialize(using = OptReasonDeserializer.class)
	public void setOptReason(OptReason optReason) {
		this.optReason = optReason;
	}

	public DateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(DateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Target getTarget() {
		return target;
	}

	public Target getDeviceClass() {
		return deviceClass;
	}
}
