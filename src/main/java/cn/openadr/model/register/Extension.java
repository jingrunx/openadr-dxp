package cn.openadr.model.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class Extension implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private List<KeyValue> info = new ArrayList<>();
}
