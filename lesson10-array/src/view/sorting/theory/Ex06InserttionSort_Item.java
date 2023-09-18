package view.sorting.theory;

import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex06InserttionSort_Item {
	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1, i2) -> {
			return i2.getSalesPrice().compareTo(i1.getSalesPrice());
		});
		
		ArraysUtils.generate("Sort items by salesPrice(DESC)", items);
	}
	
	private static void sort(Item[] items, Comparator<Item> comparator) {
		int length = items.length;
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if(comparator.compare(items[j], items[i]) > 0) {
					ArraysUtils.swap(items, j, i);
				}
			}
		}
	}
}