package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;

import  static utils.CollectionUtils.*;

import java.util.List;
import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroup;

public class Ex02ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		
		var itemGroupToBeTested = new ItemGroup(11, "Loại hàng 11 - thêm mới");
//		itemGroupService.saveOrUpdate(itemGroupToBeTested);
		itemGroupService.merge(itemGroupToBeTested);
		
		
//		var itemGroupToBeSaved1 = new ItemGroup(8, "Loại hàng 8.8");
//		var itemGroupToBeSaved2 = new ItemGroup(9, "Loại hàng 9.9");
//		var groupsToBeSaved = List.of(itemGroupToBeSaved1, itemGroupToBeSaved2);
//		itemGroupService.save(groupsToBeSaved);
		
		generate(
				"Cau 1A: Liet ke tat ca loai hang",
				itemGroupService.getAll()
		);
		
		generate(
				"Cau 1B: Liet ke loai hang co ma loai = 2",
				itemGroupService.get(2)
		);	
		
		generate(
				"Cau 1E: Liet ke loai hang co ten loai = 'that lung",
//				itemGroupService.get("X' OR '1=1")
				itemGroupService.get("Thắt lưng")
		);
		
		
		System.out.println("Cau 1G: Liet ke tat ca cac loai hang(loaihang, danhsachmathang)");
		itemGroupService.getItemGroupWithItems()
			.forEach(group -> {
				String itemNames = group.getItems()
						.stream().map(Item::getName)
						.collect(Collectors.joining(", "));
				System.out.println(group + " --> " + itemNames);
			});
		generate(
				"Cau 2: Đếm số lượng các mặt hàng theo từng loại hàng",
				itemGroupService.countItemsByItemGroup()
		);
		
	}
}
