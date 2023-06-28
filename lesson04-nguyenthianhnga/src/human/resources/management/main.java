package human.resources.management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
	public static void main(String[] args) {
		President p1 = new President("Châu Tịnh Nhiên", LocalDate.of(1980, 5, 21), 3, 2);
		Manager m1 = new Manager("Chế Gia Tịnh", LocalDate.of(1990, 7, 10), 2.5, 1.5, "A");
		Manager m2 = new Manager("Chế Bảo Ly", LocalDate.of(1992, 1, 3), 2.5, 1.5, "B");
		Employee e1 = new Employee("Trần Hữu Thịnh", LocalDate.of(1994, 3, 6), 2.0, "A", m1);
		Employee e2 = new Employee("Châu An Nhiên", LocalDate.of(1994, 3, 6), 2.0, "A", m1);
		Employee e3 = new Employee("Trần Hồng Linh", LocalDate.of(1994, 3, 6), 2.0, "A", m1);
		Employee e4 = new Employee("Tống Phước Thọ", LocalDate.of(1994, 3, 6), 2.0, "A", m2);
		Employee e5 = new Employee("Lương Hùng", LocalDate.of(1994, 3, 6), 2.0, "A", m2);
		Employee e6 = new Employee("Châu Mẫn Nhi  ", LocalDate.of(1994, 3, 6), 2.0, "A", m2);

		EmployeeManager[] em = { p1, m1, m2, e1, e2, e3, e4, e5, e6 };
		System.out.println("\tPersonnel list: \n");
		for (EmployeeManager employeeM : em) {
			System.out.println(employeeM.toString());
		}

		System.out.println("-------------------");
		System.out.println("\t\tEmployee salary: ");
		calSalary(em);
		
		Employee[] employees = {e1,e2,e3,e4,e5,e6};
		  HashMap<String, Integer> employeeCountByDepartmentHead = new HashMap<>();
		    for (Employee employee : employees) {
		        Manager manager = employee.getDepartmentManager();
		        if (manager != null) {
		            String managerName = manager.getDepartmentName();
		            employeeCountByDepartmentHead.put(managerName, employeeCountByDepartmentHead.getOrDefault(managerName, 0) + 1);
		        }
		    }
		    System.out.println("\n-----------------");
		    System.out.println("\n Number of employees managed by each department head:");
		    for (String managerName : employeeCountByDepartmentHead.keySet()) {
		        System.out.println(managerName + ": " + employeeCountByDepartmentHead.get(managerName));
		    }


	}

	private static void calSalary(EmployeeManager[] em) {
		System.out.println("\t*President*");
		for (EmployeeManager em1 : em) {
			if (em1 instanceof President) {
				President pr = (President) em1;
				System.out.println(pr.getFullName()+"\t:"+(pr.getSalaryFactor() + pr.getPositioncCoefficient()) * 3000000);

			}
		}
		System.out.println("\t-Manager-");
		for (EmployeeManager em2 : em) {
			if (em2 instanceof Manager) {
				Manager mn = (Manager) em2;
				System.out.println(mn.getFullName()+"\t:"+(mn.getPositioncCoefficient() + mn.getSalaryFactor()) * 2200000);

			}
		}
		System.out.println("\tEmployee");
		for (EmployeeManager em3 : em) {
			if (em3 instanceof Employee) {
				Employee st = (Employee) em3;
				System.out.println(st.getFullName()+"\t:"+st.getSalaryFactor() * 1250000);

			}
		}

	}
  
}
