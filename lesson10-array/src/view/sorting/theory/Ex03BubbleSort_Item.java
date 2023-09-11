package view.sorting.theory;

import static utils.ArrayUtils.generate;
import static utils.ArrayUtils.swap;

import bean.Item;
import functional.Comparator_Item;
import model.DataModel;

public class Ex03BubbleSort_Item {

	public static void main(String[] args) {
		// prior: JDK 1.5
		// int 
		// Integer
		// int a, Integer b = new Integer(2);
		// a = b; error
		// b = a; error
		
		// JDK 1.5
		// autoboxing 	: primitive -> object
		// autounboxing : object -> primitive
		
		// Item: id, name, salesPrice, storeId
		Item[] items = DataModel.mockItems_NullValues();
		
		// sort items by id(asc)
		sort(items, (i1, i2) -> {
			if (i1 == null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}
			
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			
			if (id1 == null && id2 != null) {
				return 1;
			}
			
			if (id2 == null) {
				return -1;
			}
			
			return i1.getId().compareTo(i2.getId());
		});
		generate("sort items by id(asc) ", items);
		
		// sort items by name(desc)
		sort(items, (i1, i2) -> i2.getName().compareTo(i1.getName()));
		generate("sort items by name(desc) ", items);
		
		// sort items by salesPrice(asc)
		sort(items, (i1, i2) -> i1.getSalesPrice().compareTo(i2.getSalesPrice()));
		generate("sort items by salesPrice(asc) ", items);
		// sort items by storeId(asc), salesPrice (desc)
		sort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			
			int storeIdCompare = storeId1.compareTo(storeId2);
			
			return storeIdCompare == 0 ? i2.getSalesPrice().compareTo(i1.getSalesPrice())
									   : storeIdCompare;
		});
		generate("sort items by storeId(asc), salesPrice (desc) ", items);

	}

	private static void sort(Item[] items, Comparator_Item comparator) {
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
