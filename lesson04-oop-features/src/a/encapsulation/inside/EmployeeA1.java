package a.encapsulation.inside;

public class EmployeeA1 {
	public int Id;
	public String name;
	//private double salary;
	
	public static void main(String[] args) {
		CompanyA cA = new CompanyA();
		System.out.println("name ---> " + cA.name);
		System.out.println("benafit ---> " + cA.benefit);
	}
}
