package view;

import static utils.CollectionUtils.generate;

import java.util.List;
//import java.util.List;
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
		var itemGroupToBeSaveTested = new ItemGroup(10, "Loại hàng 10");
		// itemGroupService.saveOrUpdate(itemGroupToBeSaveTested);
		itemGroupService.merge(itemGroupToBeSaveTested);
		
		var itemGroupToBeSaved = List.of(
				new ItemGroup(11, "Loại Hàng 11"),
				new ItemGroup(12, "Loại Hàng 12"),
				new ItemGroup(13, "Loại Hàng 13"));
		// itemGroupService.save(itemGroupToBeSaved);
		itemGroupService.merge(itemGroupToBeSaved);
				
		generate("Câu 1A. Liệt kê tất cả các loại hàng", itemGroupService.getAll());
		
		generate("Câu 1B. Liệt kê loại hàng có mã loại = 3", itemGroupService.get(3));

		generate("Câu 1E. Liệt kê loại hàng có tên loại là Thắt lưng", itemGroupService.get("Thắt lưng"));
		
		System.out.println("Câu 1G. Liệt kê các loại hàng(LH, ds MH theo LH)");
		itemGroupService.getItemGroupWithItems()
				.forEach(group -> {
					String itemNames = group.getItems()
							.stream()
							.map(Item::getName)
							.collect(Collectors.joining(", "));
					System.out.println(group + " -> " + itemNames);
				});
		
		generate("Câu 2: Đếm số lượng các mặt hàng theo từng loại hàng", 
				itemGroupService.countItemsByItemGroup());
	}
}
