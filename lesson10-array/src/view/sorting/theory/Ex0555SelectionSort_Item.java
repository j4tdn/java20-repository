package view.sorting.theory;

import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex0555SelectionSort_Item {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1, i2) -> {
			return i2.getSalesPrices().compareTo(i1.getSalesPrices());
		});
		
		ArraysUtils.generate("Sort items by salesPrices(DESC)", items);
	}
	private static void sort(Item[] items, Comparator<Item> comparator) {
		int length = items.length;
		for(int i = length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(comparator.compare(items[j], items[i]) > 0) {
					ArraysUtils.swap(items, i, j);
				}
			}
		}
	}
}
