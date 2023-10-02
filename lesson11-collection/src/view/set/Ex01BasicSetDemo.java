package view.set;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex01BasicSetDemo {
	
	public static void main(String[] args) {
		// Set.of(....) --> immutable set
		
		// set of integers
		Set<Integer> numbers = new LinkedHashSet<>();
		
		numbers.add(220);
		numbers.add(41);
		numbers.add(777);
		numbers.add(39);
		numbers.add(555);
		numbers.add(220); // kiểm tra hashcode, equals
		
		System.out.println("Set of numbers");
		numbers.forEach(number -> {
			System.out.print(number + "  ");
		});
		
		
		// set of objects
		Set<Item> items = new HashSet<>();
		
		items.add(new Item(1, "A1", BigDecimal.valueOf(10), 101));
		items.add(new Item(2, "A2", BigDecimal.valueOf(20), 102));
		items.add(new Item(3, "A3", BigDecimal.valueOf(30), 103));
		items.add(new Item(4, "A3", BigDecimal.valueOf(30), 103));
		
		System.out.println("\n\nitems size --> " + items.size());
	}
}
