package view.sorting.theory;

import static utils.ArrayUtils.*;

import functional.Comparator_String;

public class Ex02BubbleSort_String {

	public static void main(String[] args) {

		// Cho danh sách các chuỗi String
		String[] elements = { "a12", "whz", "z", "bb", "ca23", "t17" };
		generate("elements", elements);

		// 1. Sắp xếp tăng dần
		// sortAsc(elements);
		sort(elements, (s1, s2) -> s1.compareTo(s2));
		generate("elements sort ascending", elements);
		

		// 2. Sắp xếp giảm dần
		// sortDesc(elements);
		sort(elements, (s1, s2) -> s2.compareTo(s1));
		generate("elements sort descending", elements);
		
		
		/*
			Với KDL đối tượng (có sẵn của Java), so sánh dùng compareTo từ interface cha Comparable<T>
												giá trị của các phần tử có thể bị null
			=> NULL CHECK trước khi so sánh
		 */
		String[] sequences = { null, "a12", "whz", null, null, "z", "bb", null, "ca23", "t17", null };
		// Yêu cầu: sắp xếp các phần tử tăng dần và null first
		sort(sequences, (s1, s2) -> {
			// null first
			if (s1 == null)
				return -1;
			if (s2 == null)
				return 1;
			
			return s1.compareTo(s2);
		});
		generate("sequences(NULL FIRST, ASC)", sequences);
		
		
		// Yêu cầu: sắp xếp các phần tử tăng dần và null last
		sort(sequences, (s1, s2) -> {
			if (s1 == null && s2 != null) 
				return 1;
			if (s2 == null) 
				return -1;
			return s1.compareTo(s2);
		});
		generate("sequences(NULL LAST, ASC)", sequences);
		
		
		// Yêu cầu: sắp xếp các phần tử giảm dần và null first
		sort(sequences, (s1, s2) -> {
			if (s1 == null)
				return -1;
			if (s2 == null)
				return 1;
			return s2.compareTo(s1);
		});
		generate("sequences(NULL FIRST, DESC)", sequences);
		
		
		// Yêu cầu: sắp xếp các phần tử giảm dần và null last
		sort(sequences, (s1, s2) -> {
			if (s1 == null && s2 != null) 
				return 1;
			if (s2 == null) 
				return -1;
			return s2.compareTo(s1);
		});
		generate("sequences(NULL LAST, DESC)", sequences);

	}

	// Strategy Sort
	public static void sort(String[] elements, Comparator_String comparator) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++)
			// iterate elements
			for (int j = 0; j < length - i - 1; j++)
				if (comparator.compare(elements[j], elements[j + 1]) > 0)
					swap(elements, j, j + 1);
	}

	// Ascending Sort
	public static void sortAsc(String[] elements) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++)
			// iterate elements
			for (int j = 0; j < length - i - 1; j++)
				if (elements[j].compareTo(elements[j + 1]) > 0)
					swap(elements, j, j + 1);
	}

	// Descending Sort
	public static void sortDesc(String[] elements) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++)
			// iterate elements
			for (int j = 0; j < length - i - 1; j++)
				if (elements[j + 1].compareTo(elements[j]) > 0)
					swap(elements, j, j + 1);
	}

}
