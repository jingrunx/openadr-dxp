package cn.openadr;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaMapper;

/**
 * Author: jrxian
 * Date: 2019-10-16 20:20
 */
public class JsonTest {
	public static void main(String[] args) throws JsonProcessingException {
		JodaMapper objectMapper = new JodaMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		objectMapper.setWriteDatesAsTimestamps(false);

//		System.out.println(objectMapper.writeValueAsString(event));
	}
}
