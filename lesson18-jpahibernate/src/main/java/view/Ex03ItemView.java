package view;

import service.ItemService;
import service.ItemServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import persistence.entities.Item;
import persistence.entities.Size;

public class Ex03ItemView {

	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		selfGenerate(
				"Câu 2A: Liệt kê tất cả các mặt hàng",
				itemService.getAll()
		);
	}
	
	public static void selfGenerate(String prefix, List<Item> elements) {
		System.out.println(prefix + " --> {");
		
		elements.forEach(e -> {
			System.out.println("   " + e);
			System.out.println("   group --> " + e.getGroup() + " \n");

			String sizes = e.getDetails().stream()
					.map(itd -> {
						Size size = itd.getSize();
						return size.getSize() + "," + (size.getGender() == true ? "Nam" : "Nữ");
					})
					.collect(Collectors.joining(" & "));
			System.out.println("   details --> " + sizes + " \n");
		});
		
		System.out.println("}\n");
	}
}
