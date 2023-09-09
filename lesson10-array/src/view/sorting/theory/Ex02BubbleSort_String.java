package view.sorting.theory;

import static utils.ArrayUtils.swap;

import java.util.Arrays;

import functional.Comparator_String;
import static utils.ArrayUtils.*;

public class Ex02BubbleSort_String {

	public static void main(String[] args) {
		String[] elements = {"a", "abc", "12a", "aka24", "thanh"};
	
		//sortAsc(elements);
		sort(elements, (s1, s2) -> {
			return s1.compareTo(s2);
		});
		generate("ascending --> ", elements);
		
		//descending(elements);
				sort(elements, (s1, s2) -> {
					return s2.compareTo(s1);
				});
		generate("descending --> ", elements);
				
				
		/*
		 với DKL đối tượng so sánh dùng compareto từ interface cha Comparable<T>
		 giá trị các phần tử có thể bị null
		 
		 an toàn: null check trước khi compare
		 
		 kết luận: khi sắp xếp kdl đối tượng
		 + phần 1: NUll values
		 --> null first/ null last
		 --> null first: null value < non-null value
		 --> null last : null value > non-null value
		 
		 + phần 2: NON-NULL 
		 --> ASC/ DESC
		 */
				
		String[] sequences = {"h", null, "a", null, null, "abc", "12a", "aka24", "thanh", null};
	
		// yêu cầu: sx tăng dần null first
		sort(sequences, (s1, s2) -> {
			if (s1 == null) {
				return -1;
			}
			
			if (s2 == null) {
				return 1;
			}
			
			return s1.compareTo(s2);
		});
		
		generate("sx tăng dần null first ", sequences);
		// yêu cầu: sx tăng dần null last
		sort(sequences, (s1, s2) -> {
			if (s1 == null && s2 != null) {
				return 1;
			}
			
			if (s2 == null) {
				return -1;
			}
			
			return s1.compareTo(s2);
		});
		generate("sx tăng dần null last ", sequences);
		// yêu cầu: sx giảm dần null first
		
		// yêu cầu: sx giảm dần null last
		
		
	}
	
	private static void sort(String[] elements, Comparator_String cmp) {
		int length = elements.length;
		for(int round = 0; round < length - 1; round++) {
			for (int i = 0; i < length - round - 1; i++) {
				if (cmp.compare(elements[i], elements[i + 1]) > 0) {
					swap(elements, i, i + 1);
				}
			}
			// System.out.println("round" + (round + 1) + Arrays.toString(elements));
		}
	}
	
	private static void sortAsc(String[] elements) {
		int length = elements.length;
		for(int round = 0; round < length - 1; round++) {
			for (int i = 0; i < length - round - 1; i++) {
				if (elements[i].compareTo(elements[i + 1]) > 0) {
					swap(elements, i, i+1);
				}
			}
		}
	}
	
	
}
