package view.sorting.theory;

import bean.Item;
import functional.Comparator;
import model.DataModel;
import utils.ArraysUtils;

public class Ex05SelectionSort_Item {
	public static void main(String[] args) {
		 Item[] items = DataModel.mockItems();
		 
		 sort(items, (i1, i2) -> {
			 return i1.getSalesPrices().compareTo(i2.getSalesPrices());
		 });
		 
		 ArraysUtils.generate("Sort items by salesPrice(DESC)", items);
		 
	}
	
	private static void sort(Item[] items, Comparator<Item> comparator) {
		int length = items.length;
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if (comparator.compare(items[i], items[j]) > 0) {
					ArraysUtils.swap(items, i, j);
				}
			}
		}
	}
}
