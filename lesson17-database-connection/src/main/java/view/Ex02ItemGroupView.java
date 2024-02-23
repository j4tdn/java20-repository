package view;

import static utils.CollectionUtils.generate;

import java.util.List;
import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		itemGroupService.merge(new ItemGroup(18, "Loai hang 18-them moi"));
		
		var ItemGroupToBeTested = new ItemGroup(15, "Loại hàng 555");
		//itemGroupService.saveOrUpdate(ItemGroupToBeTested);
		
		// TODO: saveOrUpdate(list) with batch update
		var itemGroupToBeSaved1 = new ItemGroup(16, "Loại hàng 16");
		var itemGroupToBeSaved2 = new ItemGroup(17, "Loại hàng 17");
		var groupsToBeSaved = List.of(itemGroupToBeSaved1, itemGroupToBeSaved2);
		//itemGroupService.save(groupsToBeSaved);
		
		
		generate("Câu 1A: Liệt kê các loại hàng", itemGroupService.getAll());
		
		generate("Câu 1B: Liệt kê loại hàng có mã loại = 2", itemGroupService.get(2));
		
		generate("Câu 1E: Liệt kê loại hàng có tên loại = Thắt lưng", 
				//itemGroupService.get("x' OR '1=1"));
				itemGroupService.get("Thắt lưng"));
		
		System.out.println("1G. Liệt kê các loại hàng(Loại hàng, DanhSachMatHang)");
		
		itemGroupService.getItemGroupWithItems()
			.forEach(group -> {
				
				String itemNames = group.getItems().stream()
						.map(Item::getName)
						.collect(Collectors.joining(", "));
				System.out.print(group + " --> " + itemNames);
				
			});
		System.out.println("\n");
		generate("Câu 2: Đếm số lượng các mặt hàng theo từng loại hàng", 
				itemGroupService.countItemsByItemGroup());
	}
}
