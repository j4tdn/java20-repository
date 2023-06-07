package exercises1;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils() {
	}
	public static double discount(Order order) {
		double result = 0;
		ItemDetail[] ids = order.getItemDetails();
		for(ItemDetail id: ids) {
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double idCost = item.getPrice() * quantity;
			if(item.getPrice() > 590 && LocalDate.of(2023, Month.MAY, 5).equals(order.getDateTime().toLocalDate())) {
				idCost *= 0.9;
			}
			result += idCost;
		}
		return result;
	}
}
