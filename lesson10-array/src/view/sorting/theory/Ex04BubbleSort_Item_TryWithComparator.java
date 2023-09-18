package view.sorting.theory;

import java.util.Comparator;
import java.util.List;

import bean.Item;
import functional.Comparator_Item;
import model.DataModel;
import static utils.ArrayUtils.*;

public class Ex04BubbleSort_Item_TryWithComparator {

	public static void main(String[] args) {

		Item[] items = DataModel.mockItems();
		generate("items", items);

		// Sort items by salesPrice(ASC)
		sort(items, (i1, i2) -> i1.getSalesPrice().compareTo(i2.getSalesPrice()));
		generate("1. Sort items by salesPrice(ASC)", items);

		// Sort items by storeId(asc), salesPrice(desc)
		sort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			if (storeId1.equals(storeId2)) 
				return i2.getSalesPrice().compareTo(i1.getSalesPrice());
			return storeId1.compareTo(storeId2);
		});
		generate("2. Sort items by storeId(ASC), salesPrice(desc)", items);

	}

	private static void sort(Item[] items, Comparator<Item> comparator) {
		int size = items.length;
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size - i - 1; j++) 
				if (comparator.compare(items[j], items[j + 1]) > 0)
					swap(items, j, j + 1);
	}

}
