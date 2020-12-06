package cn.openadr.model;

import java.io.Serializable;

// EiResponseType
@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Response implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 状态代码
	 */
	public Integer code;
	/**
	 * 错误描述
	 */
	public String description;
	/**
	 * 请求ID
	 */
	public String requestID;
}
