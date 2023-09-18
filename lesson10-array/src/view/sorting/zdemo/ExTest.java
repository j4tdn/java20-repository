package view.sorting.zdemo;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.ArraysUtils;

public class ExTest {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		ArraysUtils.generate("Items", items);
		
		//Sort items by Comparable (with salesPrice desc)
		Arrays.sort(items);
		ArraysUtils.generate("Items by comparable salesPrice desc", items);
		
		// Sort items by Comparator (with storeId ASC)
		Arrays.sort(items, (i1,i2)->{
			return i1.getStoreId() - i2.getStoreId();
		});
		ArraysUtils.generate("Items by comparable storeId asc", items);
		
		// Sort items by Comparator (with name ASC)
		Arrays.sort(items, new Comparator<Item>() {
			public int compare(Item o1, Item o2) {
				return o1.getName().compareTo(o2.getName());
			};
		});
		ArraysUtils.generate("Items by comparable name asc", items);
	}
}
