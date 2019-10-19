package cn.openadr.payload;

/**
 * 通用请求
 */
@lombok.Getter
@lombok.Setter
public abstract class DNRequest extends DRRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * DN编号
	 */
	public String dnID;
}
