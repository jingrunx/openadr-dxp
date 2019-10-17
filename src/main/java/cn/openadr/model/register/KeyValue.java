package cn.openadr.model.register;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
@AllArgsConstructor
public class KeyValue implements Serializable {
	private static final long serialVersionUID = 1L;

	private String key;
	private String value;
}
