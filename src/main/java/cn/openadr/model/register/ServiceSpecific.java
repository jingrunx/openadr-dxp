package cn.openadr.model.register;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ServiceName;
import cn.openadr.jackson.EnumeratedSerializer;

public class ServiceSpecific implements Serializable {
	private static final long serialVersionUID = 1L;

	private ServiceName type;
	private final Map<String, String> extensions = new HashMap<>();

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ServiceName getType() {
		return type;
	}

	public void setType(ServiceName type) {
		this.type = type;
	}

	public Map<String, String> getExtensions() {
		return extensions;
	}
}
