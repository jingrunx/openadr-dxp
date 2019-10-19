package cn.openadr.model.event;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class QualifiedEventID implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 事件ID
	 */
	@NonNull
	public String eventID;

	/**
	 * 修改版本
	 */
	public int modificationNumber;
}
