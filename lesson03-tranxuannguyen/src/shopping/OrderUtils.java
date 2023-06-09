package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	
	private OrderUtils() {
	}
	//o1, o2, o3
	public static double export(Order order) {
		double totoOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		
		for (ItemDetail id:ids) {
			Item item = id.getIteml();
			int quantity = id.getQuantity();
			double idCost = item.getCost()*quantity;
			if(item.getCost()>590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
				idCost *= 0.9;
			}
			totoOfMoney += idCost;
		}
		return totoOfMoney;
	}
}
