package view.list;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class ExPractice {
	public static void main(String[] args) {
		
		List<Item> listItems = DataModel.mockItems();
		List<Item> listItemss = DataModel.mockItems();
		
		CollectionUtils.generateItem("listItems", listItems);
		
		//Collections.sort(listItems);
		
		CollectionUtils.generateItem("listItems sorted by Id ASC", listItems);
		
		Collections.sort(listItems, new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				if(o1.getStoreId().equals(o2.getStoreId())) {
					return o2.getSalesPrice().compareTo(o1.getSalesPrice());
				}
				
				return o2.getStoreId().compareTo(o1.getStoreId());
			}
		});
		
		CollectionUtils.generateItem("listItems sorted by storeId DESC", listItems);
		
		listItemss.removeIf(sql -> sql.getName().endsWith("A6"));
		
		Item item = new Item(6, "Item A6", BigDecimal.valueOf(21), 104);
		boolean isContained = listItems.contains(item);		
		boolean containAll  = listItems.containsAll(listItemss);
		System.out.println("is list contain ITEM-6-A6-21-104 ? " + isContained);
		System.out.println("is list contain all the items  ? " + containAll);
		
	} 
}
