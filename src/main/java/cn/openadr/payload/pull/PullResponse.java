package cn.openadr.payload.pull;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import cn.openadr.payload.DRResponse;

/** 需要由VEN主动轮询获取的信息 */
public class PullResponse extends DRResponse<PullRequest> {
	private static final long serialVersionUID = 1L;

	/** 需要重新注册 */
	private Boolean reregistration;
	/** 要求VEN报告能够采集数据的测点 */
	private Boolean reportMetadata;
	/** 要求VEN重新注册默认报表 */
	private Boolean registerReport;
	/** 要求VEN报告可供调用策略以及降负荷能力 */
	private Boolean ability;
	/** 事件 */
	@JsonInclude(Include.NON_EMPTY)
	private final List<String> eventIDs = new ArrayList<>();
	/** 报表 */
	@JsonInclude(Include.NON_EMPTY)
	private final List<String> reportIDs = new ArrayList<>();

	public PullResponse(PullRequest request) {
		super(request);
	}

	public Boolean getReregistration() {
		return reregistration;
	}

	public void setReregistration(Boolean reregistration) {
		this.reregistration = reregistration;
	}

	public Boolean getReportMetadata() {
		return reportMetadata;
	}

	public void setReportMetadata(Boolean reportMetadata) {
		this.reportMetadata = reportMetadata;
	}

	public Boolean getRegisterReport() {
		return registerReport;
	}

	public void setRegisterReport(Boolean registerReport) {
		this.registerReport = registerReport;
	}

	public Boolean getAbility() {
		return ability;
	}

	public void setAbility(Boolean ability) {
		this.ability = ability;
	}

	public List<String> getEventIDs() {
		return eventIDs;
	}

	public List<String> getReportIDs() {
		return reportIDs;
	}
}
