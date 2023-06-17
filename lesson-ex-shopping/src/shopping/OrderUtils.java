package shopping;

import java.time.LocalDate;
import java.time.Month;

/**
 * Utility of Order Class Normal: Utility is place where contains utility
 * methods No cares created class's objects
 */
public class OrderUtils {

	private OrderUtils() {
	}

	public static void export(Order order) {
		System.out.println(order.getCustomer().toString());

		for (ItemDetail item : order.getItemDetails()) {
			System.out.println( "ItemDetail [item=" + item.getItem().getOs() + ", quantity=" + item.getQuantity() + "]");
		}
		System.out.println("Date: " + order.getOrderDate());

//		double totalOfmoney = 0;
//		
//		ItemDetail[] ids =  order.getItemDetails();

		// for index
//		for (int i = 0; i < ids.length; i++) {
//			ItemDetail id = ids[i];
//		}

		// for each
//		for (ItemDetail id: ids) {
//			Item item = id.getItem();
//			int quantity = id.getQuantity();
//			
//			double idCost = item.getCost() * quantity;
//			if (item.getCost() > 590 && LocalDate.of(2021, Month.MAY, 8).isEqual(order.getOrderDate().toLocalDate())) {
//				idCost *= 0.9;
//			}
//			totalOfmoney += idCost;
//			
//		}
//		
//		return totalOfmoney;
		System.out.println("Total: " + order.export());
	}

}
