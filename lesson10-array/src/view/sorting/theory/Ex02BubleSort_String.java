package view.sorting.theory;

import ArrayUtils.ArraysUtils;
import bean.SortOrder;
import funtional.Comparator_Item;
import funtional.Comparator_String;
import funtional.Comparator_int;

public class Ex02BubleSort_String {
	public static void main(String[] args) {
		String[] elements = { "a12", "whz", "z", "bb", "ca23", "t17" };

		sort(elements, new Comparator_String() {

			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		ArraysUtils.generate("ASC", elements);
		String[] sequences = { null, "a12", "whz", null, null, "z", "bb", null, "ca23", "t17", null };
		ArraysUtils.generate("ASC sequences", sequences);
		sort(sequences, new Comparator_String() {

			@Override
			public int compare(String a, String b) {
				if (a == null) {
					return -1;
				}
				if (b == null) {
					return 1;
				}
				return a.compareTo(b);
			}
		});
		ArraysUtils.generate("ASC sequences", sequences);
		sort(sequences, new Comparator_String() {

			@Override
			public int compare(String a, String b) {
				if (a == null && b != null) {
					return 1;

				}
				if (b == null) {
					return -1;
				}
				return a.compareTo(b);
			}
		});
		ArraysUtils.generate("ASC sequences", sequences);

	}

	private static void sort(String[] elements, Comparator_String comparator) {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length - i - 1; j++) {
				if (comparator.compare(elements[j], elements[j + 1]) > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}

	// ASC
	private static void ASC(String[] elements) {
		int lenght = elements.length;
		for (int i = 0; i < lenght; i++) {
			for (int j = 0; j < lenght - i - 1; j++) {
				if (elements[j].compareTo(elements[j + 1]) > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void DESC(String[] elements) {
		int lenght = elements.length;
		for (int i = 0; i < lenght; i++) {
			for (int j = 0; j < lenght - i - 1; j++) {
				if (elements[j].compareTo(elements[j + 1]) > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}

		}
	}

}
