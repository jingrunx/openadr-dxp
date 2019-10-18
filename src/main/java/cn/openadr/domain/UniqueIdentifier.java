package cn.openadr.domain;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.UUID;

import org.joda.time.DateTimeConstants;

public final class UniqueIdentifier {
	private static final SecureRandom sr = new SecureRandom();

	private UniqueIdentifier() {
	}

	public static UUID classBased(Class<?> clazz) {
		long chash = Objects.hashCode(clazz.getName());
		long shash = System.currentTimeMillis() / DateTimeConstants.MILLIS_PER_SECOND;
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

	private static UUID randomUUID(long mostSigBits) {
		long leastSigBits = sr.nextLong();
		return new UUID(mostSigBits, leastSigBits);
	}
}
