package cn.openadr.restful;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.openadr.payload.reg.*;

@RequestMapping("/registration")
public interface RestRegistration extends RestApi {
	@PostMapping("/create")
	CreateRegistrationResponse create(@RequestBody CreateRegistrationRequest request);

	@PostMapping("/query")
	CreateRegistrationResponse query(@RequestBody QueryRegistrationRequest request);

	@PostMapping("/cancel")
	CancelRegistrationResponse cancel(@RequestBody CancelRegistrationRequest request);
}
