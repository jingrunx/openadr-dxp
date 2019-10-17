package cn.openadr.payload.reg;

import cn.openadr.payload.DNRequest;

@lombok.Getter
@lombok.Setter
public abstract class RegistrationRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private String registrationID;
}
