package ex04_personnel_management;

import java.util.Date;
import java.util.ArrayList;

public class Company {
	public static void main(String[] args) {
		ArrayList<Personnel> team = new ArrayList<Personnel>();
		Personnel CEO = new CEO("Nguyen An", "12-6-1997", 2.0, 3.0);
		team.add(CEO);
		
		Personnel Man1 = new Manager("Tran Van Bao", "11-9-1999", 1.5, 2.5, "Marketing Dept");
		team.add(Man1);
		Personnel Man2 = new Manager("Tran Long", "25-3-1999", 1.5, 2.5, "Human Resource Dept");
		team.add(Man2);
		
		Personnel Emp1 = new Employee("Huynh Van Quoc", "1-1-2000", 1.0, "Marketing Dept", (Manager)Man1);
		team.add(Emp1);
		Personnel Emp2 = new Employee("Phan Quang Phat", "3-6-2002", 1.0, "Human Resource Dept", (Manager)Man2);
		team.add(Emp2);
		Personnel Emp3 = new Employee("Nguyen Quoc Long", "6-3-2002", 1.0, "Human Resource Dept", (Manager)Man2);
		team.add(Emp3);
		Personnel Emp4 = new Employee("Nguyen Linh", "7-7-2001", 1.0, "Marketing Dept", (Manager)Man1);
		team.add(Emp4);
		Personnel Emp5 = new Employee("Ho Van Nam", "11-12-2003", 1.0, "Marketing Dept", (Manager)Man1);
		team.add(Emp5);
		Personnel Emp6 = new Employee("Phan Dung", "21-4-2002", 1.0, "Human Resource Dept", (Manager)Man2);
	
		checkInfo(team);
		checkEmployeeNum(team);
	}
	
	public static void checkInfo(ArrayList<Personnel> team) {
		System.out.println("Company X's hiearchy: ");
		System.out.println("CEO: ");
		for(Personnel person : team) {
			if(person instanceof CEO)
				System.out.println(person.toString());
		}
		
		System.out.print("\n\n");
		System.out.println("Managers: ");
		
		for(Personnel person : team) {
			if(person instanceof Manager)
				System.out.println(person.toString());
		}
		
		System.out.print("\n\n");
		System.out.println("Employees: ");
		for(Personnel person : team) {
			if(person instanceof Employee)
				System.out.println(person.toString());
		}
		System.out.println();
		System.out.println("===================END================");
	}
	
	public static void checkEmployeeNum(ArrayList<Personnel> team) {
		ArrayList<String>names = new ArrayList<>();
		int[] num = new int[2];
		for(Personnel person : team) {
			if(person instanceof Manager)
				names.add(((Manager)person).getName());
		}
		
		for(Personnel person : team) {
			if(person instanceof Employee) 
				if(((Employee) person).getManager().equals(names.get(0)))
					num[0]++;
				else if(((Employee) person).getManager().equals(names.get(1)))
					num[1]++;
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Manager " + names.get(i) + " has " + num[i] + " employees");
		}
		System.out.println("=====================END=====================");
	}
	
	public static void printSalary(ArrayList<Personnel> team) {
		for(Personnel person : team) {
			if(person instanceof CEO)
				System.out.println("CEO " + person.getName() + "'s salary is " + person.getSalaryFactor() * ((CEO) person).getStatusFactor() * 3000000);
		}
		System.out.println();
		for(Personnel person : team) {
			if(person instanceof Manager)
				System.out.println("Manager " + person.getName() + "'s salary is " + person.getSalaryFactor() * ((Manager) person).getStatusFactor() * 2200000);
		}
		System.out.println();
		for(Personnel person : team) {
			if(person instanceof Employee)
				System.out.println("Employee " + person.getName() + "'s salary is " + person.getSalaryFactor() * 1250000);
		}
	}
}
