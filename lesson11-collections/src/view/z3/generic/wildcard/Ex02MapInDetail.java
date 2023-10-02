package view.z3.generic.wildcard;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;

public class Ex02MapInDetail {
	public static void main(String[] args) {
		 Map<Item, List<Item>> items = mockData();
		 
		Item item4 = new Item(1,  "Item B1", bd(99), 102);
		items.put(item4, List.of());
		
		System.out.println("items size --> " + items.size());
		
	}
	
	//K: Item		--> original item
	//V: List<Item>	--> reference items
	
	private static Map<Item, List<Item>> mockData(){
		Item item1 = new Item(1,  "Item A1", bd(22), 101);
		Item item2 = new Item(2,  "Item A2", bd(27), 101);
		Item item3 = new Item(3,  "Item B1", bd(99), 102);
		
		Item item11 = new Item(11,  "Item B2", bd(16), 102);
		Item item12 = new Item(12,  "Item A3", bd(88), 105);
		
		Item item21 = new Item(21,  "Item C4", bd(55), 105);
		Item item22 = new Item(22,  "Item C4", bd(55), 105);
		Item item23 = new Item(23,  "Item C4", bd(55), 105);
		
		Item item31 = new Item(31,  "Item C4", bd(55), 105);
		//dynamic app
		 Map<Item, List<Item>> items = new HashMap<>();
		 items.put(item1, List.of(item11, item12));
		 items.put(item2, List.of(item21, item22, item23));
		 items.put(item3, List.of(item31));
		 
		 return items;

	}
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
