package cn.openadr.payload;

/**
 * 由DN发出的响应
 */
@lombok.Getter
@lombok.Setter
public abstract class DNResponse extends DRResponse {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String dnID;
}
