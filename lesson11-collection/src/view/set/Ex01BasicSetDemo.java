package view.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex01BasicSetDemo {

	public static void main(String[] args) {
		
		// set of integers 
		
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5000);
		numbers.add(600);
		numbers.add(200);
		numbers.add(777);
		numbers.add(101);
		numbers.add(101); // kiểm tra hashcode và equals
		
		System.out.println("Set of numbers");
		numbers.forEach(number -> System.out.print(number + " "));
		
		// set of objects
		
		Set<Item> items = new HashSet<>();
		items.add(new Item(1, "A1", BigDecimal.valueOf(10), 101));
		items.add(new Item(2, "A2", BigDecimal.valueOf(20), 102));
		items.add(new Item(3, "A3", BigDecimal.valueOf(30), 103));
		items.add(new Item(4, "A3", BigDecimal.valueOf(30), 103));
		
		System.out.println("\nitems size " + items.size());
		
	}

}
