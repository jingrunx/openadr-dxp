package cn.openadr.model.event;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import cn.openadr.domain.OptType;
import cn.openadr.model.Response;

public class EventResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private OptType optType;
	private final Response response = new Response();
	private final QualifiedEventID qualifiedEventID = new QualifiedEventID();

	public OptType getOptType() {
		return optType;
	}

	public void setOptType(OptType optType) {
		this.optType = optType;
	}

	@JsonUnwrapped
	public Response getResponse() {
		return response;
	}

	public QualifiedEventID getQualifiedEventID() {
		return qualifiedEventID;
	}
}
