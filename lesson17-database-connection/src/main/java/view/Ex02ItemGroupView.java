package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import static utils.CollectionUtils.*;

import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroup;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		var itemGroupToBeTested = new ItemGroup(14, "Loại hàng 14");
//		itemGroupService.saveOrUpdate(itemGroupToBeTested);
		itemGroupService.merge(itemGroupToBeTested);
//		
//		var itemGroupToBeSaved1 = new ItemGroup(12, "Loại hàng 12");
//		var itemGroupToBeSaved2 = new ItemGroup(13, "Loại hàng 13");
//		var groupsToBeSaved = List.of(itemGroupToBeSaved1, itemGroupToBeSaved2);
//		itemGroupService.save(groupsToBeSaved);
		
//		dùng batchUpdate với procdure
		
		generate("Câu 1: Liệt kê tất cả các loại hàng", itemGroupService.getAll());
		
		generate("Câu 2: Liệt kê loại hàng có mã loại = 2", itemGroupService.get(2));
		
		generate("Câu 1E: Liệt kê loại hàng có tên loại = 'Thắt lưng'", itemGroupService.get("Thắt lưng"));

		System.out.println("Câu 1G: Liệt kê loại hàng (LoaiHang, DanhSachMatHang)");
		itemGroupService.getItemGroupWithItems()
			.forEach(group -> {
				String itemNames = group.getItems()
						.stream().map(Item::getName)
						.collect(Collectors.joining(", "));
				System.out.println(group + " --> " + itemNames);
			});
		
		generate("Câu 2: Đếm số lượng các mặt hàng theo từng loại hàng", 
				itemGroupService.countItemsByItemGroup());
	}
}
