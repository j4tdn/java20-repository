package view;

import java.util.List;

import persistence.entities.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex03ItemView {

	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		selfgenerate("2AB. Liệt kê các mặt hàng", itemService.getAll());
		
	}
	
	public static void selfgenerate(String prefix, List<Item> elements) {
		System.out.println(prefix + " -> {");
		elements.forEach(e -> System.out.println(""
				+ "    " + e + "\n     --> " + e.getGroup()));
		System.out.println("}");
	}
}
