package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.ReportDescription;
import cn.openadr.model.target.MeterAsset;
import cn.openadr.model.target.Resource;
import cn.openadr.payload.DNRequest;

public class ResourceReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private final List<Resource> resource = new ArrayList<>();
	private final List<MeterAsset> meterAsset = new ArrayList<>();
	private final List<ReportDescription> reportDescription = new ArrayList<>();

	public List<Resource> getResource() {
		return resource;
	}

	public List<MeterAsset> getMeterAsset() {
		return meterAsset;
	}

	public List<ReportDescription> getReportDescription() {
		return reportDescription;
	}
}
