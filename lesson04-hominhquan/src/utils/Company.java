package utils;

import bean.ChiefRoom;
import bean.Employee;
import bean.Manager;

public class Company {
	private Company() {
	}

	public static void printf(Manager[] managers) {
		for (Manager manager : managers) {
			System.out.println(manager);
		}
	}
	public static double salary(Manager manager) {
		double salary = 0;
		double coefficient = (manager.getCoefficientsSalary() + manager.getCoefficientsJob());
		if(manager instanceof Manager) {
			salary = coefficient * 300000;
		}
		if(manager instanceof ChiefRoom) {
			salary = coefficient * 220000;
		}
		if(manager instanceof Employee) {
			salary = coefficient * 125000;
		}
		return salary;
	}
	public static boolean check(Employee employee, ChiefRoom chiefRoom) {
		
			if(employee.getDepartmentName().equals(chiefRoom.getDepartmentName())) {
				return true;
			
		}
		return false;
		
		
	}
}
