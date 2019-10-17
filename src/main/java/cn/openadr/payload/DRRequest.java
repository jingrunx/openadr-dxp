package cn.openadr.payload;

/**
 * 通用请求
 */
@lombok.Getter
@lombok.Setter
public abstract class DRRequest extends DRObject {
	private static final long serialVersionUID = 1L;

	/**
	 * 请求编号
	 */
	private String requestID;
}
