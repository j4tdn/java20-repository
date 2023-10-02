package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

import static java.util.Comparator.*;

public class Ex03Sort_SimpleCases {
	public static void main(String[] args) {
		
		//array of int
		
		
		//array of strings
		String[] sequences = {"a", "z", null, "c", null, "d", "b"};
		Arrays.sort(sequences, nullsFirst(comparing(Function.identity())));
		ArraysUtils.generate("Sort sequences(ASC), null first", sequences);
		
		//array of items
		Item[] items = DataModel.mockItems();
		
		//Với những trường hợp đơn giản như sắp xếp các phần tử theo các thuộc tính
		//bên trong đối tượng, xử lý null value cho đối tượng
		
		//-> Sử dụng Comparator.comparing(Function<T, ?> function) thay vì new Comparator<T>
		
		//1. Sort items by name(ASC)
		/*Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item i1, Item i2) {
				return i1.getName().compareTo(i2.getName());
			}
			
		});*/
		
		//Function<T, R> f = (Item item) -> item.getName(); //lambda expression
		//Function<T, R> f = Item::getname;					//method reference
		//Arrays.sort(items, Comparator.comparing( item -> item.getName())); //default asc
		Arrays.sort(items, Comparator.comparing(Item::getName).reversed()); //desc
		ArraysUtils.generate("Sort items by name(ASC)", items);
		
		//2. Sort items by storeId(DESC), salesPrices(ASC)
		


		
		//Arrays.sort(items, Comparator.comparing(Item::getStoreId).reversed().thenComparing(Item::getSalesPrices));
		ArraysUtils.generate("Sort items by name(ASC)", items);
	}
}
