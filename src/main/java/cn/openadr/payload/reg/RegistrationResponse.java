package cn.openadr.payload.reg;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.joda.time.Period;

import cn.openadr.domain.TransportType;
import cn.openadr.model.register.ServiceSpecific;
import cn.openadr.payload.DRResponse;

public class RegistrationResponse<T extends RegistrationRequest> extends DRResponse<T> {
	private static final long serialVersionUID = 1L;

	/** 主站ID */
	private String unID;
	/** 轮询频率 */
	private Period pollFreq;
	private final Set<TransportType> transport = EnumSet.noneOf(TransportType.class);
	private final List<ServiceSpecific> service = new ArrayList<>();

	public RegistrationResponse(T request) {
		super(request);
	}

	public String getRegistrationID() {
		return request.getRegistrationID();
	}

	public String getDnID() {
		return request.getDnID();
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

	public Set<TransportType> getTransport() {
		return transport;
	}

	public List<ServiceSpecific> getService() {
		return service;
	}
}
