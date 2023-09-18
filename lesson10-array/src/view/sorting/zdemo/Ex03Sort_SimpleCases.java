package view.sorting.zdemo;

import java.util.Arrays;
import java.util.function.Function;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

import static java.util.Comparator.*;

public class Ex03Sort_SimpleCases {
	
	public static void main(String[] args) {
		// array of int
		
		// array of strings
		String[] sequences = {"a", "z", null, "c", null, "d", "b"};
		
		// sắp xếp tăng dần, null first các chuỗi
		
		// Function<String, String> f = s -> s
		// Function<String, String> f = Function.identity()
		
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity())));
		ArraysUtils.generate("1. Sort sequences ASC, NULL FIRST", sequences);
		
		// sắp xếp giảm dần
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity(), reverseOrder())));
		ArraysUtils.generate("2. Sort sequences DESC, NULL FIRST", sequences);
		
		// array of items
		Item[] items = DataModel.mockItems();
		
		// Với những trường hợp đơn giản như sắp xếp các phần tử theo các thuộc tính
		// bên trong đối tượng, xử lý null value cho đối tượng
		
		// --> Sử dụng Comparator.comparing(Function<T, ?> function) thay vì phải new Comparator<T>
		
		// 1. Sort items by name(ASC)
		// Arrays.sort(items, (c1, c2) -> c1.getName().compareTo(c2.getName()));
		
		// Function<T, R> f = (Item item) -> item.getName(); // lambda expression
		// Function<T, R> f = Item::getName; // method reference
		
		// Arrays.sort(items, comparing(Item::getName)); // default asc
		Arrays.sort(items, comparing(Item::getName).reversed()); // desc
		
		ArraysUtils.generate("Sort items by name(ASC)", items);
		
		items[0] = null;
		items[2] = null;
		items[6] = null;
		
		// items[1].setStoreId(null); không hỗ trợ --> dùng override new Comparator<T>
		
		// 2. Sort items by storeId(DESC), salesPrice(ASC)
		Arrays.sort(items, 
				nullsLast(
						comparing(Item::getStoreId, reverseOrder())
						.thenComparing(Item::getSalesPrice)
				));
		
		ArraysUtils.generate("2. Sort items by storeId(DESC), salesPrice(ASC)", items);
	}
}