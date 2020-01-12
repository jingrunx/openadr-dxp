package cn.openadr;

import java.io.IOException;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaMapper;
import cn.openadr.payload.DRObject;
import cn.openadr.payload.reg.QueryRegistrationRequest;

/**
 * Author: jrxian
 * Date: 2019-10-16 20:20
 */
public class JsonTest {
	public static void main(String[] args) throws IOException {
		JodaMapper objectMapper = new JodaMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		objectMapper.setWriteDatesAsTimestamps(false);

		QueryRegistrationRequest request = new QueryRegistrationRequest();
		String json = objectMapper.writeValueAsString(request);
		System.out.println(json);

		Object object = objectMapper.readValue(json, DRObject.class);
		Class<?> objectClass = object.getClass();
		System.out.println(objectClass.getName());
	}
}
