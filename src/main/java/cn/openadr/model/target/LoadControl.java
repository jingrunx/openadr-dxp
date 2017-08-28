package cn.openadr.model.target;

public class LoadControl {
	private LoadControlType capacity;
	private LoadControlType levelOffset;
	private LoadControlType percentOffset;
	private LoadControlType setPoint;

	public LoadControlType getCapacity() {
		return capacity;
	}

	public void setCapacity(LoadControlType capacity) {
		this.capacity = capacity;
	}

	public LoadControlType getLevelOffset() {
		return levelOffset;
	}

	public void setLevelOffset(LoadControlType levelOffset) {
		this.levelOffset = levelOffset;
	}

	public LoadControlType getPercentOffset() {
		return percentOffset;
	}

	public void setPercentOffset(LoadControlType percentOffset) {
		this.percentOffset = percentOffset;
	}

	public LoadControlType getSetPoint() {
		return setPoint;
	}

	public void setSetPoint(LoadControlType setPoint) {
		this.setPoint = setPoint;
	}
}
