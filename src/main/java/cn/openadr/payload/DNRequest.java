package cn.openadr.payload;

import java.io.Serial;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 通用请求
 */
@lombok.Getter
@lombok.Setter
public abstract class DNRequest extends DRRequest {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * DN编号
	 */
	public String dnID;

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
			.append("requestID", requestID)
			.append("dnID", dnID)
			.toString();
	}
}
