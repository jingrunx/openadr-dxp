package cn.openadr.model.target;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.register.KeyValue;

/**
 * 资源
 */
public class Resource implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 资源ID
	 */
	public String resourceID;
	/**
	 * 资源名称
	 */
	public String resourceName;
	/**
	 * 资源状态
	 */
	public String status;
	/**
	 * 额定电压
	 */
	public Double ratedU;
	/**
	 * 额定电流
	 */
	public Double ratedI;
	/**
	 * 额定功率
	 */
	public Double ratedS;
	/**
	 * 上级资源
	 */
	public String parentResourceID;
	/**
	 * 资源类型，对应到资源模型
	 */
	public final EndDeviceAsset endDeviceAsset = new EndDeviceAsset();
	/**
	 * 关联的表计
	 */
	public MeterAsset meterAsset;
	/**
	 * 资源之间的横向关联关系
	 */
	public final List<String> relationID = new ArrayList<>();
	/**
	 * 资源的扩展属性
	 */
	public final List<KeyValue> properties = new ArrayList<>();

	public String getResourceID() {
		return resourceID;
	}

	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getRatedU() {
		return ratedU;
	}

	public void setRatedU(Double ratedU) {
		this.ratedU = ratedU;
	}

	public Double getRatedI() {
		return ratedI;
	}

	public void setRatedI(Double ratedI) {
		this.ratedI = ratedI;
	}

	public Double getRatedS() {
		return ratedS;
	}

	public void setRatedS(Double ratedS) {
		this.ratedS = ratedS;
	}

	public String getParentResourceID() {
		return parentResourceID;
	}

	public void setParentResourceID(String parentResourceID) {
		this.parentResourceID = parentResourceID;
	}

	public EndDeviceAsset getEndDeviceAsset() {
		return endDeviceAsset;
	}

	public MeterAsset getMeterAsset() {
		return meterAsset;
	}

	public void setMeterAsset(MeterAsset meterAsset) {
		this.meterAsset = meterAsset;
	}

	public List<String> getRelationID() {
		return relationID;
	}

	public List<KeyValue> getProperties() {
		return properties;
	}
}
