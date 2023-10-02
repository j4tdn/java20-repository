package view.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import bean.Item;

public class Ex01BasicSetDemo {
	public static void main(String[] args) {
		// set.of(....) --> immutable set
		// set of Integer
		Set<Integer> numbers = new LinkedHashSet<>();
		numbers.add(22);
		numbers.add(47);
		numbers.add(32);
		numbers.add(15);
		numbers.add(22);// check hashcode, equals
		System.out.println("set of numbers");
		numbers.forEach(number -> System.out.print(number + " "));

		// set of objects
		Set<Item> items = new HashSet<>();
		items.add(new Item(1, "A1", BigDecimal.valueOf(10), 101));
		items.add(new Item(2, "A2", BigDecimal.valueOf(103), 102));
		items.add(new Item(3, "A3", BigDecimal.valueOf(102), 103));
		items.add(new Item(4, "A4", BigDecimal.valueOf(101), 104));
		System.out.println("\nitem size--> " + items.size());
	}
}
