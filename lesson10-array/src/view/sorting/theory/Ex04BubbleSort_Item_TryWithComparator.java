package view.sorting.theory;

import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex04BubbleSort_Item_TryWithComparator {

	public static void main(String[] args) {

		// Item: id, name, salesPrice, storeId
		Item[] items = DataModel.mockItems();
		ArraysUtils.generate("items", items);
		
		
		//Sort items by salesPrice(ASC)
		sort(items, (i1,i2) ->{
			return i1.getSalesPrice().compareTo(i2.getSalesPrice());
		});
		ArraysUtils.generate("1. Sort items by id(ASC)", items);
		
		
		// Sort items by name(desc)
		sort(items, (i1,i2) -> {
			return i2.getName().compareTo(i1.getName());
		});
		ArraysUtils.generate("2. Sort items by name(DESC)", items);
	}

	private static void sort(Item[] items, Comparator<Item> comparator) {
		int length = items.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				Item i1 = items[j];
				Item i2 = items[j + 1];
				if (comparator.compare(i1, i2) > 0) {
					ArraysUtils.swap(items, j, j + 1);
				}
			}
		}
	}

}
