package cn.openadr.payload;

/** 通用请求 */
public abstract class DRRequest extends DRObject {
	private static final long serialVersionUID = 1L;

	/** 请求编号 */
	private String requestID;

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
}
