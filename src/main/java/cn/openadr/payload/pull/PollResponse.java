package cn.openadr.payload.pull;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.openadr.model.event.Event;
import cn.openadr.model.report.ReportSpecifier;
import cn.openadr.payload.DRResponse;

/** 需要由DN主动轮询获取的信息 */
public class PollResponse extends DRResponse<PollRequest> {
	private static final long serialVersionUID = 1L;

	/** 需要重新注册 */
	private Boolean reregistration;
	/** 要求DN报告能够采集数据的测点 */
	private Boolean registerReport;
	/** 要求DN重新注册默认报表 */
	private Boolean createReport;
	/** UN推送给DN的事件 */
	@JsonInclude(Include.NON_EMPTY)
	private final List<Event> events = new ArrayList<>();
	/** UN要求DN创建的报告 */
	@JsonInclude(Include.NON_EMPTY)
	private final List<ReportSpecifier> reports = new ArrayList<>();

	public PollResponse(PollRequest request) {
		super(request);
	}

	public Boolean getReregistration() {
		return reregistration;
	}

	public void setReregistration(Boolean reregistration) {
		this.reregistration = reregistration;
	}

	public Boolean getRegisterReport() {
		return registerReport;
	}

	public void setRegisterReport(Boolean registerReport) {
		this.registerReport = registerReport;
	}

	public Boolean getCreateReport() {
		return createReport;
	}

	public void setCreateReport(Boolean createReport) {
		this.createReport = createReport;
	}

	public List<Event> getEvents() {
		return events;
	}

	public List<ReportSpecifier> getReports() {
		return reports;
	}
}
