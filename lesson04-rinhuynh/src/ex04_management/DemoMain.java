package ex04_management;

import java.time.LocalDate;

public class DemoMain {
	
	public static void main(String[] args) {
		Director d1 = new Director("Hải", LocalDate.of(1980, 06, 20), 3, 3 );
		
		Manager m1 = new Manager("Thao", LocalDate.of(1994, 02, 04), 2, 2, "Phòng kế toán");
		Manager m2 = new Manager("Hùng", LocalDate.of(1982, 12, 24), 2, 2, "Phòng kinh doanh");
		
		Employee e1 = new Employee("Phương", LocalDate.of(1995, 05, 10), 1.5, "Phòng kế toán", "Thao");
		Employee e2 = new Employee("Hoa", LocalDate.of(1999, 07, 17), 1.5, "Phòng kế toán", "Thao");
		Employee e3 = new Employee("Thành", LocalDate.of(1998, 05, 20), 1.5, "Phòng kế toán", "Thao");
		Employee e4 = new Employee("Dung", LocalDate.of(1996, 10, 10), 1.5, "Phòng kinh doanh", "Hùng");
		Employee e5 = new Employee("Duy", LocalDate.of(2000, 02, 12), 1.5, "Phòng kinh doanh", "Hùng");
		Employee e6= new Employee("Lê", LocalDate.of(1997, 10, 11), 1.5, "Phòng kinh doanh", "Hùng");
		
		//hiển thị thông tin các nhân sự có trong công ty
		
		Personnel[] s = {d1, m1, m2, e1, e2, e3, e4, e5, e6};
		printPerson(s);
		
		System.out.println("\n============================\n");
		
		Employee[] employees = { e1, e2, e3, e4, e5, e6 };
		
		System.out.println(
				"Số nhân viên được quản lý bởi trưởng phòng kế toán: " + numberOfEmployeesManagedByManager(m1, employees));
		System.out.println(
				"Số nhân viên được quản lý bởi trưởng phòng kinh doanh: " + numberOfEmployeesManagedByManager(m2, employees));

		System.out.println("\n================================================\n");
		
		System.out.println(" ----------- Salary ----------- ");
		
		printSalary(s);
		
		
		
		
	}
	private static void printPerson(Personnel[] personnels) {
		for( var Personnel : personnels)
			System.out.println(Personnel);
	
		
	}
	
	private static int numberOfEmployeesManagedByManager(Manager m, Employee[] employees) {
		int count = 0;
		for (var Employee : employees)
			if (m.getNameOfDepartment().equals(Employee.getNameOfDepartment()))
				count++;
		return count;
	}
	
	private static double calSalary (Personnel personnel) {
		if( personnel instanceof Employee) {
			Employee eml = (Employee)personnel;
			return eml.getCoefficientsSalary() * 1250000;
		} else if ( personnel instanceof Manager) {
			Manager mana = (Manager)personnel;
			return (mana.getCoefficientsSalary() + mana.getCoefficientsPosition()) * 2200000;
			
		} else {
			Director dr = (Director)personnel;
			return (dr.getCoefficientsSalary() + dr.getCoecoefficientsPosition()) * 3000000;
		}
	
	}
	private static void printSalary(Personnel[] personnels) {
		for ( Personnel personnel : personnels) {
			if( personnel instanceof Director) {
				Director dr = (Director)personnel;
				System.out.println("Salary of Director :  " + dr.getName() + " ---> " + calSalary(dr));
			}
		}
		for ( Personnel personnel : personnels) {
			if( personnel instanceof Manager) {
				Manager mana = (Manager)personnel;
				System.out.println("Salary of Manager :  " + mana.getName() + " ---> " + calSalary(mana));
			}
		}
		for ( Personnel personnel : personnels) {
			if( personnel instanceof Employee) {
				Employee em = (Employee)personnel;
				System.out.println("Salary of Employee :  " + em.getName() + " ---> " + calSalary(em));
			}
		}
	}
	
}
