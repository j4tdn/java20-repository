package view.sorting.theory;

import static utils.ArraysUtils.*;

import java.util.Arrays;

import functional.Comparator_String;

public class Ex02BubbleSort_String {

	public static void main(String[] args) {

		// Cho danh sách các chuỗi string
		String[] elements = { "a12", "whz", "z", "bb", "ca23", "t17" };

		generate("elements", elements);

		// 1. Sắp xếp tăng dần
		// sortAsc(elements);
		sort(elements, (s1, s2) -> {
			return s1.compareTo(s2);
		});
		generate("elements sort ascending", elements);

		// 2. Sắp xếp giảm dần
		sortDesc(elements);
		sort(elements, (s1, s2) -> {
			return s2.compareTo(s1);
			// return s1.compareTo(s2) * (-1);
		});
		generate("elements sort descening", elements);

		/*
		 * Với KDL đối tượng(có sẵn của Java như Integer, String, Double), so sánh dùng
		 * compareTo từ interface cha Comparable<T> Giá trị của các phần tử có thể bị
		 * NULL
		 * 
		 * An toàn: NULL check trước khi so sách dùng compareTo Kết luận: Khi sắp xếp
		 * KDL đối tượng
		 * 
		 * + Phần 1: NULL values --> null first || null last --> null first: null value
		 * < non-null value --> null last : null value > non-null value
		 * 
		 * + Phần 2: NON_NULL values --> ASC || DESC
		 */

		String[] sequences = { null, "a12", "whz", null, null, "z", "bb", null, "ca23", "t17", null };

		generate("sequences", sequences);

		// Yêu cầu: Sắp xếp các phần tử tăng dần và NULL first
		sort(sequences, (s1, s2) -> {
			// NULL first
			if (s1 == null) {
				return -1;
			}

			if (s2 == null) {
				return 1;
			}

			// ASC
			return s1.compareTo(s2);
		});
		generate("sequences(NULL FRIST, ASC)", sequences);

		// Yêu cầu: Sắp xếp các phần tử tăng dần và NULL last
		sort(sequences, (s1, s2) -> {
			// NULL last
			if (s1 == null && s2 != null) {
				return 1;
			}

			// s1 = null(s2 = null)
			// s1 != null(s2...)

			if (s2 == null) {
				return -1;
			}

			// ASC
			return s1.compareTo(s2);
		});
		generate("sequences(NULL LAST, ASC)", sequences);

		// Yêu cầu: Sắp xếp các phần tử giảm dần và NULL first
		sort(sequences, (s1, s2) -> {
			// NULL first
			if (s1 == null) {
				return -1;
			}

			if (s2 == null) {
				return 1;
			}

			// DESC
			return s2.compareTo(s1);
		});
		generate("sequences(NULL FRIST, DESC)", sequences);

		// Yêu cầu: Sắp xếp các phần tử giảm dần và NULL last
		sort(sequences, (s1, s2) -> {
			// NULL last
			if (s1 == null && s2 != null) {
				return 1;
			}

			// s1 = null(s2 = null)
			// s1 != null(s2...)

			if (s2 == null) {
				return -1;
			}

			// DESC
			return s2.compareTo(s1);
		});
		generate("sequences(NULL LAST, DESC)", sequences);
	}

	public static void sort(String[] elements, Comparator_String comparator) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (comparator.compare(elements[j], elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
			System.out.println("Round " + (i + 1) + ": " + Arrays.toString(elements));
		}
	}

	// Tăng dần (ascending)
	public static void sortAsc(String[] elements) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j].compareTo(elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	// Giảm dần (ascending)
	public static void sortDesc(String[] elements) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j + 1].compareTo(elements[j]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
}