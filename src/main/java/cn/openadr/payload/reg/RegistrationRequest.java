package cn.openadr.payload.reg;

import cn.openadr.payload.DRRequest;

public class RegistrationRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	private String registrationID;

	public String getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
	}
}
