package cn.openadr.payload.opt;

import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptType;
import cn.openadr.jackson.EnumeratedDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
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

	private OptType type;
	private OptReason optReason;
	private DateTime createdDateTime;
	private String eventID;
	private long modificationNumber;
	private final Target target = new Target();

	@JsonSerialize(using = EnumeratedSerializer.class)
	public OptType getType() {
		return type;
	}

	@JsonDeserialize(using = OptTypeDeserializer.class)
	public void setType(OptType type) {
		this.type = type;
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

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public long getModificationNumber() {
		return modificationNumber;
	}

	public void setModificationNumber(long modificationNumber) {
		this.modificationNumber = modificationNumber;
	}

	public Target getTarget() {
		return target;
	}
}
