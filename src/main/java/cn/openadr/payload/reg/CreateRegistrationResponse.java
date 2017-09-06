package cn.openadr.payload.reg;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.joda.time.Period;

import cn.openadr.domain.TransportType;
import cn.openadr.model.register.ServiceSpecific;

public class CreateRegistrationResponse extends RegistrationResponse {
	private static final long serialVersionUID = 1L;

	/** 主站ID */
	private String unID;
	/** 轮询频率 */
	private Period pollFreq;
	private final Set<TransportType> transports = EnumSet.noneOf(TransportType.class);
	private final List<ServiceSpecific> services = new ArrayList<>();

	public CreateRegistrationResponse(CreateRegistrationRequest request) {
		super(request);
	}

	public String getUnID() {
		return unID;
	}

	public void setUnID(String unID) {
		this.unID = unID;
	}

	public Period getPollFreq() {
		return pollFreq;
	}

	public void setPollFreq(Period pollFreq) {
		this.pollFreq = pollFreq;
	}

	public Set<TransportType> getTransports() {
		return transports;
	}

	public List<ServiceSpecific> getServices() {
		return services;
	}
}
