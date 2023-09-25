package view.sorting.theory;

import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex05InsertionSort_Item {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		sort(items, (i1, i2) -> i2.getSalePrice().compareTo(i1.getSalePrice()));
		ArrayUtils.generate("sort items by salesPrice(DESC)", items);
	}
	private static void sort(Item[] items, Comparator<Item> comparator) {
		int length = items.length;
		for(int i = 1; i < length; i++) {
			for(int j = 0; j < i; j++) {
				if(comparator.compare(items[j], items[i]) > 0) {
					ArrayUtils.swapString(items, j, i);
				}
			}
		}
	}
}
