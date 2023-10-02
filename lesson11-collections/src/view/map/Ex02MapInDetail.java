package view.map;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;

public class Ex02MapInDetail {
	public static void main(String[] args) {
		
		Map<Item, List<Item>> items = mockData();
		Item item4 = new Item(4, "A4",bd(123) , 901);
		items.put(item4, List.of());
		
		System.out.println("item size: " + items.size());
		for(Item key: items.keySet()) {
			System.out.println(key);
		}
	}
	
	//Key: Item  		--> original Item
	//Value: List<Item>	--> reference Item
	private static Map<Item, List<Item>> mockData(){
		Item item1 = new Item(1, "A1",bd(20) , 301);
		Item item2 = new Item(2, "B1",bd(21) , 401);
		Item item3 = new Item(3, "C1",bd(50) , 501);
		
		Item item11 = new Item(11, "A1",bd(30) , 301);
		Item item12 = new Item(12, "B1",bd(21) , 401);
		Item item13 = new Item(13, "C1",bd(60) , 501);
		
		//dynamic map
		Map<Item, List<Item>> items = new HashMap<>();
		items.put(item1, List.of(item1, item2));
		items.put(item2, List.of(item11, item12));
		items.put(item3, List.of(item12, item13));
		return items;
	}
	
	private static BigDecimal bd(double double1) {
		return BigDecimal.valueOf(double1);
	}
}
