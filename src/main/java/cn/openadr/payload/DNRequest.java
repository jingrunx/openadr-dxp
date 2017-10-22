package cn.openadr.payload;

/** 通用请求 */
public class DNRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	/** DN编号 */
	private String dnID;

	public String getDnID() {
		return dnID;
	}

	public void setDnID(String dnID) {
		this.dnID = dnID;
	}
}
