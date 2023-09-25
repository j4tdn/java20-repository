package view.sorting.zdemo;

import java.util.Arrays;
import java.util.function.Function;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;
import static java.util.Comparator.*;

public class Ex03Sort_SimpleCases {
	public static void main(String[] args) {
		// arrays of int 
		//arrays of String
		String[] sequences = {"a","z", null, "c", "d", "b"};
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity())));
		ArrayUtils.generate("null first ", sequences);
		// arrays of items
		Item[] items = DataModel.mockItems();
		// với những trường hợp đơn giản như sắp xếp phần tử theo thuộc tính 
		// bên trong đối tượng, xử lý null cho đối tượng 
		
		//--> sử dụng comparator.comparing(Function<T, ?>)
		
		
		//Function<T,R> f = (Item item) -> item.getName(); // lambda expression
		//Function<T,R> f = Item::getName; // method reference
		//1. sort items by name(ASC)
		Arrays.sort(items, comparing(Item::getName).reversed());
		ArrayUtils.generate("Sort by id ", items);
	
		Arrays.sort(items, comparing(Item::getStoreId, reverseOrder())
				.thenComparing(Item::getSalePrice));
		ArrayUtils.generate("Sort by id ", items);
		
		items[0] = null;
		items[2] = null;
		items[4] = null;
		Arrays.sort(items, nullsFirst(comparing(Item::getName).reversed()));
		ArrayUtils.generate("null first ", items);
		
		
		Arrays.sort(items, nullsLast( comparing(Item::getStoreId, reverseOrder())
				.thenComparing(Item::getSalePrice)));
		ArrayUtils.generate("null last ", items);
		
	}
}
