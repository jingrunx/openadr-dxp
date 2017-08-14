package cn.openadr.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import cn.openadr.model.OadrObject;

public class OadrObjectSerializer {
	public static class Id extends StdSerializer<OadrObject> {
		private static final long serialVersionUID = 1L;

		public Id() {
			super(OadrObject.class);
		}

		@Override
		public void serialize(OadrObject value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException {
			jgen.writeString(value.getId());
		}
	}

	public static class IdName extends StdSerializer<OadrObject> {
		private static final long serialVersionUID = 1L;

		public IdName() {
			super(OadrObject.class);
		}

		@Override
		public void serialize(OadrObject value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException {
			jgen.writeStartObject();
			jgen.writeStringField("id", value.getId());
			jgen.writeStringField("name", value.getName());
			jgen.writeEndObject();
		}
	}
}
