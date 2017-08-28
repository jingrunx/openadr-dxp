package cn.openadr.payload;

/** 通用请求 */
public class DRRequest extends Payload {
	private static final long serialVersionUID = 1L;

	/** 版本号 */
	private int version;
	/** DN编号 */
	private String dnID;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getDnID() {
		return dnID;
	}

	public void setDnID(String dnID) {
		this.dnID = dnID;
	}
}
