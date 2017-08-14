package cn.openadr.model.event;

public class EventDescriptor {
	/** 修改版本 */
	private int modificationNumber;
	/** 修改原因 */
	private String modificationReason;
	/** 优先级 */
	private int priority;
	/** 已经发布 */
	private boolean published;
	/** 事件模板 */
	private boolean template;
	/** 测试事件 */
	private boolean test;

	public int getModificationNumber() {
		return modificationNumber;
	}

	public void setModificationNumber(int modificationNumber) {
		this.modificationNumber = modificationNumber;
	}

	public String getModificationReason() {
		return modificationReason;
	}

	public void setModificationReason(String modificationReason) {
		this.modificationReason = modificationReason;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	public boolean isTemplate() {
		return template;
	}

	public void setTemplate(boolean template) {
		this.template = template;
	}

	public boolean isTest() {
		return test;
	}

	public void setTest(boolean test) {
		this.test = test;
	}
}
