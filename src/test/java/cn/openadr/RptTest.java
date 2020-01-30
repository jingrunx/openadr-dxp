package cn.openadr;

import org.joda.time.DateTime;
import org.junit.Test;
import cn.openadr.domain.EndDeviceAssetType;
import cn.openadr.model.report.MetaDataReport;
import cn.openadr.model.report.ReportRequest;
import cn.openadr.model.target.MeterAsset;
import cn.openadr.model.target.Resource;
import cn.openadr.payload.rpt.*;
import cn.openadr.utils.CommonUtils;
import cn.openadr.utils.MetricUtils;
import cn.openadr.utils.RptUtils;

public class RptTest extends AbstractTest {
	@Test
	public void testRegisterReportRequest() {
		RegisterReportRequest req = new RegisterReportRequest();
		CommonUtils.fillRequest(req);

		for(int i = 0; i < 2; ++i) {
			MetaDataReport report = new MetaDataReport();

//			report.setReportRequestID(CommonUtils.id());
			report.setCreatedDateTime(DateTime.now());

//			RptUtils.fillReportDescription(report.getReportDescription());

			req.getReport()
				.add(report);
		}

		object = req;
	}

	@Test
	public void testRegisterReportResponse() {
		RegisterReportResponse rep = new RegisterReportResponse();
		CommonUtils.fillResponse(rep);

		for(int i = 0; i < 2; ++i) {
			ReportRequest rreq = new ReportRequest();
			rreq.setReportRequestID(CommonUtils.id());

			RptUtils.fillReportSpecifier(rreq.getReportSpecifier());

			rep.getReportRequest()
				.add(rreq);
		}

		object = rep;
	}

	@Test
	public void testCreateReportRequest() {
		CreateReportRequest req = new CreateReportRequest();

		for(int i = 0; i < 2; ++i) {
			ReportRequest rreq = new ReportRequest();
			rreq.setReportRequestID(CommonUtils.id());

			RptUtils.fillReportSpecifier(rreq.getReportSpecifier());

			req.getReportRequest()
				.add(rreq);
		}

		object = req;
	}

	@Test
	public void testCreateReportResponse() {
		CreateReportResponse rep = new CreateReportResponse();
		CommonUtils.fillResponse(rep);

		for(int i = 0; i < 2; ++i)
			rep.getPendingReports()
				.getReportRequestID()
				.add(CommonUtils.id());

		object = rep;
	}

	@Test
	public void testCancelReportRequest() {
		CancelReportRequest req = new CancelReportRequest();
		CommonUtils.fillRequest(req);

		req.setReportToFollow(true);

		for(int i = 0; i < 2; ++i)
			req.getReportRequestID()
				.add(CommonUtils.id());

		object = req;
	}

	@Test
	public void testCancelReportResponse() {
		CancelReportResponse rep = new CancelReportResponse();
		CommonUtils.fillResponse(rep);

		for(int i = 0; i < 2; ++i)
			rep.getPendingReports()
				.getReportRequestID()
				.add(CommonUtils.id());

		object = rep;
	}

	@Test
	public void testLiveReportRequest() {
		MomentDataReportRequest req = new MomentDataReportRequest();
		RptUtils.fillDataReportRequest(req);

		req.addPointData(MetricUtils.createPointValue(1, 97));
		req.addPointData(MetricUtils.createPointValue(2, 4567));
		req.addPointData(MetricUtils.createPointValue(3, 232.2));

		object = req;
	}

	@Test
	public void testHistoryReportRequest() {
		IntervalDataReportRequest req = new IntervalDataReportRequest();
		RptUtils.fillDataReportRequest(req);

		req.addPointCurveData(MetricUtils.createPointValues(1));
		req.addPointCurveData(MetricUtils.createPointValues(2));
		req.addPointCurveData(MetricUtils.createPointValues(3));

		object = req;
	}

	@Test
	public void testUpdateReportResponse() {
		UpdateReportResponse rep = new UpdateReportResponse();
		CommonUtils.fillResponse(rep);

		CancelReportRequest creq = new CancelReportRequest();
		creq.setRequestID(CommonUtils.id());
		for(int i = 0; i < 2; ++i)
			creq.getReportRequestID()
				.add(CommonUtils.id());
		rep.setCancelReport(creq);

		object = rep;
	}

	@Test
	public void testResourceReportRequest() {
		ResourceReportRequest req = new ResourceReportRequest();

		for(int i = 0; i < 2; ++i) {
			Resource res = new Resource();
			res.getEndDeviceAsset()
				.setMrid(EndDeviceAssetType.Electric_Vehicle.name());
			res.setResourceID(CommonUtils.id());
			res.setResourceName("空调#" + i);
			req.getResource()
				.add(res);
		}

		for(int i = 0; i < 2; ++i) {
			MeterAsset meter = new MeterAsset();
			meter.setMrid(CommonUtils.id());
		}

//		RptUtils.fillReportDescription(req.getReportDescription());

		object = req;
	}
}
