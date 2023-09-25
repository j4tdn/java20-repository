package bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class DataModel {
	private DataModel() {
		
	}
	
	public static Item[] mockItem(){
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
	public static List<Item> mockItems(){
		List<Item> items = new ArrayList<>();
		items.add(new Item(1, "Item A1", bd(22), 101));
		items.add(new Item(3, "Item A2", bd(25), 102));		
		items.add(new Item(2, "Item A4", bd(24), 103));		
		items.add(new Item(6, "Item b4", bd(26), 101));		
		items.add(new Item(5, "Item c1", bd(27), 103));		
		items.add(new Item(4, "Item c2", bd(32), 106));		
		items.add(new Item(7, "Item f2", bd(122), 108));		
		items.add(new Item(9, "Item e2", bd(33), 109));		
				
		return items;
	}
	public static BigDecimal  bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
