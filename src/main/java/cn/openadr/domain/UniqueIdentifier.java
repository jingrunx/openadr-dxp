package cn.openadr.domain;

import java.security.SecureRandom;
import java.util.UUID;

public final class UniqueIdentifier {
	private static final SecureRandom sr = new SecureRandom();

	private UniqueIdentifier() {
	}

	public static UUID classBased(Class<?> clazz) {
		long chash = clazz.hashCode();
		long mostSigBits = (chash << 32) + Math.abs(sr.nextInt());
		return randomUUID(mostSigBits);
	}

	public static UUID scopeBased(Class<?> clazz, Object scope) {
		long chash = clazz.hashCode();
		int shash = null != scope ? scope.hashCode() : 0;
		long mostSigBits = (chash << 32) + Math.abs(shash);
		return randomUUID(mostSigBits);
	}

	public static UUID orderBased(Class<?> clazz, Object scope, int order) {
		long chash = clazz.hashCode();
		int shash = null != scope ? scope.hashCode() : 0;
		long mostSigBits = (chash << 32) + (shash & 0xffff0000) + (order & 0xffff);
		return randomUUID(mostSigBits);
	}

	private static UUID randomUUID(long mostSigBits) {
		long leastSigBits = sr.nextLong();
		return new UUID(mostSigBits, leastSigBits);
	}
}
