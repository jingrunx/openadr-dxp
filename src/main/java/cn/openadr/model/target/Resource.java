package cn.openadr.model.target;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 资源 */
public class Resource implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 资源ID */
	private String resourceID;
	/** 资源名称 */
	private String resourceName;
	/** 资源状态 */
	private String status;
	/** 额定电压 */
	private Double ratedU;
	/** 额定电流 */
	private Double ratedI;
	/** 额定功率 */
	private Double ratedS;
	/** 资源类型，对应到资源模型 */
	private Asset asset;
	/** 上级资源 */
	private String parentResourceID;
	/** 资源之间的关联关系，key=关联类型, values=关联的资源 */
	private final Map<String, List<String>> relations = new HashMap<>();
	/** 扩展属性 */
	private final Map<String, Object> properties = new HashMap<>();

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

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public String getParentResourceID() {
		return parentResourceID;
	}

	public void setParentResourceID(String parentResourceID) {
		this.parentResourceID = parentResourceID;
	}

	public Map<String, List<String>> getRelations() {
		return relations;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}
}
