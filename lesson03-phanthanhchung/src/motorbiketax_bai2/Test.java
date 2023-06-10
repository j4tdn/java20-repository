package motorbiketax_bai2;

public class Test {
	public static void main(String[] args) {
		Vehicle[] motorbikes = new Vehicle[3];
		motorbikes[0] = new Vehicle("Future Neo", 100, 35_000_000);
		motorbikes[1] = new Vehicle("Ford Ranger", 3_000, 250_000_000);
		motorbikes[2] = new Vehicle("Landscape", 1_500, 1_000_000_000);
		
		Customers[] buyers = new Customers[3];
		buyers[0] = new Customers("Nguyễn Thu Loan", motorbikes[0]);
		buyers[1] = new Customers("Lê Minh Tính", motorbikes[1]);
		buyers[2] = new Customers("Nguyễn Minh Triết", motorbikes[2]);
		
		String fmt = "%1$-26s %2$-22s %3$-33s %4$-16s %5$13s";
		String fmt2 = "%1$-25s %2$-21s %3$-23d %4$16.2f %5$21.2f";
		
		System.out.println("Tên chủ xe                Loại xe               Dung tích                        Trị giá         Thuế phải nộp");
		System.out.println("=".repeat(110));
		for(int i = 0; i < buyers.length; i++) {
			System.out.println(String.format(fmt2, buyers[i].getFullName(), buyers[i].getVehicle().getVehicleType(), 
											buyers[i].getVehicle().getCapacity(), buyers[i].getVehicle().getPrice(), buyers[i].getVehicle().getTax()));
		}
	}
}
