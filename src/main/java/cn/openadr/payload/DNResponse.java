package cn.openadr.payload;

import java.io.Serial;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 由DN发出的响应
 */
@lombok.Getter
@lombok.Setter
public abstract class DNResponse extends DRResponse {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String dnID;

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
			.append("code", response.code)
			.append("requestID", response.requestID)
			.append("dnID", dnID)
			.toString();
	}
}
