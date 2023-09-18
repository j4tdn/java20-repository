package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex03Sort_SimpleCases {

	public static void main(String[] args) {

		// Array of String
		String[] sequences = {null,"a","z",null,"c","d","b",null};
		
		//Sắp tăng dần
		// Function<String,String> f = s -> s
		// Function<String,String> f = s -> Function.identity
		Arrays.sort(sequences, Comparator.nullsFirst(Comparator.comparing(s -> s)));
		ArraysUtils.generate("1. Sort sequences ASC null first", sequences);
		
		Arrays.sort(sequences, Comparator.nullsLast(
								Comparator.comparing(Function.identity(),Comparator.reverseOrder())
								));
		ArraysUtils.generate("1. Sort sequences ASC null first", sequences);
		
		//Sắp giảm dần
		
		// Array of int

		// Array of items
		Item[] items = DataModel.mockItems();

		// Với trường hợp đơn giản như sắp xếp phần tử theo các thuộc tính bên trong đối
		// tượng, xử lý null value
		// --> Sử dụng Comparator.comparing(Function<T,?> function) thay vì new Comparator<T>

		// 1. Sort items by name(ASC)
//		Arrays.sort(items, new Comparator<T>() {
//			public int compare(T o1, T o2) {
//				
//			}
//		});
		
		// Function<T,R> f = (Item item) -> item.getName(); // Lamda expression
		// Function<T,R> f = Item::getName //method reference

		Arrays.sort(items, Comparator.comparing(Item::getName).reversed());// Default ASC
		ArraysUtils.generate("Sort items by name ASC", items);
				
		Arrays.sort(items, Comparator.comparing((Item item) -> item.getName(), Comparator.reverseOrder()).reversed());	
		
		Arrays.sort(items, Comparator.comparing(Item::getStoreId,Comparator.reverseOrder()).thenComparing(Item::getSalesPrice));// Default ASC
		ArraysUtils.generate("Sort items by storeId(DESC), salesPrice (ASC)", items);
		
		items[2] = null;
		items[4] = null;
		items[6] = null;
		
		Arrays.sort(items,  Comparator.nullsFirst(
									Comparator.comparing(Item::getStoreId,Comparator.reverseOrder())
									.thenComparing(Item::getSalesPrice)
									)
				);// Default ASC
		
		
		
		ArraysUtils.generate("Sort null first items by storeId(DESC), salesPrice (ASC)", items);
		
	}

}
