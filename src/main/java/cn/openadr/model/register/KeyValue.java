package cn.openadr.model.register;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class KeyValue implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String key;
	public String value;
}
