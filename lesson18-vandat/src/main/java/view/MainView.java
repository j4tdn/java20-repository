package view;

import java.time.LocalDate;
import java.util.List;

import persistence.entities.Item;
import service.ItemService;
import service.ItemServiceImpl;
import utils.CollectionUtils;

public class MainView {

	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		CollectionUtils.generate("1. Liệt kê các mặt hàng được bán trong ngày ?", 
				itemService.getItemsBySalesDate(LocalDate.of(2023, 2, 15)));
		
		selfgenerate("4. Liệt kê danh sách các mặt hàng của mỗi loại hàng", itemService.getAll());
	}
	
	public static void selfgenerate(String prefix, List<Item> elements) {
		System.out.println(prefix + " -> {");
		elements.forEach(e -> System.out.println("    " + e + "   group -> " + e.getGroup()));
		System.out.println("}");
	}
}
