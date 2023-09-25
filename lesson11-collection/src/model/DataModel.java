package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import bean.Item;

public class DataModel {
	
	private DataModel() {
		
	}
	
	public static List<Item> mockItems(){
		var items = new ArrayList<Item>();
		items.add(new Item(2, "Item A2", bd(23), 102));
		items.add(new Item(4, "Item B2", bd(39), 101));
		items.add(new Item(5, "Item C1", bd(19), 102));
		items.add(new Item(3, "Item B1", bd(89), 101));
		items.add(new Item(1, "Item P2", bd(100), 104));
		items.add(new Item(8, "Item H2", bd(29), 102));
		items.add(new Item(6, "Item G2", bd(63), 103));
		items.add(new Item(7, "Item A2", bd(93), 104));

		return items;
	}
	
	public static Item[] mockItems_NullValues(){
		return new Item[]{
			null,
			new Item(2, "Item A2", bd(23), 102),
			new Item(4, "Item B2", bd(39), 101),
			new Item(5, "Item C1", bd(19), 102), 
			new Item(null, "Item A1", bd(22), 101), 
			null,
			new Item(3, "Item B1", bd(89), 103), 
			new Item(7, "Item D1", bd(20), 104), 
			null,
			new Item(10, "Item E2", bd(100), 105),
			new Item(null, "Item D2", bd(24), 103),
			new Item(6, "Item C2", bd(55), 104),
			new Item(9, "Item E1", bd(12), 105),
			null
		};
	}
	
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
