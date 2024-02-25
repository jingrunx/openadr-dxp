package cn.openadr.payload;

import java.io.Serial;

/**
 * 通用请求
 */
@lombok.Getter
@lombok.Setter
public abstract class DRRequest extends DRObject {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 请求编号
	 */
	public Long requestID;
}
