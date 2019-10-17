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
	private static final long serialVersionUID = 1L;

	/**
	 * 状态代码
	 */
	@NonNull
	private Integer code;
	/**
	 * 错误描述
	 */
	private String description;
	/**
	 * 请求ID
	 */
	@NonNull
	private String requestID;
}
