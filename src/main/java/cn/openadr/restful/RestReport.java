package cn.openadr.restful;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.openadr.payload.rpt.*;

/**
 * 报告
 */
@RequestMapping("/report")
public interface RestReport extends RestApi {
	/**
	 * DN包含的测点信息
	 */
	@PostMapping("/register")
	RegisterReportResponse register(@RequestBody RegisterReportRequest request);

	/**
	 * 可以由UN或DN发起
	 */
	@PostMapping("/create")
	CreateReportResponse create(@RequestBody CreateReportRequest request);

	/**
	 * 取消报告
	 */
	@PostMapping("/cancel")
	CancelReportResponse cancel(@RequestBody CancelReportRequest request);

	/**
	 * 更新报告
	 */
	@PostMapping("/update")
	UpdateReportResponse update(@RequestBody UpdateReportRequest request);

	/**
	 * 资源报告
	 */
	@PostMapping("/resource")
	UpdateReportResponse resource(@RequestBody ResourceReportRequest request);

	/**
	 * 实时数据
	 */
	@PostMapping("/moment")
	UpdateReportResponse moment(@RequestBody MomentDataReportRequest request);

	/**
	 * 历史曲线
	 */
	@PostMapping("/interval")
	UpdateReportResponse interval(@RequestBody IntervalDataReportRequest request);
}
