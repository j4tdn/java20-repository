package view.sorting.theory;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex05SelectionSort_Item {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1,i2) ->{
			return i1.getSalesPrice().compareTo(i2.getSalesPrice());
		});
		
		ArraysUtils.generate("Sorts items by salesPrice(ASC)", items);
		
	}

	public static void sort(Item[] items, Comparator<Item> comparator) {
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
