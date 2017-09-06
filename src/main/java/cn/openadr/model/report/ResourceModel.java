package cn.openadr.model.report;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.target.Asset;

/** 资源模型 */
/*
 * 资源模型用于描述某一类资源具有的通用属性或数据。如：
 * <li>电表资源具有的通用属性有：三相电流、电压、功率、电量等
 * <li>空调资源具有的通用属性有：冷冻水出回水温度、冷却水出回水温度、压力等
 */
public class ResourceModel {
	/** 资源类型 */
	private Asset asset;
	/** 资源具有的测点：key=点号，value=点描述 */
	private final List<MetricMetaData> metrics = new ArrayList<>();

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public List<MetricMetaData> getMetrics() {
		return metrics;
	}
}
