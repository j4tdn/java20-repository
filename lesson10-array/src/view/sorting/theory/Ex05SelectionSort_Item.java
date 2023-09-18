package view.sorting.theory;

import static utils.ArrayUtils.generate;
import static utils.ArrayUtils.swap;

import java.util.Comparator;

import bean.Item;
import model.DataModel;

public class Ex05SelectionSort_Item {

	public static void main(String[] args) {

		Item[] items = DataModel.mockItems();

		sort(items, (i1, i2) -> i1.getSalesPrice().compareTo(i2.getSalesPrice()));

		generate("Sort items by salesPrice(ASC)", items);

	}

	private static void sort(Item[] items, Comparator<Item> comparator) {
		int lenght = items.length;
		for (int i = lenght - 1; i > 0; i--)
			for (int j = 0; j < i; j++)
				if (comparator.compare(items[j], items[i]) > 0)
					swap(items, j, i);
	}

}
