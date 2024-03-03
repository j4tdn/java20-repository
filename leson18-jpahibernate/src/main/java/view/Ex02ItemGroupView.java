package view;

import static utils.CollectionUtils.generate;

import java.util.List;

import persistence.entities.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {

	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		var groups = List.of(
				new ItemGroup(22,null),
				new ItemGroup(23,"Loại hàng 23")
				
				);
		itemGroupService.save(groups);
		
		ItemGroup igNew = new ItemGroup(21,"Loại hàng 21 -26/02/2024");
		itemGroupService.merge(igNew);
		System.out.println("---> after save");
		generate("Câu 1A. Liệt kê tất cả các loại hàng", itemGroupService.getAll());
		
		generate("Câu 1B. Liệt kê loại hàng có mã loại = 3", itemGroupService.get(3));

		generate("Câu 1B. Liệt kê loại hàng có tên loại là Thắt lưng", itemGroupService.get("Thắt lưng"));
		
		generate("Câu 5. Đếm số lượng các mặt hàng theo từng loại hàng", 
				itemGroupService.countItemsByItemGroup());
	}
	
	
//	public static void selfgenerate(String prefix, List<ItemGroup> elements) {
//		System.out.println(prefix + " -> {");
//		elements.forEach(e -> System.out.println("    " + e + ""
//				+ "\n     Amount of items -> " + e.getItems().size()));
//		System.out.println("}");
//	}
}
