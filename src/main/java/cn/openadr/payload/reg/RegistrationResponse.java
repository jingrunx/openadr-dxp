package cn.openadr.payload.reg;

import cn.openadr.payload.DNResponse;

@lombok.Getter
@lombok.Setter
public abstract class RegistrationResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	private String registrationID;
}
