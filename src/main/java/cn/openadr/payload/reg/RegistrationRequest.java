package cn.openadr.payload.reg;

import cn.openadr.payload.DNRequest;

@lombok.Getter
@lombok.Setter
public abstract class RegistrationRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String registrationID;
}
