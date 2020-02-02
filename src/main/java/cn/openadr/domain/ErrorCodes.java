package cn.openadr.domain;

/**
 * Author: jrxian
 * Date: 2020-02-01 14:06
 */
public enum ErrorCodes {
	OUT_OF_SEQUENCE(450, "event ordering, uid ordering, modification number sequencing"),
	NOT_ALLOWED(451, "changing an event in the past"),
	INVALID_ID(452, "eventID, optID, requestID, registrationID, etc."),
	NOT_RECOGNIZED(453, "reportName, signalName, etc."),
	INVALID_DATA(454, "out of range signal or report data"),
	COMPLIANCE_ERROR(459, "Other"),

	SIGNAL_NOT_SUPPORTED(460, "recognized, but not supported"),
	REPORT_NOT_SUPPORTED(461, "recognized, but not supported"),
	TARGET_MISMATCH(462, "cannot resolve target/market context to VEN or its resources"),
	NOT_REGISTERED(463, "Not Registered/Authorized"),
	DEPLOYMENT_ERROR(469, "Other"),
	;

	public final int code;
	public final String literal;

	ErrorCodes(int code, String literal) {
		this.code = code;
		this.literal = literal;
	}
}
