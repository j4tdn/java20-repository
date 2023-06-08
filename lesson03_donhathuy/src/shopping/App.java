package shopping;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Adam", "123", "NewYork");
		Customer c2 = new Customer("KH2", "kate", "243", "Califonia");
		
		Items i1 = new Items("SS10",  "Android", "Black", 620);
		Items i2 = new Items("SS20U",  "Android", "Green", 840);
		Items i3 = new Items("IP4",  "IOS", "White", 280);
		Items i4 = new Items("IP12",  "IOS", "Black", 880);
		Items i5 = new Items("WP8",  "Windowphone", "Blue", 560);
		
		Order o1 = new Order(c1, new ItemDetail[] {
				new ItemDetail(i1,3), 
				new ItemDetail(i4,5), 
				new ItemDetail(i2,1)
				}, LocalDateTime.of(2021, 5, 8, 15, 07, 23));
		
		Order o2 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i3,2), 
				new ItemDetail(i5,1), 
				}, LocalDateTime.of(2021, 7, 5, 20, 07, 21));
		
		Order o3 = new Order(c2, new ItemDetail[] {
				new ItemDetail(i4,1), 
				}, LocalDateTime.of(2021, 5, 8, 9, 28, 24));
		System.out.println("Order 1"+ OrderUtils.export(o1));
		System.out.println("Order 2"+ OrderUtils.export(o2));
		System.out.println("Order 3"+ OrderUtils.export(o3));
		
		//write method export in order class: on-paranter
		//write method on Another class: export(order)
	}
}
