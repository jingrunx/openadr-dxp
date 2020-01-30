package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class Extension implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
	public final List<KeyValue> info = new ArrayList<>();

	public String name;
}
