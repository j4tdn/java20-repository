package utils;

public class ArrayUtils {

	public ArrayUtils() {
	}
	public static void swap(int[] elements, int i , int j) {
	
		if(!isValid(i, elements) || isValid(j, elements)) {
			int tmp = elements[i];
			elements[i] = elements[j];
			elements[j] = tmp;
		}
		
	
	}
	public static void swap(String[] elements, int i , int j) {
		
		if(!isValid(i, elements) || isValid(j, elements)) {
			String tmp = elements[i];
			elements[i] = elements[j];
			elements[j] = tmp;
		}
		
		
	}
	
	public static void generate(String prefix, int[] elements) {
		System.out.print(prefix + " --> {");

		for (int element: elements) {
			System.out.print( element +" ");
		}
		System.out.print(" }\n\n");
	}
	
	public static void generate(String prefix, Object[] elements) {
		System.out.println(prefix + " --> {");
		for (Object element: elements) {
			System.out.println(" " + element);
		}
		System.out.println("}\n");
	}
	
	private static boolean isValid(int i , int[] elements) {
		return i >= 0 && i < elements.length;
	}
	private static boolean isValid(int i , Object[] element) {
		return i >= 0 && i < element.length;
	}
}
