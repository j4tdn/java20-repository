package view.sorting.zdemo;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.Comparator.*;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex03Sort_SimpleCases {

	public static void main(String[] args) {
		
		// array of int
		
		// array of strings
		// Function<String, String> f = Function.identity() = s -> s
		String[] sequences = {"a", null, "h", null, "k"};
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity())));
		
		// array of items
		Item[] items = DataModel.mockItems();
		
		// sort by name (desc)
		Arrays.sort(items, (i1, i2) -> {
			return i2.getName().compareTo(i1.getName());
		});
		
		// Function<T, R> f = (Item item) -> item.getName()
		// Function<T, R> f = Item::getName
		Arrays.sort(items, comparing(item -> item.getName(), reverseOrder()));
		
		ArrayUtils.generate("sort by name (desc) ", items);
		
		// sort by storeId (desc), salesPrice (asc)
		Arrays.sort(items, comparing(Item::getStoreId, reverseOrder())
								.thenComparing(Item::getSalesPrice));
		
		ArrayUtils.generate("sort by storeId (desc), salesPrice (asc) ", items);
		items[0] = null;
		items[5] = null;
		// items[1].setStoreId(null) --> ko hỗ trợ --> override hàm new Comparator<T>
		Arrays.sort(items, nullsFirst(comparing(Item::getStoreId)));
		ArrayUtils.generate("sort by storeId (asc) ", items);
		
	}

}
