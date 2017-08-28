package cn.openadr.payload;

/** 通用响应 */
public class DRResponse<R extends DRRequest> extends OadrPayload {
	private static final long serialVersionUID = 1L;

	/** 请求 */
	protected final R request;
	/** 状态代码 */
	private int code;
	/** 错误原因 */
	private String reason;

	public DRResponse(R request) {
		super();
		this.request = request;
	}

	public String getRequestID() {
		return request.getId();
	}

	public String getDnID() {
		return request.getDnID();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
