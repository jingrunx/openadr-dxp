package cn.openadr.payload.reg;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import cn.openadr.payload.DNResponse;

@lombok.Getter
@lombok.Setter
public abstract class RegistrationResponse extends DNResponse {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String registrationID;

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
			.append("code", response.code)
			.append("requestID", response.requestID)
			.append("dnID", dnID)
			.append("registrationID", registrationID)
			.toString();
	}
}
