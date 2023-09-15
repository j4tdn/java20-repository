package view.sorting.demo;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

import static java.util.Comparator.*;

public class Ex02Sort_ObjectType {
	public static void main(String[] args) {
		// sort with available object types: Integer, Double, String ...
		
		// sort with custom object types: Item, Employee
		
		// Arrays.sort(Object[] object)
		// Yêu cầu: KDL truyền vào cho Object[] phải là con của Comparable<?>
		
		// Arrays.sort(T[] elements, Comparator<T> comparator)
		//			: KDL truyền vào bất kỳ, chỉ caàn KDL đối tượng
		//			: Sắp xếp tăng dần/ giảm dần dựa vào Comparator<T>
		
		// ??? Phân biệt comparator và comparable
		
		// sort(Object[] a)
		
		String[] sequences = { "a1", "z2", "c5", "d4" };
		// Arrays.sort(sequences);
		Arrays.sort(sequences, (s1, s2) -> {
			return s2.compareTo(s1);
		});
		ArraysUtils.generate("", sequences);
		
		System.out.println("===========================");

		Item[] items = DataModel.mockItems();
		
		// Sort items by id(ASC)
		Arrays.sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		ArraysUtils.generate("items", items);
		
		// Sort items by name(DESC)
		Arrays.sort(items, (i1, i2) -> {
			return i2.getName().compareTo(i1.getName());
		});
		
		// Arrays.sort(items);
		ArraysUtils.generate("items", items);
		
		// TODO: storeId(DESC)
		Arrays.sort(items,
				comparing(Item::getStoreId, reverseOrder())
				.thenComparing(Item::getSalesPrices));
		ArraysUtils.generate("Sort items by storeId(DESC)", items);
		
		// Hạn chế: với KDL ví dụ như Item, Employee khi sort với Comparable thì chỉ được
		// phép sort theo 1 phương pháp(theo thuộc tính này, kia) duy nhất
	}
}
