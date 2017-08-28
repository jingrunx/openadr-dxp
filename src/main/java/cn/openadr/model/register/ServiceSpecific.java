package cn.openadr.model.register;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import cn.openadr.domain.ServiceName;

public class ServiceSpecific implements Serializable {
	private static final long serialVersionUID = 1L;

	private String token;
	private ServiceName serviceType;
	private final Map<String, String> specs = new HashMap<>();

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public ServiceName getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceName serviceType) {
		this.serviceType = serviceType;
	}

	public Map<String, String> getSpecs() {
		return specs;
	}
}
