package cn.openadr.payload.reg;

import javax.validation.constraints.NotNull;

import cn.openadr.domain.TransportType;

// OadrCreatePartyRegistrationType
public class CreateRegistrationRequest extends RegistrationRequest {
	private static final long serialVersionUID = 1L;

	private String dnName;
	/** 只报送数据 */
	private boolean reportOnly;
	/** 主动拉的模式 */
	private boolean pullMode;
	/** 传输的数据需要签名 */
	private boolean signature;
	/** 传输类型 */
	@NotNull
	private TransportType transport;
	/**
	 * 传输地址
	 * JSON格式是RESTful地址
	 * MQTT格式是mqtt服务器地址
	 */
	private String transportAddress;

	public String getDnName() {
		return dnName;
	}

	public void setDnName(String dnName) {
		this.dnName = dnName;
	}

	public boolean isReportOnly() {
		return reportOnly;
	}

	public void setReportOnly(boolean reportOnly) {
		this.reportOnly = reportOnly;
	}

	public boolean isPullMode() {
		return pullMode;
	}

	public void setPullMode(boolean pullMode) {
		this.pullMode = pullMode;
	}

	public boolean isSignature() {
		return signature;
	}

	public void setSignature(boolean signature) {
		this.signature = signature;
	}

	public TransportType getTransport() {
		return transport;
	}

	public void setTransport(TransportType transport) {
		this.transport = transport;
	}

	public String getTransportAddress() {
		return transportAddress;
	}

	public void setTransportAddress(String transportAddress) {
		this.transportAddress = transportAddress;
	}
}
