package cn.openadr.model.event;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.OptType;
import cn.openadr.domain.OptType.OptTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import cn.openadr.model.Response;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventResponse extends Response implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = OptTypeDeserializer.class)
	public OptType optType;

	public final QualifiedEventID qualifiedEventID = new QualifiedEventID();
}
