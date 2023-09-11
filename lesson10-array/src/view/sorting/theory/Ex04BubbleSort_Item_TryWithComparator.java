package view.sorting.theory;

import static utils.ArrayUtils.generate;
import static utils.ArrayUtils.swap;

import java.util.Comparator;

import bean.Item;
import model.DataModel;

public class Ex04BubbleSort_Item_TryWithComparator {

	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1, i2) -> i1.getSalesPrice().compareTo(i2.getSalesPrice()));
		generate("sort items by salesPrice(asc) ", items);

		sort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			int storeIdCompare = storeId1.compareTo(storeId2);
			
			return storeIdCompare == 0 ? i2.getSalesPrice().compareTo(i1.getSalesPrice())
									   : storeIdCompare;
		});
		generate("sort items by storeId(asc), salesPrice (desc) ", items);

	}

	private static void sort(Item[] items, Comparator<Item> comparator) {
		int length = items.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (comparator.compare(items[j], items[j + 1]) > 0) {
					swap(items, j, j + 1);
				}
			}
		}
			
	}
}
