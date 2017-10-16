package cn.openadr.payload;

/** 通用响应 */
public class DRResponse<R extends DRRequest> extends Payload {
	private static final long serialVersionUID = 1L;

	/** 请求 */
	protected final R request;
	/** 状态代码 */
	private int code;
	/** 错误描述 */
	private String description;

	public DRResponse(R request) {
		super();

		this.request = request;
	}

	public String getRequestID() {
		return request.getRequestID();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
