package cn.openadr.model.register;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ServiceName;
import cn.openadr.jackson.EnumeratedSerializer;

public class ServiceSpecific implements Serializable {
	private static final long serialVersionUID = 1L;

	private ServiceName name;
	private final Map<String, String> info = new HashMap<>();

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ServiceName getName() {
		return name;
	}

	public void setName(ServiceName name) {
		this.name = name;
	}

	public Map<String, String> getInfo() {
		return info;
	}
}
