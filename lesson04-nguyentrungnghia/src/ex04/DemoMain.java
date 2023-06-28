package ex04;

import java.time.LocalDate;

public class DemoMain {

	public static void main(String[] args) {

		Director d = new Director("Nguyễn Trung Nghĩa", LocalDate.of(2003, 11, 02), 3, 3);

		Manager m1 = new Manager("Lê A", LocalDate.now(), 2, 2, "Phòng tài chính");
		Manager m2 = new Manager("Lê B", LocalDate.now(), 2, 2, "Phòng marketing");

		Employee e1 = new Employee("Trần A", LocalDate.now(), 1, "Phòng tài chính", "Lê A");
		Employee e2 = new Employee("Trần B", LocalDate.now(), 1, "Phòng tài chính", "Lê A");
		Employee e3 = new Employee("Trần C", LocalDate.now(), 1, "Phòng marketing", "Lê B");
		Employee e4 = new Employee("Trần D", LocalDate.now(), 1, "Phòng marketing", "Lê B");
		Employee e5 = new Employee("Trần E", LocalDate.now(), 1, "Phòng marketing", "Lê B");
		Employee e6 = new Employee("Trần F", LocalDate.now(), 1, "Phòng marketing", "Lê B");

		// Hiển thị thông tin các nhân sự có trong công ty
		Staff[] s = { d, m1, m2, e1, e2, e3, e4, e5, e6 };
		printStaffs(s);

		System.out.println("\n================================================\n");

		// Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
		Employee[] employees = { e1, e2, e3, e4, e5, e6 };
		System.out.println(
				"Số nhân viên được quản lý bởi trưởng phòng m1: " + numberOfEmployeesManagedByManager(m1, employees));
		System.out.println(
				"Số nhân viên được quản lý bởi trưởng phòng m2: " + numberOfEmployeesManagedByManager(m2, employees));

		System.out.println("\n================================================\n");
		
		// In ra mức lương của từng loại nhân sự
		System.out.println("Lương của giám đốc: " + printSalary(d));
		System.out.println("Lương của trưởng phòng: " + printSalary(m1));
		System.out.println("Lương của nhân viên: " + printSalary(e1));
		
	}

	// Hiển thị thông tin các nhân sự có trong công ty
	private static void printStaffs(Staff[] staffs) {
		for (Staff staff : staffs)
			System.out.println(staff);
	}

	// Số lượng nhân viên được quản lý bởi từng trưởng phòng
	private static int numberOfEmployeesManagedByManager(Manager m, Employee[] employees) {
		int count = 0;
		for (Employee e : employees)
			if (m.getNameOfDepartment().equals(e.getNameOfDepartment()))
				count++;
		return count;
	}

	private static double printSalary(Staff staff) {
		double salary;
		if (staff instanceof Employee)
			salary = staff.getCoefficientsSalary() * 1250000;
		else if (staff instanceof Manager) {
			Manager m = (Manager) staff;
			salary = (m.getCoefficientsSalary() + m.getCoefficientsPosition()) * 2200000;
		} else {
			Director d = (Director) staff;
			salary = (d.getCoefficientsSalary() + d.getCoefficientsPosition()) * 3000000;
		}
		return salary;
	}

}
