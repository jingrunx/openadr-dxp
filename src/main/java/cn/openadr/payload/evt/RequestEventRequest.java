package cn.openadr.payload.evt;

import cn.openadr.payload.DRRequest;

public class RequestEventRequest extends DRRequest {
	private static final long serialVersionUID = 1L;

	/** 限制返回的事件数目 */
	private int replyLimit;

	public int getReplyLimit() {
		return replyLimit;
	}

	public void setReplyLimit(int replyLimit) {
		this.replyLimit = replyLimit;
	}
}
