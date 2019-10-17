package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.target.Resource;
import cn.openadr.payload.DNRequest;

@lombok.Getter
public class ResourceReportRequest extends DNRequest {
	private static final long serialVersionUID = 1L;

	private String reportRequestID;
	private final List<Resource> resource = new ArrayList<>();
//	private final List<MeterAsset> meterAsset = new ArrayList<>();
}
