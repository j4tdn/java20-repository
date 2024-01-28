package view;

import static utils.CollectionUtils.generate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class Ex02ItemGroupView {
	
private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		generate(
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
	}
	
}
