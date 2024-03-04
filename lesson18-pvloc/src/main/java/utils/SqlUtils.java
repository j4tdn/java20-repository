package utils;

import java.util.List;
import java.util.Objects;



public class SqlUtils {

	private SqlUtils() {
	}
	
	public static String md5(String text) {
		Objects.requireNonNull(text, "text cannot be null");
		return DigestUtils.md5Hex(text);
	}

	public static void close(AutoCloseable... objectsNeedToBeClosed) {
		for (AutoCloseable closeableObject : objectsNeedToBeClosed) {
			try {
				closeableObject.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void generate(String text, Runnable runnable) {
		System.out.println(text + " ----> {");
		System.out.print("   running .... ");
		runnable.run();
		System.out.println("}\n");
	}
	
	public static void generate(String text, Object... elements) {
		System.out.println(text + " ----> {");
		for (Object element: elements) {
			System.out.println("     " + element);
		}
		System.out.println("}\n");
	}
	
	
	public static <Element> void generate(String text, List<Element> elements) {
		System.out.println(text + " ----> {");
		elements.forEach(element -> {
			System.out.println("     " + element);
		});
		System.out.println("}\n");
		
	}

}
