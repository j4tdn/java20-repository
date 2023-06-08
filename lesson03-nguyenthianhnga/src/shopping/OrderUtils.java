package shopping;

import java.time.LocalDate;
import java.time.Month;

public class OrderUtils {
	private OrderUtils()//cấm không cho tạo đối tượng ra
	{}
	//hàm export k quan tâm đến đối tượng đang gọi thì chì cho static để hạn chế việc khởi tạo quá nhiều ô trên heap
	//không phụ thuộc vào hàm --> dùng static
	public static double export(Order order) {
		//1 class k qua tâm dến việc đối tượng được tạo ra cho class
		double totalOfMoney = 0;
		ItemDetail[] ids = order.getItemDetails();
		for (ItemDetail id :ids)
		{
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double isCost= item.getCost()* quantity;
			if(item.getCost()>590 && LocalDate.of(2021, Month.MAY,8).equals(order.getDatetime().toLocalDate()))
			{
				isCost *= 0.9;
				
			}
			totalOfMoney+=isCost;
		}
		return totalOfMoney;
	}
}
