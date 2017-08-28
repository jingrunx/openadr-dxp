package cn.openadr;

import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.junit.Test;

import cn.openadr.domain.MetricType;
import cn.openadr.model.report.PointValue;
import cn.openadr.model.report.PointValues;
import cn.openadr.payload.rpt.HistoryReportRequest;
import cn.openadr.payload.rpt.LiveReportRequest;
import cn.openadr.payload.rpt.RegisterReportRequest;
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

	}

	@Test
	public void testCreateReportRequest() {

	}

	@Test
	public void testCreateReportResponse() {

	}

	@Test
	public void testCancelReportRequest() {

	}

	@Test
	public void testCancelReportResponse() {

	}

	@Test
	public void testLiveReportRequest() {

	}

	@Test
	public void testLiveReportResponse() {

	}

	@Test
	public void testHistoryReportRequest() {

	}

	@Test
	public void testHistoryReportResponse() {

	}
}
