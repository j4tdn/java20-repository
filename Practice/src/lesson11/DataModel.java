package lesson11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DataModel {

	private DataModel() {
	}

	public static List<Item> mockItems() {
		List<Item> items = new ArrayList<>();
		items.add(new Item(2, "Item A2", bd(28), 107));
		items.add(new Item(4, "Item A4", bd(30), 102));
		items.add(new Item(1, "Item A1", bd(22), 108));
		items.add(new Item(6, "Item A6", bd(21), 104));
		items.add(new Item(3, "Item A3", bd(29), 107));
		items.add(new Item(5, "Item A5", bd(31), 103));
		items.add(new Item(9, "Item A9", bd(20), 102));
		items.add(new Item(8, "Item A8", bd(63), 101));
		items.add(new Item(7, "Item A7", bd(24), 105));
		return items;
	};
	
	public static Item[] mockItemsArray(){
		return new Item[] {
			new Item(2, "Item A2", bd(28), 107),	
			new Item(4, "Item A4", bd(30), 102),	
			new Item(1, "Item A1", bd(22), 108),	
			new Item(6, "Item A6", bd(21), 104),	
			new Item(3, "Item A3", bd(29), 107),	
			new Item(5, "Item A5", bd(31), 103),	
			new Item(9, "Item A9", bd(20), 102),	
			new Item(8, "Item A8", bd(63), 101),	
			new Item(7, "Item A7", bd(24), 105)	
		};
	}


	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
