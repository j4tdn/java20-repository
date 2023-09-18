package view.sorting.theory;

import bean.Item;
import functional.Comparator_Item;
import model.DataModel;
import static utils.ArrayUtils.*;

public class Ex03BubbleSort_Item {

	public static void main(String[] args) {

		Item[] items = DataModel.mockItems_NullValues();
		generate("items", items);

		// Sort items by id(ASC)
		sort(items, (i1, i2) -> {
			// null first
			if (i1 == null)
				return -1;
			if (i2 == null)
				return 1;
			
			// null last (property)
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			if (id1 == null && id2 != null)
				return 1;
			if (id2 == null)
				return -1;
			return id1.compareTo(id2);
		});
		generate("1. Sort items by id(ASC)", items);

		// Sort items by name(DESC)
		sort(items, (i1, i2) -> i2.getName().compareTo(i1.getName()));
		generate("2. Sort items by name(DESC)", items);

		// Sort items by salesPrice(ASC)
		sort(items, (i1, i2) -> i1.getSalesPrice().compareTo(i2.getSalesPrice()));
		generate("3. Sort items by salesPrice(ASC)", items);

		// Sort items by storeId(DESC), salesPrice(DESC)
		sort(items, (i1, i2) -> {
			if (i1.getStoreId() == i2.getStoreId())
				return i2.getSalesPrice().compareTo(i1.getSalesPrice());
			return i1.getStoreId().compareTo(i2.getStoreId());
		});
		generate("4. Sort items by storeId(DESC), salesPrice(DESC)", items);

	}

	private static void sort(Item[] items, Comparator_Item comparator) {
		int length = items.length;
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length - i - 1; j++)
				if (comparator.compare(items[j], items[j + 1]) > 0)
					swap(items, j, j + 1);
	}

}
