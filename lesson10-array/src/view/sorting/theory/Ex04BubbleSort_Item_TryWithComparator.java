package view.sorting.theory;

import java.util.Comparator;

import bean.Item;
import functional.Comparator_Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex04BubbleSort_Item_TryWithComparator {
	
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		ArraysUtils.generate("items", items);
		
		sort(items, (i1, i2) -> {
			return i1.getSalesPrice().compareTo(i2.getSalesPrice());
		});
		ArraysUtils.generate("1. Sort items by salesPrice(ASC)", items);
		
		
		sort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			int storeIdCompare = storeId1.compareTo(storeId2);
			
			return storeIdCompare == 0 ? i2.getSalesPrice().compareTo(i1.getSalesPrice()) : storeIdCompare;
			
		});
		ArraysUtils.generate("2. Sort items by storeId(ASC), salesPrice(DESC)", items);
	}
	
	private static void sort(Item[] items, Comparator<Item> comparator) {
		int length = items.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				Item i1 = items[j];
				Item i2 = items[j+1];
				if (comparator.compare(i1, i2) > 0) {
					ArraysUtils.swap(items, j, j + 1);
				}
			}
		}
	}
}
