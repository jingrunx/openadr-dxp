package cn.openadr.payload;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Author: jrxian
 * Date: 2020-01-12 11:28
 */
public class DRTypeIdResolver extends TypeIdResolverBase {
	private static final Map<String, Class<? extends DRObject>> types = new HashMap<>();

	static {
		for(MessageType value : MessageType.values()) {
			types.put(value.reqClass.getSimpleName(), value.reqClass);
			types.put(value.respClass.getSimpleName(), value.respClass);
		}
	}

	@Override
	public String idFromValue(Object value) {
		return idFromValueAndType(value, value.getClass());
	}

	@Override
	public String idFromValueAndType(Object value, Class<?> suggestedType) {
		return suggestedType.getSimpleName();
	}

	@Override
	public JavaType typeFromId(DatabindContext context, String id) throws IOException {
		TypeFactory factory = context.getTypeFactory();
		return factory.constructType(types.get(id));
	}

	@Override
	public Id getMechanism() {
		return Id.CUSTOM;
	}
}
