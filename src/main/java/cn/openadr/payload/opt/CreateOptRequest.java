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
@lombok.Getter
@lombok.Setter
public class CreateOptRequest extends OptRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = OptTypeDeserializer.class)
	public OptType optType;

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = OptReasonDeserializer.class)
	public OptReason optReason;
	public String marketContext;
	public DateTime createdDateTime;
	public final QualifiedEventID qualifiedEventID = new QualifiedEventID();
	public final Target target = new Target();
	public final Target deviceClass = new Target();
}
