package cn.openadr.model.target;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.register.KeyValue;

/**
 * 资源
 */
public class Resource implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 资源ID
	 */
	private String resourceID;
	/**
	 * 资源名称
	 */
	private String resourceName;
	/**
	 * 资源状态
	 */
	private String status;
	/**
	 * 额定电压
	 */
	private Double ratedU;
	/**
	 * 额定电流
	 */
	private Double ratedI;
	/**
	 * 额定功率
	 */
	private Double ratedS;
	/**
	 * 上级资源
	 */
	private String parentResourceID;
	/**
	 * 资源类型，对应到资源模型
	 */
	private final EndDeviceAsset endDeviceAsset = new EndDeviceAsset();
	/**
	 * 关联的表计
	 */
	private MeterAsset meterAsset;
	/**
	 * 资源之间的横向关联关系
	 */
	private final List<String> relationID = new ArrayList<>();
	/**
	 * 资源的扩展属性
	 */
	private final List<KeyValue> properties = new ArrayList<>();

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
