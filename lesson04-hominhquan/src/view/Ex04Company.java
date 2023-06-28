package view;

import bean.ChiefRoom;
import bean.Employee;
import bean.Manager;
import utils.Company;

public class Ex04Company {
	public static void main(String[] args) {
		Manager manager  = new Manager("Quan", "25/7/2002", 3.5f, 4.2f);
		ChiefRoom chiefRoom1 = new ChiefRoom("Minh", "09/10/2002", 3.0f, 3.4f, "Font-end");
		ChiefRoom chiefRoom2 = new ChiefRoom("Ni", "24/5/2001", 3.3f, 3.6f, "Back-end");
		
		Employee employee1 = new Employee("nv1", "20/4/2003", 2.4f, "Font-end", "Minh");
		Employee employee2 = new Employee("nv2", "16/8/2003", 2.4f, "Font-end", "Minh");
		Employee employee3 = new Employee("nv3", "12/6/2003", 2.4f, "Back-end", "Ni");
		Employee employee4 = new Employee("nv4", "6/3/2003", 2.4f, "Back-end", "Ni");
		Employee employee5 = new Employee("nv5", "9/1/2003", 2.4f, "Font-end", "Minh");
		Employee employee6 = new Employee("nv6", "11/6/2003", 2.4f, "Back-end", "Ni");
		
		Manager[] ManagerEmployees = {manager, chiefRoom1, chiefRoom2, 
							employee1, employee2,employee3,employee4,employee5, employee6};
		Company.printf(ManagerEmployees);
		
		System.out.println("======================");
		Employee[] employees = {employee1, employee2,employee3,employee4,employee5, employee6};
		int countMinh = 0;
		int countNi = 0;
		for(Employee employee:employees) {
			if(Company.check(employee, chiefRoom1)) {
				countMinh++;
			}
			if(Company.check(employee, chiefRoom2)) {
				countNi++;
			}
		}
		System.out.println("so luong nhan vien trong phong Minh la: " + countMinh);
		System.out.println("so luong nhan vien trong phong Ni la: " + countNi);
		
		
		System.out.println("======================");
		System.out.println("Luong nhan vien: " + Company.salary(employee1));
		System.out.println("Luong truong phong: " +Company.salary(chiefRoom1) );
		System.out.println("Luong giam doc: " +Company.salary(manager));
		
	}
	
	
}
