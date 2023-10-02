package view.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import bean.Item;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		
		// Set of integers
		Set<Integer> numbers = new HashSet<>();
		numbers.add(21);
		numbers.add(14);
		numbers.add(52);
		numbers.add(23);
		numbers.add(61);
		numbers.add(12);
		numbers.add(12); // Kiểm tra HashCode và Equals
		
		System.out.println("Set of numbers");
		numbers.forEach(number -> System.out.print(number + " "));
	
		// Set of objects
		Set<Item> items = new HashSet<>();
		items.add(new Item(1, "A1", BigDecimal.valueOf(10), 101));
		items.add(new Item(12, "A1", BigDecimal.valueOf(10), 101));
		items.add(new Item(1, "A1", BigDecimal.valueOf(10), 101));
		
		System.out.println("\nItems size --> " + items.size());
	}
}
