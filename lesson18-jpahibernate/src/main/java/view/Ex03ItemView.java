package view;

import static utils.CollectionUtils.generate;

import java.util.List;
import java.util.stream.Collectors;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.entities.Item;
import persistence.entities.Size;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex03ItemView {
	
private static ItemService itemService;
private static ItemGroupDao itemGroupDao;
	
	static {
		itemService = new ItemServiceImpl();
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	public static void main(String[] args) {
		
		selfGenerate("2A. Liệt kê các mặt hàng", itemService.getAll());
		
		generate("Câu 5: Đếm số lượng các mặt hàng theo từng loại hàng", 
				itemGroupDao.countItemsByItemGroup());
	}	
	
	public static void selfGenerate(String prefix, List<Item> elements) {
		System.out.println(prefix + " --> {");
		
		elements.forEach(e -> {
			System.out.println("   " + e);
			System.out.println(" group --> " + e.getGroup() + "\n");
			
			String sizes = e.getDetails().stream()
				.map(itd -> {
					Size size = itd.getSize();
					return size.getSize() + ", " + (size.getGender() == true ? "Nam":"Nữ");
				})
				.collect(Collectors.joining(" $ "));
			System.out.println("  detail --> " + sizes );
		});
		
		System.out.println("}\n");
	}
}
