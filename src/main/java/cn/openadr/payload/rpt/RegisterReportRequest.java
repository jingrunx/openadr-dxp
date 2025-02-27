package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.MetaDataReport;
import cn.openadr.payload.DNRequest;

// OadrRegisterReportType
@lombok.Getter
@lombok.Setter
public class RegisterReportRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String reportRequestID;
	public final List<MetaDataReport> report = new ArrayList<>();
}
