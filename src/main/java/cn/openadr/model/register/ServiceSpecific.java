package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ServiceType;
import cn.openadr.domain.ServiceType.ServiceTypeDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;

public class ServiceSpecific implements Serializable {
	private static final long serialVersionUID = 1L;

	private ServiceType serviceName;
	private final List<KeyValue> info = new ArrayList<>();

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ServiceType getServiceName() {
		return serviceName;
	}

	@JsonDeserialize(using = ServiceTypeDeserializer.class)
	public void setServiceName(ServiceType name) {
		this.serviceName = name;
	}

	public List<KeyValue> getInfo() {
		return info;
	}
}
