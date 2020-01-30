package cn.openadr.tsdb;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
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
}
