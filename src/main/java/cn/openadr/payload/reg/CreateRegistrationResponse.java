package cn.openadr.payload.reg;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.register.Profile;
import cn.openadr.model.register.ServiceSpecific;

public class CreateRegistrationResponse extends RegistrationResponse<CreateRegistrationRequest> {
	private static final long serialVersionUID = 1L;

	private String vtnID;
	/** 轮询频率 */
	private int pollFreq;
	private final List<Profile> profiles = new ArrayList<>();
	private final List<ServiceSpecific> services = new ArrayList<>();

	public CreateRegistrationResponse(CreateRegistrationRequest request) {
		super(request);
	}

	public String getVtnID() {
		return vtnID;
	}

	public void setVtnID(String vtnID) {
		this.vtnID = vtnID;
	}

	public int getPollFreq() {
		return pollFreq;
	}

	public void setPollFreq(int pollFreq) {
		this.pollFreq = pollFreq;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public List<ServiceSpecific> getServices() {
		return services;
	}
}
