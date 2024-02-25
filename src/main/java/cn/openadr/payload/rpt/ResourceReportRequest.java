package cn.openadr.payload.rpt;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.target.MeterAsset;
import cn.openadr.model.target.Resource;
import cn.openadr.payload.DNRequest;

@lombok.Getter
public class ResourceReportRequest extends DNRequest {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public Long reportRequestID;
	public final List<Resource> resource = new ArrayList<>();
	public final List<MeterAsset> meterAsset = new ArrayList<>();
}
