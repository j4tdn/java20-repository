package view;

import static utils.CollectionUtils.generate;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		var ItemGroupToBeTested = new ItemGroup(15, "Loại hàng 555");
		itemGroupService.saveOrUpdate(ItemGroupToBeTested);
		
		// TODO: saveOrUpdate(list) with batch update
		var itemGroupToBeSaved1 = new ItemGroup(16, "Loại hàng 16");
		var itemGroupToBeSaved2 = new ItemGroup(17, "Loại hàng 17");
		var groupsToBeSaved = List.of(itemGroupToBeSaved1, itemGroupToBeSaved2);
		itemGroupService.save(groupsToBeSaved);
		
		
		generate("Câu 1: Liệt kê các loại hàng", itemGroupService.getAll());
		
		generate("Câu 2: Liệt kê loại hàng có mã loại = 2", itemGroupService.get(2));
		
		
		
	}
}
