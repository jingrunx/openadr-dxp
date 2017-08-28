package cn.openadr.payload;

/** 通用请求 */
public class DRRequest extends OadrPayload {
	private static final long serialVersionUID = 1L;

	/** 版本号 */
	private int version;
	/** VEN编号 */
	private String venID;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getVenID() {
		return venID;
	}

	public void setVenID(String venID) {
		this.venID = venID;
	}
}
