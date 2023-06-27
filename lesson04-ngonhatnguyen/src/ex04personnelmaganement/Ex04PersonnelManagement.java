package ex04personnelmaganement;

import java.time.LocalDate;

public class Ex04PersonnelManagement {
	public static void main(String[] args) {
		Director dr1 = new Director("AA", LocalDate.of(1980, 5, 21), 20, 30);
		
		Manager mng1 = new Manager("AB", LocalDate.of(1995, 9, 25), 15, 15, "Kế toán");
		Manager mng2 = new Manager("BB", LocalDate.of(1998, 7, 29), 15, 18, "Kế hoạch");
		
		Employee emp1 = new Employee("VA", LocalDate.of(1999, 2, 10), 10, mng2);
		Employee emp2 = new Employee("BV", LocalDate.of(2000, 4, 20), 8, mng1);
		Employee emp3 = new Employee("NN", LocalDate.of(2001, 1, 1), 12, mng1);
		Employee emp4 = new Employee("HT", LocalDate.of(1997, 10, 23), 10, mng1);
		Employee emp5 = new Employee("HK", LocalDate.of(1999, 2, 15), 10, mng2);
		Employee emp6 = new Employee("AL", LocalDate.of(1998, 7, 18), 9, mng1);
		
		Personnel[] personnels = {emp1, dr1, emp2, emp3, emp5, mng2, mng1, emp6, emp4};
		printPersonnel(personnels);
		
		System.out.println("\n======================================================\n");
		
		System.out.println("Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng:");
		statsQuanlityEmployeesOfManager(personnels);
		
		System.out.println("\n======================================================\n");
		
		System.out.println("In lương của từng loại nhân sự: ");
		printSalaryByPosition(personnels);
	}
	
	private static void printPersonnel(Personnel[] personnels) {
		System.out.println("Thông tin các nhân sự có trong công ty:");
		for (Personnel personnel : personnels) {
			System.out.println(personnel);
		}
	}
	
	private static Manager[] detachManager(Personnel[] personnels) {
		int countManager = 0;
		for (Personnel personnel : personnels) {
			if (personnel instanceof Manager) {
				countManager++;
			}
		}
		
		Manager[] managers = new Manager[countManager];
		int i = 0;
		for (Personnel personnel : personnels) {
			if (personnel instanceof Manager) {
				managers[i] = (Manager)personnel;
				i++;
			}
		}
		return managers;
	}
	
	private static void statsQuanlityEmployeesOfManager(Personnel[] personnels) {
		Manager[] managers = detachManager(personnels);
		
		int countEmpOfManager;
		for (Manager mng : managers) {
			countEmpOfManager = 0;
			for (Personnel psn : personnels) {
				if (psn instanceof Employee) {
					Employee emp = (Employee)psn;
					String nameMng = emp.getManager().getName();
					if (nameMng.equals(mng.getName())) {
						countEmpOfManager++;
					}
				}
			}
			System.out.println("Trưởng phòng " + mng.getDepartmentName() + ": " + mng.getName() + " --> " + countEmpOfManager + " nhân viên.");
		}
	}
	
	private static double calSalary(Personnel personnel) {
		if (personnel instanceof Employee) {
			Employee empl = (Employee)personnel;
			return empl.getCoefficientsSalary() * 1250000;
		} else if (personnel instanceof Manager) {
			Manager manager = (Manager)personnel;
			return (manager.getCoefficientsSalary() + manager.getJobCoefficient()) * 2200000;
		} else {
			Director dr = (Director)personnel;
			return (dr.getCoefficientsSalary() + dr.getJobCoefficient()) * 3000000;
		}
	}
	
	private static void printSalaryByPosition(Personnel[] personnels) {
		System.out.println("Giám đốc:");
		for (Personnel personnel : personnels) {
			if (personnel instanceof Director) {
				Director dr = (Director)personnel;
				System.out.println(dr.getName() + " ---> " + calSalary(dr));
			}
		}
		System.out.println("\nTrưởng phòng:");
		for (Personnel personnel : personnels) {
			if (personnel instanceof Manager) {
				Manager mng = (Manager)personnel;
				System.out.println(mng.getName() + " ---> " + calSalary(mng));
			}
		}
		System.out.println("\nNhân viên:");
		for (Personnel personnel : personnels) {
			if (personnel instanceof Employee) {
				Employee emp = (Employee)personnel;
				System.out.println(emp.getName() + " ---> " + calSalary(emp));
			}
		}
	}
}
