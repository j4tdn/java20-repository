package view;

import java.util.Arrays;

import bean.Department;
import bean.Director;
import bean.Employee;
import bean.Manager;
import bean.Personnel;

public class Ex04DemoEmployee {
	public static void main(String[] args) {
		Personnel pd = new Director("Nguyễn Văn A", 12, 8f, 8.5f);

		Personnel pm1 = new Manager("Nguyễn Văn B", 22, 7f, 7.5f, Department.ACCOUNTANT);
		Personnel pm2 = new Manager("Nguyễn Văn C", 26, 7f, 7.5f, Department.ADMINISTRATION);

		Personnel pe1 = new Employee("Lê Văn A", 9, 5f, Department.ACCOUNTANT, "Nguyễn Văn B");
		Personnel pe2 = new Employee("Lê Văn B", 19, 5f, Department.ADMINISTRATION, "Nguyễn Văn C");
		Personnel pe3 = new Employee("Lê Văn C", 3, 5f, Department.HUMANRESOURCE, "Nguyễn Văn D");
		Personnel pe4 = new Employee("Lê Văn D", 10, 5f, Department.ACCOUNTANT, "Nguyễn Văn B");
		Personnel pe5 = new Employee("Lê Văn E", 6, 5f, Department.HUMANRESOURCE, "Nguyễn Văn D");
		Personnel pe6 = new Employee("Lê Văn F", 30, 5f, Department.ADMINISTRATION, "Nguyễn Văn C");

		Personnel[] personnels = { pd, pm1, pm2, pe1, pe2, pe3, pe4, pe5, pe6 };
		// Personnel[] employees = {pe1, pe2, pe3, pe4, pe5, pe6};

		printPersonnels(personnels);
		System.out.println("\n============\n");
		
		Employee[] employees = countEmpPerDepartment(personnels, "Nguyễn Văn B");
		for (Employee each: employees) {
			System.out.println(each);
		}
		
		System.out.println("\n============\n");
		
		System.out.println(calSalary(pd));
	}

	private static void printPersonnels(Personnel[] personnels) {
		for (Personnel personnel : personnels) {
			System.out.println(personnel);
		}
	}

	private static Employee[] countEmpPerDepartment(Personnel[] personnels, String nameOfManager) {
		Employee[] storage = new Employee[personnels.length];
		int count = 0;
		for (Personnel personnel : personnels) {
			if (personnel instanceof Employee) {
				Employee e = (Employee) personnel;
				if (e.getManager().equals(nameOfManager)) {
					storage[count++] = e;
				}
			}
		}
		return Arrays.copyOfRange(storage, 0, count);
	}
	
	private static float calSalary(Personnel personnel) {
		float salary = 0;
		if (personnel instanceof Employee) {
			Employee e = (Employee) personnel;
			salary += e.getCoefficientsSalary() * 1_250_000;
		} else if (personnel instanceof Manager) {
			Manager m = (Manager) personnel;
			salary += (m.getCoefficientsSalary() + m.getJobGrade()) * 2_200_000;
		} else {
			Director d = (Director) personnel;
			salary += (d.getCoefficientsSalary() + d.getJobGrade()) * 3_000_000;
		}
		return salary;
	}
}
