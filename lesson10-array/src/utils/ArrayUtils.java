package utils;

public class ArrayUtils {

	public ArrayUtils() {
	}
	
	public static void generate(String prefix, int[] elements) {
		System.out.println(prefix + " --> {");
		for (int element: elements) {
			System.out.println(" " + element);
		}
		System.out.println("}\n");
	}
	
	public static void generate(String prefix, Object[] elements) {
		System.out.println(prefix + " --> {");
		for (Object element: elements) {
			System.out.println(" " + element);
		}
		System.out.println("}\n");
	}
}
