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
		
		ItemGroup igNew = new ItemGroup(20, "Updated Loại Hàng 20 - 23/02/2024");
		itemGroupService.saveOrUpdate(igNew);
		
		System.out.println(">>> After saving ...");
		
		selfGenerate(
			"Câu 1A: Liệt kê tất cả các loại hàng", 
			itemGroupService.getAll()
		);
		
		generate(
			"Câu 1B: Liệt kê loại hàng có mã loại = 2", 
			itemGroupService.get(2)
		);
		
		generate(
			"Câu 1B: Liệt kê loại hàng có tên loại = 'Thắt lưng'", 
			// itemGroupService.get("x' OR '1=1")
			itemGroupService.get("Thắt lưng")
		);
		
		generate(
			"Câu 5: Đếm số lượng các mặt hàng theo từng loại hàng", 
			itemGroupService.countItemsByItemGroup()
		);
	}
	
	public static void selfGenerate(String prefix, List<ItemGroup> elements) {
		System.out.println(prefix + " --> {");
		
		elements.forEach(e -> {
			System.out.println("   " + e);
			System.out.println("   --> amount of items --> " + e.getItems().size() + "\n\n");
		});
		
		System.out.println("}\n");
	}
	
}
