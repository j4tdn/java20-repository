package view.sorting.theory;

import java.util.List;

import bean.Item;
import functional.Comparator_Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex03BubbleSort_Item {
	public static void main(String[] args) {
		// Prior: JDK 1.5
		// int
		// Integer
		// int a, Integer b = new Integer(2);
		// a = b // error
		// b = a // error

		// JDK 1.5
		// autoboxing    : primitive -> object
		// autoaunboxing : object    -> primitive
		// Integer b = 2;
		// int a = b;
		// b = a;

		// Item: id, name, salesPrice, storeId
		// NULL: first

		Item[] items = DataModel.mockItems_NullValues();

		ArraysUtils.generate("items", items);

		sort(items, (i1, i2) -> {
			// null first
			if (i1 == null) {
				return -1;
			}
			if (i2 == null) {
				return 1;
			}

			// null last
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			if (id1 == null && id2 != null) {
				return 1;
			}
			if (id2 == null) {
				return -1;
			}
			return id1 - id2;
		});
		ArraysUtils.generate("1. Sort items by id(ASC)", items);


		sort(items, (i1, i2) -> {
			return i2.getName().compareTo(i1.getName());
		});
		ArraysUtils.generate("2. Sort items by name(DESC)", items);


		sort(items, (i1, i2) -> {
			return i1.getSalesPrices().compareTo(i2.getSalesPrices());
		});
		ArraysUtils.generate("3. Sort items by salesPrice(ASC)", items);


		sort(items, (i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();

			int storeIdCompare = storeId1.compareTo(storeId2);

			return storeIdCompare == 0 ? i2.getSalesPrices().compareTo(i1.getSalesPrices()) : storeIdCompare;

		});
		ArraysUtils.generate("4. Sort items by storeId(ASC), salesPrice(DESC)", items);
	}

	private static void sort(Item[] items, Comparator_Item comparator) {
		int length = items.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				Item i1 = items[j];
				Item i2 = items[j+1];
				if (comparator.compare(i1, i2) > 0) {
					ArraysUtils.swap(items, j, j + 1);
				}
			}
		}
	}
}
