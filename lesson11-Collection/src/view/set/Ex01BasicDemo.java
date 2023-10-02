package view.set;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import bean.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		
		
		Set<Integer> numbers =  new HashSet<>();//hash set k có cơ chế sắp xếp tăng dấn khi add
		numbers.add(2);
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		System.out.println("Set of numbers");
		numbers.forEach(number->{
			System.out.println(number +" ");
		});
		
		
		Set<Item> items = new HashSet<>();
		items.add(new Item(1,"A1",BigDecimal.valueOf(10),101));
		items.add(new Item(2,"A2",BigDecimal.valueOf(10),101));
		items.add(new Item(3,"A3",BigDecimal.valueOf(10),101));
		items.add(new Item(3,"A3",BigDecimal.valueOf(10),101));
		System.out.println("\n size --> "+items.size());
		
		Set<Integer> numbersT =  new TreeSet<>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		System.out.println("Set of numbers");
		numbers.forEach(number->{
			System.out.println(number +" ");
		});
		
		
	}
}
