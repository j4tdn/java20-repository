package utils;

import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;

public class SqlUtils {
	
	private SqlUtils() {
	}
	
	public static String md5(String text) {
		Objects.requireNonNull(text);
		return DigestUtils.md5Hex(text);
	}
	
	public static void close(AutoCloseable ... closeables) {
		for (AutoCloseable closeable: closeables) {
			if(closeable != null) {
				try {
					closeable.close();;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
