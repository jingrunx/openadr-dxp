package cn.openadr.model.target;

import java.io.Serial;
import java.io.Serializable;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
public class Asset implements Serializable {
	@Serial
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String mrid;
}
