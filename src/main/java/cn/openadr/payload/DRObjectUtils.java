package cn.openadr.payload;

/**
 * Author: jrxian
 * Date: 2020-02-05 21:48
 */
public final class DRObjectUtils {
	private DRObjectUtils() {
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
}
