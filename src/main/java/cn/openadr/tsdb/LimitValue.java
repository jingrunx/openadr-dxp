package cn.openadr.tsdb;

import java.io.Serializable;

public class LimitValue implements Serializable {
	private static final long serialVersionUID = cn.openadr.Version.V1;

	/**
	 * 下限(>=)
	 */
	public Double lower;
	/**
	 * 上限(<)
	 */
	public Double upper;
	/**
	 * 闭合 (lower>=? && upper<=?)
	 */
	public Boolean closure;
	/**
	 * 取反 !(exp)
	 */
	public Boolean negate;

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
