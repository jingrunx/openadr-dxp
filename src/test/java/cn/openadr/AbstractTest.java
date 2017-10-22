package cn.openadr;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaMapper;

public class AbstractTest {
	private static JodaMapper jsonMapper = new JodaMapper();

	public Object object;

	@BeforeClass
	public static void beforeClass() {
		jsonMapper.setWriteDatesAsTimestamps(false);
		jsonMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
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
