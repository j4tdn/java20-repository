package view.sorting.zdemo;

import java.util.Arrays;
import static java.util.Comparator.*;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex02Sort_ObjectType {

	public static void main(String[] args) {
		// sort with object types: Integer, Double, String...
		
		// Arrays.sort(Object[] objects)
		// Yêu cầu : KDL truyền vào cho Object phải là con của Comparable<?>
		// Mặc định: tăng
		// 		   : muốn custom tăng/ giảm dần phải override Comparable<?>
		
		// Arrays.sort(T[] elements, Comparator <T> comparator)
		// 	      : KDL truyền vào bki, chỉ cần Object
		// 		  : sắp xếp tăng/ dần dựa Comparator<T>
		String[] sequences = {"a1", "x2", "h1", "t9"};
		Arrays.sort(sequences, (s1, s2) -> s1.compareTo(s2));
		ArrayUtils.generate("sequences ", sequences);
		
		Item[] items = DataModel.mockItems();
		// Arrays.sort(items);
		Arrays.sort(items, (i1, i2) -> i1.getId().compareTo(i2.getId()));
		ArrayUtils.generate("sequences ", items);
		
		Arrays.sort(items, comparing(Item::getStoreId, reverseOrder())
						   .thenComparing(Item::getSalesPrice));
		ArrayUtils.generate("storeid desc  ", items);
		// Hạn chế: với KDL Item, Employee khi sort với Comparable thì chỉ đc 
		// sort theo 1 method(theo thuộc tính này, kia) duy nhất
		
	}
}
