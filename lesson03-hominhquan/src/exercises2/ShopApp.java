package exercises2;

public class ShopApp {
	public static void main(String[] args) {
		Customer ctm1 = new Customer("123", "Nguyen Thi Loan", 768);
		Customer ctm2 = new Customer("234", "Le Minh Tinh", 798);
		Customer ctm3 = new Customer("246", "Nguyen Minh Triet", 608);

		Vehicle vh1 = new Vehicle("F", "Future Neo", 100, 3500000);
		Vehicle vh2 = new Vehicle("M", "Mazda", 300, 2500000);
		Vehicle vh3 = new Vehicle("L", "Landscape", 1000, 9000000);

		Order o1 = new Order(ctm1, 
				new VehicleDetail[] { 
						new VehicleDetail(vh1, 1)}
						);
		Order o2 = new Order(ctm2, 
				new VehicleDetail[] { 
						new VehicleDetail(vh2, 1)
					 });
		Order o3 = new Order(ctm3, 
				new VehicleDetail[] { 
						new VehicleDetail(vh3, 1) 
						 });
		System.out.print("Tên chủ xe \t\t");
		System.out.print("Loại xe \t\t");
		System.out.print("Dung tích \t\t");
		System.out.print("Trị giá \t\t");
		System.out.println("Thuế phải nộp");
		System.out.println("===================================================================="
				+ "======================================");
		
		
		System.out.print(ctm1.getName()+ "\t\t");
		System.out.print(vh1.getModel()+ "\t\t");
		System.out.print(vh1.getCapacity()+ "\t\t\t");
		System.out.print(vh1.getPrice()+ "\t\t");
		System.out.println(OrderUtils.tax(o1));
		
		System.out.print(ctm2.getName()+ "\t\t");
		System.out.print(vh2.getModel()+ "\t\t\t");
		System.out.print(vh2.getCapacity()+ "\t\t\t");
		System.out.print(vh2.getPrice()+ "\t\t");
		System.out.println(OrderUtils.tax(o2));
		
		System.out.print(ctm3.getName()+ "\t");
		System.out.print(vh3.getModel()+ "\t\t");
		System.out.print(vh3.getCapacity()+ "\t\t\t");
		System.out.print(vh3.getPrice()+ "\t\t");
		System.out.println(OrderUtils.tax(o3));
		
		
		
		
	}
}
