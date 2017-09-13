package cn.openadr.payload.rpt;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.report.PointMetaData;
import cn.openadr.model.report.ResourceModel;
import cn.openadr.model.target.Resource;

/** 元数据报告，由终端向主站报送拥有的资源和资源模型，定义的测点rID */
public class RegisterReportRequest extends ReportRequest {
	private static final long serialVersionUID = 1L;

	/** 资源模型，如：电表、中央空调、电锅炉、电动汽车等的模型 */
	private final List<ResourceModel> models = new ArrayList<>();
	/** DN拥有的全部资源清单 */
	private final List<Resource> resources = new ArrayList<>();
	/** 要报告的测点及数据类型 */
	private final List<PointMetaData> points = new ArrayList<>();

	public List<ResourceModel> getModels() {
		return models;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public List<PointMetaData> getPoints() {
		return points;
	}
}
