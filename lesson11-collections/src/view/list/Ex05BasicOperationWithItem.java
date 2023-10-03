package view.list;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.sort;
import static java.util.Comparator.*;
import static utils.CollectionUtils.*;
import bean.Item;
import model.DataModel;

public class Ex05BasicOperationWithItem {
	
	public static void main(String[] args) {
		
		List<Item> items = DataModel.mockItems();
		System.out.println("item size --> " + items.size());
		
		Item itemToBeRemoved = new Item(8,  "Item C4", bd(55), 105);
		items.remove(itemToBeRemoved);
		
		// sort items by storeId(ASC), salesPrice(DESC)
		items.sort(comparing(Item::getStoreId).thenComparing(Item::getSalesPrice, reverseOrder()));
		
		System.out.println("item size after --> " + items.size());
		generateItems("items", items);
		
	}
	
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
	
}
