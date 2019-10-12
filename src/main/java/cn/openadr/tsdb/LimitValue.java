package cn.openadr.tsdb;

import java.io.Serializable;

public class LimitValue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 下限(>=)
	 */
	private Double lower;
	/**
	 * 上限(<)
	 */
	private Double upper;
	/**
	 * 闭合 (lower>=? && upper<=?)
	 */
	private Boolean closure;
	/**
	 * 取反 !(exp)
	 */
	private Boolean negate;

	public Double getLower() {
		return lower;
	}

	public void setLower(Double lower) {
		this.lower = lower;
	}

	public Double getUpper() {
		return upper;
	}

	public void setUpper(Double upper) {
		this.upper = upper;
	}

	public Boolean getClosure() {
		return closure;
	}

	public void setClosure(Boolean closure) {
		this.closure = closure;
	}

	public Boolean getNegate() {
		return negate;
	}

	public void setNegate(Boolean negate) {
		this.negate = negate;
	}
}
