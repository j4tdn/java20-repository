package model;

import java.math.BigDecimal;

import bean.Item;

public class DataModel {
	private DataModel() {
		
	}
	public static Item[] mockItems_nullValue(){
		return new Item[] {
				null,
				new Item(1, "Item A1", bd(22), 101),
				new Item(3, "Item A2", bd(25), 102),
				new Item(2, "Item A4", bd(24), 103),
				new Item(6, "Item b4", bd(26), 101),
				null,
				new Item(5, "Item c1", bd(27), 103),
				new Item(4, "Item c2", bd(32), 106),
				new Item(7, "Item f2", bd(122), 108),
				null,
				new Item(9, "Item e2", bd(33), 109),
				new Item(8, "Item d2", bd(35), 110)
		};
	}
	public static Item[] mockItems(){
		return new Item[] {
				
				new Item(1, "Item A1", bd(22), 101),
				new Item(3, "Item A2", bd(25), 102),
				new Item(2, "Item A4", bd(24), 103),
				new Item(6, "Item b4", bd(26), 101),
				new Item(5, "Item c1", bd(27), 103),
				new Item(4, "Item c2", bd(32), 106),
				new Item(7, "Item f2", bd(122), 108),
				new Item(9, "Item e2", bd(33), 109),
				new Item(8, "Item d2", bd(35), 110)
		};
	}
	public static BigDecimal  bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
