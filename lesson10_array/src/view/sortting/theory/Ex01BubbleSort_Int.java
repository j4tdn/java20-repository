package view.sortting.theory;


import static utils.ArrayUtils.*;


import Functional.ArraySortBool;
import Functional.Comparator_Int;
public class Ex01BubbleSort_Int {

	public static void main(String[] args) {
		//Cho 1 mảng số nguyên không âm
		//Tăng dần :trước lớn hơn sau  --> Sai vị trí --> hoán vị
		//Giẩm dần :trước nhỏ hơn sau  --> Sai vị trí --> hoán vị
		
		
		int[] numbers = {1,5,8,2,4,9};
		//1.Sắp xếp các phẩn tử tăng dần
		sortInt(numbers, (int n1,int n2) -> {
			return n1 -n2;
		});
		generate("number", numbers);
		
		sortInt(numbers, (int n1,int n2) -> {
			return n2 -n1;
		});
		generate("number sort ascending", numbers);
		
		//2. Sắp xếp các phần tử dảm dần
		generate("number", numbers);
		
		sort(numbers,(n1,n2)-> n1<n2);
		generate("number sort Descending", numbers);
	}

	private static void sort(int[] elements, ArraySortBool aSort) {
		int lenght = elements.length;
		//iterate round
		for(int i = 0; i < lenght ; i++) {
			//iteate element
			for(int j =0 ; j < lenght - i -1; j++) {
				if(aSort.compare(elements[j],elements[j+1] )) {
					swap(elements ,j ,j + 1);
				}
			}
		}
	}
	
	private static void sortInt(int[] elements, Comparator_Int aSort) {
		int lenght = elements.length;
		//iterate round
		for(int i = 0; i < lenght ; i++) {
			//iteate element
			for(int j =0 ; j < lenght - i -1; j++) {
				if(elements[j] - elements[j+1] >0) {
					swap(elements ,j ,j + 1);
				}
			}
		}
	}
	
	
}
