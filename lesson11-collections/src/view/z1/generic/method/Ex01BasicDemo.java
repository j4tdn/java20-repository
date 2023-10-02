package view.z1.generic.method;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//Write program to print all elements from Array, List
		
		//Handle with array of elements
		Integer[] aOIntegers = {1, 5, 8, 4, 2, 10};
		Double[] aODoubles = {2.2d, 7.4d, 4.6d, 8.8d};
		String[] aOStrings = {"a", "d", "b", "c"};
		
		//Integer, Double, String, iplms
		
	}
	//Đa hình trong đối tượng
	//Cha = con
	public static void printArray_UsingOop(Object[] objects) {
		System.out.println();
		for(Object o : objects) {
			System.out.println(o + " ");
		}
		System.out.println();
	}
	
	//Sử dụng generic method
	//<E>	:generic type, tự định nghĩa, mặc định nó là KDL đối tượng
	//		:phạm vi sử dụng trong hàm nó khai báo
	public static <E> void printArray_UsingGeneric(E[] es) {
		for(E e : es) {
			System.out.println(e + " ");
		}
		System.out.println();
	}
}
