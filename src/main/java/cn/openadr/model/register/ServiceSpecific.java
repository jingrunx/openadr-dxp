package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.ServiceName;
import cn.openadr.jackson.EnumeratedSerializer;

public class ServiceSpecific implements Serializable {
	private static final long serialVersionUID = 1L;

	private ServiceName serviceName;
	private final List<ServiceInfo> serviceInfo = new ArrayList<>();

	@JsonSerialize(using = EnumeratedSerializer.class)
	public ServiceName getServiceName() {
		return serviceName;
	}

	public void setServiceName(ServiceName name) {
		this.serviceName = name;
	}

	public List<ServiceInfo> getServiceInfo() {
		return serviceInfo;
	}
}
