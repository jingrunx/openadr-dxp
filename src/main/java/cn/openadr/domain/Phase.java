package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/**
 * 相位
 */
public enum Phase implements EnumeratedType {
	/**
	 * 全部
	 */
	all(0, 't'),
	/**
	 * A相
	 */
	a(1, 'a'),
	/**
	 * B相
	 */
	b(2, 'b'),
	/**
	 * C相
	 */
	c(3, 'c'),
	/**
	 * 零序
	 */
	zeroSequence(10, '0'),
	/**
	 * 正序
	 */
	posSequence(11, 'p'),
	/**
	 * 负序
	 */
	negSequence(12, 'r');

	public final int value;
	public final char code;

	Phase(int value, char code) {
		this.value = value;
		this.code = code;
	}

	public static Phase valueOf(int value) {
		for(Phase i : values()) {
			if(i.value == value) {
				return i;
			}
		}

		return all;
	}

	@Override
	public String value() {
		return String.valueOf(code);
	}

	public static class Deserializer extends EnumeratedDeserializer<Phase> {
		public Deserializer() {
			super(Phase.class);
		}
	}
}
