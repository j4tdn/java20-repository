package view.sorting.zdemo;

import static java.util.Arrays.sort;
import static utils.ArrayUtils.generate;
import java.util.function.Function;

import static java.util.Comparator.*;
import bean.Item;
import model.DataModel;

public class Ex03Sort_SimpleCases {

	public static void main(String[] args) {

		// array of int

		/*===============================================================================*/

		// array of strings
		String[] sequences = { "a", "z", null, "c", null, "d", "b" };

		// Sắp xếp chuỗi tăng dần, null first
		sort(sequences, nullsFirst(comparing(s -> s)));
		generate("1. Sort sequences(ASC), null first", sequences);

		// Sắp xếp chuỗi giảm dần, null first
		sort(sequences, nullsFirst(comparing(s -> s, reverseOrder())));
		generate("2. Sort sequences(DESC), null first", sequences);

		/*=============================================================================*/

		// list of items
		Item[] items = DataModel.mockItems();

		/*
		 * Với những trường hợp đơn giản như sắp xếp các phần tử theo các thuộc tính bên
		 * trong obj, xử lí null value cho 'đối tượng' 
		 * => Dùng    Comparator.comparing(Function<T, ?> function) 
		 * 	  thay vì new Comparator<T>
		 */

		// 1. Sort items by name(ASC)

		// sort(items, (i1, i2) -> i1.compareTo(i2));

		/*
		 * sort(items, comparing(new Function<Item, String>() {
		 * 		@Override public String apply(Item item) { 
		 * 			return item.getName(); 
		 * 		} 
		 * }));
		 */

		// lambda expression
		// sort(items, comparing(item -> item.getName()));

		// method reference
		// sort(items, comparing(Item::getName)); // Default: ASC
		sort(items, comparing(Item::getName, reverseOrder())); // DESC
		generate("Sort items by name(ASC)", items);

		items[0] = null;
		items[2] = null;
		items[6] = null;

		// 2. Sort items by storeId(DESC), salesPrice(ASC)
		sort(items, nullsLast(comparing(Item::getStoreId, reverseOrder()).thenComparing(Item::getSalesPrice)));
		generate("Sort items by storeId(DESC), salesPrice(ASC)", items);

	}

}
