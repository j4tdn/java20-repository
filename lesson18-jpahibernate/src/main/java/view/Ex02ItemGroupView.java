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
				"Cau 1A: Liet ke tat ca loai hang",
				itemGroupService.getAll()
		);
		generate(
				"Cau 1B: Liet ke loai hang co ma loai = 2",
				itemGroupService.get(2)
		);
		generate(
				"Cau 1E: Liet ke loai hang co ten loai = 'Thắt lưng'",
//				itemGroupService.get("X' OR '1=1'")
				itemGroupService.get("Thắt lưng")
		);
	}
}
