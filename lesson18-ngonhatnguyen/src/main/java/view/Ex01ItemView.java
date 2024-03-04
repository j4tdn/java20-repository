package view;

import service.ItemService;
import service.ItemServiceImpl;

import static utils.CollectionUtils.*;

public class Ex01ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		generate(
				"Câu 1: Liệt kê các mặt hàng được bán trong ngày 15-02-2023",
				itemService.getItemsByCreatedDate("2023-02-15")
		);
		
		generate(
				"Câu 3: Liệt kê top 3 mặt hàng được bán nhiều nhất năm 2023",
				itemService.getItemsBySales(2023)
		);
	}
}
