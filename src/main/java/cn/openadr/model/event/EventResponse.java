package cn.openadr.model.event;

import java.io.Serializable;

import cn.openadr.domain.OptType;
import cn.openadr.model.Response;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventResponse extends Response implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public OptType optType;
	public final QualifiedEventID qualifiedEventID = new QualifiedEventID();
}
