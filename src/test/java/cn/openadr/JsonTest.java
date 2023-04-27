package cn.openadr;

import java.io.IOException;

import cn.openadr.payload.DRObject;
import cn.openadr.payload.reg.QueryRegistrationRequest;
import cn.openadr.utils.JsonUtils;

/**
 * Author: jrxian
 * Date: 2019-10-16 20:20
 */
public class JsonTest {

	public static void main(String[] args) throws IOException {
		QueryRegistrationRequest request = new QueryRegistrationRequest();
		String json = JsonUtils.jsonMapper.writeValueAsString(request);
		System.out.println(json);

		Object object = JsonUtils.jsonMapper.readValue(json, DRObject.class);
		Class<?> objectClass = object.getClass();
		System.out.println(objectClass.getName());
	}
}
