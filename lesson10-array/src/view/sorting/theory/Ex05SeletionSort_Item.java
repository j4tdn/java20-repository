package view.sorting.theory;

import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex05SeletionSort_Item {

	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItems();
		sort(items, (i1, i2) -> i1.getSalesPrice().compareTo(i2.getSalesPrice()));
		ArrayUtils.generate("asc by salesPrice ", items);
	}
	
	private static void sort(Item[] items, Comparator<Item> comparator) {
		int length = items.length;
		for (int i = length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (comparator.compare(items[j], items[i]) > 0) {
					ArrayUtils.swap(items, i, j);
				}
			}
		}
	}

}
