package view;

import static utils.CollectionUtils.generate;
import java.util.List;

import persistence.dto.ItemOrderDto;
import service.ItemOrderService;
import service.ItemOrderServiceImpl;

public class Ex01ItemGroupByDay {
	
	private static ItemOrderService itemOrderService;
	
	static {
		itemOrderService = new ItemOrderServiceImpl();
	}
	
	public static void main(String[] args) {
		generate(
				"Câu 1: Liệt kê mặt hàng theo ngày = '2023-09-07'", 
				itemOrderService.getItemsOrderByDay("2023-09-07")
			);
	}
}
