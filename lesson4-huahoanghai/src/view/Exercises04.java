package view;

import bean.Employee;
import bean.EmployeeManager;
import bean.Manager;
import bean.President;

public class Exercises04 {
	public static void main(String[] args) {
		President pr = new President("Trần Văn Ơn","13/06/1976",8.5,4.0);
		
		Manager mg1 = new Manager("Lê Quảng Đốc","18/06/1986",7.9,3.5,"Phòng đào tạo");
		Manager mg2 = new Manager("Lê Quảng Chí","26/12/1982",7.7,3.5,"Phòng tổ chức");
		
		Employee ep1 = new Employee("Trần Thị Dung", "18/06/1999", 7.3, "Phòng đào tạo", "Lê Quảng Đốc");
		Employee ep2 = new Employee("Trần Văn Dũng", "17/09/1998", 7.2, "Phòng đào tạo", "Lê Quảng Đốc");
		Employee ep3 = new Employee("Ngô Tấn Trọng", "25/04/1995", 6.9, "Phòng đào tạo", "Lê Quảng Đốc");
		Employee ep4 = new Employee("Phạm Văn Đô", "07/06/1993", 7.2, "Phòng tổ chức", "Lê Quảng Chí");
		Employee ep5 = new Employee("Ung Tấn Đức", "19/12/1999", 7.4, "Phòng tổ chức", "Lê Quảng Chí");
		Employee ep6 = new Employee("Trần Thị Mỹ", "01/10/1996", 7.0, "Phòng tổ chức", "Lê Quảng Chí");
		
		
		EmployeeManager[] employeemanager = {pr,mg1,mg2,ep1,ep2,ep3,ep4,ep5,ep6}; 
		

        String managerName1 = "Lê Quảng Đốc";
        String managerName2 = "Lê Quảng Chí";

        System.out.println("Danh sách nhân viên được quản lý bởi " + managerName1 + ":");
        printManagedEmployees(employeemanager, managerName1);

        System.out.println("Danh sách nhân viên được quản lý bởi " + managerName2 + ":");
        printManagedEmployees(employeemanager, managerName2);
        
        System.out.println("\n--------------------------\n");
        
        calculatePresidentSalary(pr);
        calculateManagerSalary(employeemanager);
        calculateEmployeeSalary(employeemanager);
      
	}
	 public static void printManagedEmployees(EmployeeManager[] employeemanager, String managerName) {
	        for (EmployeeManager epl : employeemanager) {
	            if (epl instanceof Employee) {
	                Employee tk = (Employee) epl;
	                String manager = tk.getManager();
	                if (manager.equals(managerName)) {
	                	System.out.println("    "+tk.getName()+"\t\t"+
	                    		tk.getDate()+"    \t"+tk.getManager()+"  \t"+tk.getRoomName());
	                }
	            }
	        }
	    }
	 
	 public static void calculatePresidentSalary(President pr) {
	        System.out.println("Lương của giám đốc là: \n");
	        System.out.println("    " + pr.getName() + "  \t" + pr.getSalary());
	    }

	 public static void calculateManagerSalary(EmployeeManager[] employeemanager) {
	        System.out.println("Lương của trưởng phòng là: \n");
	        for (EmployeeManager epl : employeemanager) {
	            if (epl instanceof Manager) {
	                Manager manager = (Manager) epl;
	                System.out.println("    " + manager.getName() + "  \t" + manager.getSalary());
	            }
	        }
	    }

	  public static void calculateEmployeeSalary(EmployeeManager[] employeemanager) {
	        System.out.println("Lương của nhân viên là: \n");
	        for (EmployeeManager epl : employeemanager) {
	            if (epl instanceof Employee) {
	                Employee employee = (Employee) epl;
	                System.out.println("    " + employee.getName() + "  \t" + employee.getSalary());
	            }
	        }
	    }
}
