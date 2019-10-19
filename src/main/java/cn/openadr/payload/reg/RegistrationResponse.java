package cn.openadr.payload.reg;

import cn.openadr.payload.DNResponse;

@lombok.Getter
@lombok.Setter
public abstract class RegistrationResponse extends DNResponse {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String registrationID;
}
