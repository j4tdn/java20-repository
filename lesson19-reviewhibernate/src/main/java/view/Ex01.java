package view;

import java.util.List;

import dto.ItemGroupDTO;
import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex01 {
	
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
//		// 1. Liệt kê itemgroup
//		List<ItemGroup> itemGroups = itemGroupService.getAll();
//		itemGroups.forEach(System.out::println);
//		
//		// 2. Liệt kê item
//		List<Item> items = itemService.getAll();
//		items.forEach(System.out::println);
//		
//		System.out.println("\n\n=====\n\n");
//		// 3. Liệt kê danh sách các item trong itemgroup
//		itemGroups.forEach(itemgroup -> System.out.println(itemgroup.getItems()));
		
		List<ItemGroupDTO> itemGroupDTOs = itemGroupService.getAllItemGroupDTO();
		itemGroupDTOs.forEach(System.out::println);
	}
}
