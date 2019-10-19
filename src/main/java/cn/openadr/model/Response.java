package cn.openadr.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

// EiResponseType
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 状态代码
	 */
	@NonNull
	public Integer code;
	/**
	 * 错误描述
	 */
	public String description;
	/**
	 * 请求ID
	 */
	@NonNull
	public String requestID;
}
