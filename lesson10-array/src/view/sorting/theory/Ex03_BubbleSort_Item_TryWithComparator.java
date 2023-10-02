package view.sorting.theory;

import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex03_BubbleSort_Item_TryWithComparator {
	public static void main(String[] args) {
		
		//Item: id, name, salesPrice, storeId
		//NULL: first
		
		Item[] items = DataModel.mockItems();
		sort(items,(i1, i2) -> {
			return i2.getSalesPrices().compareTo(i2.getSalesPrices());
		});
		
		ArraysUtils.generate("3. Sort Item by SalesPrices(ASC) --> ", items);
		sort(items,(i1, i2) -> {
			Integer storeId1 = i1.getStoreId();
			Integer storeId2 = i2.getStoreId();
			return storeId1.equals(storeId2) ? i2.getSalesPrices().compareTo(i1.getSalesPrices()) : storeId1.compareTo(storeId2);
			//if(storeId1.equals(storeId2) ) {
				//return i2.getSalesPrices().compareTo(i1.getSalesPrices());
			//}
			//return storeId1.compareTo(storeId2);
		});
		ArraysUtils.generate("4. Sort Item by StoreId(ASC)", items);
	}
	public static void sort(Item[] items, Comparator<Item> comparator){
		int length = items.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (comparator.compare(items[j], items[j + 1]) > 0) {
					ArraysUtils.swap(items, j, j + 1);
				}
			}
		}
	}
}
