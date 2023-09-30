package view.map;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;

public class Ex02MapInDetail {

	public static void main(String[] args) {
		
		Map<Item, List<Item>> items = mockData();
		
		Item item4 = new Item(1, "A4", bd(99), 999);
		
		items.put(item4, List.of());
		
		System.out.println("items size: " + items.size());
		
		for (Item key: items.keySet()) {
			System.out.println(key + " " + items.get(key).size());
		}
	}
	
	// K: Item       --> original item
	// V: List<Item> --> reference items
	private static Map<Item, List<Item>> mockData(){
		// original items
		Item item1 = new Item(1, "A1", bd(20), 301);
		Item item2 = new Item(2, "A2", bd(30), 401);
		Item item3 = new Item(3, "A3", bd(40), 501);
				
		// reference items
		Item item11 = new Item(11,"A11", bd(20), 301);
		Item item12= new Item(22, "A12", bd(20), 301);
		
		Item item21 = new Item(21, "A21", bd(30), 401);
		Item item22 = new Item(22, "A22", bd(30), 401);
		Item item23 = new Item(23, "A23", bd(30), 401);

		Item item31 = new Item(31, "A31", bd(40), 501);
		
		// dynamic map
		Map<Item, List<Item>> items = new HashMap<>();
		items.put(item1, List.of(item11, item12));
		items.put(item2, List.of(item21, item22, item23));
		items.put(item3, List.of(item31));
		
		return items;
	}

	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
