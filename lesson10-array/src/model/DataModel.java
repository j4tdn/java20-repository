package model;

import java.math.BigDecimal;
import java.util.List;

import bean.Item;

public class DataModel {
	
	private DataModel() {
	}
	
	public static Item[] mockItems_NullValues(){
		return new Item[] {
			new Item(2, "Item A2", bd(28), 107),	
			new Item(4, "Item A4", bd(30), 102),	
			new Item(1, "Item A1", bd(22), 108),	
			new Item(null, "Item A6", bd(21), 104),	
			new Item(3, "Item A3", bd(29), 107),	
			null,
			new Item(5, "Item A5", bd(31), 103),	
			new Item(10, "Item A10", bd(19), 103),
			null,
			new Item(null, "Item A9", bd(20), 102),	
			new Item(8, "Item A8", bd(63), 101),	
			null,
			new Item(7, "Item A7", bd(24), 105)	
		};
	}
	
	public static Item[] mockItems(){
		return new Item[] {
			new Item(2, "Item A2", bd(28), 107),	
			new Item(4, "Item A4", bd(30), 102),	
			new Item(1, "Item A1", bd(22), 108),	
			new Item(6, "Item A6", bd(21), 104),	
			new Item(3, "Item A3", bd(29), 107),	
			new Item(5, "Item A5", bd(31), 103),	
			new Item(10, "Item A10", bd(19), 103),
			new Item(9, "Item A9", bd(20), 102),	
			new Item(8, "Item A8", bd(63), 101),	
			new Item(7, "Item A7", bd(24), 105)	
		};
	}
	
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
