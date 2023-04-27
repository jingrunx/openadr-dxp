package cn.openadr;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import com.fasterxml.jackson.databind.ObjectMapper;
import cn.openadr.utils.JsonUtils;

public class AbstractTest {
	private static final ObjectMapper jsonMapper = JsonUtils.jsonMapper;

	public Object object;

	@BeforeEach
	public void before() {
		object = null;
	}

	@AfterEach
	public void after() throws IOException {
		String name = object.getClass()
			.getSimpleName();

		String path = "C:/Windows/Temp/openadr";
		File file = new File(path + name + ".json");
		jsonMapper.writeValue(file, object);

		System.out.println(name);
		System.out.println(jsonMapper.writeValueAsString(object));
		System.out.println();
	}
}
