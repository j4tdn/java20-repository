package view.sorting.theory;

import bean.Item;
import functional.Comparator_Item;
import model.DataModel;
import utils.ArraysUtils;

public class Ex03_BubbleSort_Item {
	public static void main(String[] args) {
		
		//Item: id, name, salesPrice, storeId
		//NULL: first
		
		Item[] items = DataModel.mockItems();
		
		sort(items, (i1, i2) -> {
			if(i1 == null){
				return -1;
			}
			if(i2 == null){
				return 1;
			}
			Integer id1 = i1.getId();
			Integer id2 = i2.getId();
			if(id1 == null && id2 != null) {
				return 1;
			}
			if(id2 == null) {
				return -1;
			}
			return i1.getId() - i2.getId();
		});
		ArraysUtils.generate("items", items);
		ArraysUtils.generate("1. Sort Item by id(ASC)", items);
	
		sort(items,(i1, i2) -> {
			return i2.getName().compareTo(i2.getName());
		});
		ArraysUtils.generate("2. Sort Item by name(DESC)", items);
		
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
	public static void sort(Item[] items, Comparator_Item comparator){
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
