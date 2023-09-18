package view.sorting.zdemo;

import static utils.ArrayUtils.generate;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;

public class Ex02Sort_ObjectType {

	public static void main(String[] args) {
		
		// sort with available object types: Integer, Double ...
		// sort with custom object: Item, Employee ...
		
		// Arrays.sort(Object[] objects)
		// Yêu cầu: KDL truyền vào cho mảng Object phải là con của Comparable<?>
		// Mặc định: Tăng dần
		//		   : Muốn custom lại tăng/giảm override Comparable<?> compareTo
		
		// Arrays.sort(T[] elements, Comparator<T> comparator)
		// Yêu cầu: KDL truyền vào bất kỳ, chỉ cần KDL đối tượng
		//		  : Sắp xếp tăng/giảm dần dựa vào Comparator<T>
		
 		String[] sequences = { "a1", "z2", "c5", "d4" };
 		// Arrays.sort(sequences); // sort(Object[] a)
 		Arrays.sort(sequences, (s1, s2) -> s1.compareTo(s2));
 		generate("sequences", sequences);
 		
 		System.out.println("==========================");
 		
 		Item[] items = DataModel.mockItems();
 		// Arrays.sort(items); // sort(Object[] a)
 		Arrays.sort(items, (s1, s2) -> s2.getName().compareTo(s1.getName()));
 		generate("Sort items by name(DESC)", items);
 		
	}

}
