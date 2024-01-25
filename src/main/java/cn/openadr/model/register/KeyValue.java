package cn.openadr.model.register;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class KeyValue implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String key;
	public String value;
}
