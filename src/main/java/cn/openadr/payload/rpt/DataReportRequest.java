package cn.openadr.payload.rpt;

import org.joda.time.DateTime;
import cn.openadr.payload.DNRequest;

@lombok.Getter
@lombok.Setter
public abstract class DataReportRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String reportRequestID;
	public DateTime createdDateTime;
}
