package cn.openadr.domain;

/**
 * 质量码
 */
public enum Quality {
	/**
	 * 未定义
	 */
	undefined(-1),
	/**
	 * 正常
	 */
	good(0),
	/**
	 * 无效
	 */
	failure(1),
	/**
	 * 旧数据
	 */
	oldData(2),
	/**
	 * 超过量程
	 */
	outOfRange(3),
	/**
	 * 溢出
	 */
	overFlow(4),
	/**
	 * 可疑
	 */
	suspect(5),
	/**
	 * 估计代替
	 */
	estimatorReplaced(6),
	/**
	 * 操作阻塞
	 */
	operatorBlocked(7),
	/**
	 * 震荡
	 */
	oscillatory(8),
	/**
	 * 测试
	 */
	test(9);

	public final int value;

	Quality(int value) {
		this.value = value;
	}

	public static Quality valueOf(int value) {
		for(Quality i : Quality.values()) {
			if(i.value == value) {
				return i;
			}
		}
		return good;
	}
}
