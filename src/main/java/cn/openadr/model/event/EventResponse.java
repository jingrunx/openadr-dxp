package cn.openadr.model.event;

import java.io.Serializable;

import cn.openadr.domain.OptType;
import cn.openadr.model.Response;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private OptType optType;
	private final Response response = new Response();
	private final QualifiedEventID qualifiedEventID = new QualifiedEventID();
}
