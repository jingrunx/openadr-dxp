package cn.openadr.restful;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.openadr.payload.evt.DistributeEventRequest;
import cn.openadr.payload.evt.QueryEventRequest;

@RequestMapping("/event")
public interface RestEvent extends RestApi {
	/**
	 * 查询
	 */
	@PostMapping("/query")
	DistributeEventRequest request(@RequestBody QueryEventRequest request);
}
