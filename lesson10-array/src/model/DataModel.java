package model;

import java.math.BigDecimal;

import bean.Item;

public class DataModel {
	
	private DataModel() {
		
	}
	
	public static Item[] mockItems(){
		return new Item[]{
			new Item(2, "Item A2", bd(23), 102),
			new Item(4, "Item B2", bd(39), 101),
			new Item(5, "Item C1", bd(19), 102), 
			new Item(8, "Item A1", bd(22), 101), 
			new Item(3, "Item B1", bd(89), 103), 
			new Item(7, "Item D1", bd(20), 104), 
			new Item(10, "Item E2", bd(100), 105),
			new Item(1, "Item D2", bd(24), 103),
			new Item(6, "Item C2", bd(55), 104),
			new Item(9, "Item E1", bd(12), 105)
		};
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
