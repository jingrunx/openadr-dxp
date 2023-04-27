package cn.openadr.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import cn.openadr.domain.EndDeviceAssetType;
import cn.openadr.model.Response;
import cn.openadr.model.target.EndDeviceAsset;
import cn.openadr.model.target.Target;
import cn.openadr.payload.DNRequest;
import cn.openadr.payload.DRRequest;
import cn.openadr.payload.DRResponse;
import cn.openadr.payload.opt.OptRequest;
import cn.openadr.payload.reg.RegistrationRequest;

public class CommonUtils {
	public static String id() {
		return UUID.randomUUID()
			.toString();
	}

	public static LocalDateTime dtstart() {
		return LocalDate.now()
			.atStartOfDay();
	}

	public static void fillRequest(DRRequest req) {
		req.setRequestID(id());
		req.setVersion(1);
	}

	public static void fillRequest(DNRequest req) {
		fillRequest((DRRequest) req);
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

	public static void fillResponse(DRResponse rep) {
		fillResponse(rep.getResponse());
	}

	public static void fillResponse(Response rep) {
		rep.setCode(200);
		rep.setDescription("successful");
		rep.setRequestID(CommonUtils.id());
	}

	public static void fillEndDeviceAsset(Target target) {
		EndDeviceAsset asset = new EndDeviceAsset();
		asset.setMrid(EndDeviceAssetType.Energy_Management_System.name());
		target.getEndDeviceAsset()
			.add(asset);
	}
}
