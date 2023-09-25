package view.z1.generic.method;

public class Ex01BasicDemo__ArrayPrint {
	public static void main(String[] args) {
		//write program to print all elements from array, List
		
		
		
		//Handle with array of elements
		Integer[] aOIntegers = {1,5,7,8,2,5,4};
		Double[] aODoubles = {2.2d, 3.21d, 6.4d, 7.3d};
		String[] aOStrings = {"as", "d", "c", "d"};
		
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
		
		// handle with list of elements
	}
	
	public static void printArray_Using(Object[] Objects) {
		System.out.println();
		for(Object element: Objects) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	//Da hinh trong doi tuong
	// Cha = Con
	// <E>: generic type, tu dinh nghia
	//    : pham vi su dung trong ham no khai bao
	public static<E> void printArray_UsingGeneric(E[] elements) {
		System.out.println();
		for(E element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
