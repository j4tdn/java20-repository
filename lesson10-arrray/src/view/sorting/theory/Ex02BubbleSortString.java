package view.sorting.theory;


import static utils.ArrayUtils.*;

import functional.Comparator_String;

public class Ex02BubbleSortString {
	public static void main(String[] args) {
		String[] elements = {"a12", "whz", "z", "bb", "ca23", "t17"};
		// 1. sắp xếp tăng dần
		sort(elements, (n1, n2) -> n1.compareTo(n2));
		generate("sort Ascending", elements);
		// 2. sắp xếp giảm dần
		sort(elements, (n1, n2) -> n2.compareTo(n1));
		generate("sort Descending", elements);
		
		// với KDL đối tượng so sánh dùng compareTo
		// giá trị của các phần tử có thể bị null 
		// an toàn: null check trước khi dùng compareTo
		// kết luận: khi sắp xếp KDL đối tượng: 
		// +phần 1: null Value
		//			--> null first || null last
		// +phần 2: non- null: --> ASC || DESC
		
		String[] sequences = {null, "a12", "whz",null, null, "z", "bb", "ca23", "t17", null};
		// yêu cầu: sắp xếp các phần tử tăng dần và null first
		sort(sequences, (n1, n2)-> {
			if(n1 == null ) {
				return -1;
			}
			if(n2 == null) {
				return 1;
			}
			return n1.compareTo(n2);
		});
		generate("sort Ascending null first", sequences);
		// yêu cầu: sắp xếp các phần tử tăng dần và null last
	
		sort(sequences, (n1, n2) -> {
			if(n1 == null && n2 != null) {
				return 1;
			}
			if(n2 == null) {
				return 0;
			}
			return n1.compareTo(n2);
		});
		generate("sort Ascending null last", sequences);
	}
	public static void sort(String[] elements, Comparator_String arraySortString) {
		int length = elements.length;
		
		//iterate round
		for(int i = 0; i < length; i++) {
			// iterate elements
			for(int j = 0; j < length - i - 1; j++) {
				if(arraySortString.compare(elements[j], elements[j + 1]) > 0) {
					swapString(elements, j, j + 1);
				}
			}
		}
	}
}
