package model;

import java.math.BigDecimal;

import bean.Item;

public class DataModel {
	private DataModel() {
	}
	public static Item[] mockItems(){
		return new Item[] {
				new Item(1, "Item A1", bd(22), 101),
				new Item(2, "Item A2", bd(22), 101),
				new Item(3, "Item B1", bd(25), 102),
				new Item(4, "Item B2", bd(72), 103),
				new Item(5, "Item A3", bd(15), 105),
				new Item(6, "Item C4", bd(22), 103),
				new Item(7, "Item C1", bd(22), 101),
				new Item(8, "Item D2", bd(13), 101),
				new Item(9, "Item F7", bd(2), 101),
				new Item(10, "Item C2", bd(52), 101)
		};
	}
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
