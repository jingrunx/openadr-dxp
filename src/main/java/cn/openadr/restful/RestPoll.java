package cn.openadr.restful;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.openadr.payload.DRObject;
import cn.openadr.payload.poll.DrResponse;
import cn.openadr.payload.poll.Poll;

@RequestMapping("/poll")
public interface RestPoll extends RestApi {
	/**
	 * 查询事件或报表
	 */
	@PostMapping("/request")
	DRObject request(@RequestBody Poll request);

	@PostMapping("/response")
	void response(@RequestBody DrResponse response);
}
