package exercises04;

import java.time.LocalDate;

public class HRM {
	public static void main(String[] args) {
		
		President[] president = new President[1];
		president[0] = new President("Trần Xuân Thanh", LocalDate.of(1974,01,01), 8.0f, 1.25f);
		
		Manager[] manager = new Manager[2];
		manager[0] = new Manager("Lê Thị Thanh Tùng", LocalDate.of(1974,10,10), 6.5f, 0.7f, "Phòng marketing");
		manager[1] = new Manager("Lavender Tran", LocalDate.of(1996,07,17), 6.5f, 0.7f, "Phòng tài chính");
		
		Staff[] staff = new Staff[6];
		staff[0] = new Staff("Trần Xuân Nguyên", LocalDate.of(2002,03,07), 4.25f, "Phòng marketing", (Manager)manager[0]);
		staff[1] = new Staff("Hồ Quang Sang", LocalDate.of(2002,06,25), 4.25f, "Phòng tài chính", (Manager)manager[1]);
		staff[2] = new Staff("Phạm Khánh Minh", LocalDate.of(2002,01,05), 4.25f, "Phòng marketing", (Manager)manager[0]);
		staff[3] = new Staff("Bùi Văn Bình", LocalDate.of(2002,10,18), 4.25f, "Phòng marketing", (Manager)manager[0]);
		staff[4] = new Staff("Phạm Hồng Anh", LocalDate.of(2002,04,19), 4.25f, "Phòng marketing", (Manager)manager[0]);
		staff[5] = new Staff("Nguyễn Phước Quyền", LocalDate.of(2002,02,28), 4.25f, "Phòng tài chính", (Manager)manager[1]);
		printInforPersonnel(president, manager, staff);
		printSalaryPersonnel(president, manager, staff);

	}

	public static void printInforPersonnel(President[] presidents, Manager[] managers, Staff[] staffs) {
		System.out.println("--------------------Bảng thông tin nhân sự--------------------");
		System.out.printf("\n%-30s%-30s%-30s%-30s\n", "Họ và Tên", "Ngày Sinh", "Hệ số lương", "Hệ số chức vụ");
		for (President president : presidents) {
			President.printInforPersonnel(president);
		}
		System.out.printf("\n%-30s%-30s%-30s%-30s%-35s\n", "Họ và Tên", "Ngày Sinh", "Hệ số lương",
				"Hệ số chức vụ", "Tên đon vị");
		for (Manager manager : managers) {
			Manager.printInforPersonnel(manager);
		}
		System.out.printf("\n%-30s%-30s%-30s%-30s%-35s\n", "Họ và Tên", "Ngày Sinh", "Hệ số lương", "Tên đơn vị",
				"Tên Trưởng Phòng");
		for (Staff staff : staffs) {
			Staff.printInforPersonnel(staff);
		}
	}

	private static void printSalaryPersonnel(President[] presidents, Manager[] managers, Staff[] staffs) {
		System.out.println("\n--------Bảng mức lương của từng loại nhân sự--------");
		System.out.printf("\n%-30s%-30s\n", "Loại nhân sự", "Lương");
		
		System.out.printf("\n%-30s\n", "Giám đốc: ");
		for (President president : presidents) {
			System.out.printf("%-30s%-30f\n", president.getFullName(), president.salary());
		}
		System.out.printf("\n%-30s\n", "Trưởng phòng: ");
		for (Manager manager : managers) {
			System.out.printf("%-30s%-30f\n", manager.getFullName(), manager.salary());
		}
		System.out.printf("\n%-30s\n", "Nhân viên: ");
		for (Staff staff : staffs) {
			System.out.printf("%-30s%-30f\n", staff.getFullName(), staff.salary());
		}
	}
	
}
