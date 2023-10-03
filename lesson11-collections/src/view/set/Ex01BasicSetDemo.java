package view.set;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex01BasicSetDemo {
	
	public static void main(String[] args) {
		
		// Set of Integer
		Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
		
		numbers.add(220);
		numbers.add(41);
		numbers.add(777);
		numbers.add(39);
		numbers.add(555);
		numbers.add(220); // Kiểm tra hashcode, equals
		
		System.out.println("Set of numbers");
		numbers.forEach(number -> System.out.print(number + "   "));
		
		// Set of Objects
		Set<Item> items = new HashSet<>();
		items.add(new Item(1, "A1", BigDecimal.valueOf(10), 101));
		items.add(new Item(2, "A2", BigDecimal.valueOf(20), 102));
		items.add(new Item(3, "A3", BigDecimal.valueOf(30), 103));
		
		System.out.println("\nitems size --> " + items.size());
		
	}

}
