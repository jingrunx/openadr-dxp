package cn.openadr.payload;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import cn.openadr.model.Response;

/**
 * 通用响应
 */
@lombok.Getter
public abstract class DRResponse extends DRObject {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@JsonUnwrapped
	public final Response response = new Response();
}
