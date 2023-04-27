package cn.openadr;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class AbstractTest {
	private static final ObjectMapper jsonMapper = new ObjectMapper();

	public Object object;

	@BeforeClass
	public static void beforeClass() {
		jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
	}

	@Before
	public void before() {
		object = null;
	}

	@After
	public void after() throws IOException {
		String name = object.getClass()
			.getSimpleName();

		String path = "C:\\Users\\jrxian\\Workspaces\\openadr\\openadr-dxp\\src\\test\\resources\\";
		File file = new File(path + name + ".json");
		jsonMapper.writeValue(file, object);

		System.out.println(name);
		System.out.println(jsonMapper.writeValueAsString(object));
		System.out.println();
	}
}
