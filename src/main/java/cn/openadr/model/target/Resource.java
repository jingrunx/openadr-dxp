package cn.openadr.model.target;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.openadr.model.register.KeyValue;

/**
 * 资源
 */
@lombok.Getter
@lombok.Setter
public class Resource implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 资源类型，对应到资源模型
	 */
	public final EndDeviceAsset endDeviceAsset = new EndDeviceAsset();
	/**
	 * 关联的表计
	 */
	public final MeterAsset meterAsset = new MeterAsset();
	/**
	 * 资源之间的横向关联关系
	 */
	public final List<String> relationID = new ArrayList<>();
	/**
	 * 资源的扩展属性
	 */
	public final List<KeyValue> properties = new ArrayList<>();
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
}
