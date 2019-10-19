package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class Extension implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	public String name;
	@JsonInclude(value = Include.NON_EMPTY)
	public final List<KeyValue> info = new ArrayList<>();
}
