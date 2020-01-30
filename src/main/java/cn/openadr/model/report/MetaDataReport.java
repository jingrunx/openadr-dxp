package cn.openadr.model.report;

import java.io.Serializable;

import org.joda.time.DateTime;
import lombok.NoArgsConstructor;

// OadrReportType
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class MetaDataReport implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public final ReportDescription reportDescription = new ReportDescription();
	public DateTime createdDateTime;
}
