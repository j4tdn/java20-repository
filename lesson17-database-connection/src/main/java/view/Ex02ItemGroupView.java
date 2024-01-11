package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Câu 1: Liệt kê các loại hàng");
		
		var itemGroups = itemGroupService.getAll();
		
		itemGroups.forEach(System.out::println);
		
	}
}
