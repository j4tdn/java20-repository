package view.sorting.zdemo;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex02Sort_String {
	public static void main(String[] args) {
		//sort with available object types: Integer, Double, String
		
		//sort with custom object types: Item, Employee
		
		//Arrays.sort(Object[] objects)
		//Yêu cầu: KDL truyền vào cho Object phải là con của Comparable
		//		 : Sắp xếp tăng dần/ giảm dần dựa vào Comparable
		//Mặc định: tăng dần
		//Muốn custom lại tăng/ giảm override Comparable<?>#
		
		
		//Arrays.sort(T[] elements, Comparator<T> comparator
		//		: KDL truyền vào bất kì, chỉ cần là KDL dối tượng
		//		: Sắp xếp tăng dần/ giảm dần dựa vào Comparator
		
		
		
		String[] sequences = {"a1", "z2", "c5", "d4"};
		
		//Arrays.sort(sequences); sort(Object[] a)
		Arrays.sort(sequences, (s1, s2) -> {
			return s1.compareTo(s2);
		});
		ArraysUtils.generate("sequences", sequences);
		System.out.println("\n=========================\n");
		
		
		Item[] items = DataModel.mockItems();
		
		//Sort items by id(ASC)
		Arrays.sort(items);
		ArraysUtils.generate("Sort items by id(ASD)", items);
		
	}
}
