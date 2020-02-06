package cn.openadr.payload;

import java.util.Optional;

import cn.openadr.model.Response;

/**
 * Author: jrxian
 * Date: 2020-02-05 21:48
 */
public final class DRObjectUtils {
	private DRObjectUtils() {
	}

	public static String className(Object object) {
		return Optional.ofNullable(object)
			.map(Object::getClass)
			.map(Class::getSimpleName)
			.orElse(null);
	}

	public static String dnID(Object object) {
		if(object instanceof DNRequest) {
			return ((DNRequest) object).dnID;
		} else if(object instanceof DNResponse) {
			return ((DNResponse) object).dnID;
		} else {
			return null;
		}
	}

	public static String requestID(Object object) {
		if(object instanceof DNRequest) {
			return ((DNRequest) object).requestID;
		} else if(object instanceof DNResponse) {
			return ((DNResponse) object).response.requestID;
		} else {
			return null;
		}
	}

	public static String requestID(DNRequest request, DNResponse response) {
		return Optional.ofNullable(request)
			.map(DNRequest::getRequestID)
			.orElse(Optional.ofNullable(response)
				.map(DNResponse::getResponse)
				.map(Response::getRequestID)
				.orElse(null));
	}

	public static String dnID(DNRequest request, DNResponse response) {
		return Optional.ofNullable(request)
			.map(DNRequest::getDnID)
			.orElse(Optional.ofNullable(response)
				.map(DNResponse::getDnID)
				.orElse(null));
	}
}
