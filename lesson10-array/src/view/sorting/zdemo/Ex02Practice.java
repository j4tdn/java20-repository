package view.sorting.zdemo;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex02Practice {
	public static void main(String[] args) {
		String[] sequences = { "z2", "c5", "d4","a1", "e1","p6" };
		int[] numbers = { 3, 1, 2, 5, 8, 6, 9 };
		
		ArraysUtils.generate("number", numbers);
		ArraysUtils.sort(numbers);
		ArraysUtils.generate("number", numbers);
		
		ArraysUtils.generate("sequences", sequences);
		Arrays.sort(sequences);
		ArraysUtils.generate("sequences", sequences);
		
		ArraysUtils.generate("sequences", sequences);
		Arrays.sort(sequences);
		ArraysUtils.generate("sequences", sequences);

		Item[] items = DataModel.mockItems();
		ArraysUtils.generate("Items", items);
		//Sort by name ASC
		Arrays.sort(items);
		ArraysUtils.generate("Items", items);
		
		//Sort by SalesPrice DESC
		Arrays.sort(items, (i1, i2) -> {
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
		});
		ArraysUtils.generate("Items SalesPrice", items);
		
	}
}
