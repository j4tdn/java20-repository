package view;

import service.ItemService;
import service.ItemServiceImpl;

import static utils.CollectionUtils.*;

import java.time.LocalDate;

public class Ex03ItemView {

	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		generate("1F. Liệt kê các mặt hàng", itemService.getAll());
		
		generate("1H. Liệt kê các mặt hàng được bán trong ngày 07.09.2023",
				itemService.getItemsBySalesDate(LocalDate.of(2023, 9, 7)));
		
		generate("3. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng", 
				itemService.getItemDetails());
		
		itemService.updateItemDetails();
	}
}
