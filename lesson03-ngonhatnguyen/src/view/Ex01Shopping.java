package view;

import java.time.LocalDateTime;

import bean.Customer;
import bean.Item;
import bean.ItemDetails;
import bean.Order;

public class Ex01Shopping {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "LosAngeles");
		Customer c2 = new Customer("KH2", "Anna", "055", "London");
		
		Item i1 = new Item("SS10+", "Android", "Black", 620);
		Item i2 = new Item("SSA23", "Android", "Blue", 440);
		Item i3 = new Item("IP7+", "IOS", "Black", 600);
		Item i4 = new Item("IP14+", "IOS", "Yellow", 820);
		Item i5 = new Item("WP8", "WindowPhone", "White", 560);
		
		Order o1 = new Order(c1, new ItemDetails[] {
				new ItemDetails(i1, 2),
				new ItemDetails(i3, 1),
				new ItemDetails(i4, 3)
		}, LocalDateTime.of(2023, 5, 5, 10, 10, 10)) ;
		
		Order o2 = new Order(c2, new ItemDetails[] {
				new ItemDetails(i5, 1),
				new ItemDetails(i2, 4)
		}, LocalDateTime.of(2023, 5, 5, 13, 10, 10)) ;
		
		Order o3 = new Order(c2, new ItemDetails[] {
				new ItemDetails(i4, 2)
		}, LocalDateTime.of(2023, 5, 8, 15, 20, 10)) ;
		
		System.out.println("Order 1: " + o1.export());
		System.out.println("Order 2: " + o2.export());
		System.out.println("Order 3: " + o3.export());
		
		o1.printItem();
		o2.printItem();
		o3.printItem();
		// write method export in order class
		// write method export in another class: export(order)
	}
}
