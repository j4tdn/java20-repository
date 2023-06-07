package bean;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utility of order class
 * Normally: Utility is placed where containing utility methods
 * No care created class's object
 * @author PC
 * Lớp tiện ích chứa những hàm tiện ích là static chỉ quan tâm tham số truyền vào không quan tâm đối tượng đang gọi -> static
 */
public class OrderUtils {
	private OrderUtils() {
		
	}
	
	public static double export(Order order) {
		double totalOfSum = 0;
		ItemDetail[] listItemDetails = order.getItemDetails();
		for(ItemDetail itdt : listItemDetails) {
			Item item = itdt.getItem();
			int quantity = itdt.getQuantity();
			totalOfSum += item.getCost() * quantity;
			if(totalOfSum > 590 && LocalDate.of(2023, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())){
				totalOfSum *= 0.9;
			}
		}
		return totalOfSum;
	}
}