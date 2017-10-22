package cn.openadr.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

// EiResponseType
public class Response implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 状态代码 */
	@NotNull
	private int code;
	/** 错误描述 */
	private String description;
	/** 请求ID */
	@NotNull
	private String requestID;

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

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
}
