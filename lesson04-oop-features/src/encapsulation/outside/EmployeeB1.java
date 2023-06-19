package encapsulation.outside;

import encapsulation.inside.CompanyA;

public class EmployeeB1 {
	public int id;
	public String name;
	private double salary;
	
	public static void main(String[] args) {
		CompanyA ca = new CompanyA();
		System.out.println("name --> " + ca.name);
		// System.out.println("benefit --> " + ca.benefit);
	}
}
