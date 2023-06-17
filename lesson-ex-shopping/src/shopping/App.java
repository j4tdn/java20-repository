package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("KH1","Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2","Kdate", "234", "California");
		
		Item i1 = new Item("ss10+", "Androi", "Black", 620d);
		Item i2 = new Item("ss20U", "Androi", "Green", 840d);
		Item i3 = new Item("IP4", "IOS", "White", 280d);
		Item i4 = new Item("IP12", "IOS", "Black", 880d);
		Item i5 = new Item("WP8", "WindowPhone", "Blue", 560d);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1, 3), 
				new ItemDetail(i4, 5),
				new ItemDetail(i2, 1)
				}, LocalDateTime.of(2021, 5, 8, 10, 10, 10));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3, 2), 
				new ItemDetail(i5, 1),
				}, LocalDateTime.of(2021, 5, 7, 20, 10, 12));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4, 1), 
				}, LocalDateTime.of(2021, 5, 8, 9, 28, 32));

		OrderUtils.export(o1);
//		System.out.println("Order 1: " + OrderUtils.export(o1));
//		System.out.println("Order 2: " + OrderUtils.export(o2));
//		System.out.println("Order 3: " + OrderUtils.export(o3));
		
		//Write method export in Order class: no-parameter
		//Write method export in Another class: export(order)
	}

}
