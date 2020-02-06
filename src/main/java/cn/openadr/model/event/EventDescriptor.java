package cn.openadr.model.event;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import cn.openadr.domain.EventStatus;
import cn.openadr.jackson.EnumeratedSerializer;
import lombok.NoArgsConstructor;

/**
 * 事件描述
 */
@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class EventDescriptor extends QualifiedEventID {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 事件状态
	 */
	@JsonSerialize(using = EnumeratedSerializer.class)
	@JsonDeserialize(using = EventStatus.Deserializer.class)
	public EventStatus status;

	/**
	 * 优先级
	 */
	public Integer priority;

	/**
	 * 测试事件
	 */
	public Boolean test;

	/**
	 * 修改时间
	 */
	public DateTime modificationDateTime;

	/**
	 * 修改原因
	 */
	public String modificationReason;

	/**
	 * 创建时间
	 */
	public DateTime createdDateTime;

	/**
	 * 注释
	 */
	public String comment;

	/**
	 * 市场信息
	 */
	@JsonProperty("marketURL")
	public String marketUrl;
}
