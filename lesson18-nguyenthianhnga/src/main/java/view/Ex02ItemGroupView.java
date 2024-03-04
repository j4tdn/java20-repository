package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import static utils.CollectionUtils.generate;
public class Ex02ItemGroupView {
private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		generate(
				"Câu 2: Số lượng mặt hàng đang rồn kho của mỗi loại hàng", 
				itemGroupService.countItemsByItemGroup()
			);
	}
}
