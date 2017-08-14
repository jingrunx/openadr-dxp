package cn.openadr.payload.opt;

import cn.openadr.payload.OadrRequest;

public class OptRequest extends OadrRequest {
	private static final long serialVersionUID = 1L;

	private String optID;

	public String getOptID() {
		return optID;
	}

	public void setOptID(String optID) {
		this.optID = optID;
	}
}
