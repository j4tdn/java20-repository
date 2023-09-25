package view.sorting.theory;


import bean.Item;
import functional.Comparator_Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex03BubbleSort_Item {
	public static void main(String[] args) {
		//Item: id, name, salePrice, storeId
		Item[] items = DataModel.mockItems_nullValue();
		ArrayUtils.generate("items", items);
		// sort item by id(ASC)
		sort(items, (i1, i2) -> {
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			return i1.getId() - i2.getId();
		});
		ArrayUtils.generate("1.sort item by id(ASC)", items);
		
		// sort item by name(DESC)
		sort(items, (i1, i2) -> {
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			return i2.getName().compareTo(i1.getName());
		});
		ArrayUtils.generate("1.sort item by name(DESC)", items);
		
		// sort item by salePrice(ASC)
		sort(items, (i1, i2) -> {
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			return i1.getSalePrice().compareTo(i2.getSalePrice());
		});
		
		ArrayUtils.generate("1.sort item by salePrice(ASC)", items);
		// sort item by storeId(DESC), salePrice(DESC)
		sort(items, (i1, i2) ->{
			if(i1 == null) {
				return -1;
			}
			if(i2 == null) {
				return 1;
			}
			if(i1.getStoreId().equals(i2.getStoreId())) {
				return i2.getSalePrice().compareTo(i1.getSalePrice());
			}
			return i1.getStoreId().compareTo(i2.getStoreId());
			
		});
		ArrayUtils.generate("1.sort item by storeId(ASC), salePrice(DESC)", items);
		
	}
	private static void sort(Item[] items, Comparator_Item comparator) {
		for(int i = 0; i < items.length; i++) {
			for(int j = 0; j < items.length -1; j++) {
				Item i1 = items[j];
				Item i2 = items[j + 1];
				if(comparator.compare(i1, i2) > 0) {
					ArrayUtils.swapString(items, j, j + 1);
				}
			}
		}
	}
	
}
