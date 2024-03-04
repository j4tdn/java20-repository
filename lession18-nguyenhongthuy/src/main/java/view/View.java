package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import static utils.CollectionUtils.*;

public class View {
	private static ItemService itemService;
	private static ItemGroupService itemGroupService;
	static {
		itemService = new ItemServiceImpl();
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		generate("Câu 1: Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số truyền vào.", 
				itemService.getItemsByTimeCreatedOrder("2023-09-07"));
		
		generate("Câu 2: Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng", 
				itemGroupService.getRemainingItems());
	}
}
