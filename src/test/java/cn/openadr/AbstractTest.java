package cn.openadr;

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
		jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
	}

	@Before
	public void before() {
		object = null;
	}

	@After
	public void after() throws IOException {
		System.out.println(object.getClass()
			.getSimpleName());
		System.out.println(jsonMapper.writeValueAsString(object));
		System.out.println();
	}
}
