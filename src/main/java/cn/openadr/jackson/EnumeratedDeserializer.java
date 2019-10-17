package cn.openadr.jackson;

import java.io.IOException;
import java.util.Objects;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import cn.openadr.domain.EnumeratedType;

public class EnumeratedDeserializer<E extends Enum<?> & EnumeratedType> extends JsonDeserializer<E> {
	private final Class<E> clazz;

	public EnumeratedDeserializer(Class<E> clazz) {
		super();

		this.clazz = clazz;
	}

	@Override
	public E deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		for(E value : clazz.getEnumConstants()) {
			if(Objects.equals(value.value(), p.getText()))
				return value;
		}

		return null;
	}
}
