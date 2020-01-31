package cn.openadr.payload.reg;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import cn.openadr.domain.TransportType;

// OadrCreatePartyRegistrationType
@lombok.Getter
@lombok.Setter
public class CreateRegistrationRequest extends RegistrationRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String dnName;
	/**
	 * 只报送数据
	 */
	public boolean reportOnly;
	/**
	 * 主动拉的模式
	 */
	public boolean pullMode;
	/**
	 * 传输的数据需要签名
	 */
	public boolean signature;
	/**
	 * 传输类型
	 */
	@JsonDeserialize(using = TransportType.Deserializer.class)
	public TransportType transport;
	/**
	 * 传输地址
	 * JSON格式是RESTful地址
	 * MQTT格式是mqtt服务器地址
	 */
	public String transportAddress;
}
