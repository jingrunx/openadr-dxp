package cn.openadr.payload;

/**
 * 由DN发出的响应
 */
@lombok.Getter
@lombok.Setter
public abstract class DNResponse extends DRResponse {
	private static final long serialVersionUID = 1L;

	private String dnID;
}
