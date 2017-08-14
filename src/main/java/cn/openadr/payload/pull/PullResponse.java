package cn.openadr.payload.pull;

import java.util.ArrayList;
import java.util.List;

import cn.openadr.payload.OadrResponse;

/** 需要由VEN主动获取的信息 */
public class PullResponse extends OadrResponse<PullRequest> {
	private static final long serialVersionUID = 1L;

	/** 事件 */
	private List<String> eventIDs = new ArrayList<>();
	/** 报表 */
	private List<String> reportIDs = new ArrayList<>();
	/** 需要重新注册 */
	private boolean reregistration;
	/** 需要报送VEN采集的测点 */
	private boolean reportMetadata;
	/** 注册VEN默认支持的报表 */
	private boolean registerReport;

	public PullResponse(PullRequest request) {
		super(request);
	}

	public List<String> getEventIDs() {
		return eventIDs;
	}

	public void setEventIDs(List<String> eventIDs) {
		this.eventIDs = eventIDs;
	}

	public List<String> getReportIDs() {
		return reportIDs;
	}

	public void setReportIDs(List<String> reportIDs) {
		this.reportIDs = reportIDs;
	}

	public boolean isReregistration() {
		return reregistration;
	}

	public void setReregistration(boolean reregistration) {
		this.reregistration = reregistration;
	}

	public boolean isReportMetadata() {
		return reportMetadata;
	}

	public void setReportMetadata(boolean reportMetadata) {
		this.reportMetadata = reportMetadata;
	}

	public boolean isRegisterReport() {
		return registerReport;
	}

	public void setRegisterReport(boolean registerReport) {
		this.registerReport = registerReport;
	}
}
