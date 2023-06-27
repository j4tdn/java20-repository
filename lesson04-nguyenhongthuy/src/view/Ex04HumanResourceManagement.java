package view;

import java.time.LocalDate;

import bean.Director;
import bean.Employee;
import bean.Manager;

public class Ex04HumanResourceManagement {
	public static void main(String[] args) {
		Director[] directors = new Director[1];
		directors[0] = new Director("Giam doc", LocalDate.of(2003, 10, 25), 2.5f, 3.7f);

		Manager[] managers = new Manager[2];
		managers[0] = new Manager("Truong phong 1", LocalDate.of(2003, 10, 25), 2.0f, 3.4f, "Phong ban 1");
		managers[1] = new Manager("Truong phong 2", LocalDate.of(2002, 01, 14), 2.0f, 3.4f, "Phong ban 2");

		Employee[] employees = new Employee[6];
		employees[0] = new Employee("Nhan vien 1", LocalDate.of(2003, 10, 11), 1.5f, (Manager) managers[0]);
		employees[1] = new Employee("Nhan vien 6", LocalDate.of(2001, 12, 15), 1.5f, (Manager) managers[1]);
		employees[2] = new Employee("Nhan vien 2", LocalDate.of(2000, 12, 25), 1.5f, (Manager) managers[1]);
		employees[3] = new Employee("Nhan vien 3", LocalDate.of(1997, 06, 27), 1.5f, (Manager) managers[1]);
		employees[4] = new Employee("Nhan vien 4", LocalDate.of(2001, 02, 15), 1.5f, (Manager) managers[1]);
		employees[5] = new Employee("Nhan vien 5", LocalDate.of(2000, 02, 15), 1.5f, (Manager) managers[0]);

		ouputInfor(directors, managers, employees);
		
		System.out.println("\n===========================\n");
		System.out.println("Quantity employee: ");
		System.out.println(managers[0].getFullname() + " ==> " + getQuantityEmployee(employees, managers[0]));
		System.out.println(managers[1].getFullname() + " ==> " + getQuantityEmployee(employees, managers[1]));
		
		System.out.println("\n===========================\n");
		System.out.println("Salary: ");
		ouputInforSalary(directors, managers, employees);
	}

	// In danh sách nhân sự
	public static void ouputInfor(Director[] directors, Manager[] managers, Employee... employees) {
		System.out.printf("\n%-15s|%-15s|%-20s|%-20s\n", "fullname", "dob", "salaryCoefficient", "positionCoefficient");
		for (Director director : directors) {
			Director.outputInfor(director);
		}
		System.out.printf("\n%-15s|%-15s|%-20s|%-20s|%-25s\n", "fullname", "dob", "salaryCoefficient",
				"positionCoefficient", "departmentName");
		for (Manager manager : managers) {
			Manager.outputInfor(manager);
		}
		System.out.printf("\n%-15s|%-15s|%-20s|%-20s|%-25s\n", "fullname", "dob", "salaryCoefficient", "departmentName",
				"managerName");
		for (Employee employee : employees) {
			Employee.outputInfor(employee);
		}
	}

	// Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
	public static int getQuantityEmployee(Employee[] employees, Manager manager) {
		int count = 0;
		for(Employee employee:employees) {
			if(employee.getManager().equals(manager))
				count++;
		}
		return count;
	}
	
	//In mức lương 
	public static void ouputInforSalary(Director[] directors, Manager[] managers, Employee... employees) {
		System.out.printf("\n%-15s|%-15s\n", "fullname", "salary");
		for (Director director : directors) {
			System.out.printf("%-15s|%-15.2f\n", director.getFullname(), director.getSalary());
		}
		for (Manager manager : managers) {
			System.out.printf("%-15s|%-15.2f\n", manager.getFullname(), manager.getSalary());
		}
		for (Employee employee : employees) {
			System.out.printf("%-15s|%-15.2f\n", employee.getFullname(), employee.getSalary());
		}
	}
}
