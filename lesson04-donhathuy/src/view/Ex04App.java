package view;

import java.time.LocalDate;

import bean.ex04.Director;
import bean.ex04.Employees;
import bean.ex04.Manager;
import bean.ex04.Room;
import bean.ex04.Staff;

public class Ex04App {
	public static void main(String[] args) {
		//Enter employees
		Director director = new Director ("Nguyễn Văn Huy", LocalDate.of(1999, 3, 27), 5.2, 3.5 );
		Manager hrManager = new Manager ("Đỗ Văn Sang",LocalDate.of(2000, 12, 3), 3.1, 2.1, Room.HR );
		Manager salesManager = new Manager ("Đỗ Văn Tùng",LocalDate.of(2001, 6, 3), 3.4, 2.5, Room.SALES );
		Staff st01 = new Staff ("Nguyễn Ngọc Linh", LocalDate.of(2003, 5, 3), 2.5, Room.HR , hrManager);
		Staff st02 = new Staff ("Trần Gia Hân", LocalDate.of(2003, 6, 3), 2.5, Room.HR , hrManager);
		Staff st03 = new Staff ("Nguyễn Văn Tuấn", LocalDate.of(2003, 6, 23), 2.4, Room.HR , hrManager);
		Staff st04 = new Staff ("Nguyễn Thanh Lan", LocalDate.of(2002, 6, 7), 2.3, Room.SALES, salesManager);
		Staff st05 = new Staff ("Nguyễn Thanh Huy", LocalDate.of(2001, 9, 23), 2.5, Room.SALES, salesManager);
		Staff st06 = new Staff ("Nguyễn Ngọc Anh", LocalDate.of(2000, 12, 9), 2.7, Room.SALES, salesManager);
		
		//print employees list
		System.out.println("Employees List: ");
		Employees[] employees = {director, hrManager, salesManager, st01, st02, st03, st04, st05, st06};
		for (Employees employee : employees) {
			System.out.println(employee.toString());
		}
		System.out.println("\n--------------------------\n");
		
		//Statistics staff managed by managers
		System.out.print("Staff managed by HR manager: ");
		int count = 0;
		for (Employees employee : employees) {
			if (employee instanceof Staff) {
				Staff st = (Staff)employee;
				if(st.getManager() == hrManager) {
					count++;
				}
			}
		}
		System.out.println(count);
		count = 0;
		System.out.print("Staff managed by Sales manager: ");
		for (Employees employee : employees) {
			if (employee instanceof Staff) {
				Staff st = (Staff)employee;
				if(st.getManager() == salesManager) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println("\n--------------------------\n");
		
		//calculate salary
		System.out.println("Salary: ");
		for (Employees employee : employees) {
			System.out.println(employee.getName()+ ": "+salary(employee) );
		}
		
	}
	public static double salary(Employees employee ) {
		if (employee instanceof Staff) {
			Staff st = (Staff)employee;
			return st.getSalaryCoefficient()*1250000;
		}
		if (employee instanceof Manager) {
			Manager manager = (Manager)employee;
			return (manager.getSalaryCoefficient() + manager.getPositionCoefficient())*2200000;
		}
		Director director = (Director)employee;
		return (director.getSalaryCoefficient() + director.getPositionCoefficient())*3000000;
	}

	
}
