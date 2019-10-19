package cn.openadr.payload.opt;

import cn.openadr.payload.DNRequest;
import lombok.NonNull;

@lombok.Getter
@lombok.Setter
public abstract class OptRequest extends DNRequest {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@NonNull
	public String optID;
}
