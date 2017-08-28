package cn.openadr;

import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.junit.Test;

import cn.openadr.domain.MetricType;
import cn.openadr.model.report.PointValue;
import cn.openadr.model.report.PointValues;
import cn.openadr.payload.rpt.CancelReportRequest;
import cn.openadr.payload.rpt.CancelReportResponse;
import cn.openadr.payload.rpt.CreateReportRequest;
import cn.openadr.payload.rpt.CreateReportResponse;
import cn.openadr.payload.rpt.DataReportRequest;
import cn.openadr.payload.rpt.DataReportResponse;
import cn.openadr.payload.rpt.HistoryReportRequest;
import cn.openadr.payload.rpt.LiveReportRequest;
import cn.openadr.payload.rpt.RegisterReportRequest;
import cn.openadr.payload.rpt.RegisterReportResponse;
import cn.openadr.payload.rpt.ReportRequest;
import cn.openadr.tsdb.TagKey;
import cn.openadr.tsdb.ValuePart;

public class RptTest extends AbstractJsonTest<ReportRequest> {
	private DateTime dtstart = LocalDate.now()
		.toDateTimeAtStartOfDay();

	@Test
	public void testLiveReport() {
		LiveReportRequest request = new LiveReportRequest();

		for (int i = 0; i < 2; ++i) {
			PointValue value = new PointValue();

			value.setMetric(MetricType.CURRENT.value());
			value.getTags()
				.put(TagKey.device, UUID.randomUUID()
					.toString());

			value.getValue()
				.setValue(5.5f);

			request.getValues()
				.add(value);
		}

		object = request;
	}

	@Test
	public void testHistoryReport() {
		HistoryReportRequest request = new HistoryReportRequest();

		PointValues value = new PointValues();
		value.setMetric(MetricType.CURRENT.value());
		value.getTags()
			.put(TagKey.device, UUID.randomUUID()
				.toString());
		value.getRegular()
			.setDtstart(dtstart);
		value.getRegular()
			.setPeriod(Minutes.minutes(15)
				.toPeriod());
		value.getRegular()
			.setArray(new double[] { 1, 2, 3, 4, 5 });
		request.getValues()
			.add(value);

		value.getIrregular()
			.getValues()
			.add(new ValuePart(1.0d, dtstart));
		value.getIrregular()
			.getValues()
			.add(new ValuePart(2.0d, dtstart.plusMinutes(15)));
		value.getIrregular()
			.getValues()
			.add(new ValuePart(3.0d, dtstart.plusMinutes(60)));

		object = request;
	}
	

	@Test
	public void testRegisterReportRequest() {
		RegisterReportRequest v = new RegisterReportRequest();

		CommonUtils.fillRptRequest(v);

		object = v;
	}

	@Test
	public void testRegisterReportResponse() {
		RegisterReportRequest v = new RegisterReportRequest();
		CommonUtils.fillRptRequest(v);
		RegisterReportResponse response = new RegisterReportResponse(v);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
		object = response;
	}

	@Test
	public void testCreateReportRequest() {
		CreateReportRequest request =new CreateReportRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setReportRequestID(FillUtils.uuid());
		request.setVersion(0);
		object = request;
	}

	@Test
	public void testCreateReportResponse() {
		CreateReportRequest request =new CreateReportRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setReportRequestID(FillUtils.uuid());
		request.setVersion(0);
		CreateReportResponse response =new CreateReportResponse(request);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
		object = response;
	}

	@Test
	public void testCancelReportRequest() {
		CancelReportRequest request =new CancelReportRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setReportRequestID(FillUtils.uuid());
		request.setVersion(0);
		object = request;
	}

	@Test
	public void testCancelReportResponse() {
		CancelReportRequest request =new CancelReportRequest();
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setReportRequestID(FillUtils.uuid());
		request.setVersion(0);
		CancelReportResponse response =new CancelReportResponse(request);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
		object = response;
	}

	@Test
	public void testLiveReportRequest() {
		LiveReportRequest request =new LiveReportRequest();
		request.setCreatedDateTime(dtstart);
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setReportRequestID(FillUtils.uuid());
		request.setReportSpecifierID(FillUtils.uuid());
		request.setVersion(0);
		object = request;
	}

	@Test
	public void testLiveReportResponse() {
		DataReportRequest request = new DataReportRequest();
		request.setCreatedDateTime(dtstart);
		request.setDnID(FillUtils.uuid());
		request.setDnID(FillUtils.uuid());
		request.setReportRequestID(FillUtils.uuid());
		request.setReportSpecifierID(FillUtils.uuid());
		request.setVersion(0);
		DataReportResponse response = new DataReportResponse(request);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
		object = response;
	}

	@Test
	public void testHistoryReportRequest() {
		HistoryReportRequest request = new HistoryReportRequest();
		request.setCreatedDateTime(dtstart);
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setReportRequestID(FillUtils.uuid());
		request.setReportSpecifierID(FillUtils.uuid());
		request.setVersion(0);
		object = request;
	}

	@Test
	public void testHistoryReportResponse() {
		HistoryReportRequest request = new HistoryReportRequest();
		request.setCreatedDateTime(dtstart);
		request.setDnID(FillUtils.uuid());
		request.setId(FillUtils.uuid());
		request.setReportRequestID(FillUtils.uuid());
		request.setReportSpecifierID(FillUtils.uuid());
		request.setVersion(0);
		DataReportResponse response = new DataReportResponse(request);
		response.setCode(200);
		response.setId(FillUtils.uuid());
		response.setReason("no reason");
		object = response;
	}
}
