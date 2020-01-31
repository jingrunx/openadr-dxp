package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

/**
 * 质量码
 */
public enum DataQuality implements EnumeratedType {
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

	DataQuality(int value) {
		this.value = value;
	}

	@Override
	public String value() {
		return name();
	}

	public static DataQuality valueOf(int value) {
		for(DataQuality i : DataQuality.values()) {
			if(i.value == value) {
				return i;
			}
		}
		return good;
	}

	public static class Deserializer extends EnumeratedDeserializer<DataQuality> {
		public Deserializer() {
			super(DataQuality.class);
		}
	}
}
