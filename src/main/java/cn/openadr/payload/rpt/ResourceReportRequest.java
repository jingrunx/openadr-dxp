package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.ResourceModel;
import cn.openadr.model.target.Resource;

public class ResourceReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	/** 资源模型，如：电表、中央空调、电锅炉、电动汽车等的模型 */
	private final List<ResourceModel> models = new ArrayList<>();
	/** DN拥有的全部资源清单 */
	private final List<Resource> resources = new ArrayList<>();

	public List<ResourceModel> getModels() {
		return models;
	}

	public List<Resource> getResources() {
		return resources;
	}
}
