package exercises4;

public class AppHRM {
	public static void main(String[] args) {
		Director dr = new Director("Dương Văn An", "17.06.1999", 5.5f, 5f);
		Manager mn1 = new Manager("Nguyễn Doãn Bình", "15.05.1997", 4f, 4);
		Manager mn2 = new Manager("Trần Tấn Tài", "25.06.1994", 5f, 2);
		Employee emp1 = new Employee("Nguyễn Hoàng", "22.02.2000", 3.4f, "Nhân sự");
		Employee emp2 = new Employee("Trần Lệ", "10.03.1999", 2.8f, "Kế toán");
		Employee emp3 = new Employee("Hoàng Minh", "12.09.2002", 3.1f, "Marketing");
		Employee emp4 = new Employee("Lê Văn Tùng", "18.07.1995", 3.9f, "Kỹ thuật");
		Employee emp5 = new Employee("Kế Xương", "19.01.1998", 2.7f, "Hành chính");
		Employee emp6 = new Employee("Đào Văn", "23.06.1995", 3.5f, "Kiểm soát chất lượng");
	
		Person [] listPersons = {dr, mn1, mn2, emp1, emp2, emp3, emp4, emp5, emp6};
		HRMUtils.informationPersonel(listPersons);
		
		System.out.println("salary of director: " + dr.salary());
		System.out.println("salary of manager mn1: " + mn1.salary());
		System.out.println("salary of manager mn2: " + mn2.salary());
		System.out.println("salary of employee emp1: " + emp1.salary());
		System.out.println("salary of employee emp2: " + emp2.salary()); 
		System.out.println("salary of employee emp3: " + emp3.salary());
		System.out.println("salary of employee emp4: " + emp4.salary());
		System.out.println("salary of employee emp5: " + emp5.salary());
		System.out.println("salary of employee emp6: " + emp6.salary());
		
	}
}
