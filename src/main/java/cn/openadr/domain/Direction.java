package cn.openadr.domain;

/**
 * 方向
 */
public enum Direction {
	/**
	 * 无方向
	 */
	none(0x00, 'n'),
	/**
	 * 正向
	 */
	positive(0x01, 'p'),
	/**
	 * 反向
	 */
	reverse(0x02, 'r'),
	/**
	 * 双向
	 */
	both(positive.value + reverse.value, 'b'),
	/**
	 * 容性
	 */
	capacitive(0x04, 'c'),
	/**
	 * 感性
	 */
	inductance(0x08, 'i'),
	/**
	 * 第一象限
	 */
	q1(positive.value + capacitive.value, '1'),
	/**
	 * 第二象限
	 */
	q2(reverse.value + capacitive.value, '2'),
	/**
	 * 第三象限
	 */
	q3(positive.value + inductance.value, '3'),
	/**
	 * 第四象限
	 */
	q4(reverse.value + inductance.value, '4'),
	/**
	 * 组合无功1
	 */
	combin1(q1.value << 4 + q2.value, '5'),
	/**
	 * 组合无功2
	 */
	combin2(q3.value << 4 + q4.value, '6');

	public final int value;
	public final char code;

	Direction(int value, char code) {
		this.value = value;
		this.code = code;
	}

	public static Direction valueOf(int value) {
		for(Direction i : values()) {
			if(i.value == value) {
				return i;
			}
		}

		return none;
	}
}
