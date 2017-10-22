package cn.openadr.payload;

/** 由DN发出的响应 */
public abstract class DNResponse extends DRResponse {
	private static final long serialVersionUID = 1L;

	private String dnID;

	public String getDnID() {
		return dnID;
	}

	public void setDnID(String dnID) {
		this.dnID = dnID;
	}
}
