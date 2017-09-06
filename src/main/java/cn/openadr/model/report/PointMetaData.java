package cn.openadr.model.report;

/** 采样点元数据 */
public class PointMetaData {
	/** 同一个DN唯一 */
	private int rID;
	/** 测点名 */
	private String metric;
	/** 对应的resourceID */
	private String resourceID;
	/** 采样周期 */
	private final SamplingRate samplingRate = new SamplingRate();

	public int getrID() {
		return rID;
	}

	public void setrID(int rID) {
		this.rID = rID;
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
	}

	public String getResourceID() {
		return resourceID;
	}

	public void setResourceID(String resourceID) {
		this.resourceID = resourceID;
	}

	public SamplingRate getSamplingRate() {
		return samplingRate;
	}
}
