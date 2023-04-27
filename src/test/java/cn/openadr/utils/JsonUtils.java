package cn.openadr.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class JsonUtils {
	public static final ObjectMapper jsonMapper = new ObjectMapper();

	static {
		jsonMapper.registerModule(new JavaTimeModule());
		jsonMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		jsonMapper.disable(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS);
		jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
	}
}
