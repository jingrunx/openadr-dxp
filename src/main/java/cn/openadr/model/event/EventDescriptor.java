package cn.openadr.model.event;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import cn.openadr.domain.EventStatus;
import cn.openadr.domain.EventStatus.EventStatusDeserializer;
import cn.openadr.jackson.EnumeratedSerializer;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * 事件描述
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventDescriptor extends QualifiedEventID {
	private static final long serialVersionUID = 1L;

	/**
	 * 事件状态
	 */
	@NonNull
	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = EventStatusDeserializer.class)
	private EventStatus status;

	/**
	 * 优先级
	 */
	private int priority;

	/**
	 * 测试事件
	 */
	private boolean test;

	/**
	 * 修改时间
	 */
	private DateTime modificationDateTime;

	/**
	 * 修改原因
	 */
	private String modificationReason;

	/**
	 * 创建时间
	 */
	private DateTime createdDateTime;

	/**
	 * 注释
	 */
	private String comment;

	/**
	 * 市场信息
	 */
	@JsonProperty("marketURL")
	private String marketContext;
}
