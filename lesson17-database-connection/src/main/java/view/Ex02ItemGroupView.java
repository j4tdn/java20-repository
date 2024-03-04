package view;

import static utils.CollectionUtils.generate;

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
		ItemGroup itemGroupToBeTested = new ItemGroup(19, "Loại hàng 2024 - Thêm mới");
		// itemGroupService.saveOrUpdate(itemGroupToBeTested);
		itemGroupService.merge(itemGroupToBeTested);
		
		// TODO: saveOrUpdate(list) with batch update
		// var itemGroupToBeSaved1 = new ItemGroup(16, "Loại hàng 16");
		// var itemGroupToBeSaved2 = new ItemGroup(17, "Loại hàng 17");
		// var groupsToBeSaved = List.of(itemGroupToBeSaved1, itemGroupToBeSaved2);
		// itemGroupService.save(groupsToBeSaved);
		
		// dùng batchUpdate với procedure
		
		generate(
			"Câu 1A: Liệt kê tất cả các loại hàng", 
			itemGroupService.getAll()
		);
		
		generate(
			"Câu 1B: Liệt kê loại hàng có mã loại = 2", 
			itemGroupService.get(2)
		);
		
		generate(
			"Câu 1E: Liệt kê loại hàng có tên loại = 'Thắt lưng'", 
			// itemGroupService.get("x' OR '1=1")
			itemGroupService.get("Thắt lưng")
		);
		
		System.out.println("Câu 1G: Liệt kê tất cả các loại hàng(LoaiHang, DanhSachMatHang)");
		itemGroupService.getItemGroupWithItems()
			.forEach(group -> {
				String itemNames = group.getItems()
						.stream().map(Item::getName)
						.collect(Collectors.joining(", "));
				System.out.println(group + " --> " + itemNames);
			});
		
		
		generate(
			"Câu 2: Đếm số lượng các mặt hàng theo từng loại hàng", 
			itemGroupService.countItemsByItemGroup()
		);
	}
	
}
