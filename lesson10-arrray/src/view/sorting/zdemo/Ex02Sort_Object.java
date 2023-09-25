package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex02Sort_Object {
	public static void main(String[] args) {
		
		//sort with object type: Integer, Double, String
		//sort with custom object types: Item, employee
		
		//Arrays.Sort(Object[] objects)
		//require: input type object is child of comparable<?>
		// 		 : custom sort ASC, DESC, phụ thuộc vào comparable<?> override compareTo 
		//Arrays.sort(T[] elements, Comparator<T> comparator)
		// 		 : input type, require input type is object
		//		 : sort ASC, DESC, phụ thuộc vào comparable<?>
		String[] sequences = {"a1", "z2", "c5", "b2"};
		//Arrays.sort(sequences);
		Arrays.sort(sequences, (s1,s2)-> s2.compareTo(s1));
		ArrayUtils.generate("sequences", sequences);
		System.out.println("==============");
		Item[] items = DataModel.mockItems();
		//Arrays.sort(items);
		Arrays.sort(items, (i1, i2) -> i1.getId().compareTo(i2.getId()));
		ArrayUtils.generate("sort with name", items);
		
		//ACS BY StoreID
		Arrays.sort(items, Comparator.comparing(Item::getStoreId).reversed()
									.thenComparing(Item::getSalePrice));
		ArrayUtils.generate("sort with name", items);
		//hạn chế: với KDL ví dụ như Item, Employee khi sort với comparable thì chỉ đc phép
		// sort theo một 1 phương pháp(theo thuộc tính này, kia) duy nhất
	}
}
