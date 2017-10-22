package cn.openadr.payload.opt;

import javax.validation.constraints.NotNull;

import cn.openadr.payload.DNRequest;

public class OptRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	@NotNull
	private String optID;

	public String getOptID() {
		return optID;
	}

	public void setOptID(String optID) {
		this.optID = optID;
	}
}
