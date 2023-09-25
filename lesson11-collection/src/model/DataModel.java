package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class DataModel {
	private DataModel() {
		
	}
	
	public static Item[] mockArrayOfItem() {
		return new Item[] {
				new Item(1, "Item A1", bd(22), 101),
				new Item(2, "Item A2", bd(27), 101),
				new Item(4, "Item B2", bd(16), 102)
		};
	}
	
	public static List<Item> mockItems() {
		List<Item> items = new ArrayList<>();
				
		items.add(new Item(1, "Item A1", bd(22), 101));
		items.add(new Item(2, "Item A2", bd(27), 101));
		items.add(new Item(3, "Item B1", bd(99), 102));
		items.add(new Item(4, "Item B2", bd(16), 102));
		items.add(new Item(6, "Item A3", bd(88), 105));
		items.add(new Item(8, "Item C4", bd(55), 105));
		items.add(new Item(7, "Item C1", bd(91), 102));
		items.add(new Item(5, "Item D2", bd(44), 103));
		items.add(new Item(9, "Item F7", bd(72), 101));
		items.add(new Item(10, "Item C2", bd(37), 104));
		return items;
	}
	
	public static Item[] mockItems_NullValues() {
		return new Item[] {
				null,
				new Item(1,  "Item A1", bd(22), 101),
				new Item(2,  "Item A2", bd(27), 101),
				new Item(3,  "Item B1", bd(99), 102),
				new Item(4,  "Item B2", bd(16), 102),
				null,
				new Item(6,  "Item A3", bd(88), 105),
				new Item(8,  "Item C4", bd(55), 105),
				new Item(null,  "Item C1", bd(91), 102),
				new Item(5,  "Item D2", bd(44), 103),
				null,
				new Item(9,  "Item F7", bd(72), 104),
				new Item(null, "Item C2", bd(37), 103)
		};
	}
	
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
