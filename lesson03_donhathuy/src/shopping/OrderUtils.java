package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils () {
		
	}
	
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemdetails();
		for (ItemDetail id : ids) {
			Items item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getCost() * quantity;
			if (item.getCost() > 598 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}			
		return totalOfMoney;
		
	}
}
