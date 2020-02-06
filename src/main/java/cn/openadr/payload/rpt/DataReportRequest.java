package cn.openadr.payload.rpt;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.joda.time.DateTime;
import cn.openadr.payload.DNRequest;

@lombok.Getter
@lombok.Setter
public abstract class DataReportRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String reportRequestID;
	public DateTime createdDateTime;

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
			.append("requestID", requestID)
			.append("dnID", dnID)
			.append("reportRequestID", reportRequestID)
			.toString();
	}
}
