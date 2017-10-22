package cn.openadr.payload;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import cn.openadr.model.Response;

/** 通用响应 */
public abstract class DRResponse extends DRObject {
	private static final long serialVersionUID = 1L;

	@NotNull
	private final Response response = new Response();

	@JsonUnwrapped
	public Response getResponse() {
		return response;
	}
}
