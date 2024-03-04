package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import static utils.CollectionUtils.*;

import java.util.List;

import persistence.entities.ItemGroup;

public class Ex02ItemGroupView {

	private static ItemGroupService groupService;
	
	static {
		groupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		var groups = List.of(
				new ItemGroup(23, "Loại Hàng 23"),
				new ItemGroup(24, "Loại hàng 24")
		);
		groupService.save(groups);
		
		ItemGroup igNew = new ItemGroup(21, "Cập nhật Loại hàng 21 - 26/02/2024");
		groupService.merge(igNew);
		
		System.out.println("After saving ...");
		
		selfGenerate(
			"Câu 1A: Liệt kê tất cả các loại hàng",
			groupService.getAll()
		);
		
		generate(
				"Câu 1B: Liệt kê loại hàng có mã loại = 2",
				groupService.get(2)
				);
		
		generate(
				"Câu 1E: Liệt kê loại hàng có tên loại = 'Thắt lưng'",
				// groupService.get("x' OR '1=1")
				groupService.get("Thắt lưng")
				);
		
		generate("Câu 5: Đếm số lượng các mặt hàng theo từng loại hàng", 
				groupService.countItemsByItemGroup());
	}
	
	public static void selfGenerate(String prefix, List<ItemGroup> elements) {
		System.out.println(prefix + " --> {");
		
		elements.forEach(e -> {
			System.out.println("   " + e);
			System.out.println("   --> amount of items --> " + e.getItems().size() + " \n\n");
		});
	}
}
