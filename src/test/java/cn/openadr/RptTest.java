package cn.openadr;

import org.junit.Test;

import cn.openadr.domain.MetricType;
import cn.openadr.payload.rpt.CancelReportRequest;
import cn.openadr.payload.rpt.CancelReportResponse;
import cn.openadr.payload.rpt.CreateReportRequest;
import cn.openadr.payload.rpt.CreateReportResponse;
import cn.openadr.payload.rpt.DataReportResponse;
import cn.openadr.payload.rpt.HistoryReportRequest;
import cn.openadr.payload.rpt.LiveReportRequest;
import cn.openadr.payload.rpt.RegisterReportRequest;
import cn.openadr.payload.rpt.RegisterReportResponse;
import cn.openadr.utils.CommonUtils;
import cn.openadr.utils.MetricUtils;
import cn.openadr.utils.RptUtils;

public class RptTest extends AbstractTest {

	@Test
	public void testRegisterReportRequest() {
		RegisterReportRequest req = new RegisterReportRequest();
		CommonUtils.fillRptRequest(req);

		object = req;
	}

	@Test
	public void testRegisterReportResponse() {
		RegisterReportRequest req = new RegisterReportRequest();
		CommonUtils.fillRptRequest(req);

		RegisterReportResponse rep = new RegisterReportResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testCreateReportRequest() {
		CreateReportRequest req = new CreateReportRequest();
		CommonUtils.fillRptRequest(req);
		RptUtils.fillReportSpecifier(req.getReportSpecifier());

		object = req;
	}

	@Test
	public void testCreateReportResponse() {
		CreateReportRequest req = new CreateReportRequest();
		CommonUtils.fillRptRequest(req);

		CreateReportResponse rep = new CreateReportResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testCancelReportRequest() {
		CancelReportRequest req = new CancelReportRequest();
		CommonUtils.fillRptRequest(req);

		object = req;
	}

	@Test
	public void testCancelReportResponse() {
		CancelReportRequest req = new CancelReportRequest();
		CommonUtils.fillRptRequest(req);

		CancelReportResponse rep = new CancelReportResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testLiveReportRequest() {
		LiveReportRequest req = new LiveReportRequest();
		RptUtils.fillDataReportRequest(req);

		String resourceID = CommonUtils.id();
		req.getValues()
			.add(MetricUtils.createPointValue(MetricType.POWER_ACTIVE, resourceID, 97));
		req.getValues()
			.add(MetricUtils.createPointValue(MetricType.ENERGY_ACTIVE, resourceID, 4567));
		req.getValues()
			.add(MetricUtils.createPointValue(MetricType.VOLTAGE, resourceID, 232.2));

		object = req;
	}

	@Test
	public void testLiveReportResponse() {
		LiveReportRequest req = new LiveReportRequest();
		RptUtils.fillDataReportRequest(req);

		DataReportResponse rep = new DataReportResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}

	@Test
	public void testHistoryReportRequest() {
		HistoryReportRequest req = new HistoryReportRequest();
		RptUtils.fillDataReportRequest(req);

		String resourceID = CommonUtils.id();
		req.getValues()
			.add(MetricUtils.createPointValues(MetricType.POWER_ACTIVE, resourceID));
		req.getValues()
			.add(MetricUtils.createPointValues(MetricType.VOLTAGE, resourceID));
		req.getValues()
			.add(MetricUtils.createPointValues(MetricType.CURRENT, resourceID));

		object = req;
	}

	@Test
	public void testHistoryReportResponse() {
		HistoryReportRequest req = new HistoryReportRequest();
		RptUtils.fillDataReportRequest(req);

		DataReportResponse rep = new DataReportResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}
}
