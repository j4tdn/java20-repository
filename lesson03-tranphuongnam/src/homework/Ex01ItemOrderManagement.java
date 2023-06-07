package homework;

import java.time.LocalDateTime;

import bean.Customer;
import bean.Item;
import bean.ItemDetail;
import bean.Order;
import bean.OrderUtils;

public class Ex01ItemOrderManagement {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "John", "0348294523", "New York");
		Customer c2 = new Customer("KH2", "Peter", "0943923342", "California");

		Item i1 = new Item("SSG01", "Android", "Orange", 500);
		Item i2 = new Item("IP11", "IOS", "Black", 200);
		Item i3 = new Item("IP4", "IOS", "White", 300);
		Item i4 = new Item("OPPOF5", "Android", "Blue", 800);
		Item i5 = new Item("REDMI", "Android", "Green", 1000);

		Order order1 = new Order(c1, new ItemDetail[] { 
						new ItemDetail(i1, 10), 
						new ItemDetail(i2, 5), 
						new ItemDetail(i3, 2) 
						},
				LocalDateTime.of(2023, 5, 9, 19, 20, 20));
		
		Order order2 = new Order(c1, new ItemDetail[] { 
				new ItemDetail(i1, 1), 
				new ItemDetail(i3, 2) 
				},
		LocalDateTime.of(2023, 5, 10, 19, 20, 20));
		
		Order order3 = new Order(c1, new ItemDetail[] { 
				new ItemDetail(i2, 5),  
				},
		LocalDateTime.of(2023, 5, 8, 19, 20, 20));
		
		Order order4 = new Order(c1, new ItemDetail[] { 
				new ItemDetail(i2, 5),  
				new ItemDetail(i1, 10),  
				},
		LocalDateTime.of(2023, 5, 8, 19, 20, 20));
		
		Order order5 = new Order(c1, new ItemDetail[] { 
				new ItemDetail(i2, 5),  
				new ItemDetail(i3, 5),  
				},
		LocalDateTime.of(2023, 5, 11, 19, 20, 20));
		
		System.out.println("Order 1 : " + order1.export());
		System.out.println("Order 2 : " + order2.export());
		System.out.println("Order 3 : " + order3.export());
		System.out.println("Order 4 : " + OrderUtils.export(order4));
		System.out.println("Order 5 : " + OrderUtils.export(order5));
	}
}
