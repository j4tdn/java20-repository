package view;
import java.time.LocalDate;


import service.ItemService;
import service.ItemServiceImpl;
import utils.SqlUtils;

public class Item_View {
private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		//SqlUtils.generate("Q2: ", itemService.getAll());
		SqlUtils.generate("Q1: ", itemService.getItemByOrderDate(LocalDate.of(2023, 07, 19)) );
	}
}
