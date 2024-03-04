package view;

import java.util.List;

import dao.ItemGroupDao;
import persistence.dtos.ItemDTO;
import persistence.dtos.ItemGroupDTO;
import persistence.entities.Employee;
import persistence.entities.Item;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class Ex01 {

	private static ItemService itemService;
	private static ItemGroupService itemGroupService;
	private static EmployeeService employeeService;

	static {
		itemService = new ItemServiceImpl();
		itemGroupService = new ItemGroupServiceImpl();
		employeeService= new EmployeeServiceImpl();
	}

	public static void main(String[] args) {
		
		
		//1. Liệt kê các mặt hàng được bán trong ngày bất kỳ. Với ngày bán là tham số truyền vào.
		System.out.println("\n\n =>>>>>>>> Câu 1");
		List<ItemDTO> itemDTOs = itemService.getItemByOrderDate("07/09/2023");
		itemDTOs.forEach(System.out::println);
		
		
		//2. Thống kê số lượng mặt hàng đang tồn kho của mỗi loại hàng
		System.out.println("\n\n =>>>>>>>> Câu 2");
		List<ItemGroupDTO> itemGroupDTOs = itemGroupService.getAllItemGroupDTO();
		itemGroupDTOs.forEach(System.out::println);
		
		
		//3. Liệt kê top 3 mặt hàng được bán nhiều nhất năm bất kỳ. Với năm là tham số truyền vào.
		System.out.println("\n\n =>>>>>>>> Câu 3");
		List<ItemDTO> itemDTOByYears = itemService.getItemByAmountInOrderByYear(2023);
		itemDTOByYears.stream()
						.map(itemDTO -> itemDTO.getName())
						.forEach(System.out::println);
		
		//4. Liệt kê danh sách các mặt hàng của mỗi loại hàng.
		System.out.println("\n\n =>>>>>>>> Câu 4");
		List<Item> items = itemService.getAllItemByItemGroup();
		items.forEach(item -> {
			System.out.println(item + "|" + item.getItemGroup());
		});
		
		//5. Cập nhật cơ sở dữ liệu, yêu cầu nhân viên sẽ có thêm thông tin mức lương và người quản lys
		System.out.println("\n\n =>>>>>>>> Câu 5");
		List<Employee> employees = employeeService.getEmployeeHaveSalaryMoreThanManager();
		employees.forEach(System.out::println);
	}
}
