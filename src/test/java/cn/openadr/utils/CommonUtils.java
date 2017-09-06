package cn.openadr.utils;

import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import cn.openadr.domain.EndDeviceAssetType;
import cn.openadr.model.DRObject;
import cn.openadr.model.target.EndDeviceAsset;
import cn.openadr.model.target.Target;
import cn.openadr.payload.DRRequest;
import cn.openadr.payload.DRResponse;
import cn.openadr.payload.opt.OptRequest;
import cn.openadr.payload.reg.RegistrationRequest;
import cn.openadr.payload.rpt.ReportRequest;

public class CommonUtils {
	public static String id() {
		return UUID.randomUUID()
			.toString();
	}

	public static DateTime dtstart() {
		return LocalDate.now()
			.toDateTimeAtStartOfDay();
	}

	public static void fillObject(DRObject obj) {
		obj.setId(id());
		obj.setName(obj.getClass()
			.getSimpleName() + "#1");
	}

	public static void fillRequest(DRRequest req) {
		req.setRequestID(id());
		req.setVersion(1);
		req.setDnID("dn#1");
	}

	public static void fillRegRequest(RegistrationRequest req) {
		fillRequest(req);
		req.setRegistrationID(id());
	}

	public static void fillOptRequest(OptRequest req) {
		fillRequest(req);
		req.setOptID(id());
	}

	public static void fillRptRequest(ReportRequest req) {
		fillRequest(req);
		req.setReportRequestID(id());
	}

	public static void fillResponse(DRResponse<? extends DRRequest> rep) {
		rep.setCode(200);
		rep.setReason("successful");
	}

	public static void fillEndDeviceAsset(Target target) {
		target.getEndDeviceAsset()
			.add(new EndDeviceAsset(EndDeviceAssetType.Energy_Management_System));
	}
}
