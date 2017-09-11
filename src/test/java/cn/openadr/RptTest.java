package cn.openadr;

import java.util.Collections;

import org.junit.Test;

import cn.openadr.model.report.ResourceModel;
import cn.openadr.model.target.Resource;
import cn.openadr.payload.rpt.CancelReportRequest;
import cn.openadr.payload.rpt.CreateReportRequest;
import cn.openadr.payload.rpt.CreateReportResponse;
import cn.openadr.payload.rpt.DataReportResponse;
import cn.openadr.payload.rpt.HistoryReportRequest;
import cn.openadr.payload.rpt.LiveReportRequest;
import cn.openadr.payload.rpt.MetadataReportRequest;
import cn.openadr.utils.CommonUtils;
import cn.openadr.utils.MetricUtils;
import cn.openadr.utils.RptUtils;

public class RptTest extends AbstractTest {

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
	public void testMetadataReportRequest() {
		MetadataReportRequest req = new MetadataReportRequest();
		CommonUtils.fillRptRequest(req);

		ResourceModel rm1 = new ResourceModel();
		RptUtils.fillResourceModel(rm1);
		req.getModels()
			.add(rm1);

		Resource r1 = new Resource();
		r1.setAsset(rm1.getAsset());
		r1.setId(CommonUtils.id());
		r1.setName("空调#1");
		req.getResources()
			.add(r1);

		Resource r2 = new Resource();
		r1.setAsset(rm1.getAsset());
		r2.setId(CommonUtils.id());
		r2.setName("空调#2");
		req.getResources()
			.add(r2);

		Resource rootMeter = new Resource();
		rootMeter.setId(CommonUtils.id());
		rootMeter.setName("总表#1");
		req.getResources()
			.add(rootMeter);

		Resource r3 = new Resource();
		r3.setId(CommonUtils.id());
		r3.setName("空调电表#1");
		r3.setParentID(rootMeter.getId());
		r3.getRelations()
			.put("reading", Collections.singletonList(r1.getId()));
		req.getResources()
			.add(r3);

		RptUtils.fillPointMetaData(req.getPoints());

		object = req;
	}

	@Test
	public void testLiveReportRequest() {
		LiveReportRequest req = new LiveReportRequest();
		RptUtils.fillDataReportRequest(req);

		req.getValues()
			.add(MetricUtils.createPointValue(1, 97));
		req.getValues()
			.add(MetricUtils.createPointValue(2, 4567));
		req.getValues()
			.add(MetricUtils.createPointValue(3, 232.2));

		object = req;
	}

	@Test
	public void testHistoryReportRequest() {
		HistoryReportRequest req = new HistoryReportRequest();
		RptUtils.fillDataReportRequest(req);

		req.getValues()
			.add(MetricUtils.createPointValues(1));
		req.getValues()
			.add(MetricUtils.createPointValues(2));
		req.getValues()
			.add(MetricUtils.createPointValues(3));

		object = req;
	}

	@Test
	public void testReportResponse() {
		LiveReportRequest req = new LiveReportRequest();
		RptUtils.fillDataReportRequest(req);

		DataReportResponse rep = new DataReportResponse(req);
		CommonUtils.fillResponse(rep);

		object = rep;
	}
}
