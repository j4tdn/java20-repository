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
				"Câu 2: Liệt kê số lượng tồn kho của mỗi loại hàng",
				itemGroupService.getItemGroupsByAmount()
				);
	}
}
