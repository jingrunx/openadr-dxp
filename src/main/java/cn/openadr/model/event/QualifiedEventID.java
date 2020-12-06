package cn.openadr.model.event;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
@lombok.EqualsAndHashCode
@lombok.NoArgsConstructor
public class QualifiedEventID implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 事件ID
	 */
	public String eventID;

	/**
	 * 修改版本
	 */
	public int modificationNumber;
}
