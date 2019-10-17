package cn.openadr.payload;

/**
 * 通用请求
 */
@lombok.Getter
@lombok.Setter
public abstract class DNRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	/**
	 * DN编号
	 */
	private String dnID;
}
