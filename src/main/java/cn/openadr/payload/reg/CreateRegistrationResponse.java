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
@lombok.Getter
@lombok.Setter
public class CreateRegistrationResponse extends RegistrationResponse {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final Set<TransportType> transport = EnumSet.noneOf(TransportType.class);
	public final List<ServiceSpecific> serviceSpecific = new ArrayList<>();
	public final List<Extension> extensions = new ArrayList<>();
	/**
	 * 上位节点ID
	 */
	public String unID;
	/**
	 * 轮询频率
	 */
	public Period pollFreq;
}
