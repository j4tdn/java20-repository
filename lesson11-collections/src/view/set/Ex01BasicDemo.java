package view.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import bean.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//set of integers
		Set<Integer> numbers = new HashSet<>();
		numbers.add(22);
		numbers.add(42);
		numbers.add(1);
		numbers.add(31);
		numbers.add(5);
		//numbers.add(5); -> kiểm tra hashCode, equals
		
		numbers.forEach(number -> {
			System.out.println(number + "  ");
		}
		);
		
		//set of Object
		Set<Item> items = new LinkedHashSet<>();
		items.add(new Item(1,  "Item A1", bd(22), 101));
		items.add(new Item(2,  "Item A2", bd(27), 101));
		items.add(new Item(3,  "Item B1", bd(99), 102));
		items.add(new Item(4,  "Item B2", bd(16), 102));
		items.add(new Item(4,  "Item B2", bd(16), 102));
		
		System.out.println("size --> " + items.size());
		
		items.forEach(item -> {
			System.out.println(item + "  ");
		}
		);
	}
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
