package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ServiceName;
import cn.openadr.domain.ServiceName.ServiceNameDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;

public class ServiceSpecific implements Serializable {
	private static final long serialVersionUID = 1L;

	private ServiceName serviceName;
	private final List<KeyValue> info = new ArrayList<>();

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ServiceName getServiceName() {
		return serviceName;
	}

	@JsonDeserialize(using = ServiceNameDeserializer.class)
	public void setServiceName(ServiceName name) {
		this.serviceName = name;
	}

	public List<KeyValue> getInfo() {
		return info;
	}
}
