package view.sorting.zdemo;

import java.util.Arrays;

import bean.Item;
import bean.SortOrder;
import model.DataModel;
import utils.ArraysUtils;

public class Ex0Sort_Object {
	/*
	 sort with available object types: Integer, Double, String ...
	
	 sort with custom object types: Item, Employee
	
	 Arrays.sort(Object[] objects)
	 Yêu cầu : KDL truyền vào cho Object phải là con của Comparable<?>
	 Mặc định: Tăng dần        
	         : Muốn custom lại tăng/giảm thì KDL truyền vào phải override Comparable<?>#compareTo
	
	 Arrays.sort(T[] elements, Comparator<T> comparator)
	         : KDL truyền vào bất kỳ, chỉ cần KDL đối tượng
	         : Sắp xếp tăng dần / giảm dần dựa vào Comparator<T>
	
	*/
	//Array.sort
	//Comparator > Comparable
	
	
	public static void main(String[] args) {
		String[] sequences = { "a1", "z2", "c5", "d4" };
		int[] numbers = { 3, 1, 2, 5, 8, 6, 9 };
		// Arrays.sort(sequences); // sort(Object[] a)
		Arrays.sort(sequences, (s1, s2) -> { // sort(T[] a, Comparator<? Super T> c)
			return s2.compareTo(s1);
		});
		ArraysUtils.generate("sequences", sequences);

		System.out.println("\n=================================\n");

		Item[] items = DataModel.mockItems();
		ArraysUtils.generate("ITEMS ", items);
		// Sort items by id(ASC)
		// Arrays.sort(items); // sort(Object[] a)
		Arrays.sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		ArraysUtils.generate("Sort items by id(ASC)", items);

		// Sort items by name(DESC)
		// Arrays.sort(items); // sort(Object[] a)
		Arrays.sort(items, (i1, i2) -> {
			return i2.getName().compareTo(i1.getName());
		});
		ArraysUtils.generate("Sort items by name(DESC)", items);

		System.out.println("\n======\n");

		items = DataModel.mockItems();
		ArraysUtils.generate("items", items);
		Arrays.sort(items);
		ArraysUtils.generate("items after sorted", items);
	}
	// Hạn chế: với KDL ví dụ như Item, Employee khi sort với Comparable thì chỉ
	// được phép sort theo 1 phương pháp(theo thuộc tính này, kia) duy nhất

}
