package cn.openadr.payload.reg;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import org.joda.time.Period;

import cn.openadr.domain.TransportType;
import cn.openadr.model.register.Extension;
import cn.openadr.model.register.ServiceSpecific;

// OadrCreatedPartyRegistrationType
public class CreateRegistrationResponse extends RegistrationResponse {
	private static final long serialVersionUID = 1L;

	/** 上位节点ID */
	private String unID;
	/** 轮询频率 */
	private Period pollFreq;
	private final Set<TransportType> transport = EnumSet.noneOf(TransportType.class);
	private final List<ServiceSpecific> serviceSpecific = new ArrayList<>();
	private final List<Extension> extensions = new ArrayList<>();

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

	public List<ServiceSpecific> getServiceSpecific() {
		return serviceSpecific;
	}

	public List<Extension> getExtensions() {
		return extensions;
	}
}
