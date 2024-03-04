package view;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import persistence.ItemDto;
import service.ItemService;
import service.ItemServiceImpl;
import utils.*;

public class Ex01ItemView {
private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
		
	};
	public static void main(String[] args) {
		 
	        
	        
		utils.CollectionUtils.generate("Liệt kê các mặt hàng được bán trong ngày 07/09/2023", itemService.getItemByTimeCreatedOrder("2023-09-07"));
	}
}
