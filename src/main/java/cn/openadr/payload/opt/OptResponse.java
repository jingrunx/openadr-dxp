package cn.openadr.payload.opt;

import java.io.Serial;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import cn.openadr.payload.DNResponse;

@lombok.Getter
@lombok.Setter
public abstract class OptResponse extends DNResponse {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public Long optID;

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
			.append("code", response.code)
			.append("requestID", response.requestID)
			.append("dnID", dnID)
			.append("optID", optID)
			.toString();
	}
}
