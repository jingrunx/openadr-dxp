package cn.openadr.payload.reg;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.Period;

import cn.openadr.model.register.Profile;
import cn.openadr.model.register.ServiceSpecific;

public class CreateRegistrationResponse extends RegistrationResponse {
	private static final long serialVersionUID = 1L;

	/** 主站ID */
	private String unID;
	/** 轮询频率 */
	private Period pollFreq;
	private final List<Profile> profiles = new ArrayList<>();
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

	public List<Profile> getProfiles() {
		return profiles;
	}

	public List<ServiceSpecific> getServices() {
		return services;
	}
}
