package cn.openadr;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.UUID;

public final class UniqueIdentifier {
	private static final SecureRandom sr = new SecureRandom();

	private UniqueIdentifier() {
	}

	public static UUID classBased(Class<?> clazz) {
		long chash = Objects.hashCode(clazz.getName());
		long shash = System.currentTimeMillis() / 1000L;
		long mostSigBits = (chash << 32) + shash;
		return randomUUID(mostSigBits);
	}

	public static UUID scopeBased(Class<?> clazz, Object scope) {
		long chash = Objects.hashCode(clazz.getName());
		long shash = Objects.hashCode(scope);
		long mostSigBits = (chash << 32) + Math.abs(shash);
		return randomUUID(mostSigBits);
	}

	public static UUID orderBased(Class<?> clazz, Object scope, int order) {
		long chash = Objects.hashCode(clazz.getName());
		long shash = Objects.hashCode(scope);
		long mostSigBits = (chash << 32) + (shash & 0xffff0000) + (order & 0xffff);
		return randomUUID(mostSigBits);
	}

	public static UUID randomUUID(long mostSigBits) {
		long leastSigBits = sr.nextLong();
		return new UUID(mostSigBits, leastSigBits);
	}
}
