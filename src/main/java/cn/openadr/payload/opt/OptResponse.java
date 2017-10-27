package cn.openadr.payload.opt;

import javax.validation.constraints.NotNull;

import cn.openadr.payload.DNResponse;

public abstract class OptResponse extends DNResponse {
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
