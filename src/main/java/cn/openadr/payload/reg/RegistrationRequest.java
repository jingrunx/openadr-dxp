package cn.openadr.payload.reg;

import cn.openadr.payload.OadrRequest;

public class RegistrationRequest extends OadrRequest {
	private static final long serialVersionUID = 1L;

	private String registrationID;

	public String getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
	}
}
