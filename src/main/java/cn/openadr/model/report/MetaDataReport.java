package cn.openadr.model.report;

import java.io.Serializable;

import org.joda.time.DateTime;

import lombok.NoArgsConstructor;

// OadrReportType
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class MetaDataReport implements Serializable {
	private static final long serialVersionUID = 1L;

	private DateTime createdDateTime;
	private final ReportDescription reportDescription = new ReportDescription();
}
