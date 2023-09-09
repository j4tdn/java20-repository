package utils;

public class ArrayUtils {

	public ArrayUtils() {
	}
	
	public static void swap(String[] elements, int i, int j) {
		if (isValidIndex(i, elements) || isValidIndex(j, elements)) {
			String tmp = elements[i]; 
			elements[i] = elements[j];
			elements[j] = tmp;
		}
	}
	
	public static void swap(int[] elements, int i, int j) {
		if (isValidIndex(i, elements) || isValidIndex(j, elements)) {
			int tmp = elements[i]; 
			elements[i] = elements[j];
			elements[j] = tmp;
		}
	}
	
	public static void generate(String prefix, int[] elements) {
		System.out.println(prefix + " --> {");
		for (int element: elements) {
			System.out.print(" " + element);
		}
		System.out.println("\n}");
	}
	
	public static void generate(String prefix, Object[] elements) {
		System.out.println(prefix + " --> {");
		for (Object element: elements) {
			System.out.println(" " + element);
		}
		System.out.println("}\n");
	}
	
	private static boolean isValidIndex(int i, int[] elements) {
		return i >= 0 && i < elements.length;
	}
	
	private static boolean isValidIndex(int i, Object[] elements) {
		return i >= 0 && i < elements.length;
	}
}
