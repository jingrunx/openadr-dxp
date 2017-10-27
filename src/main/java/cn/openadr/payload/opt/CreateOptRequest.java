package cn.openadr.payload.opt;

import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.OptReason;
import cn.openadr.domain.OptReason.OptReasonDeserializer;
import cn.openadr.domain.OptType;
import cn.openadr.domain.OptType.OptTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.event.QualifiedEventID;
import cn.openadr.model.target.Target;

// OadrCreateOptType
public class CreateOptRequest extends OptRequest {
	private static final long serialVersionUID = 1L;

	private OptType optType;
	private OptReason optReason;
	private String marketContext;
	private DateTime createdDateTime;
	private final QualifiedEventID qualifiedEventID = new QualifiedEventID();
	private final Target target = new Target();
	private final Target deviceClass = new Target();

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

	public String getMarketContext() {
		return marketContext;
	}

	public void setMarketContext(String marketContext) {
		this.marketContext = marketContext;
	}

	public DateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(DateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public QualifiedEventID getQualifiedEventID() {
		return qualifiedEventID;
	}

	public Target getTarget() {
		return target;
	}

	public Target getDeviceClass() {
		return deviceClass;
	}
}
