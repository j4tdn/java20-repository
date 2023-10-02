package lesson11.map;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex02MapInDetail {
	public static void main(String[] args) {

		Map<Item, List<Item>> items = mockData();
		
		Item item4 = new Item(3, "A3", bd(50), 303);
		Item item5 = new Item(3, "A3", bd(50), 303);
		
		Item item21 = new Item(21, "A21", bd(20), 400);
		Item item22 = new Item(22, "A22", bd(20), 400);
		Item item23 = new Item(23, "A23", bd(20), 400);
		
		items.put(item4, List.of(item21, item22, item23));
		System.out.println(item4.getId().hashCode());
		
		System.out.println("Items size --> " + items.size());
		
		List<Item> it4 = items.get(item4);
		System.out.println(it4);
		for (Entry<Item, List<Item>> entry: items.entrySet()) {
			System.out.println(entry.getKey().hashCode());
		}

	}

	// K: Item --> Original item
	// V: List<Item> --> Reference Item
	private static Map<Item, List<Item>> mockData() {

		// Original items
		Item item1 = new Item(1, "A1", bd(20), 301);
		Item item2 = new Item(2, "A2", bd(30), 302);
		Item item3 = new Item(3, "A3", bd(50), 303);

		// reference items
		Item item11 = new Item(11, "A11", bd(20), 400);
		Item item12 = new Item(12, "A11", bd(20), 400);

		Item item21 = new Item(21, "A21", bd(20), 400);
		Item item22 = new Item(22, "A22", bd(20), 400);
		Item item23 = new Item(23, "A23", bd(20), 400);

		Item item31 = new Item(31, "A31", bd(20), 400);

		// Dynamic map
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
