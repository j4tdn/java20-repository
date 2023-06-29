package view;

import bean.Department;
import bean.Director;
import bean.Employee;
import bean.Leader;
import bean.People;

public class Ex04StaffManagement {
	public static void main(String[] args) {

		// 1 Director
		People director = new Director("Giám đốc", "17/02/2002", 5, 5);

		// 2 Leaders
		People leader1 = new Leader("Trưởng phòng 1", "15/05/1999", 2, 4, Department.DESIGN);
		People leader2 = new Leader("Trưởng phòng 2", "15/10/2000", 2, 4, Department.CONSTRUCTION);

		// 6 Employee
		People employee1 = new Employee("Nhân viên 1", "17/10/2005", 1, Department.DESIGN, (Leader) leader1);
		People employee2 = new Employee("Nhân viên 2", "07/10/2004", 2, Department.DESIGN, (Leader) leader1);
		People employee3 = new Employee("Nhân viên 3", "07/01/2000", 3, Department.DESIGN, (Leader) leader1);
		People employee4 = new Employee("Nhân viên 4", "10/01/1998", 2, Department.CONSTRUCTION, (Leader) leader2);
		People employee5 = new Employee("Nhân viên 5", "13/02/1995", 3, Department.CONSTRUCTION, (Leader) leader2);
		People employee6 = new Employee("Nhân viên 6", "15/08/1992", 1, Department.CONSTRUCTION, (Leader) leader2);

		People nhanSuCongTy[] = new People[9];
		nhanSuCongTy[0] = director;
		nhanSuCongTy[1] = leader1;
		nhanSuCongTy[2] = leader2;
		nhanSuCongTy[3] = employee1;
		nhanSuCongTy[4] = employee2;
		nhanSuCongTy[5] = employee3;
		nhanSuCongTy[6] = employee4;
		nhanSuCongTy[7] = employee5;
		nhanSuCongTy[8] = employee6;

		People[] leaders = new People[] { leader1, leader2 }; // Mảng lưu danh sách trưởng phòng
		int employeeCount[] = new int[2]; // Mảng lưu danh sách số lượng nhân viên mỗi trưởng phòng quản lý

		// Hiển thị thông tin các nhân sự có trong công ty
		displayPeopleInCompany(nhanSuCongTy);

		// Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng
		countEmployeeManagement(nhanSuCongTy, leaders, employeeCount);
		for (int i = 0; i < leaders.length; i++) {
			System.out.println("Trưởng phòng " + leaders[i] + " quản lý " + employeeCount[i] + " nhân viên");
		}

		// Tính và in ra mức lương của từng loại nhân sự
		for (People person : nhanSuCongTy) {
			person.findSalary();
			System.out.println("Lương của " + person.getName() + " là " + person.findSalary());
		}
	}

	private static void displayPeopleInCompany(People people[]) {
		for (People person : people) {
			System.out.println(person);
		}
	}

	private static void countEmployeeManagement(People people[], People leaders[], int employeeCount[]) {
		for (People person : people) {
			if (person instanceof Employee) {
				People leaderOfCurrentStaff = ((Employee) person).getLeader();
				for (int i = 0; i < leaders.length; i++) {
					if (leaders[i] == leaderOfCurrentStaff) {
						employeeCount[i]++;
					}
				}
			}
		}
	}
}
