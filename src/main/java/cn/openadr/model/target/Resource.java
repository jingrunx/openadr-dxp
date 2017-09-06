package cn.openadr.model.target;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.openadr.model.DRObject;

/** 资源 */
public class Resource extends DRObject {
	private static final long serialVersionUID = 1L;

	/** 额定电压 */
	private Double ratedU;
	/** 额定电流 */
	private Double ratedI;
	/** 额定功率 */
	private Double ratedS;
	/** 资源类型，对应到资源模型 */
	private Asset asset;
	/** 上级资源 */
	private String parentID;
	/** 资源之间的关联关系，key=关联类型, values=关联的资源 */
	private final Map<String, List<String>> relations = new HashMap<>();
	/** 扩展属性 */
	private final Map<String, Object> properties = new HashMap<>();

	public Resource() {
		super();
	}

	public Resource(String id) {
		super(id);
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

	public String getParentID() {
		return parentID;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public Map<String, List<String>> getRelations() {
		return relations;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}
}
