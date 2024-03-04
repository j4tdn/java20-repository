package view;

import java.time.LocalDate;
import java.time.Month;

import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.of(2023, Month.AUGUST, 07);
		 itemService.getItemDtoWithDate(ldate).forEach(System.out::println);;
		
		itemService.getItemDtoInventory().forEach(System.out::println);;
		
		itemService.getItemsWithMaxSalesPrice().forEach(System.out::println);
	}
	

}
