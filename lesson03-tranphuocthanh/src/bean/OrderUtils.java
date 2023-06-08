package bean;

import java.time.LocalDate;
import java.time.Month;

/**
 * utility of order class
 * Normally:Utility is place where contains utility methods
 * no cares created class'objects
 */

public class OrderUtils {
	
	private OrderUtils() {
	}
	
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItem_detail();
		for (ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).equals(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		//	System.out.println(item + " --> " + quantity);
		}
		return totalOfMoney;
	}
}
