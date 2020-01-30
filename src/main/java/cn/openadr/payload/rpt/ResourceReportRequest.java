package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.target.MeterAsset;
import cn.openadr.model.target.Resource;
import cn.openadr.payload.DNRequest;

@lombok.Getter
public class ResourceReportRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String reportRequestID;
	public final List<Resource> resource = new ArrayList<>();
	public final List<MeterAsset> meterAsset = new ArrayList<>();
}
