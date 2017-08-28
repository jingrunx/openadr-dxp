package cn.openadr.model.target;

public class LoadControlType {
	private double current;
	private Double normal;
	private Double min, max;

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public Double getNormal() {
		return normal;
	}

	public void setNormal(Double normal) {
		this.normal = normal;
	}

	public Double getMin() {
		return min;
	}

	public void setMin(Double min) {
		this.min = min;
	}

	public Double getMax() {
		return max;
	}

	public void setMax(Double max) {
		this.max = max;
	}
}
