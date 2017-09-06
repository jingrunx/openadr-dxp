package cn.openadr.payload;

/** 通用请求 */
public class DRRequest extends Payload {
	private static final long serialVersionUID = 1L;

	/** 编号 */
	private String requestID;
	/** DN编号 */
	private String dnID;

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String getDnID() {
		return dnID;
	}

	public void setDnID(String dnID) {
		this.dnID = dnID;
	}
}
