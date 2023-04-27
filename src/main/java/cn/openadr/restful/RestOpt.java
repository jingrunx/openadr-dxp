package cn.openadr.restful;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.openadr.payload.opt.CancelOptRequest;
import cn.openadr.payload.opt.CancelOptResponse;
import cn.openadr.payload.opt.CreateOptRequest;
import cn.openadr.payload.opt.CreateOptResponse;

@RequestMapping("/opt")
public interface RestOpt extends RestApi {
	@PostMapping("/create")
	CreateOptResponse create(@RequestBody CreateOptRequest request);

	@PostMapping("/cancel")
	CancelOptResponse cancel(@RequestBody CancelOptRequest request);
}
