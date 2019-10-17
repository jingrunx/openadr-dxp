package cn.openadr.payload.rpt;

import org.joda.time.DateTime;

import cn.openadr.payload.DNRequest;

@lombok.Getter
@lombok.Setter
public abstract class DataReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private String reportRequestID;
	private DateTime createdDateTime;
}
