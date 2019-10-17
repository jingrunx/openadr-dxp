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
	private static final long serialVersionUID = 1L;

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = OptTypeDeserializer.class)
	private OptType optType;

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = OptReasonDeserializer.class)
	private OptReason optReason;
	private String marketContext;
	private DateTime createdDateTime;
	private final QualifiedEventID qualifiedEventID = new QualifiedEventID();
	private final Target target = new Target();
	private final Target deviceClass = new Target();
}
