package vehice_tax;

public class App {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("KH1", "Nguyen Thi Loan", "USA");
		Customer c2 = new Customer("KH2", "Le Minh Tinh", "JaPan");
		Customer c3 = new Customer("KH3", "Nguyen Minh Triet", "VietNam");
		
		Vehicle vh1 = new Vehicle("F1", "Future Neo", "Black", 100, 35000000);
		Vehicle vh2 = new Vehicle("F2", "Ford Ranger", "Green", 3000, 250000000);
		Vehicle vh3 = new Vehicle("L1", "Landscape", "White", 1500, 1000000000);
		
		Order o1 = new Order(c1, new VehicleDetail[] { 
				   				 new VehicleDetail(vh1, 1)});
		Order o2 = new Order(c2, new VehicleDetail[] { 
								 new VehicleDetail(vh2, 1) });
		Order o3 = new Order(c3, new VehicleDetail[] { 
								 new VehicleDetail(vh3, 1)});
		
		System.out.print("Tên chủ xe \t\t");
		System.out.print("Loại xe \t\t");
		System.out.print("Dung tích \t\t");
		System.out.print("Trị giá \t\t");
		System.out.println("Thuế phải nộp ");
		
		
		System.out.print(c1.getName()+ "\t\t");
		System.out.print(vh1.getModel()+ "\t\t");
		System.out.print(vh1.getCapacity()+ "\t\t\t");
		System.out.print(vh1.getCost()+ "\t\t\t");
		System.out.println(OrderUtils.tax(o1));
		
		System.out.print(c2.getName()+ "\t\t");
		System.out.print(vh2.getModel()+ "\t\t");
		System.out.print(vh2.getCapacity()+ "\t\t\t");
		System.out.print(vh2.getCost()+ "\t\t\t");
		System.out.println(OrderUtils.tax(o2));
		
		System.out.print(c3.getName()+ "\t");
		System.out.print(vh3.getModel()+ "\t\t");
		System.out.print(vh3.getCapacity()+ "\t\t\t");
		System.out.print(vh3.getCost()+ "\t\t\t");
		System.out.println(OrderUtils.tax(o3));
	
		
		
	}
//	Customers:
//		c1: c1	 : KH1, Nguyen Thi Loan, USA
//			c2	 : KH2, Le Minh Tinh, Japan
//			c3 	 : KH3, Nguyen Minh Triet, VietNam
//
//		Vehicle:
//		vh1	: F1, Future Neo, Black, 100, 35000000
//		vh2	: F2, Ford Ranger, Green, 3000, 250000000
//		vh3	: L1, Landscape, White, 1500, 1000000000
}
