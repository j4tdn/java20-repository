package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderUtils {
	private OrderUtils() {}
	
	public static double export(Order order) {
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item i = id.getItem();
			int quantity = id.getQuantity();
			double idCost = i.getCost() * quantity;
			if (i.getCost() > 590 && LocalDate.of(2021, 5, 8).isEqual(order.getOrderDate().toLocalDate()))
				idCost *= 0.9;
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}

	public static void print(Order order) {
		Customer c = order.getCustomer();
		System.out.println("Tên khách hàng: " + c.getName());
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id : ids) {
			Item i = id.getItem();
			int quantity = id.getQuantity();
			System.out.println("Tên mặt hàng: " + i.getId() + ", Số lượng: " + quantity);
		}
		LocalDateTime ldt = order.getOrderDate();
		System.out.println(ldt);
	}
}
