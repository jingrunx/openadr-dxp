package cn.openadr.model.event;

import java.io.Serial;
import java.io.Serializable;
import lombok.NoArgsConstructor;

@lombok.Getter
@lombok.Setter
@lombok.EqualsAndHashCode
@NoArgsConstructor
public class QualifiedEventID implements Serializable {
	@Serial
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
