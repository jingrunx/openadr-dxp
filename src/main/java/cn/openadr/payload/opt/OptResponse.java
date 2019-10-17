package cn.openadr.payload.opt;

import cn.openadr.payload.DNResponse;
import lombok.NonNull;

@lombok.Getter
@lombok.Setter
public abstract class OptResponse extends DNResponse {
	private static final long serialVersionUID = 1L;

	@NonNull
	private String optID;
}
