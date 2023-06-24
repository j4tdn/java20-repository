package a.encapsulation.outside;

import a.encapsulation.inside.CompanyA;

public class EmployeeB1 {
	public int Id;
	public String name;
	//private double salary;
	
	public static void main(String[] args) {
		CompanyA cA = new CompanyA();
		System.out.println("name ---> " + cA.name);
		//System.out.println("benafit ---> " + cA.benefit);
	}
}
