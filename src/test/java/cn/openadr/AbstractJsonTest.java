package cn.openadr;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaMapper;

import cn.openadr.model.DN;
import cn.openadr.model.UN;

public class AbstractJsonTest<T> {
	private static JodaMapper jsonMapper = new JodaMapper();

	public T object;

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
		jsonMapper.writeValue(System.out, object);
	}

	@Test
	public void testVEN() throws IOException {
		DN ven = new DN();
		ven.setUn(new UN());

		String json = jsonMapper.writeValueAsString(ven);
		System.out.println(json);
	}
}
