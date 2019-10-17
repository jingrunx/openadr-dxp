package cn.openadr.model.event;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@lombok.Getter
@lombok.Setter
@NoArgsConstructor
public class QualifiedEventID implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 事件ID
	 */
	@NonNull
	private String eventID;

	/**
	 * 修改版本
	 */
	private int modificationNumber;
}
