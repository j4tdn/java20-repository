package view.sorting.theory;

import functional.Comparator_String;
import utils.ArraysUtils;

public class Ex02BubbleSort_String {

	public static void main(String[] args) {
		// Cho danh sách các chuỗi String
		String[] elements = { "a12", "whz", "z", "bb", "ca23", "t17" };

		// 1. Sắp xếp tăng dần
		// sortAsc(elements);
		sort(elements, (s1, s2) -> s1.compareTo(s2));
		ArraysUtils.generate("String asc", elements);

		// 2. Sắp xếp giảm dần
		// sortDesc(elements);
		sort(elements, (s1, s2) -> s1.compareTo(s2));
		ArraysUtils.generate("String desc", elements);

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

		String[] sequences = { "a12", null, "whz", "z", "bb", null, "ca23", null, "t17" };

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
		ArraysUtils.generate("sequences(NULL FIRST, ASC)", sequences);

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
		ArraysUtils.generate("sequences(NULL LAST, ASC)", sequences);

		// Yêu cầu: Sắp xếp các phần tử giảm dần và NULL first

		// Yêu cầu: Sắp xếp các phần tử giảm dần và NULL last

	}

	private static void sort(String[] elements, Comparator_String comparator) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++) {
			// iterate elements
			for (int j = 0; j < length - i - 1; j++) {
				if (comparator.compare(elements[j], elements[j + 1]) > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}

	// Tăng dần
	private static void sortAsc(String[] elements) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++) {
			// iterate elements
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j].compareTo(elements[j + 1]) > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void sortDesc(String[] elements) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++) {
			// iterate elements
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j + 1].compareTo(elements[j]) > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}
}
