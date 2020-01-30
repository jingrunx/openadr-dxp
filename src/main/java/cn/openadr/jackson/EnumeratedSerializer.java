package cn.openadr.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import cn.openadr.domain.EnumeratedType;

public class EnumeratedSerializer extends JsonSerializer<EnumeratedType> {

	@Override
	public void serialize(EnumeratedType value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(value.value());
	}
}
