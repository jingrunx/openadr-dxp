package cn.openadr.payload.opt;

import cn.openadr.payload.DNResponse;
import lombok.NonNull;

@lombok.Getter
@lombok.Setter
public abstract class OptResponse extends DNResponse {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@NonNull
	public String optID;
}
