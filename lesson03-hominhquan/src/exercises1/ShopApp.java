package exercises1;

import java.time.LocalDateTime;

public class ShopApp {
	public static void main(String[] args) {

		Customer ctm1 = new Customer("Top", "Sorm", 345, "Sai Gon");
		Customer ctm2 = new Customer("Jung", "Levi", 789, "Ha Noi");

		Item it1 = new Item("D", "Dell", "Black", 620);
		Item it2 = new Item("A", "Asus", "White", 840);
		Item it3 = new Item("T", "ThingkingPad", "Black", 280);
		Item it4 = new Item("N", "Nitro", "Black", 880);
		Item it5 = new Item("M", "MSI", "Black", 560);

		Order o1 = new Order(ctm1,
				new ItemDetail[] { 
						new ItemDetail(it1, 3), 
						new ItemDetail(it4, 5), 
						new ItemDetail(it2, 1) },
						LocalDateTime.of(2023, 5, 5, 10, 10, 10));
		Order o2 = new Order(ctm2,
				new ItemDetail[] { 
						new ItemDetail(it3, 2), 
						new ItemDetail(it5, 1),},
						LocalDateTime.of(2023, 5, 5, 18, 7, 10));
		
		System.out.println("oder1 :" + OrderUtils.discount(o1));
		System.out.println("oder2 :" + OrderUtils.discount(o2));
	}
}
