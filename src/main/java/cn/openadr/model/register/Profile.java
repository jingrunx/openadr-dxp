package cn.openadr.model.register;

import java.io.Serializable;
import java.util.EnumSet;
import java.util.Set;

import cn.openadr.domain.TransportType;

public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	private String token;
	private final Set<TransportType> transports = EnumSet.noneOf(TransportType.class);

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Set<TransportType> getTransports() {
		return transports;
	}
}
