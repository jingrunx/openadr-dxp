package cn.openadr.payload.reg;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import cn.openadr.payload.DNRequest;

@lombok.Getter
@lombok.Setter
public abstract class RegistrationRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String registrationID;

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
			.append("requestID", requestID)
			.append("dnID", dnID)
			.append("registrationID", registrationID)
			.toString();
	}
}
