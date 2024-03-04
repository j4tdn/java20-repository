package view;

import java.util.List;

import dao.ItemGroupDao;
import persistence.dtos.ItemDTO;

import persistence.entities.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex02ItemView {

	private static ItemService itemService;


	static {
		itemService = new ItemServiceImpl();

	}

	public static void main(String[] args) {
		
		
		System.out.println("\nCâu 1 Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số truyền vào");
		List<ItemDTO> itemDTOs = itemService.getItemByOrderDate("07/09/2023");
		itemDTOs.forEach(System.out::println);
		
		

		System.out.println("\nCâu 3 Liệt kê top 3 mặt hàng được bán nhiều nhất năm bất kỳ. Với năm là tham số truyền vào");
		List<ItemDTO> itemDTOByYears = itemService.getItemByAmountInOrderByYear(2023);
		itemDTOByYears.stream()
						.map(itemDTO -> itemDTO.getName())
						.forEach(System.out::println);
		
		System.out.println("\nCâu 4 Liệt kê danh sách các mặt hàng của mỗi loại hàng:");
		List<Item> items = itemService.getAllItemByItemGroup();
		items.forEach(item -> {
			System.out.println(item + "|" + item.getItemGroup());
		});
		
	}
}
